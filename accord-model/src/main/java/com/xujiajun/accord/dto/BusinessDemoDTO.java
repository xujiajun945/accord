package com.xujiajun.accord.dto;

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
public class BusinessDemoDTO implements Serializable {

	private static final long serialVersionUID = -6162738226510192222L;

	private Long id;

	private String message;
}
