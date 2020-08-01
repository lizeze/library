/**
 * @author zeze.li
 * @version 1.0.0
 * @ClassName UnifyResponse.java
 * @Description TODO
 * @createTime 2020年08月01日 18:35:00
 */
package com.github.lizeze.exception;


import com.github.lizeze.exception.http.HttpException;

public class UpdateSuccess extends HttpException {
    public UpdateSuccess(int code){
        this.httpStatusCode = 200;
        this.code = code;
    }
//    201 202 204
}
