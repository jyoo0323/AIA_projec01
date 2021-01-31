package aia_project1.objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import aia_project1.db.ProjectJDBC;

public class User {
	private final String IDEXIST = "SELECT * FROM USER WHERE ID=?";
	private String LOGIN[] = {"SELECT * FROM USER WHERE ID=", " AND PWD="};
	private final String SIGNUP = "INSERT INTO USER VALUES(?, ? )";
	private PreparedStatement pstmt;
	private Connection conn = null;
	private ResultSet rs= null;	
	private Statement stmt = null;
	ProjectJDBC jdbc;
	
	public boolean login(String id, String pwd) {
		List<String> user = new ArrayList<String>();
		String LOGINinfo = LOGIN[0]+"'"+id+"'"+LOGIN[1]+"'"+pwd+"'";
		System.out.println(LOGINinfo);
		
		jdbc = new ProjectJDBC();
		conn = jdbc.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(LOGINinfo);
			
			if(rs.next()) {
				return true;
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			jdbc.close(rs, stmt, conn);
			
		}
		
		
		System.out.println(user);
		return false;
	}
	
	public static void main(String[] args) {
		new User().login("User A","1234");
	}
}
