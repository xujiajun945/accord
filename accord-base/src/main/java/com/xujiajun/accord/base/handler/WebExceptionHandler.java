package com.xujiajun.accord.base.handler;

import com.xujiajun.accord.common.ResponseData;
import com.xujiajun.accord.common.ResponseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@RestControllerAdvice
@Slf4j
public class WebExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = ResponseException.class)
	public ResponseData handleResponseException(ResponseException e) {
		return new ResponseData(e);
	}
}
