package com.bits.service;

import com.bits.model.ProductDTO;
import com.bits.model.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class OrderRESTService {
    private static final Logger log = LoggerFactory.getLogger(OrderRESTService.class);
    private final RestTemplate restTemplate;

    @Value("${user.service.url}")
    private String userServiceUrl;

    @Value("${product.service.url}")
    private String productServiceUrl;

    public OrderRESTService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDTO getUserDetails(Long userId) {
        String url = userServiceUrl + "/users/" + userId;
        return restTemplate.getForObject(url, UserDTO.class);
    }

    public ProductDTO getProductDetails(Long productId) {
        String url = userServiceUrl + "/products/" + productId;
        return restTemplate.getForObject(url, ProductDTO.class);
    }
}
