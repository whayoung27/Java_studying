package java_lesson;

public class Ch03 {

	public static void main(String[] args) {
	
		// 00 자료형과 변수 
		
		
		// 1 byte == 8 bit 
		
		// 자료 (데이터) : 선저장 후 처리 ( 공간 먼저 확보 후 저장)  ** 선저장 후처리 .. 꼭 기억 
		
		 int plus = 1+2; 
		 
		// 자료형 : 데이터 종류에 따라 저장됨 공간을 미리 규격화 시켜놓은 예약어 
//		 
//		 byte age 1 = 1;
//	
		
			 
		
		// 변수란? : 하나의 값저장할 수 있는 저장공간, 필요에 의해 반복적으로 바꿀 수 있음 
		// 상수란? : 항상 같은 수, 값을 바꾸지 않음 (고정) 
	
		// " = " 은 우리가 알면 수학적 기호의 의미 즉, "같다"는 의미를 지니는게 아니라 "대입"의 의미를 지님. 
		
		//				왼쪽 = 오른쪽 
		//			  (공간) = (값, 수) 
		// 			(Variable) = ( Value)
		// 이떄 오른쪽을 먼저 처리한다. 
			 
			 
			 
	    System.out.println(" ----------------------- 변수선언예제------------");
		int age ;       // 변수 선언 
						//int 자료형 == 4byte 
						//4byte 정수 공간에 age이름 부여 
		
		
		age = 22; 			// 변수 공간에 값 " 대입 "
							//이떄 주의해야 할 점이 age는 22과 같지 않음 
							//"대입"의 개념 
		
		
		System.out.println(22);
		System.out.printf("age : %d \n", age);
		
		age = 12; 
		
		int num1 = 10;  				 // 변수 초기화 
		int num2 = 20;
		int num3 = num1 + num2 ; 
		System.out.println(num3);
		
		System.out.println();    		// 빈줄 삽입  (줄바꿈)
		
		
		
		// 01 자료형의 종류 
		
		//1. 정수 자료형 
		//1-1} int            : 4byte 정수( 32bit) , 기본자료형        ( -21억 ~ 21 억  : 거의 모든 수 표현가능) 
		
		
		System.out.println("------ 정수 자료형 - int 형 예제 ------------");
		
		int n1 = 0b10101101 ; 
		int n2 = 173 ; 
		int n3 = 0255; 
		int n4 = 0xad; 
		System.out.printf("%d %d %d %d \n", n1 , n2, n3, n4);
		System.out.println();

		
		
		// 1-2) byte    : 1byte 정수, 부호 o        ( -128 ~ 127)
		
		
		
		System.out.println(" -------------------정수자료형 - byte형 예제 -----------");
		byte m1 = -128;
		byte m2 = -30 ; 
		byte m3 = 30;
		byte m4 = 127;
		byte m5 = (byte) 128;  //error why 
		
		System.out.println(m5);
		System.out.println();
		
		
		//1-3) ## short vs char 비교 ##           
		//char      		: 2 byte 정수 부호 x , 단일문자 저장용으로 주로 사용 
		//short 			: 2 byte 정수 부호 o 
		
		System.out.println("-----------------정수 자료형 - char 형, short 형 예제 ---- ");
		
		char o1 = 65535 ;   		//0 - 2^16 / 0  ~ 65535
		//short o2 = 60000 ; 			//error 
		char o2 = 32767 ; 			// - 2^15 ~ ( 2^15 - 1 )  /  -32768 ~ 32767
		
		char o3 = 60000; 
		short o4 = ( short) o3 ;   	//error, r강제 형변환, o3은 이제 음수가 되어버림. 
		System.out.println(o4); 
		o3 = 65 ; 
		System.out.println(o3);
		System.out.println();
		
		// 1- 4 )long 			: 8byte 정수  거의 대부분의 숫자를표현 할 수 있음. 
		
		System.out.println(" ---- 정수자료형 long 형 예제 ---- ") ; 
		
		long a1 = 20;   		//리터럴 접미사 x == > 기본자료형 (int) 
								// long , int 자료형을 일치시켜주는 작업이 합 ( 자동 형 변환 작업) 
								//자동형변환. . >>int를 long 바이트에 넣는것. 당연한 것이기 때문에 강제형 변환 x
								//long 이 더 큰범위이기 때문에 
		
		
		//(8byte = 4byte )
			
		
		
		
		long a2 = 20L ; 		// 리터럴 접미사 L , l : long 자료형 
								//long , long 자료형이 같아서 작업이 필요 없음. 
		
		// 8byte = 8byte
		
		
	
				
	    //long a3 - 10000000000; // error why  - int는 21억까지 가능 
		
							     //4byte는 대략 -21억 -21억까지 저장 o 
							     //long , int 이기 때문에 4byte 안에 저장 x 
							     //sysou ctrl space enter 
		
		long a4 = 10000000000L ; // L을 붙임으로써 long 으로 변화해서 ( 8byte)에 담기떄문에 에러가 나지 않음. 
		
		System.out.println(a4); 
		System.out.println();
		
		
	
		
		
		
		//
		
	
	}

}
