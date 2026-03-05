package com.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import com.db.DbConnection;

public class StudentCRUD {
	public static void createStudent(String name,int age) {
		String sql="insert into student(name,age) values(?,?)";
		try(Connection con = DbConnection.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1,name);
			stmt.setInt(2,age);
			int  rows=stmt.executeUpdate();
			System.out.println(rows);
		}catch (SQLIntegrityConstraintViolationException e) {
	        // IMPROVEMENT: Handle the duplicate case specifically
	        System.out.println("Skipped: Student '" + name + "' already exists. No duplicate added.");
	    }catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void readStudent(){
		String sql="select * from student";
		try(Connection con = DbConnection.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			while(rs.next()) {
				System.out.println(rs.getString("name")+
						rs.getInt("age"));
			}
			}catch(Exception e){
				 e.printStackTrace();
		}
	}
	public static void updateStudent(String name,int age) {
		String sql="UPDATE student set age = ? WHERE name = ?";
		try(Connection con = DbConnection.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(2, name);
			stmt.setInt(1, age);
			int rows = stmt.executeUpdate();
			System.out.println(rows + "rows updated ");
			
		}catch (SQLIntegrityConstraintViolationException e) {
		    System.out.println("Constraint Violation: Student '" + name + "' already exists!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void deletestudent(String name) {
		String sql="DELETE from student WHERE NAME = ?;";
		try(Connection con = DbConnection.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, name);
			stmt.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
