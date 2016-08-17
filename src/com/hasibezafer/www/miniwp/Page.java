package com.hasibezafer.www.miniwp;

import java.util.ArrayList;
import java.util.List;

public  class Page {
	public String title;
	public String body;
	public String category;
	
	
	public Page(){
		super();
	}
	
	//Constructor
	public Page(String title, String body, String category) {
		super();
		this.title = title;
		this.body = body;
		this.category = category;
	
	}
	//Getter Setter Methods
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}


	
	
	
	
	


}
