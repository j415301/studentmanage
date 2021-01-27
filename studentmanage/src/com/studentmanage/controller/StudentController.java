package com.studentmanage.controller;

import com.studentmanage.model.dao.StudentDao_old;
import com.studentmanage.model.vo.Student;
import com.studentmanage.view.MainView;

//Student�� �����ϴ� �� �ʿ��� ȭ�� ���, ������ ���� ���� ��� ȣ���ϴ� ����
public class StudentController {
	
	private StudentDao_old dao = new StudentDao_old();
	//view�� ��� ȣ���ص� ������ studentdao�� ��� ȣ���ϸ� ȣ��� ������ ���ο� ��ü�� ��� ���ܼ� ��������� 5����
	//�����س��� �ǹ̰� ����. ���� StudentController�� ����� �� StudentDao��ü�� 1�� �����ǵ��� ��.
	//���� �׷��� StudentController�� ����� ������ ���ο� ��ü�� �����Ǵ� ���̹Ƿ� mainMenu �ѹ� ���� �� �� ����
	//��ü�� �����ϱ� ���� mainView�� mainMenu���� �Ű������� ����
	
	public void mainMenu() {
		//StudentController stc = new StudentController();
		new MainView().mainMenu(this);//new StudentController();
	}//1. mainmenu ����
	
	public void insertStudent() {
		//1-�л� ������ �Է��� view ȭ��
		
		Student s = new MainView().insertStudent();//6. studentŬ������ ��ü s�� �Է¹��� �л� ������ �Է�
		//2-StudentDao ������ ����ҿ� �����ϱ�
		boolean flag = dao.insertStudent(s);
		//3-�Է� ����� ���� ����ڿ��� �޼��� ���-mainViewŬ���� ���
		String msg = flag? "�Է� ����" : "���� ������ �����մϴ�";
		new MainView().printmsg(msg);
	}
	
	public void searchAllStudent() {
		//StudentDao�� ��������� ����Ǿ� �ִ� �����͸� ��� -> ����ڿ��� �����ִ� ��
		String data = dao.searchAllStudent();
		new MainView().printmsg(data);
	}
	
	public void updateStudent() {
		//����� �л��� 1�� ��� ������ ����
		String data = dao.searchAllStudent();
		new MainView().printmsg(data);
		
		//���̿� �ּҸ� �����ϴ� ��
		Student s = new MainView().updateStudent();//������ ������ �޾ƿ�
		
		boolean flag = dao.updateStudent(s);
		
		String msg = flag? "��������" : "��������";
		new MainView().printmsg(msg);
	}
	
	public void insertStudentScore() {
		//�Էµ� ������ studentdao�� ����
		
//�Է��� ������ �޾ƿ�
		Student s = new MainView().insertStudentScore();
		boolean flag = dao.insertStudentScore(s);
		String msg = flag? "���� �Է� ����" : "�ش� �̸��� �л��� �����ϴ�.";
		new MainView().printmsg(msg);
		
		String data = dao.searchAllStudent();
		new MainView().printmsg(data);
	}
	
	public void searchByName() {
		Student s = new MainView().searchByName();
		boolean flag = dao.searchByName(s);
		System.out.println(flag? "" : "�ش� �̸��� �л��� �����ϴ�.");
	}
	
	public void searchByAge() {
		Student s = new MainView().searchByAge();
		boolean flag = dao.searchByAge(s);
		System.out.println(flag? "" : "�ش� ������ �л��� �����ϴ�.");
	}
	
	public void scoreTotalAvg() {
		Student s = new MainView().scoreTotalAvg();
		boolean flag = dao.scoreTotalAvg(s);
		System.out.println(flag? "" : "�ش� �̸��� �л��� �����ϴ�.");
	}

}
