package org.example.exception;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-31
 * Time: 16:47:18
 */
import lombok.Getter;
import lombok.Setter;

/**
 * 自定义异常：保存错误码和错误消息
 */
@Getter
@Setter
public class AppException extends RuntimeException {

    private String code;

    public AppException( String code, String message) {
        super(message);
        this.code = code;
    }

    public AppException( String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}