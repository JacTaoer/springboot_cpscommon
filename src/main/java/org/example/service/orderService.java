package org.example.service;

import org.example.pojo.Order.orderData;

import java.util.List;

public interface orderService {

    List<orderData> queryIdentify(String identify);

    List<orderData> queryAllorder();
}
