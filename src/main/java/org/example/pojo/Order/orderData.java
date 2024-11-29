package org.example.pojo.Order;

import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class orderData {
    private String identify;

    private Float commission;

    private Integer status;

    private String order_num;

    private String name;

    private Integer type;

    private Integer userid;

    private Float  order_price;

    private String order_sn;

    private Integer createtime;

    private Integer updatetime;

    private Integer settlement_status;

    private String img;
}
