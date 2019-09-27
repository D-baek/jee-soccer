package com.soccer.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.enums.DBDriver;
import com.soccer.web.enums.DBUrl;
import com.soccer.web.pool.Constants;

public class Mariadb implements Database{
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			//오라클의 영역
			Class.forName(DBDriver.MARIA_DRIVER.toString()); //import 기능 역할
			conn = DriverManager.getConnection(DBUrl.MARIA_URL.toString(), Constants.USERID, Constants.PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
