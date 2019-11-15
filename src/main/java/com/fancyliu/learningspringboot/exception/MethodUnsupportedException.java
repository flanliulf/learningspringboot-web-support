package com.fancyliu.learningspringboot.exception;

import com.fancyliu.learningspringboot.exception.enums.BaseExceptionEnum;
import lombok.Data;

/**
 * 类描述:
 * 请求方式不支持异常
 *
 * @author : Liu Fan
 * @date : 2019/11/14 09:57
 */
@Data
public class MethodUnsupportedException extends GlobalException {

    /**
     * 提供默认构造方法, 用于序列化
     */
    public MethodUnsupportedException() {
        super(BaseExceptionEnum.UNSUPPORTED_REQUEST_METHOD.getCode(), BaseExceptionEnum.UNSUPPORTED_REQUEST_METHOD.getMessage());
    }

    /**
     * 自定义异常信息参数的构造方法
     *
     * @param errorMessage
     */
    public MethodUnsupportedException(String errorMessage) {
        super(BaseExceptionEnum.UNSUPPORTED_REQUEST_METHOD.getCode(), errorMessage);
    }
}
