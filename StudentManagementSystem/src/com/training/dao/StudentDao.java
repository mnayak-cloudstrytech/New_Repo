package com.training.dao;
import com.training.pojo.Student;
public class StudentDao {
	private Student studentarr[];
	public StudentDao()
	{
		studentarr=new Student[5];
	}
	public void insert(Student storearr[])
	{
		
		for(int counter=0;counter<studentarr.length;counter++)
		{
			studentarr[counter]=storearr[counter];
		}
	}
	public void display()
	{
		for(Student s:studentarr)
		{
			System.out.println("Studnet name is "+s.getStudentname());
		}
	}

}