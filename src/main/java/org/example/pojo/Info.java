package org.example.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Info {
    private Integer id;

    private Integer cate;

    private Integer hcid;

    private String title;
    private String img;
    private String yongjin;
    private String jiesuan;
    private String shuoming;
    private String haibao;
    private Date starttime;
    private Date endtime;
    private String dingdanshuju;
    private String guiyin;
}
