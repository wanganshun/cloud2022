package com.was.controller;

import com.was.entitys.CommonResult;
import com.was.entitys.TbUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud2022
 * @author: WangAnShun
 * @create: 2022-09-11 22:41
 **/
@Slf4j
@Api(tags = "TbUserController", description = "后台用户管理")
@RestController
public class OrderController {
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @ApiOperation("添加用户")
    @GetMapping("/consumer/tbUser/create")
    public CommonResult<TbUser> create(TbUser tbUser){
        return restTemplate.postForObject(PAYMENT_URL+"/tbUser/create",tbUser,CommonResult.class);
    }
    @ApiOperation("查询用户")
    @GetMapping("/consumer/tbUser/get/{id}")
    public CommonResult<TbUser> get(@PathVariable Integer id){
        return restTemplate.getForObject(PAYMENT_URL+"/tbUser/get/"+id,CommonResult.class);
    }


}
