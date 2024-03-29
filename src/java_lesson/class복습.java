package java_lesson;


	
//문제 2: 학생 클래스 만들기

//1. Student 클래스를 작성하세요.
//2. name과 age라는 두 개의 속성을 가지도록 클래스를 구성하세요.
//3. name과 age 속성에 대한 초기화를 해주세요.

//4. displayInfo() 메소드를 구현하여 학생의 정보를 출력하세요.



class Student { 
	
	String name; 
	int age ;
	
	public void displayInfo() {
		System.out.println("학생이름 : " + name);
		
	}

public class C03PracStudent {						// 클래스를 사용할떄. 클래스를 또 만들어주는지 
	public static void main (String [] args) {
		
		Student std = new Student ();
		std.name = "이동하";
		std.age = 12;
		std.displayInfo();
		
	}
		
}
	
	
	
	
	
}
	

