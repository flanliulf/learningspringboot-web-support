package com.fancyliu.learningspringboot.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ArithmeticExceptionHandler {

//    @ExceptionHandler(ArithmeticException.class)
//    public String handle(ArithmeticException e, RedirectAttributes redirectAttributes, HttpServletRequest request) {
//        redirectAttributes.addFlashAttribute("message", "数学计算异常");
//        return "redirect:/error/500";
//    }
}
