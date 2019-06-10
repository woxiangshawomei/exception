package com.qf.exception.handler;

import com.qf.exception.pojo.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean sorry(Exception e){
        return new  ResultBean("404","sorry");
    }
}
