package org.example.gateway;

import com.alibaba.cola.extension.Extension;
import org.example.domain.order.AmountCalculateExtPt;
import org.example.common.BizCode;
import org.example.common.ScenarioConstant;
import org.example.common.UseCaseConstant;

import java.math.BigDecimal;

/**
 * 预付账款金额计算
 * @author: wengdiquan
 * @data: 2020-01-02 14:43
 * @description:
 **/
@Extension(bizId = BizCode.BIZ_FINANCE, useCase = UseCaseConstant.AMOUNT_CALCULATE, scenario = ScenarioConstant.PREPAYMENT)
public class PrepaymentAmountCalculateImpl implements AmountCalculateExtPt {
    @Override
    public String calculate(BigDecimal amount) {
        return "预付账款:" + amount;
    }
}
