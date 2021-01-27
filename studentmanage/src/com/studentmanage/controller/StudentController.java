package com.studentmanage.controller;

import com.studentmanage.model.dao.StudentDao_old;
import com.studentmanage.model.vo.Student;
import com.studentmanage.view.MainView;

//Student를 관리하는 데 필요한 화면 기능, 데이터 저장 관리 기능 호출하는 역할
public class StudentController {
	
	private StudentDao_old dao = new StudentDao_old();
	//view는 계속 호출해도 되지만 studentdao를 계속 호출하면 호출될 때마다 새로운 객체가 계속 생겨서 저장공간은 5개로
	//제한해놓은 의미가 없음. 따라서 StudentController가 실행될 때 StudentDao객체가 1개 생성되도록 함.
	//또한 그러면 StudentController가 실행될 때마다 새로운 객체가 생성되는 것이므로 mainMenu 한번 실행 당 한 개의
	//객체가 존재하기 위해 mainView의 mainMenu에서 매개변수를 받음
	
	public void mainMenu() {
		//StudentController stc = new StudentController();
		new MainView().mainMenu(this);//new StudentController();
	}//1. mainmenu 실행
	
	public void insertStudent() {
		//1-학생 정보를 입력할 view 화면
		
		Student s = new MainView().insertStudent();//6. student클래스의 객체 s에 입력받은 학생 정보를 입력
		//2-StudentDao 데이터 저장소에 저장하기
		boolean flag = dao.insertStudent(s);
		//3-입력 결과에 따라 사용자에게 메세지 출력-mainView클래스 기능
		String msg = flag? "입력 성공" : "저장 공간이 부족합니다";
		new MainView().printmsg(msg);
	}
	
	public void searchAllStudent() {
		//StudentDao의 멤버변수에 저장되어 있는 데이터를 출력 -> 사용자에게 보여주는 것
		String data = dao.searchAllStudent();
		new MainView().printmsg(data);
	}
	
	public void updateStudent() {
		//저장된 학생을 1명 골라 데이터 수정
		String data = dao.searchAllStudent();
		new MainView().printmsg(data);
		
		//나이와 주소를 변경하는 것
		Student s = new MainView().updateStudent();//수정할 내용을 받아옴
		
		boolean flag = dao.updateStudent(s);
		
		String msg = flag? "수정성공" : "수정실패";
		new MainView().printmsg(msg);
	}
	
	public void insertStudentScore() {
		//입력된 점수를 studentdao에 저장
		
//입력할 점수를 받아옴
		Student s = new MainView().insertStudentScore();
		boolean flag = dao.insertStudentScore(s);
		String msg = flag? "점수 입력 성공" : "해당 이름의 학생이 없습니다.";
		new MainView().printmsg(msg);
		
		String data = dao.searchAllStudent();
		new MainView().printmsg(data);
	}
	
	public void searchByName() {
		Student s = new MainView().searchByName();
		boolean flag = dao.searchByName(s);
		System.out.println(flag? "" : "해당 이름의 학생이 없습니다.");
	}
	
	public void searchByAge() {
		Student s = new MainView().searchByAge();
		boolean flag = dao.searchByAge(s);
		System.out.println(flag? "" : "해당 나이의 학생이 없습니다.");
	}
	
	public void scoreTotalAvg() {
		Student s = new MainView().scoreTotalAvg();
		boolean flag = dao.scoreTotalAvg(s);
		System.out.println(flag? "" : "해당 이름의 학생이 없습니다.");
	}

}
