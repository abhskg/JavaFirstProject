package com.sapient.adv.java.studentPOJO;
public interface StudentDAO {
	
	void addNewStudent();
	void displayStudentById(Integer id);
	void displayStudentByCity(String city);
	void displayAllStudentsSortedByCity();
	void displayAllStudentsSortedByName();
	
}