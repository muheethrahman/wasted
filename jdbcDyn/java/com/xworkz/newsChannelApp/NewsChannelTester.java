package com.xworkz.newsChannelApp;

import com.xworkz.newsChannelApp.DAO.NewsChannelDao;
import com.xworkz.newsChannelApp.DAO.NewsChannelDaoImpl;
import com.xworkz.newsChannelApp.DTO.NewsChannelDto;

public class NewsChannelTester {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		NewsChannelDto ncd=new NewsChannelDto();
		ncd.setId(1);
		ncd.setName("TV9");
		ncd.setLang("Kannada");
		ncd.setOwner("Barun das");
		ncd.setEditor("Rehaman");

		NewsChannelDto ncd1=new NewsChannelDto();
		ncd1.setId(2);
		ncd1.setName("Telugu");
		ncd1.setOwner("Nimmagadda Prasad");
		ncd1.setEditor("darshan");







		NewsChannelDao ncds=new NewsChannelDaoImpl();
		ncds.save(ncd);
		ncds.save(ncd1);


		ncds.updateEditorByName("SKALI", "tv9");

		ncds.deleteByName("Telugu");

	}
	}
	

}
