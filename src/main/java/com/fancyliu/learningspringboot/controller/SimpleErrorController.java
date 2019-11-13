package com.fancyliu.learningspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleErrorController {

    @RequestMapping(value = "/zero")
    @ResponseBody
    public Object zero() {
        int i = 5 / 0;
        return "zero";
    }

    @RequestMapping(value = "/npe")
    @ResponseBody
    public Object npe() {
        Integer a = null;
        a.toString();
        return "npe";
    }

    /**
     * 局部异常处理方法
     *
     * @param e
     * @return
     */
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public String exceptionHandler(Exception e) {
//        // 对除 0 异常进行单独处理
//        if (e instanceof ArithmeticException) {
//            return "发生了数学计算异常";
//        }
//        return "发生了其他未知异常";
//    }

//    @RequestMapping(value = "/error/500")
//    public String innerError() {
//        return "error";
//    }
}
