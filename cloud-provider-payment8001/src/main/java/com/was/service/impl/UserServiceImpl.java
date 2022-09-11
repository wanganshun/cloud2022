package com.was.service.impl;

import com.was.dao.UserDao;
import com.was.entitys.TbUser;
import com.was.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: cloud2022
 * @author: WangAnShun
 * @create: 2022-09-11 16:59
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int create(TbUser tbUser) {
        int i=userDao.create(tbUser);

        return i;
    }

    @Override
    public TbUser getTbUserById(Integer id) {
        return userDao.getTbUserById(id);
    }
}
