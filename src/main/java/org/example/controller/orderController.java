package org.example.controller;

import org.example.pojo.Order.orderData;
import org.example.pojo.Result;
import org.example.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class orderController {

    @Autowired
    private orderService orderservice;

    @GetMapping("/queryIdentify")
    public Result queryIdentify(@RequestParam("identify") String identify) {
        System.out.print(identify);
        List<orderData> od = orderservice.queryIdentify(identify);
        System.out.print(od);
        return Result.success(od);
    }

    @GetMapping("/queryAllorder")
    private Result queryAllorder() {
        List<orderData> od = orderservice.queryAllorder();
        return Result.success(od);
    }
}
