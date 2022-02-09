package com.lanqiao.empsys.controller;
import com.lanqiao.empsys.model.Emp;
import com.lanqiao.empsys.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller         //控制器方法是同步操作
// @RestController  //控制器方法是异步操作，响应的是JSON数据，当开发是完全前后端分离的项目时，后端API 服务的控制器就用此注解
public class EmployeeController {
    @Autowired(required = false)
    IEmpService empService;

    @GetMapping("/employees")
    public String queryAll(Emp emp, Integer pageNum, Model model, HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
            //保留查询条件
            session.setAttribute("selective",emp);
        } else {
            emp = (Emp) session.getAttribute("selective");
        }
        //查询
        List<Emp> employeeList = empService.selectBySelective(emp, pageNum, 5);
        //保存数据请求作用域
        model.addAttribute("employeeList", employeeList);
        return "employee/list";  //forward to employee/list.html
    }

    @GetMapping("/employees/{empno}")
    public String selectByNo(@PathVariable("empno") Integer empno, Model model) {
        Emp employee = this.empService.selectByPrimaryKey(empno);
        model.addAttribute("emp",employee);
        return "employee/updateForm";
    }

}
