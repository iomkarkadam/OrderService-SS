package com.bits.controller;

import com.bits.model.OrderDTO;
import com.bits.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class OrderControler {

    @Autowired
    OrderService orderService;

    @PostMapping("/orders")
    public String placeOrder(@RequestBody OrderDTO orderDTO){
        boolean status= orderService.placeOrder(orderDTO);
        if (status== true){
            return "order placed";
        }
        return "Order not placed";
    }

}
