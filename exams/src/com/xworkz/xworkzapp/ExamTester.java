package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.exam.Exam;
import com.xworkz.xworkzapp.exam.HallTicket;
public class ExamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exam exam=new Exam();
exam.setExamCode("15cs53");
exam.setFees(1000);
HallTicket hallticket=new HallTicket("muheeth","15ca16cs403","15cs45");
hallticket.displayInfo();
exam.allow(hallticket);
	}

}