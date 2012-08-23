package com.spring.model;

import java.util.Date;
import java.util.List;

public class BoardVO {
	
	private Integer seq;
	private String title;
	private String content;
	private String name;
	private String img;
	private Date indate;


	public Integer getSeq() {
		
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getIndate() {
		return indate;
	}

	public void setIndate(Date indate) {
		this.indate = indate;
	}
	
	public BoardVO(){
		
	}

}
