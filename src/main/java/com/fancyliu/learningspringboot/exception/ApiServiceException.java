package com.fancyliu.learningspringboot.exception;

import com.fancyliu.learningspringboot.exception.enums.BaseExceptionEnum;
import lombok.Data;

/**
 * 类描述:
 * API 接口调用异常
 *
 * @author : Liu Fan
 * @date : 2019/11/14 09:52
 */
@Data
public class ApiServiceException extends GlobalException {

    /**
     * 提供默认构造方法, 用于序列化
     */
    public ApiServiceException() {
        super(BaseExceptionEnum.API_SERVICE_ERROR.getCode(), BaseExceptionEnum.API_SERVICE_ERROR.getMessage());
    }

    /**
     * 自定义异常信息参数的构造方法
     *
     * @param errorMessage
     */
    public ApiServiceException(String errorMessage) {
        super(BaseExceptionEnum.API_SERVICE_ERROR.getCode(), errorMessage);
    }
}
