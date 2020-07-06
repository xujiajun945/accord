package com.xujiajun.accord.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Setter
@Getter
@ToString
public class Pager<T> implements Serializable {

	private static final long serialVersionUID = 1397612340536430044L;

	private Integer page;

	private Integer rows;

	private Integer totalRows;

	private List<T> list;

	public Pager(Integer page, Integer rows) {
		this.page = page > 0 ? page : 1;
		this.rows = rows > 0 ? (rows <= 50 ? rows : 50) : 10;
	}

	public Pager(Integer page, Integer rows, Integer totalRows) {
		this(page, rows);
		this.totalRows = totalRows;
	}

	public Integer position() {
		return (this.page - 1) * this.rows;
	}
}
