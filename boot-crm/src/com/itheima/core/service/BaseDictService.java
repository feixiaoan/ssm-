package com.itheima.core.service;

import java.util.List;

import com.itheima.core.po.BaseDict;

/*
 * �����ֵ�service�ӿ�
 */
public interface BaseDictService {
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
