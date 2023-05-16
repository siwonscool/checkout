package com.example.checkoutkafka.dto;


import lombok.Data;

import java.util.Date;

@Data
public class CheckOutDto {
    private Long checkOutId;
    private Long memberId;
    private Long productId;
    private Long amount;
    private String shippingAddress;
    private     Date createdAt;
}
