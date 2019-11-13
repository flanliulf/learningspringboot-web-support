package com.fancyliu.learningspringboot.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handle(Exception e, HttpServletRequest request) {
        Map<String, Object> returnMap = new HashMap<>();

        returnMap.put("code", HttpStatus.INTERNAL_SERVER_ERROR.value());
        returnMap.put("message", e.getMessage() == null ? e.toString() : e.getMessage());
        returnMap.put("data", "");
        returnMap.put("success", false);

        return returnMap;
    }
}
