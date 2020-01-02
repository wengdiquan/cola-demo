package org.example.api;

import java.math.BigDecimal;

/**
 * @author: wengdiquan
 * @data: 2020-01-02 15:05
 * @description:
 **/
public interface OrderService {
    String calculateAmount(String orderType, BigDecimal amount);
}
