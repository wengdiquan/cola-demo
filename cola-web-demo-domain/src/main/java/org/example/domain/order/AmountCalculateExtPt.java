package org.example.domain.order;

import com.alibaba.cola.extension.ExtensionPointI;

import java.math.BigDecimal;

/**
 * @author: wengdiquan
 * @data: 2020-01-02 14:40
 * @description: 用于计算不同单据类型的金额
 **/
public interface AmountCalculateExtPt extends ExtensionPointI {

    /**
     * 根据单据类型计算金额
     * @param amount
     * @return
     */
    String calculate(BigDecimal amount);
}
