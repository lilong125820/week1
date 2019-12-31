package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.domain.Goods;
import com.bw.domain.Goodskind;
import com.bw.domain.brand;

public interface GoodsDao {

	List<Goods> getlist(@Param("name")String name);

	List<brand> getbrand();

	List<Goodskind> gets();

	int add(Goods s);

	void deleteone(@Param("id")int id);

	Goods selectone(@Param("id")Integer id);

	void update(Goods g);

}
