package com.was.dao;

import com.was.entitys.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2022
 * @author: WangAnShun
 * @create: 2022-09-11 16:39
 **/
@Mapper
public interface UserDao {
    public int create(TbUser tbUser);

    public TbUser getTbUserById(@Param("id") Integer id);

}
