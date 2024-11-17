package com.bits.service;

import com.bits.model.OrderDTO;
import com.bits.model.ProductDTO;
import com.bits.model.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public boolean placeOrder(OrderDTO orderDTO){

        //rest call to user service for user details
        String userId= orderDTO.getUserId();
        UserDTO userDTO= getUserInfo(userId);


        //rest call to product service for product details
        String productId= orderDTO.getProductId();
        ProductDTO productDTO= getProductInfo(productId);

        return true;
    }

    private UserDTO getUserInfo(String UserId){
        return new UserDTO();
    }

    private ProductDTO getProductInfo(String productId){
        return new ProductDTO();
    }

}
