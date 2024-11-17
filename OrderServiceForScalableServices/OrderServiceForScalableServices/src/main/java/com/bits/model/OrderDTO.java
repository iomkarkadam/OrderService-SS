package com.bits.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDTO {

    private String pincode;

    private String userId;

    private String productId;

}
