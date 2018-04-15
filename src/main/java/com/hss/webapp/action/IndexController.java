package com.hss.webapp.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    public IndexController() {
        System.out.println("=====================初始化============");
    }

    @RequestMapping(value = "/index")
    public String indexJSP() {
        return "/signIn";
    }
}
