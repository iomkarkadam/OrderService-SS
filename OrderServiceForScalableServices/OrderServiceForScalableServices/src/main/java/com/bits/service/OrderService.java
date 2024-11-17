package com.bits.service;

import com.bits.model.OrderDTO;
import com.bits.model.ProductDTO;
import com.bits.model.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public boolean placeOrder(OrderDTO orderDTO){

        //rest call to user service for user details



        //rest call to product service for product details


        return true;
    }

    private UserDTO getUserInfo(){
        return new UserDTO();
    }

    private ProductDTO getProductInfo(){
        return new ProductDTO();
    }

}
