package com.fancyliu.learningspringboot.controller;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class CustomErrorController{

//    public CustomErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
//        super(errorAttributes, errorProperties);
//    }
//
//    public CustomErrorController() {
//        super(new DefaultErrorAttributes(), new ErrorProperties());
//    }

//    /**
//     * 定义 500错误的 ModelAndView
//     *
//     * @param request
//     * @param response
//     * @return
//     */
//    @RequestMapping(produces = "text/html", value = "/500")
//    public ModelAndView error500html(HttpServletRequest request, HttpServletResponse response) {
//        response.setStatus(getStatus(request).value());
//        Map<String, Object> model = getErrorAttributes(request, isIncludeStackTrace(request, MediaType.TEXT_HTML));
//        model.put("msg", "这里是自定义的 500 错误信息");
//        model.put("message", request.getParameter("message"));
//        return new ModelAndView("error/500", model);
//    }
//
//    /**
//     * 定义 500错误的 JSON信息
//     *
//     * @param request
//     * @return
//     */
//    @RequestMapping(value = "/500")
//    @ResponseBody
//    public ResponseEntity<Map<String, Object>> error500(HttpServletRequest request) {
//        Map<String, Object> body = getErrorAttributes(request, isIncludeStackTrace(request, MediaType.ALL));
//        body.put("message", request.getParameter("message"));
//        body.put("msg", "这里是自定义的 500 错误信息");
//        HttpStatus status = getStatus(request);
//        return new ResponseEntity<Map<String, Object>>(body, status);
//    }

}
