package com.fancyliu.learningspringboot.controller;

import com.fancyliu.learningspringboot.common.response.ResponseData;
import com.fancyliu.learningspringboot.exception.ApiServiceException;
import com.fancyliu.learningspringboot.exception.ParamBindException;
import com.fancyliu.learningspringboot.model.User;
import com.fancyliu.learningspringboot.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "用户", description = "用户接口 API", position = 100, protocols = "http")
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;


    @ApiOperation(value = "新增用户",
            notes = "根据接口参数新建用户",
            produces = "application/json",
            consumes = "application/json",
            response = User.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键ID", required = false, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "用户姓名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "age", value = "年龄", required = true, dataType = "Integer", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 100, message = "请求参数有误"),
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 401, message = "未授权"),
            @ApiResponse(code = 403, message = "禁止访问"),
            @ApiResponse(code = 404, message = "请求路径不存在")
    })
    @PostMapping("user")
    public ResponseData add(User user) {
        User result = this.userService.save(user);
        return new ResponseData(true, 200, "保存成功", result);
    }

    @PutMapping("user")
    public ResponseData update(User user) {
        User result = this.userService.update(user);
        return new ResponseData(true, 200, "操作成功", result);
    }

    @PatchMapping("user/name")
    public User updateName(User user) {
        User result = this.userService.updateName(user);
        return result;
    }

    @DeleteMapping("user/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.userService.deleteById(id);
        return "success";
    }


    @GetMapping("user/{id}")
    public User find(@PathVariable("id") Integer id) {
        User user = this.userService.findById(id);
        return user;
    }

    @GetMapping("users")
    public List<User> list() {
        List<User> users = this.userService.findAll();
        return users;
    }

    @PostMapping("user/ex/{param}")
    public ResponseData ex(@PathVariable("param") Integer param) {
        // 默认自定义参数绑定异常
        if ("1".equals(param)) {
            throw new ParamBindException();
        }

        // 模拟自定义 API 接口调用异常
        if ("2".equals(param)) {
            throw new ApiServiceException();
        }

        // 模拟空指针系统异常
        if ("3".equals(param)) {
            throw new NullPointerException();
        }

        // 模拟数字格式转换系统异常
        Integer p = Integer.valueOf(param);

        ResponseData responseData = new ResponseData(true, 200, "操作成功", p);
        return responseData;
    }
}
