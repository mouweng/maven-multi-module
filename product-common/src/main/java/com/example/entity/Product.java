package com.example.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: wengyifan
 * @description:
 * @date: 2022/7/2 12:16 下午
 */
@Data
public class Product {
    /** 商品名称. */
    private String productName;
    /** 商品价格. */
    private BigDecimal productPrice;
    /** 商品库存。 */
    private int productStock;
}
