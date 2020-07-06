package com.xujiajun.accord.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Setter
@Getter
@ToString
public class ResponseData implements Serializable {

	private static final long serialVersionUID = 9205346456854534907L;

	private Integer code;

	private String message;

	private Object data;

	public ResponseData() {
		this(ResponseCodeEnum.OK);
	}

	public ResponseData(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public ResponseData(Integer code, String message, Object data) {
		this(code, message);
		this.data = data;
	}

	public ResponseData(Object date) {
		this();
		this.data = date;
	}

	public ResponseData(ResponseCodeEnum codeEnum) {
		this.code = codeEnum.getCode();
		this.message = codeEnum.getMessage();
	}

	public ResponseData(ResponseCodeEnum codeEnum, Object data) {
		this(codeEnum);
		this.data = data;
	}

	public ResponseData(ResponseException exception) {
		this(exception.getCode(), exception.getMessage());
	}
}
