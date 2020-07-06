package com.xujiajun.accord.common;

import lombok.Getter;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Getter
public enum ResponseCodeEnum {

	/** 成功 */
	OK(1, "success"),

	BAD_REQUEST(500, "服务器异常"),
	;

	private Integer code;

	private String message;

	ResponseCodeEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
