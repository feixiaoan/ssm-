package com.itheima.core.dao;

import java.util.List;

import com.itheima.core.po.BaseDict;

/*
 * Êý¾Ý×Öµä
 */
public interface BaseDictDao {
	public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
