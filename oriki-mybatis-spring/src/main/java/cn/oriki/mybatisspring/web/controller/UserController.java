package cn.oriki.mybatisspring.web.controller;

import cn.oriki.mybatisspring.domain.User;
import cn.oriki.mybatisspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "queryAll")
    public ModelAndView queryAll() {
        List<User> users = this.userService.queryAll();

        for (User user : users) {
            System.out.println(user);
        }

        return new ModelAndView("userList");
    }
}
