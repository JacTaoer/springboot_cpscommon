package org.example.controller;

import org.example.mapper.cpsMapper;
import org.example.pojo.Cate;
import org.example.pojo.Info;
import org.example.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cps")
public class cpsController {

    @Autowired
    private cpsMapper cpsmapper;

    @GetMapping("/allcate")
    public Result getAllcate() {
        List<Cate> ct = cpsmapper.getAllcate();
        return Result.success(ct);
    }

    @GetMapping("/getcate/cate")
    public Result getCate(@RequestParam("cate") Integer cate) {
        Info info = cpsmapper.getCate(cate);
        return Result.success(info);
    }

    @GetMapping("/getcate/id")
    public Result getCateid(@RequestParam("hcid") Integer hcid) {
        Info info = cpsmapper.getCatehcid(hcid);
        return Result.success(info);
    }

}
