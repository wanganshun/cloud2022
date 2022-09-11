package com.was.controller;


import com.was.entitys.CommonResult;
import com.was.entitys.TbUser;
import com.was.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: cloud2022
 * @author: WangAnShun
 * @create: 2022-09-11 17:01
 **/


@RestController
@Slf4j
@Api(tags = "TbUserController", description = "后台用户管理")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @ApiOperation("添加用户")
    @PostMapping("/tbUser/create")
    public CommonResult create(@RequestBody TbUser tbUser){
        int result = userService.create(tbUser);
        log.info("*****插入数据"+result);
        if (result>0){
            return new CommonResult(200,"插入成功",tbUser);
        }else {
            return new CommonResult(444,"添加失败");

        }
    }

    @ApiOperation("查询用户")
    @GetMapping("/tbUser/get/{id}")
    public CommonResult<TbUser> get(@PathVariable Integer id){
        TbUser tbUser = userService.getTbUserById(id);

        if (null!=tbUser){
            return new CommonResult(200,"查询成功",tbUser);
        }else {
            return new CommonResult(444,"查询失败");

        }


    }




}
