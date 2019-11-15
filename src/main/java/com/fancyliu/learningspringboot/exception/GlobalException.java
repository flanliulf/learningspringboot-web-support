package com.fancyliu.learningspringboot.exception;

import com.fancyliu.learningspringboot.exception.enums.BaseExceptionEnum;
import lombok.Data;

/**
 * 类描述:
 * 全局异常抽象父类
 *
 * @author : Liu Fan
 * @date : 2019/11/13 17:24
 */
@Data
public abstract class GlobalException extends RuntimeException {

    /**
     * 异常编码
     */
    private Integer code;

    /**
     * 异常提示信息
     */
    private String errorMessage;

    /**
     * 默认构造方法, 用于序列化
     */
    public GlobalException() {
        super(BaseExceptionEnum.SERVER_ERROR.getMessage());
        this.code = BaseExceptionEnum.SERVER_ERROR.getCode();
        this.errorMessage = BaseExceptionEnum.SERVER_ERROR.getMessage();
    }


    /**
     * 标准构造方法
     *
     * @param code
     * @param errorMessage
     */
    public GlobalException(Integer code, String errorMessage) {
        super(errorMessage);
        this.code = code;
        this.errorMessage = errorMessage;
    }

    /**
     * 异常信息参数的构造方法
     *
     * @param errorMessage
     */
    public GlobalException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    /**
     * 基于异常枚举参数的构造方法
     *
     * @param baseExceptionEnum
     */
    public GlobalException(BaseExceptionEnum baseExceptionEnum) {
        super(baseExceptionEnum.getMessage());
        this.code = baseExceptionEnum.getCode();
        this.errorMessage = baseExceptionEnum.getMessage();
    }

    /**
     * 获取当前异常类名
     *
     * @return
     */
    public String getExceptionClassName() {
        return this.getClass().getName();
    }
}
