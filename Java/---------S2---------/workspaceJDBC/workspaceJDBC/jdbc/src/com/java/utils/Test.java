package com.java.utils;

import java.sql.Connection;
import com.java.beans.Document;
import com.java.jdbc.DataBase;
import com.java.jdbc.DataSource;
import com.java.jdbc.MySQLDataSource;

public class Test {
	
	public static void main(String[] args) {
//		DataSource ds = new MySQLDataSource("india");
//		Connection cnx = ds.getConnection();
		DataBase db = new DataBase(new MySQLDataSource("india"));
//		Document d = new Document(2, "Doc 02", 200);
//		System.out.println(db.insertDocument(d));
//		System.out.println(db.selectDocument(3));
		System.out.println(db.selectAllDocuments());
	}

}
