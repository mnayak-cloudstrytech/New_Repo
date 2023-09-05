package com.training.client;

import com.training.service.StudentService;

public class AppMain {
	public static void main(String[] args) {
		StudentService sservice=new StudentService();
		sservice.insert();
		sservice.show();
	}

}