package com.xworkz.newsChannelApp.DAO;

import java.sql.SQLException;

import com.xworkz.newsChannelApp.DTO.NewsChannelDto;

public interface NewsChannelDao {
	public void save(NewsChannelDto dto) throws ClassNotFoundException, SQLException;
	public void updateEditorByName(String editor,String name)throws ClassNotFoundException,SQLException;
	public void deleteByName(String name)throws ClassNotFoundException,SQLException;
}
