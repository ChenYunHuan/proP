package com.chen.pro.util;


import tk.mybatis.mapper.common.Mapper;

public interface MyMapper<T> extends Mapper<T> {
	// FIXME 特别注意，该接口不能被扫描到，否则会出错
}