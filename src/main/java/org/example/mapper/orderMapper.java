package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Order.orderData;

import java.util.List;

@Mapper
public interface orderMapper {
    @Select("select * from fa_order where identify = #{identify}")
    List<orderData> queryIdentify(String identify);

    @Select("select * from fa_order")
    List<orderData> queryAllorder();

    @Select("select * from fa_order where type = #{type}")
    List<orderData> queryorderType(Integer type);
}
