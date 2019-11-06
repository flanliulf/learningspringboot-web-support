package com.fancyliu.learningspringboot.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class User {

    private int id;

    @NotEmpty(message = "姓名不能为空")
    private String name;

    @Max(message = "年龄不能大于 200 岁", value = 200)
    @Min(message = "年龄不能小于 18 岁", value = 18)
    private Integer age;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 6, message = "密码长度不能小于6位")
    private String password;

}
