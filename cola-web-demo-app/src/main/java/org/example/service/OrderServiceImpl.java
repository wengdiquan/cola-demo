package org.example.service;

import com.alibaba.cola.extension.BizScenario;
import com.alibaba.cola.extension.ExtensionExecutor;
import lombok.RequiredArgsConstructor;
import org.example.api.OrderService;
import org.example.common.BizCode;
import org.example.common.UseCaseConstant;
import org.example.domain.order.AmountCalculateExtPt;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author: wengdiquan
 * @data: 2020-01-02 15:06
 * @description:
 **/
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final ExtensionExecutor extensionExecutor;

    @Override
    public String calculateAmount(String orderType, BigDecimal amount) {
        BizScenario bizScenario = BizScenario.valueOf(BizCode.BIZ_FINANCE, UseCaseConstant.AMOUNT_CALCULATE, orderType);
        return extensionExecutor.execute(AmountCalculateExtPt.class, bizScenario,
                p -> p.calculate(amount));
    }
}
