package com.morganJ.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MysqlService {
	private static MysqlService mysqlService = null;
	
	private String url;
	private String id;
	private String password;
	
	//접속 관리 객체
	
	private Connection conn;
	private Statement statement;
	
	//싱글턴
	public static MysqlService getInstance() {
		if(mysqlService == null) {
			mysqlService = new MysqlService();
		}
		return mysqlService;
	}
	
	public MysqlService() {
		this.url = "jdbc:mysql://localhost:3306/morgan_web";
		this.id = "root";
		this.password = "root";
	}
	
	
	
	// 접속 메소드
	public void connection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			
			this.conn = DriverManager.getConnection(
					this.url,
					this.id,
					this.password);
			
			this.statement = this.conn.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// 쿼리 수행 메소드
	//업데이트
	public int update(String query) throws SQLException {
		return this.statement.executeUpdate(query);
	}
	//쿼리 select
	public ResultSet select(String query) throws SQLException {
		return this.statement.executeQuery(query);
	}
	
	// 접속 끊기 메소드
	public void disconnect () throws SQLException {
		this.statement.close();
		this.conn.close();
	}
	
}
