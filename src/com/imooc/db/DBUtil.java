package com.imooc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/imooc";
	private static final String USER = "root";
	private static final String PASSWORD = "123456";
	
	private static Connection conn = null;
	static{
				try {
					//1.������������
					Class.forName("com.mysql.jdbc.Driver");
					//2.������ݿ������
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public static Connection getConnection(){
		return conn;
	}
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//1.������������
		Class.forName("com.mysql.jdbc.Driver");
		//2.������ݿ������
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//3.ͨ�����ݿ����Ӳ������ݿ⣬ʵ��������ɾ�Ĳ�
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
		
		while(rs.next()){
			System.out.println(rs.getString("user_name") + "," + rs.getInt("age"));
		}
	}*/
	

}
