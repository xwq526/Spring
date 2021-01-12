package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 21:33:51
 */
@Getter
@Setter
@ToString
public class JSONResponse {
    private boolean success;
    private String code;
    private String message;
    private Object data;
}
