package org.example.reqparam;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * <p>
 * 微信支付退款
 * </p>
 *
 * @author Lch
 * @dateTime 2024/2/27 9:47
 */
@Data
public class WxPayRefundReqParam {

    /**
     * 订单号 自己生成的
     */
    @NotBlank(message = "微信支付订单id不可以为空")
    private String transactionId;

    private String out_trade_no;

    /**
     * 退款金额
     */
    @NotBlank(message = "退款金额不可以为空")
    private String refundMoney;

    /**
     * 支付时的金额
     */
    @NotBlank(message = "支付金额不可以为空")
        private String totalMoney;

}
