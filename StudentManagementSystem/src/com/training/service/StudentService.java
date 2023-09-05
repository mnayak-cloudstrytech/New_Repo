package com.training.service;
import java.util.*;
import com.training.pojo.*;
import com.training.dao.StudentDao;
public class StudentService {
	private Scanner sc;
	private StudentDao stdao;
	private Student starr[];
	int noofstudent;
	public StudentService()
	{
		sc=new Scanner(System.in);
		stdao=new StudentDao();
		
	//	System.out.println("Enter how many student details u want ");
	//noofstudent=sc.nextInt();
	starr=new Student[5];
		
	}
	public void insert()
	{
		for(int x=0;x<5;x++)
		{
			Student s=new Student();
			System.out.println("Enter Student id");
			s.setStudentid(sc.nextInt());
			System.out.println("Enter Student name ");
			s.setStudentname(sc.next());
			System.out.println("Enter Score ");
			s.setScore(sc.nextInt());
			starr[x]=s;
			
		}
		stdao.insert(starr);
	}
	public void show()
	{
		stdao.display();
	}

}