package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.GoodsDao;
import com.bw.domain.Goods;
import com.bw.domain.Goodskind;
import com.bw.domain.brand;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;

	@Override
	public PageInfo<Goods> getlist(int page, String name) {
		PageHelper.startPage(page,2);
		List<Goods> list=goodsDao.getlist(name);
		PageInfo<Goods> pageInfo = new PageInfo<Goods>(list);
		return pageInfo;
	}

	@Override
	public List<brand> getbrand() {
		// TODO Auto-generated method stub
		return goodsDao.getbrand();
	}
	@Override
	public List<Goodskind> gets() {
		// TODO Auto-generated method stub
		return goodsDao.gets();
	}

	@Override
	public int add(Goods s) {
		// TODO Auto-generated method stub
		return goodsDao.add(s);
	}

	@Override
	public void deleteone(int id) {
		// TODO Auto-generated method stub
		goodsDao.deleteone(id);
	}

	@Override
	public void delAll(String ids) {
		// TODO Auto-generated method stub
		String[] split = ids.split(",");
		for (String i : split) {
			System.out.println(i);
			goodsDao.deleteone(Integer.parseInt(i));
		}
	}

	@Override
	public Goods selectone(Integer id) {
		// TODO Auto-generated method stub
		return goodsDao.selectone(id);
	}

	@Override
	public void update(Goods g) {
		goodsDao.update(g);
		
	}
}
