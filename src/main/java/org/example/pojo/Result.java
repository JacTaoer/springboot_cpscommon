package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 统一响应结果
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    // 快速返回操作成功响应结果（带响应数据）
    public  static <E> Result<E> success(E data) {
        return new Result<>(200,"操作成功",data);
    }

    // 快速返回操作成功响应结果
    public static Result success() {
        return new Result(200,"操作成功",null);
    }


    public static Result error(String message) {
        return new Result(401,message,null);
    }
    public static Result error(Integer code,String message) {
        return new Result(code,message,null);
    }


}