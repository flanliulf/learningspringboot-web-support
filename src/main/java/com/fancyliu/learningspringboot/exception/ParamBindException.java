package com.fancyliu.learningspringboot.exception;

import com.fancyliu.learningspringboot.exception.enums.BaseExceptionEnum;
import lombok.Data;

/**
 * 类描述:
 * 参数绑定异常
 *
 * @author : Liu Fan
 * @date : 2019/11/14 09:58
 */
@Data
public class ParamBindException extends GlobalException {

    /**
     * 提供默认构造方法, 用于序列化
     */
    public ParamBindException() {
        super(BaseExceptionEnum.PARAM_BIND_ERROR.getCode(), BaseExceptionEnum.PARAM_BIND_ERROR.getMessage());
    }

    /**
     * 自定义异常信息参数的构造方法
     *
     * @param errorMessage
     */
    public ParamBindException(String errorMessage) {
        super(BaseExceptionEnum.PARAM_BIND_ERROR.getCode(), errorMessage);
    }
}
