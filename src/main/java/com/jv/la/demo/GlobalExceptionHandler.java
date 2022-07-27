package com.jv.la.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public ErrorInfo handleMethodNotSupported(HttpServletRequest request, HttpServletResponse response, Exception ex){
        LOGGER.error(ex.getMessage(), ex);
        return new ErrorInfo(request, ex);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorInfo handleNotFound(HttpServletRequest request, HttpServletResponse response, Exception ex){
        LOGGER.error(ex.getMessage(), ex);
        return new ErrorInfo(request, "Not Found.");
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorInfo handleBadRequest(HttpServletRequest request, HttpServletResponse response, Exception ex){
        LOGGER.error(ex.getMessage(), ex);
        return new ErrorInfo(request, ex.getMessage());
    }

    @ExceptionHandler(EmptyListException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public ErrorInfo handleNoContent(HttpServletRequest request, HttpServletResponse response, Exception ex){
        LOGGER.error(ex.getMessage(), ex);
        return new ErrorInfo(request, ex.getMessage());
    }

    @ExceptionHandler(EmptyFieldException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorInfo handleEmptyField(HttpServletRequest request, HttpServletResponse response, Exception ex){
        LOGGER.error(ex.getMessage(), ex);
        return new ErrorInfo(request, "Empty field.");
    }

    @ExceptionHandler(NullFieldException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorInfo handleNullField(HttpServletRequest request, HttpServletResponse response, Exception ex){
        LOGGER.error(ex.getMessage(), ex);
        return new ErrorInfo(request, "Missing field.");
    }
}
