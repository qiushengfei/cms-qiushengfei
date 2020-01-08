package com.qiushengfei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qiushengfei.entity.User;

public interface BaseDao<T> {

	/**select
	 * 按条件查询
	 * @param user
	 * @return
	 */
	List<T> select(T t);
	/**
	 * ID查询
	 * @param id
	 * @return
	 */
	T selectById(T t);
	/**
	 * 新增
	 * @param user
	 * @return
	 */
	int insert(T t);
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	int update(T t);
	/**
	 * 删除
	 */
	int delete(@Param("ids") String ids);
}
