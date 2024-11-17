package com.bits.service;

import com.bits.model.OrderDTO;
import com.bits.model.ProductDTO;
import com.bits.model.UserDTO;
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

    public boolean placeOrder(OrderDTO orderDTO){

        //rest call to user service for user details
        String userId= orderDTO.getUserId();
        UserDTO userDTO= getUserInfo(userId);
        log.info("user details fetched from REST call: "+userDTO );


        //rest call to product service for product details
        String productId= orderDTO.getProductId();
        ProductDTO productDTO= getProductInfo(productId);
        log.info("product  details fetched from REST call: "+productDTO );

        return true;
    }

    private UserDTO getUserInfo(String userId){
        UserDTO userDTO= orderRESTService.getUserDetails(Long.valueOf(userId));
        return userDTO;
    }

    private ProductDTO getProductInfo(String productId){
        ProductDTO productDTO= orderRESTService.getProductDetails(Long.valueOf(productId));
        return productDTO;
    }

}
