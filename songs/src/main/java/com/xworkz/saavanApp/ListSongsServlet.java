package com.xworkz.saavanApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/songs")
public class ListSongsServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String SongName=req.getParameter("songName");
		String featuring=req.getParameter("featuring");
		String singer=req.getParameter("singer");
		String duration=req.getParameter("duration");
		String Language=req.getParameter("langauage");
		String Lyrics=req.getParameter("lyrics");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","rootpassword");
				PreparedStatement ps=con.prepareStatement("insert int songs values(?,?,?,?,?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, SongName);
			ps.setString(3, featuring);
			ps.setString(4, singer);
			ps.setString(5, duration);
			ps.setString(6, Language);
			ps.setString(7, Lyrics);
			ps.executeUpdate();
			con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			}
	}
}