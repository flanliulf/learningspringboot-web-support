package com.fancyliu.learningspringboot.exception.enums;

/**
 * 类描述:
 * 异常响应枚举类
 *
 * @author : Liu Fan
 * @date : 2019/11/13 17:46
 */
public enum BaseExceptionEnum {
    /**
     *
     */
    NOT_FOUND(404, "请求地址不存在"),
    FILE_NOT_FOUND(400, "文件找不到"),
    SERVER_ERROR(500, "服务器内部错误"),

    API_SERVICE_ERROR(500, "API 接口调用错误"),

    UNSUPPORTED_REQUEST_METHOD(400, "不支持的请求方法"),
    PARAM_BIND_ERROR(400, "参数绑定错误"),
    ;

    /**
     * 异常响应码
     */
    private Integer code;

    /**
     * 异常信息
     */
    private String message;

    BaseExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
