package com.was.service;


import com.was.entitys.TbUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {
    public int create(TbUser tbUser);

    public TbUser getTbUserById(@Param("id") Integer id);
}
