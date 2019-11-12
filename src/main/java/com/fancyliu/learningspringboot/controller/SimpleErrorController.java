package com.fancyliu.learningspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleErrorController {

    @RequestMapping(value = "/zero")
    @ResponseBody
    public String zero() {
        int i = 5 / 0;
        return "zero";
    }

    @RequestMapping(value = "/npe")
    @ResponseBody
    public String npe() {
        Integer a = null;
        a.toString();
        return "npe";
    }

//    @RequestMapping(value = "/error/500")
//    public String innerError() {
//        return "error";
//    }
}
