package com.studentmanage.view;

import java.util.Scanner;

import com.studentmanage.controller.StudentController;
import com.studentmanage.model.vo.Student;

//Ŭ���̾�Ʈ���� ���̴� ȭ���� ����ϴ� ����� �����ϴ� Ŭ����
//���θ޴�, ���ȭ��, ��ȸȭ�� -> �޼ҵ�(���)
public class MainView {
	
	public void mainMenu(StudentController stc) {
		//���θ޴�
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===== �л����� ���α׷� =====");
			System.out.println("1. ��ü �л� ��ȸ");
			System.out.println("2. �л� ���");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. �л� ���� ���");
			System.out.println("5. �̸����� �л� ��ȸ");
			System.out.println("6. ���̷� �л� ��ȸ");
			System.out.println("7. �л� ����/��� ���ϱ�");
			//������ ����� �л� ����, �л� ���� �� ���� �Է� �ް� ������ �л��� ���� ����
			System.out.println("0. ����");
			System.out.print("�Է� : ");
			int cho = sc.nextInt();
			switch (cho) {
				case 1: stc.searchAllStudent(); break;
				case 2: stc.insertStudent(); break;
				//2. �л� ����� �� �� �ֵ��� ������ �ּҷ� ��.
				case 3: stc.updateStudent(); break;
				case 4: stc.insertStudentScore(); break;
				case 5: stc.searchByName(); break;
				case 6: stc.searchByAge(); break;
				case 7: stc.scoreTotalAvg(); break;
				case 0: System.out.println("�л� ���� ���α׷��� �����մϴ�.");
						return;//mainmenu �żҵ� ����
			}	
		}
	}
	
	//3. �����
	public Student insertStudent() {//���� Ÿ��, �������� �����͸� �����ϱ� ���� Ŭ���� �ڷ����� ��
		//�ڷ� �Է� ȭ��
		Scanner sc = new Scanner(System.in);
		System.out.println("==== �л���� ====");
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�б�: ");
		String school = sc.nextLine();
		System.out.print("�ּ�: ");
		String address = sc.nextLine();
		Student s = new Student (name, age, school, address);//4. �Էµ� �ڷḦ ������ �� �ִ� ��ü�� �����
		return s;//5. �� ��ü�� ��������
	}
	
	public void printmsg(String msg) {
		System.out.println("==== �ý��� �޼��� ====");
		System.out.println(msg);
		System.out.println("===================");
	}
	
	public Student updateStudent() {
		//������ ������ ����ڿ��� �Է¹޾Ƽ� ��������
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("==== �л����� ���� ====");
		System.out.print("������ �л��� : ");
		s.setName(sc.next());
		System.out.print("������ ���� : ");
		s.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("������ �ּ� : ");
		s.setAddress(sc.nextLine());
		
		return s;//StudentController�� ���� StudentDao��
		
	}
	
	public Student insertStudentScore() {
		//�л� ������ �Է¹޾Ƽ� student�� ��������
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("==== �л� ���� �Է� ====");
		System.out.print("���� �Է��� �л���: ");
		s.setName(sc.next());
		System.out.print("���� ����: ");
		s.setKor(sc.nextInt());
		System.out.print("���� ����: ");
		s.setEng(sc.nextInt());
		System.out.print("���� ����: ");
		s.setMath(sc.nextInt());
		System.out.print("�ڵ� ����: ");
		s.setCoding(sc.nextInt());
		
		return s;//StudentController�� ���� StudentDao��
	}
	
	public Student searchByName() {
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("==== �̸����� �л� ���� ��ȸ ====");
		System.out.print("�̸�: ");
		s.setName(sc.next());
		return s;
	}
	
	public Student searchByAge() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();//���̸� �Է¹޾Ƽ� �������ֱ� ����
		System.out.println("==== ���̷� �л� ���� ��ȸ ====");
		System.out.print("����: ");
		s.setAge(sc.nextInt());
		return s;
	}
	
	public Student scoreTotalAvg() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("==== ����/��� ====");
		System.out.print("�̸�: ");
		s.setName(sc.next());
		return s;
	}
	
}
