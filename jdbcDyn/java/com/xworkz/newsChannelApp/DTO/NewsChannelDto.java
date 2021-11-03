package com.xworkz.newsChannelApp.DTO;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NewsChannelDto implements Serializable {
	private int id;
	private String name;
	private String owner;
	private String editor;
	private String lang;



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null )
			return false;
		if(obj instanceof NewsChannelDto){
			NewsChannelDto cast=(NewsChannelDto)obj;
			if(cast.getName().equals(this.name)){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return 999;
	}


} 
