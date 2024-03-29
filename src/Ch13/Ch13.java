package Ch13;

public class Ch13 {

	public static void main(String[] args) {
		
		
		
		// 01 클래스 (자료형) 
		//동일한 종류의 객체를 구현하기 위해 객체의 속성/ 기능을 미리 선언한 자료형, 설계도 혹은 틀을 의미함 
		
		// 클래스의 구성 
		//1. 데이터(속성) ***(변수)
		//2. 해당 데이터를 처리하는 메서드 (함수 == 기능)***
		
		//클래스를 정의 하면 메모리 공간을 차지하지 않지만  ( ex. 건물설계도 ) 
		//객체가 생성되는 순간 클래스에서 선언한 속성/기능을 가진 공간이 형성됨.  ( ex. 객체 = 건물)
		
		
		//Ex)'Person'이라는 클래스에는 
		//여러가지의 속성과 기능을 가지고 있을 수 있다. ( 내가 만들기 나름)
		
		//String name; 		// 이름을 담아줄 멤버 변수 
		//int age; 			//나이를 담아줄 멤버 변수 
		//String address; 	// 주소를 담아줄 멤버 변수 
		//==> 데이터
		
		
		
		// void hello() { 	// 인사하는 멤버함수 (기능 == 메서드) 
				System.out.println(name + "이/가 인사를 합니다");
	//			}
	
	
	// ===> 하나의 Person이라는 클래스로부터 여러 명으 ㅣ사람 객체 (인스턴스)를 만들 수 있음. 
	//  예를 들자면 홍길동이라는 사람에 대한 이름, 나이 , 주소, 인사 기능도 있을 꺼고 
	//  		서길동이라는 사람에 대한 이름, 나이 , 주소, 인사 기능도 있을 꺼고
	//			남길동이라는 사람에 대한 이름, 나이 , 주소, 인사 기능도 있을 테니깐 
	
	//각자 가지는 이름과 나이, 주소값이 다를테니깐 (물론 같을 수도 있음. 같아도 상관 x) 
	
	//추가 ) 
	//클래스는 사용하기 전에는 기본적으로 메모리 공간을 차지하지 않음. 
	//클래스 자료형에 의해 객체가 생성되는 순간 클래스에서 선언한 
	//속성과 기능대로 공간이 형성되어 진다. 
	
	//02. 객체 (Object) - 존재하는 사물 (object) 
	//클래스로부터 만들어진 객체를 클래스의 인스턴스(instance)라고 함. 
	//Ex) 사람 객체는 사람( person_ 클래스의 인스턴스임 . 
	
	//"객체가 생성된다" 의 의미 == "메모리 공간을 차지한다."
	
				//
				
				//03. 객체의 기본구조 
				
				//1. 멤버변수(member variable) : 클래스 내부에 선언된 변수, 즉 객체의 속성을 나타냄 
				//Ex) Person 클래스의 name, age, address 에 해당. 
				
				//2. 메서드 (method) :클래스 내부에 정의된 함수, 즉 ㅇ객체의 기능(동작)을 나타내.ㅁ
				//Ex. person 클래스의 hello()	는 메서드임 
				//이름 멤버함수라고 부르기도 함.
				
				
				//04. 객체 지향 프로그래밍 (object oriented programming, OOP)
				//객체 (object) 에 대한 모델링을 중심으로 하는 프로그래밍 방식 
				//코드를 객체라는 단위로 구성, 객체들 간의 상호 작용을 통해 프로그램을 구축하는 것을 목표 
				
				
				//--수업자료 참고 -- 생략된것 있음. 
				
				//05. 기본코드 해석 
				
				// 자바의 메모리 영역 
				//1) 스택영역(stack ) : () 메서드 내에서 생성(int, double)
				//2) 클래스(메서드) 영역 : 공유 메모리 영역 (생성자메서드, 일반메서드, static메서드, static 변수) 
				//3) 힙영역(Heap) : 객체 저장 영역 (new 예약어 사용시 할당) 
				
				
				
				
				
				
	
		
	}
	
	
	
	

}