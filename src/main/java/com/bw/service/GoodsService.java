package com.bw.service;

import java.util.List;

import com.bw.domain.Goods;
import com.bw.domain.Goodskind;
import com.bw.domain.brand;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	PageInfo<Goods> getlist(int page, String name);

	List<brand> getbrand();

	List<Goodskind> gets();

	int add(Goods s);

	void deleteone(int id);

	void delAll(String ids);

	Goods selectone(Integer id);

	void update(Goods g);
}
