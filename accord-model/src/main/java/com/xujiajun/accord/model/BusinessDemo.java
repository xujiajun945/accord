package com.xujiajun.accord.model;

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
public class BusinessDemo implements Serializable {

	private static final long serialVersionUID = -723603980864734078L;

	private Long id;

	private String message;

	private Boolean deleted;
}
