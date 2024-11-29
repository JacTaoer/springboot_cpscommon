package org.example.service.impl;

import org.example.mapper.orderMapper;
import org.example.pojo.Order.orderData;
import org.example.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderServicelmpl implements orderService {

    @Autowired
    private orderMapper ordermapper;

    @Override
    public List<orderData> queryIdentify(String identify) {
        List<orderData> od = ordermapper.queryIdentify(identify);
        return od;
    }

    @Override
    public List<orderData> queryAllorder() {
        List<orderData> od = ordermapper.queryAllorder();
        return od;
    }

    @Override
    public List<orderData> queryorderType(Integer type) {
        List<orderData> od = ordermapper.queryorderType(type);
        return od;
    }
}
