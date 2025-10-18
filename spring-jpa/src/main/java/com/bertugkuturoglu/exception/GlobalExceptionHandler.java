package com.bertugkuturoglu.exception;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    //Spring validationdan firlatilan hatalari alip yonetmek ve response donmek
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
   public void handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        for (ObjectError objerror : ex.getBindingResult().getAllErrors()) {}


    }
}
