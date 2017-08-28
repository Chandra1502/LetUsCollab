package com.chandu.model;

import java.util.Date;

//import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="c_blog_comment")
@Component
public class BlogComment extends BaseDomain{
	@Id
	@GeneratedValue
	private int id;
	
	private String blog_id;
	private String user_id;
	private String blog_comment_data;  //comments
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date bcomment_date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(String blog_id) {
		this.blog_id = blog_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBlog_comment_data() {
		return blog_comment_data;
	}
	public void setBlog_comment_data(String blog_comment_data) {
		this.blog_comment_data = blog_comment_data;
	}
	public Date getBcomment_date() {
		return bcomment_date;
	}
	public void setBcomment_date(Date bcomment_date) {
		this.bcomment_date = bcomment_date;
	}
	
	
	
}
