package com.gpw.devtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Gpw
 * @Date: 2019/5/26
 * @Description: com.gpw.devtools.controller
 * @Version: 1.0
 */
@Controller
public class controller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
