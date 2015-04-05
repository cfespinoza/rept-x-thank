package org.grasia.reptxthank.model;

import java.util.ArrayList;
import java.util.Date;

public class Item {
	private long id;
	private Date creationDate;
	ArrayList<User> contributors;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
