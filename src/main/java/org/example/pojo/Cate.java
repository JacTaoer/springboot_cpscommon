package org.example.pojo;

import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class Cate {
    private Integer id;

    private Integer hcid;

    private Integer pid;

    private String 	name;

    private String title;

    private String img;

    private String 	img_sel;

    private Integer ismenu;

    private String keyword;

    private String icon;
}
