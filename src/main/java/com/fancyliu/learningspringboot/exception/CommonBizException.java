package com.fancyliu.learningspringboot.exception;

import com.fancyliu.learningspringboot.exception.enums.BaseExceptionEnum;
import lombok.Data;

/**
 * 类描述:
 * 用来封装类似空指针,数字格式转换等运行时系统异常(非业务异常)的通用异常类
 *
 * @author : Liu Fan
 * @date : 2019/11/14 15:09
 */
@Data
public class CommonBizException extends GlobalException {

    /**
     * 提供默认构造方法, 用于序列化
     */
    public CommonBizException() {
        super();
    }

    /**
     * 自定义异常信息参数的构造方法
     *
     * @param errorMessage
     */
    public CommonBizException(String errorMessage) {
        super(BaseExceptionEnum.SERVER_ERROR.getCode(), errorMessage);
    }
}
