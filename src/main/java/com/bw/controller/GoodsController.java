package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.domain.Goods;
import com.bw.domain.Goodskind;
import com.bw.domain.brand;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	@RequestMapping("list")
	public String getlist(@RequestParam(defaultValue = "1")int page,String name,Model m) {
		PageInfo<Goods> pageinfo=goodsService.getlist(page,name);
		m.addAttribute("page", pageinfo);
		m.addAttribute("name", name);
		return "list";
	}
	@RequestMapping("toadd")
	public String toadd(Model m) {
		m.addAttribute("goods",new Goods());
		return "add";
	}
	@RequestMapping("getbrand")
	@ResponseBody
	public Object getbrand() {
		List<brand> list=goodsService.getbrand();
		return list;
	}
	@RequestMapping("gets")
	@ResponseBody
	public Object gets() {
		List<Goodskind> list=goodsService.gets();
		return list;
	}
	@RequestMapping("add")
	public boolean add(@ModelAttribute("goods")Goods s ,MultipartFile file,Integer bid ,Integer g_sid) throws IllegalStateException, IOException{
		s.setBid(bid);
		s.setG_sid(g_sid);
		System.out.println(s);
		System.err.println("--------------------");
		if(file!=null) {
			String path="D:\\Photo";
			String oldfilename=file.getOriginalFilename();
			String filename=UUID.randomUUID()+oldfilename.substring(oldfilename.lastIndexOf("."));
			File file2 = new File(path+filename);
			file.transferTo(file2);
			s.setPic(filename);
		}
		return goodsService.add(s)>0;
	}
	@RequestMapping("deleteone")
	public String deleteone(int id) {
		goodsService.deleteone(id);
		return "redirect:list";
	}
	@RequestMapping("delAll")
	public String deleteone(String ids) {
		goodsService.delAll(ids);
		return "redirect:list";
	}
	@RequestMapping("toupdate")
	public String toupdate(Integer id,Model m) {
		Goods g=goodsService.selectone(id);
		List<Goodskind> list=goodsService.gets();
		List<brand> list1=goodsService.getbrand();
		m.addAttribute("g",g);
		m.addAttribute("list1", list);
		m.addAttribute("list2", list1);
		return "update";
	}
	@RequestMapping("select")
	public String select(Integer id,Model m) {
		Goods g=goodsService.selectone(id);
		m.addAttribute("g",g);
		return "select";
	}
	@RequestMapping("update.do")
	public String update(@ModelAttribute("g") Goods g,MultipartFile file) throws IllegalStateException, IOException {
		if(!file.isEmpty() &&file!=null) {
			String path="D:\\Photo";
			String oldfilename=file.getOriginalFilename();
			String filename=UUID.randomUUID()+oldfilename.substring(oldfilename.lastIndexOf("."));
			File file2 = new File(path+filename);
			file.transferTo(file2);
			g.setPic(filename);
		}
		goodsService.update(g);
		return "redirect:list";
	}
	
}
