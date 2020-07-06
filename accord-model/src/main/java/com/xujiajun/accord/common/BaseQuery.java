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
public class BaseQuery implements Serializable {

	private static final long serialVersionUID = 2431757085035527739L;

	private Integer page;

	private Integer rows;

	private String keywords;

	private Integer position;
}
