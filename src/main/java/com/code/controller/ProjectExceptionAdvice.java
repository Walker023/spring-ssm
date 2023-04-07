package com.code.controller;

import com.code.exception.BusinessException;
import com.code.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        System.out.println("系统异常通知");
        System.out.println(ex.getMessage());
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex) {
        System.out.println("业务异常通知");
        System.out.println(ex.getMessage());
        return new Result(ex.getCode(),null,ex.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        System.out.println("异常通知");
        System.out.println(ex.getMessage());
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"系统未知异常");
    }
}
