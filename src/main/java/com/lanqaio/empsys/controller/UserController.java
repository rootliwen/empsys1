package com.lanqaio.empsys.controller;

import com.lanqaio.empsys.model.Users;
import com.lanqaio.empsys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class UserController {

    @GetMapping("/")
    public String index(){
        return "login";
    }

    @Autowired(required = false)
    IUserService userService;

    @PostMapping("/user/login")
    public String loginUser(Users user) {
        System.out.println(user);
        Users logUser = this.userService.selectForLogin(user);
        System.out.println(logUser);
        log.debug("" + logUser);

        if (logUser != null) { //success
            return "employee/list"; // employee/list.html
        }
        return "redirect:/";
    }
}
