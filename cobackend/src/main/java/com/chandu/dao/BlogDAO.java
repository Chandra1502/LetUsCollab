package com.chandu.dao;

import java.util.List;

import com.chandu.model.Blog;
import com.chandu.model.BlogComment;

public interface BlogDAO {

public boolean save(Blog blog); 
	
	public boolean update(Blog blog);
	
	public boolean delete(Blog blog);
	
	public Blog get(String blogID);
	
	
	
    public List<Blog> viewBlogs();   // list of blogs
    
    /*related to comment*/
    
    public boolean addComment(BlogComment blogComment); //to add comments
    
    
    List<BlogComment> viewMyBlogs(String userId);  /*posted by -list individual blog*/
    
    
    List<BlogComment> viewComments();   // list of comments
}
