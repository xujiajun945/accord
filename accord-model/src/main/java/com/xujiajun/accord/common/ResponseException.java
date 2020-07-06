package com.xujiajun.accord.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Setter
@Getter
@ToString
public class ResponseException extends RuntimeException {

	private static final long serialVersionUID = 8856887727426884857L;

	private Integer code;

	public ResponseException() {
		this(ResponseCodeEnum.OK);
	}

	public ResponseException(Integer code, String message) {
		super(message);
		this.code = code;
	}

	public ResponseException(ResponseCodeEnum codeEnum) {
		this(codeEnum.getCode(), codeEnum.getMessage());
	}

}
