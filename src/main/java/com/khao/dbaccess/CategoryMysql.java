package com.khao.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.khao.model.Category;

public class CategoryMysql implements CategoryDao {
	
	private Properties dbproperties;
	private final String insertCategory = "";
	private final String updateCategory = "";
	private final String deleteCategory = "";
	private final String find = "SELECT * FROM category WHERE id = ?";
	private final String findAll = "SELECT * FROM category";

	public CategoryMysql(Properties dbproperties) {
		this.dbproperties = dbproperties;
	}
	
	public Category find(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Category category = null;
		try {
			Class.forName(this.dbproperties.getProperty("dbdriver"));
			//FIXME set proper database connection
			conn = DriverManager.getConnection(this.dbproperties.getProperty(""));
			pstmt = conn.prepareStatement(find);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.first()){
				category = new Category();
				do{
					category.setId(rs.getInt("id"));
					category.setName(rs.getString("name"));
				}while(rs.next());
			}
			
			return category;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return category;
	}

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Category> categoryList = null;
		
		try {
			Class.forName(this.dbproperties.getProperty("dbdriver"));
			conn = DriverManager.getConnection("");
			pstmt = conn.prepareStatement("");
			rs = pstmt.executeQuery();
			
			if(rs.first())
			{
				categoryList = new ArrayList<Category>();
				do{
					Category category = new Category();
					category.setId(rs.getInt("id"));
					category.setName(rs.getString("name"));
					categoryList.add(category);
				}while(rs.next());
			}
			
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Driver class not found!!");
		} catch (SQLException e) {
			throw new RuntimeException("SQL exceptions");
		}
		finally{
			try {
				closeResources(conn, pstmt, rs);
			} catch (SQLException e) {
				throw new RuntimeException("Cannot close resources");
			}
		}
		return categoryList;
	}

	public void create(Category category) {
		// TODO Auto-generated method stub
		
	}

	public void update(Category category) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	private void closeResources(Connection conn, PreparedStatement pstmt, ResultSet rs) throws SQLException{
		if(conn != null)
			conn.close();
		if(pstmt != null)
			pstmt.close();
		if(rs != null)
			rs.close();
	}
	
	private void closeResources(Connection conn, PreparedStatement pstmt) throws SQLException{
		if(conn != null)
			conn.close();
		if(pstmt != null)
			pstmt.close();
	}

}
