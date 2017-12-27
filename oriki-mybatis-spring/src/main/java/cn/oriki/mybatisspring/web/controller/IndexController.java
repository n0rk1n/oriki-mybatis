package cn.oriki.mybatisspring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * 跳转获取服务器时间的页面
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(value = {"index"})
    public ModelAndView toIndex() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("date", new Date());
        return modelAndView;
    }
}
