package com.chandu.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="c_forum")
@Component
public class Forum extends BaseDomain{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "generator")
	@SequenceGenerator(name = "generator" , sequenceName="forum_seq" , allocationSize=1)
	private int forum_id;
	
	private String user_id;
	
	private String user_name;
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date created_date;
	
	private String forum_data;
	private String topic;

	public String gettopic() {
		return topic;
	}

	public void settopic(String topic) {
		this.topic = topic;
	}

	public int getForum_id() {
		return forum_id;
	}

	public void setForum_id(int forum_id) {
		this.forum_id = forum_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getForum_data() {
		return forum_data;
	}

	public void setForum_data(String forum_data) {
		this.forum_data = forum_data;
	}
	
	
	
	
	
	
	
}
