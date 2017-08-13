package com.deni.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Values {
	@Id
	private long id;
	private String content;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Values [id=" + id + ", content=" + content + "]";
	}
}
