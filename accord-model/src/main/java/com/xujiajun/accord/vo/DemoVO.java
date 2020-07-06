package com.xujiajun.accord.vo;

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
public class DemoVO implements Serializable {

	private static final long serialVersionUID = 5522400822043012967L;

	private Long id;

	private String info;

	private Date createTime;
}
