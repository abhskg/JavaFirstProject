package com.sapient.adv.java.studentPOJO;

import java.util.ArrayList;
import java.util.List;

import com.sapient.adv.java.fileReader.Reader;

public class StudentRecords implements StudentDAO {

	List<Student> students;	
	public StudentRecords() {
		students = new ArrayList<Student>();
	}

	@Override
	public void addNewStudent() {
		Integer id;
		String name,city;

		System.out.println("Please enter Student Id:");
		id = Reader.input.nextInt();
		
		System.out.println("Please enter Student Name:");
		name = Reader.input.next();
		
		System.out.println("Please enter Student City:");
		city = Reader.input.next();
		
		Student s = new Student(id, name, city);
		students.add(s);
		
	}

	public void addNewStudent2() {
		
		Integer id;
		String name,city;
		
		System.out.println("Please enter Student Data : (in form of ID, Name, City)");
		id = Reader.input.nextInt();
		name = Reader.input.next();
		city = Reader.input.next();
		
		Student s = new Student(id, name, city);
		students.add(s);
		
	}
	
	@Override
	public void displayStudentById(Integer id) {
	
		try {
			String S = students.stream()
					.filter(s -> s.getId() == id)
					.findFirst()
					.map(s -> s.toString())
					.orElseThrow(() -> new IllegalArgumentException("No Students with this Student Id"));
			
			System.out.println(S);
		
		} catch (IllegalArgumentException e) {
				System.out.println("Error 404 : Student with such ID not found");
		}
		
		

		
	}

	@Override
	public void displayStudentByCity(String city) {		
		students.stream()
				.filter(s -> s.getCity().compareTo(city) == 0)
				.map(s -> s.toString())
				.forEach(System.out::println);

	}

	@Override
	public void displayAllStudentsSortedByCity() {		
		students.stream()
				.sorted((s1, s2) -> s1.getCity().compareTo(s2.getCity()))
				.map(s -> s.toString())   
				.forEach(System.out::println);

	}

	@Override
	public void displayAllStudentsSortedByName() {		
		students.stream()
				.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
				.map(s -> s.toString())   
				.forEach(System.out::println);

	}
}