package com.fancyliu.learningspringboot.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController {

//    private final String DEFAULT_ERROR_PATH = "/error";

//    @Override
//    public String getErrorPath() {
//        return DEFAULT_ERROR_PATH;
//    }
//
//    @RequestMapping(value = DEFAULT_ERROR_PATH)
//    public String handleError(HttpServletRequest request) {
//        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//
//        if (status != null) {
//            Integer statusCode = Integer.valueOf(status.toString());
//
//            if (statusCode == HttpStatus.NOT_FOUND.value()) {
//                return "404";
//            }
//
//            if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//                return "500";
//            }
//        }
//        return "error";
//    }

}
