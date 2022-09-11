package com.was.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2022
 * @author: WangAnShun
 * @create: 2022-09-11 16:43
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);

    }

}
