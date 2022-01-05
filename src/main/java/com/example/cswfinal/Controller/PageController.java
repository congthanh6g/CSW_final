package com.example.cswfinal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping(value = "/index")
    public String indexPage()
    {
        return "index";
    }
}
