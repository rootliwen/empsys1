package com.lanqaio.empsys.service.impl;

import com.lanqaio.empsys.dao.UserMapper;
import com.lanqaio.empsys.model.Users;
import com.lanqaio.empsys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张建平
 * @createtime 2022/2/6 下午5:56
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public Users selectForLogin(Users user) {
        return this.userMapper.selectForLogin(user);
    }

}
