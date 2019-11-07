package com.fancyliu.learningspringboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@ApiModel(description = "用户对象")
public class User {

    @ApiModelProperty(value = "主键ID", name = "id", required = true, example = "1")
    private int id;

    @ApiModelProperty(value = "姓名", name = "name", required = true, example = "zhansan")
    @NotEmpty(message = "姓名不能为空")
    private String name;

    @ApiModelProperty(value = "年龄", name = "age", required = true, example = "18")
    @Max(message = "年龄不能大于 200 岁", value = 200)
    @Min(message = "年龄不能小于 18 岁", value = 18)
    private Integer age;

    @ApiModelProperty(value = "密码", name = "password", required = true, example = "111111")
    @NotEmpty(message = "密码不能为空")
    @Length(min = 6, message = "密码长度不能小于6位")
    private String password;

}
