package com.fancyliu.learningspringboot.controller;

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
    public User add(User user) {
        User result = this.userService.save(user);
        return result;
    }

    @PutMapping("user")
    public User update(User user) {
        User result = this.userService.update(user);
        return result;
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
}
