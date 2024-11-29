package org.example.reqparam;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * <p>
 * 预支付参数
 * </p>
 *
 * @author Lch
 * @dateTime 2024/2/26 13:30
 */
@Data
@Accessors(chain = true)
public class WxPayReqParam {

    /**
     * 总金额
     */
    @NotBlank(message = "总金额不能为空！")
    private String totalPrice;

    /**
     * 商品名称
     */
    @NotBlank(message = "商品名称不能为空！")
    private String goodsName;

    /**
     * openId
     */
    @NotBlank(message = "openId不能为空！")
    private String openId;

    /**
     * 订单号
     */
    @NotBlank(message = "商品订单号不能为空！")
    private String orderNumber;


    /**
     * 回调地址
     */
    private String notify_url;
}
