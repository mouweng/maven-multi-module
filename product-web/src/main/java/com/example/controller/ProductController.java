package com.example.controller;

import com.example.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: wengyifan
 * @description:
 * @date: 2022/7/2 12:16 下午
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/list")
    public Map list() {
        // 模拟查询商品逻辑
        Product product = new Product();
        product.setProductName("小米粥");
        product.setProductPrice(new BigDecimal(2.0));
        product.setProductStock(100);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 000);
        resultMap.put("message", "成功");
        resultMap.put("data", Arrays.asList(product));
        return resultMap;
    }
}
