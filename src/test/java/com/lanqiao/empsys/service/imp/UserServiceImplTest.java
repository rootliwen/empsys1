package com.lanqiao.empsys.service.imp;

import com.lanqiao.empsys.model.Users;
import com.lanqiao.empsys.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 张建平
 * @createtime 2022/2/6 下午6:00
 */
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    IUserService userService;

    // @BeforeEach
    // void setUp() {
    // }

    @Test
    void selectForLogin() {
        Users users = new Users();
        users.setUsername("admin");
        users.setPassword("admin");
        Users users1 = this.userService.selectForLogin(users);
        System.out.println(users1);
    }
}