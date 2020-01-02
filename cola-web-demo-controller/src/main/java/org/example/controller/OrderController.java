package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.api.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author: wengdiquan
 * @data: 2020-01-02 15:16
 * @description:
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("amount")
    public String getAmount(String orderType, BigDecimal amount) {
        return orderService.calculateAmount(orderType, amount);
    }
}
