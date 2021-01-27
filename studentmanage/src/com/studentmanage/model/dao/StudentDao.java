package com.studentmanage.model.dao;

import com.studentmanage.model.vo.Student;

public class StudentDao {
	
	//학생들을 보관할 수 있는 멤버변수 생성
	private Student[] students = new Student[5];
	
	public StudentDao() {}
	
	public boolean insertStudnet(Student s) {
		boolean flag = false;
		for(int i=0 ; i<students.length ; i++) {
			if(students[i]==null) {
				students[i]=s;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	private String searchAllStudent() {
		String value="";
		for(int i=0 ; i<students.length ; i++) {
			if(students[i]!=null) {
				value+=students[i]+"\n";
			}
		}
		return value;
	}
	
	public boolean updateStudent(Student s) {
		boolean flag = false;
		String name = s.getName();
		for(int i=0 ; i<students.length ; i++) {
			if(students[i].getName().equals(name)) {
				students[i].setAge(s.getAge());
				students[i].setAddress(s.getAddress());
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean insertStudentScore(Student s) {
		boolean flag = false;
		String name = s.getName();
		for(int i=0 ; i<students.length ; i++) {
			if (students[i].getName().equals(name)) {
				students[i].setKor(s.getKor());
				students[i].setEng(s.getEng());
				students[i].setMath(s.getMath());
				students[i].setCoding(s.getCoding());
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean searchByName(Student s) {
		boolean flag = false;
		String name = s.getName();
		for(int i=0 ; i<students.length ; i++) {
			if (students[i].getName().equals(name)) {
				System.out.println(students[i]);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean searchByAge(Student s) {
		boolean flag = false;
		int age = s.getAge();
		for(int i=0 ; i<students.length ; i++) {
			if (age==students[i].getAge()) {
				System.out.println(students[i]);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean scoreTotalAvg(Student s) {
		boolean flag = false;
		String name = s.getName();
		for(int i=0 ; i<students.length ; i++) {
			if (students[i].getName().equals(name)) {
				System.out.println("총점: "+students[i].getKor()+students[i].getEng()+
						students[i].getMath()+students[i].getCoding());
				System.out.println("평균: "+(students[i].getKor()+students[i].getEng()
						+students[i].getMath()+students[i].getCoding())/4.0);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
