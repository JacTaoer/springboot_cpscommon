package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Cate;
import org.example.pojo.Info;

import java.util.List;

@Mapper
public interface cpsMapper {

    @Select("select * from fa_cate")
    List<Cate> getAllcate();

    @Select("select * from fa_cate where cate = #{cate}")
    Info getCate(Integer cate);

    @Select("select * from fa_cate where hcid = #{hcid}")
    Info getCatehcid(Integer hcid);
}
