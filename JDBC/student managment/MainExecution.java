package com.Main;

import com.operations.StudentCRUD;

public class MainExecution {
	public static void main(String[] args) {
		//creating data in student table
		StudentCRUD.createStudent("sunny",21);
		StudentCRUD.createStudent("Srinadh",20);
		//reading student data
		System.out.println("the data of registered  student are");
		StudentCRUD.readStudent();
		///updating the data in table student 
		StudentCRUD.updateStudent("Srinadh", 21);
		System.out.println("updated age of srinadh");
		StudentCRUD.readStudent();
		
		

		//delete the student from table
		StudentCRUD.deletestudent("Srinadh");
		
		//giving final validation of all the changes 
		System.out.println("final data of all the students  ");
		StudentCRUD.readStudent();
		
	
		
	}
}
