package com.bw.domain;

public class Goods {
	private Integer gid;
	private String name;
	private String ename;
	private Double cc;
	private Double price;
	private Integer number;
	private String bq;
	private String pic;
	private Integer bid;
	private String bname;
	private Integer g_sid;
	private String gname;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getCc() {
		return cc;
	}
	public void setCc(Double cc) {
		this.cc = cc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Integer getG_sid() {
		return g_sid;
	}
	public void setG_sid(Integer g_sid) {
		this.g_sid = g_sid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", name=" + name + ", ename=" + ename + ", cc=" + cc + ", price=" + price
				+ ", number=" + number + ", bq=" + bq + ", pic=" + pic + ", bid=" + bid + ", bname=" + bname
				+ ", g_sid=" + g_sid + ", gname=" + gname + "]";
	}
	
}
