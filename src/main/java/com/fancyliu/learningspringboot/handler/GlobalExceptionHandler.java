package com.fancyliu.learningspringboot.handler;

import com.fancyliu.learningspringboot.common.response.ResponseData;
import com.fancyliu.learningspringboot.exception.GlobalException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseData handle(Exception ge, HttpServletRequest request) {
        ResponseData responseData = new ResponseData();
        responseData.setData(null);
        responseData.setSuccess(false);

        if (ge instanceof GlobalException) {
            // 对于自定义的业务异常进行封装
            responseData.setCode(((GlobalException) ge).getCode());
            responseData.setMessage(ge.getMessage());
        } else if (ge instanceof ServletException) {
            // Servlet 请求异常
            responseData.setCode(400);
            responseData.setMessage(ge.getClass().getSimpleName() + ":" + ge.getMessage());
        } else if (ge instanceof ServletException) {
            // 其他的运行时系统异常
            responseData.setCode(500);
            responseData.setMessage(ge.getClass().getSimpleName() + ":" + ge.getMessage());
        }

        else {
            // 其他的运行时系统异常
            responseData.setCode(500);
            responseData.setMessage(ge.getClass().getSimpleName() + ":" + ge.getMessage());
        }

        return responseData;
    }
}
