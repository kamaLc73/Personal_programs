package com.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.beans.Document;

public class DataBase {
	private DataSource ds;
	private Connection cnx;
	
	public DataBase() {
	}

	public DataBase(DataSource ds) {
		this.ds = ds;
		this.cnx = ds.getConnection();
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
		this.cnx = ds.getConnection();
	}

	public int insertDocument(Document d) {
		try {
			//formulation de la req
			String req = "insert into document values(" + d.getId() + ", '" 
					+ d.getName() + "', " + d.getPageCount() + ");" ;
			//Creation objet stat
			Statement st = cnx.createStatement();
			return st.executeUpdate(req);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public Document selectDocument(int id ) {
		try {
			String req = "select * from document where id = " + id + ";";
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(req);
			if(rs.first()) {
				String name = rs.getString(2);
				int pageCount = rs.getInt(3);
				return new Document(id, name, pageCount);
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Document> selectAllDocuments() {
		try {
			String req = "select * from document ;";
			Statement st = cnx.createStatement();
			ResultSet rs = st.executeQuery(req);
			List<Document> dl = new ArrayList<Document>();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int pageCount = rs.getInt(3);
				dl.add(new Document(id, name, pageCount));
			}
			return dl;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
