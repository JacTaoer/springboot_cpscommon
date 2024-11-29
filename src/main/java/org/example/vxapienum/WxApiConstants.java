package org.example.vxapienum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

/**
 * <p>
 * 请求地址枚举类
 * </p>
 *
 * @author Lch
 * @dateTime 2024/2/26 15:41
 */
@AllArgsConstructor
@Getter
public enum WxApiConstants {



    /**
     * jsapi下单
     */
    JSAPI_PAY("/v3/pay/transactions/jsapi"),

    /**
     *  mchid
     */

    /**
     * 商户订单查询订单号
     */
    OUT_TRADE_NO("/v3/pay/transactions/out-trade-no/"),

    /**
     * 商户订单查询订单号
     */
    TRANSACTIONS("/v3/pay/transactions/id/"),

    /**
     * 申请退款
     */
    DOMESTIC_REFUNDS("/v3/refund/domestic/refunds");


    /**
     * 类型
     */

    private final String type;


    public String getType() {
        return type;
    }
}
