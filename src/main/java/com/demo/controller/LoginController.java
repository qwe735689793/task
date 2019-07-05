package com.demo.controller;

import com.demo.entity.Account;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author sch
 * @create 2019/4/12
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private HttpSession session;

    /**
     * 跳转到登录界面
     *
     * @param map
     * @return
     */
    @RequestMapping("getLogin")
    public String getLogin(ModelMap map) {
        return "Login";
    }

    /**
     * 登录账户验证
     */
    @RequestMapping("/checkLogin")
    @ResponseBody
    public String checkLogin(@RequestBody Map<String, Object> map) {
        String flag = "/getindex";
        Account newUser = new Account();
        newUser.setName(map.get("username").toString());
        newUser.setPassword(map.get("password").toString());
        Account oldUser = userService.getUserByName(newUser.getName());
        System.out.println(oldUser);
        return flag;
    }
}
