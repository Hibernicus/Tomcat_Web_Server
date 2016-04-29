package org.resources;

public class PageName{

	public String name = "Maths_Resources.jsp";

	public PageName(String n){

		setName(n);
	
	}

	public void setName(String value){

		name = value;
	}

	public String getName(){
		
		return name;
	}
}