package com.bits.service;

import com.bits.entity.Order;
import com.bits.model.OrderDTO;
import com.bits.model.ProductDTO;
import com.bits.model.UserDTO;
import com.bits.repo.OrderRepo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    OrderRESTService orderRESTService;

    @Autowired
    OrderRepo orderRepo;

    public boolean placeOrder(OrderDTO orderDTO){

        //rest call to user service for user details
        String userId= orderDTO.getUserId();
        UserDTO userDTO= getUserInfo(userId);
        log.info("user details fetched from REST call: "+userDTO );


        //rest call to product service for product details
        String productId= orderDTO.getProductId();
        ProductDTO productDTO= getProductInfo(productId);
        log.info("product  details fetched from REST call: "+productDTO );


        //save order info
        Order order= new Order();
        order.setProductName(productDTO.getProductName());
        order.setProductPrice(Integer.parseInt(productDTO.getProductPrice()));
        order.setUserName(userDTO.getUserName());
        order.setUserId(Long.valueOf(userId));
        order.setPincode(userDTO.getPincode());

        orderRepo.save(order);

        System.out.println("New order saved: "+ order);

        return true;
    }

    private UserDTO getUserInfo(String userId){
        UserDTO userDTO= orderRESTService.getUserDetails(Long.valueOf(userId));
        log.info("user info fetched from REST call: "+ userDTO);
        System.out.println("user info fetched from REST call: with name: "+ userDTO.getUserName()+ "user pincode: "+ userDTO.getPincode());
        return userDTO;
    }

    private ProductDTO getProductInfo(String productId){
        ProductDTO productDTO= orderRESTService.getProductDetails(Long.valueOf(productId));
        log.info("product info fetched from REST call: "+ productDTO);
        System.out.println("product info fetched from REST call: productName: "+ productDTO.getProductName()+ "Product Price: "+ productDTO.getProductPrice());
        return productDTO;
    }

}
