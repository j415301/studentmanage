package com.studentmanage.model.dao;

import com.studentmanage.model.vo.Student;

//Ŭ���̾�Ʈ�� ����ϴ� �л����� ����,
//�������(5��), ���, ��ȸ, ���� ��
public class StudentDao {
	
	private Student s1;
	private Student s2;
	private Student s3;
	private Student s4;
	private Student s5;
	//����� 5�� ����
	
	public StudentDao() {}
	
	public boolean insertStudent(Student s) {
		//�ܺ� ����ҿ��� �޾ƿ� ���� ��������� ����
		//��� ���� �� ����ִ� ����(���� null�� ����)�� ���� ������ ��
		boolean flag = true;
		if (s1 == null) {
			s1 = s;
		} else if (s2 == null) {
			s2 = s;
		} else if (s3 == null) {
			s3=s;
		} else if(s4==null) {
			s4=s;
		} else if(s5==null){
			s5=s;
		} else {
			flag=false;//������ ������ ������ �� false�� ����
		}
		return flag;
	}
	
	
	public String searchAllStudent() {
		//StudentDao ��ü�� ����Ǿ� �ִ� ��������� ������ ������ִ� ���
		
		String value = "";
		if (s1!=null) {
			value+=s1.getName()+"\t"+s1.getAge()+"\t"+s1.getSchool()+"\t"+s1.getAddress()+
					"\t"+s1.getKor()+"\t"+s1.getEng()+"\t"+s1.getMath()+"\t"+s1.getCoding()+
					"\n";
		    
		}
		if (s2!=null) {
			value+=s2.getName()+"\t"+s2.getAge()+"\t"+s2.getSchool()+"\t"+s2.getAddress()+
					"\t"+s2.getKor()+"\t"+s2.getEng()+"\t"+s2.getMath()+"\t"+s2.getCoding()+
					"\n";
		    
		}
		if (s3!=null) {
			value+=s3.getName()+"\t"+s3.getAge()+"\t"+s3.getSchool()+"\t"+s3.getAddress()+
					"\t"+s3.getKor()+"\t"+s3.getEng()+"\t"+s3.getMath()+"\t"+s3.getCoding()+
					"\n";
		    
		}
		if (s4!=null) {
			value+=s4.getName()+"\t"+s4.getAge()+"\t"+s4.getSchool()+"\t"+s4.getAddress()+
					"\t"+s4.getKor()+"\t"+s4.getEng()+"\t"+s4.getMath()+"\t"+s4.getCoding()+
					"\n";
		    
		}
		if (s5!=null) {
			value+=s5.getName()+"\t"+s5.getAge()+"\t"+s5.getSchool()+"\t"+s5.getAddress()+
					"\t"+s5.getKor()+"\t"+s5.getEng()+"\t"+s5.getMath()+"\t"+s5.getCoding()+
					"\n";
		    
		}
		return value;
	}
	
	public boolean updateStudent(Student s) {
		//�Ű������� �ִ� ��ü�� �̸��� ������ ��������� ã�Ƽ� ������ ������ Student�� �Է�����
		
		String name = s.getName();
		boolean flag = true;
		
		if (s1.getName().equals(name)) {
			//s1�̸��� ����
			s1.setName(name);
			s1.setAddress(s.getAddress());
		} else if(s2.getName().equals(name)) {
			//s2�̸��� ����
			s2.setName(name);
			s2.setAddress(s.getAddress());
		} else if(s3.getName().equals(name)) {
			//s3�̸��� ����
			s3.setName(name);
			s3.setAddress(s.getAddress());
		} else if(s4.getName().equals(name)) {
			//s4�̸��� ����
			s4.setName(name);
			s4.setAddress(s.getAddress());
		} else if(s5.getName().equals(name)) {
			//s5�̸��� ����
			s5.setName(name);
			s5.setAddress(s.getAddress());
		} else {
			flag = false;
		}
		return flag;
	}
	
	public boolean insertStudentScore(Student s) {
		//�Ű������� �ִ� ��ü�� �̸��� ������ ��������� ã�Ƽ� �Էµ� ������ Student�� �Է�����
		
		boolean flag = true;
		String name = s.getName();
		
		if (s1.getName().equals(name)) {
			//s1�̸��� ����
			s1.setKor(s.getKor());
			s1.setEng(s.getEng());
			s1.setMath(s.getMath());
			s1.setCoding(s.getCoding());
		} else if(s2.getName().equals(name)) {
			//s2�̸��� ����
			s2.setKor(s.getKor());
			s2.setEng(s.getEng());
			s2.setMath(s.getMath());
			s2.setCoding(s.getCoding());
		} else if(s3.getName().equals(name)) {
			//s3�̸��� ����
			s3.setKor(s.getKor());
			s3.setEng(s.getEng());
			s3.setMath(s.getMath());
			s3.setCoding(s.getCoding());
		} else if(s4.getName().equals(name)) {
			//s4�̸��� ����
			s4.setKor(s.getKor());
			s4.setEng(s.getEng());
			s4.setMath(s.getMath());
			s4.setCoding(s.getCoding());
		} else if(s5.getName().equals(name)) {
			//s5�̸��� ����
			s5.setKor(s.getKor());
			s5.setEng(s.getEng());
			s5.setMath(s.getMath());
			s5.setCoding(s.getCoding());
		} else {
			flag = false;
		}
		
		return flag;
		
	}
	
	public boolean searchByName(Student s) {
		boolean flag = true;
		String name = s.getName();
		
		if (s1.getName().equals(name)) {
			System.out.println(s1.getName()+"\t"+s1.getAge()+"\t"+s1.getSchool()+"\t"+s1.getAddress()+
					"\t"+s1.getKor()+"\t"+s1.getEng()+"\t"+s1.getMath()+"\t"+s1.getCoding());
		} else if(s2.getName().equals(name)) {
			System.out.println(s2.getName()+"\t"+s2.getAge()+"\t"+s2.getSchool()+"\t"+s2.getAddress()+
					"\t"+s2.getKor()+"\t"+s2.getEng()+"\t"+s2.getMath()+"\t"+s2.getCoding());
		} else if(s3.getName().equals(name)) {
			System.out.println(s3.getName()+"\t"+s3.getAge()+"\t"+s3.getSchool()+"\t"+s3.getAddress()+
					"\t"+s3.getKor()+"\t"+s3.getEng()+"\t"+s3.getMath()+"\t"+s3.getCoding());
		} else if(s4.getName().equals(name)) {
			System.out.println(s4.getName()+"\t"+s4.getAge()+"\t"+s4.getSchool()+"\t"+s4.getAddress()+
					"\t"+s4.getKor()+"\t"+s4.getEng()+"\t"+s4.getMath()+"\t"+s4.getCoding());
		} else if(s5.getName().equals(name)) {
			System.out.println(s5.getName()+"\t"+s5.getAge()+"\t"+s5.getSchool()+"\t"+s5.getAddress()+
					"\t"+s5.getKor()+"\t"+s5.getEng()+"\t"+s5.getMath()+"\t"+s5.getCoding());
		} else {
			flag = false;
		}
		return flag;
	}
	
	public boolean searchByAge(Student s) {
		boolean flag = true;
		int age = s.getAge();
		
		if (s1.getAge() == age) {
			System.out.println(s1.getName()+"\t"+s1.getAge()+"\t"+s1.getSchool()+"\t"+s1.getAddress()+
					"\t"+s1.getKor()+"\t"+s1.getEng()+"\t"+s1.getMath()+"\t"+s1.getCoding());
		} else if(s2.getAge() == age) {
			System.out.println(s2.getName()+"\t"+s2.getAge()+"\t"+s2.getSchool()+"\t"+s2.getAddress()+
					"\t"+s2.getKor()+"\t"+s2.getEng()+"\t"+s2.getMath()+"\t"+s2.getCoding());
		} else if(s3.getAge() == age) {
			System.out.println(s3.getName()+"\t"+s3.getAge()+"\t"+s3.getSchool()+"\t"+s3.getAddress()+
					"\t"+s3.getKor()+"\t"+s3.getEng()+"\t"+s3.getMath()+"\t"+s3.getCoding());
		} else if(s4.getAge() == age) {
			System.out.println(s4.getName()+"\t"+s4.getAge()+"\t"+s4.getSchool()+"\t"+s4.getAddress()+
					"\t"+s4.getKor()+"\t"+s4.getEng()+"\t"+s4.getMath()+"\t"+s4.getCoding());
		} else if(s5.getAge() == age) {
			System.out.println(s5.getName()+"\t"+s5.getAge()+"\t"+s5.getSchool()+"\t"+s5.getAddress()+
					"\t"+s5.getKor()+"\t"+s5.getEng()+"\t"+s5.getMath()+"\t"+s5.getCoding());
		} else {
			flag = false;
		}
		return flag;
	}
	
	public boolean scoreTotalAvg(Student s) {
		boolean flag = true;
		String name = s.getName();
		
		if (s1.getName().equals(name)) {
			System.out.println("����: "+(int)(s1.getKor()+s1.getEng()+s1.getMath()+s1.getCoding()));
			System.out.println("���: "+(s1.getKor()+s1.getEng()+s1.getMath()+s1.getCoding())/4.0);
		} else if(s2.getName().equals(name)) {
			System.out.println("����: "+(int)(s2.getKor()+s2.getEng()+s2.getMath()+s2.getCoding()));
			System.out.println("���: "+(s2.getKor()+s2.getEng()+s2.getMath()+s2.getCoding())/4.0);
		} else if(s3.getName().equals(name)) {
			System.out.println("����: "+(int)(s3.getKor()+s3.getEng()+s3.getMath()+s3.getCoding()));
			System.out.println("���: "+(s3.getKor()+s3.getEng()+s3.getMath()+s3.getCoding())/4.0);
		} else if(s4.getName().equals(name)) {
			System.out.println("����: "+(int)(s4.getKor()+s4.getEng()+s4.getMath()+s4.getCoding()));
			System.out.println("���: "+(s4.getKor()+s4.getEng()+s4.getMath()+s4.getCoding())/4.0);
		} else if(s5.getName().equals(name)) {
			System.out.println("����: "+(int)(s5.getKor()+s5.getEng()+s5.getMath()+s5.getCoding()));
			System.out.println("���: "+(s5.getKor()+s5.getEng()+s5.getMath()+s5.getCoding())/4.0);
		} else {
			flag = false;
		}
		return flag;
	}

}