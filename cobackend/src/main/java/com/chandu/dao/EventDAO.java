package com.chandu.dao;

import java.util.List;

import com.chandu.model.Event;

public interface EventDAO {

public boolean save(Event event); 
	
	public boolean update(Event event);
	
	public boolean delete(Event event);
	
	public Event get(int eventID);
	
	public List<Event> list();

}
