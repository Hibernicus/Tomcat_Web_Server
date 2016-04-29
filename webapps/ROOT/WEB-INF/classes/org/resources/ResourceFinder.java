package org.resources;
import java.awt.Desktop; //23 2 16
import java.io.*; //23 2 16

public class ResourceFinder{

	public String level = "all";
	public String topic = "all";
	public String tag = "all";

	public void setLevel(String value){
		level = value;
	}

	public String getLevel(){
		return level;
	}

	public void setTopic(String value){
		topic = value;
	}

	public String getTopic(){
		return topic;
	}

	public void setTag(String value){
		tag = value;
	}

	public String getTag(){
		return tag;
	}
	
	/*** 23 2 16 ***/
	public void open(String filePath){
		try{
			File myFile = new File(filePath);
			Desktop dt = Desktop.getDesktop();
			dt.open(myFile);
		}catch(IOException e){
			System.out.print(e);
		}
	}
	/*** 23 2 16 ***/
}