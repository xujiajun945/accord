package com.xujiajun.accord.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Setter
@Getter
@ToString
public class Demo implements Serializable {

	private static final long serialVersionUID = 2107543100712456839L;

	private Long id;

	private String info;

	private Date createTime;

	private Boolean deleted;
}
