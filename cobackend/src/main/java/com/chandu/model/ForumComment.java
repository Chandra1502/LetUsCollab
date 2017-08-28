package com.chandu.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="c_forum_comment")
@Component
public class ForumComment extends BaseDomain {

	@Id
	private String id;
	
	private String forum_id;
	private String user_id;
	private String forum_comment_data;
	private Date fcomment_date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getForum_id() {
		return forum_id;
	}
	public void setForum_id(String forum_id) {
		this.forum_id = forum_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getForum_comment_data() {
		return forum_comment_data;
	}
	public void setForum_comment_data(String forum_comment_data) {
		this.forum_comment_data = forum_comment_data;
	}
	public Date getFcomment_date() {
		return fcomment_date;
	}
	public void setFcomment_date(Date fcomment_date) {
		this.fcomment_date = fcomment_date;
	}
	
	
	
	
}
