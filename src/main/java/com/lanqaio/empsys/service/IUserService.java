package com.lanqaio.empsys.service;

import com.lanqaio.empsys.model.Users;
import com.lanqaio.empsys.model.Users;

/**
 * @author 张建平
 * @createtime 2022/2/6 下午5:50
 */
public interface IUserService {

    Users selectForLogin(Users user);

}
