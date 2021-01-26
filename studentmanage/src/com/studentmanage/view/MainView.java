package com.studentmanage.view;

import java.util.Scanner;

import com.studentmanage.controller.StudentController;
import com.studentmanage.model.vo.Student;

//클라이언트에게 보이는 화면을 출력하는 기능을 제공하는 클래스
//메인메뉴, 등록화면, 조회화면 -> 메소드(기능)
public class MainView {
	
	public void mainMenu(StudentController stc) {
		//메인메뉴
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===== 학생관리 프로그램 =====");
			System.out.println("1. 전체 학생 조회");
			System.out.println("2. 학생 등록");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 점수 등록");
			System.out.println("5. 이름으로 학생 조회");
			System.out.println("6. 나이로 학생 조회");
			System.out.println("7. 학생 총점/평균 구하기");
			//점수를 등록할 학생 선정, 학생 선정 후 점수 입력 받고 선정된 학생의 점수 수정
			System.out.println("0. 종료");
			System.out.print("입력 : ");
			int cho = sc.nextInt();
			switch (cho) {
				case 1: stc.searchAllStudent(); break;
				case 2: stc.insertStudent(); break;
				//2. 학생 등록을 할 수 있도록 지정된 주소로 감.
				case 3: stc.updateStudent(); break;
				case 4: stc.insertStudentScore(); break;
				case 5: stc.searchByName(); break;
				case 6: stc.searchByAge(); break;
				case 7: stc.scoreTotalAvg(); break;
				case 0: System.out.println("학생 관리 프로그램을 종료합니다.");
						return;//mainmenu 매소드 종료
			}	
		}
	}
	
	//3. 실행됨
	public Student insertStudent() {//여러 타입, 여러개의 데이터를 리턴하기 위해 클래스 자료형을 씀
		//자료 입력 화면
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 학생등록 ====");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("학교: ");
		String school = sc.nextLine();
		System.out.print("주소: ");
		String address = sc.nextLine();
		Student s = new Student (name, age, school, address);//4. 입력된 자료를 리턴할 수 있는 객체를 만들고
		return s;//5. 그 객체를 리턴해줌
	}
	
	public void printmsg(String msg) {
		System.out.println("==== 시스템 메세지 ====");
		System.out.println(msg);
		System.out.println("===================");
	}
	
	public Student updateStudent() {
		//수정할 정보를 사용자에게 입력받아서 리턴해줌
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("==== 학생정보 수정 ====");
		System.out.print("수정할 학생명 : ");
		s.setName(sc.next());
		System.out.print("수정할 나이 : ");
		s.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("수정할 주소 : ");
		s.setAddress(sc.nextLine());
		
		return s;//StudentController를 거쳐 StudentDao로
		
	}
	
	public Student insertStudentScore() {
		//학생 정보를 입력받아서 student에 리턴해줌
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("==== 학생 점수 입력 ====");
		System.out.print("점수 입력할 학생명: ");
		s.setName(sc.next());
		System.out.print("국어 점수: ");
		s.setKor(sc.nextInt());
		System.out.print("영어 점수: ");
		s.setEng(sc.nextInt());
		System.out.print("수학 점수: ");
		s.setMath(sc.nextInt());
		System.out.print("코딩 점수: ");
		s.setCoding(sc.nextInt());
		
		return s;//StudentController를 거쳐 StudentDao로
	}
	
	public Student searchByName() {
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("==== 이름으로 학생 정보 조회 ====");
		System.out.print("이름: ");
		s.setName(sc.next());
		return s;
	}
	
	public Student searchByAge() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();//나이를 입력받아서 리턴해주기 위함
		System.out.println("==== 나이로 학생 정보 조회 ====");
		System.out.print("나이: ");
		s.setAge(sc.nextInt());
		return s;
	}
	
	public Student scoreTotalAvg() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("==== 총점/평균 ====");
		System.out.print("이름: ");
		s.setName(sc.next());
		return s;
	}
	
}
