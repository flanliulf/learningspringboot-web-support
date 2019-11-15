package com.fancyliu.learningspringboot.handler;

import com.fancyliu.learningspringboot.common.response.ResponseData;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述:
 * 用来处理到达 controller 层之前的请求错误,比如请求路径错误等
 *
 * @author : Liu Fan
 * @date : 2019/11/15 10:18
 */
@RestController
public class RequestErrorHandler implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public ResponseData errorPage() {
        return new ResponseData(false, 404, "请求路径错误", null);
    }
}
