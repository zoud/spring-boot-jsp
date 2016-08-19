package me.zoud.springboot.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zoud on 2016/8/19.
 */
@Controller
public class BasicController {

    @RequestMapping(value = {"/", "/index", "/home"})
    public String home(){
        return "index";
    }
}
