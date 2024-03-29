package java_lesson;

public class Ch04 {

	public static void main(String[] args) {
	
		// 01 자료 형 변환 
		// 자료형 변환의 종류 
		
		//1. 자동형변환 ( 암시적 형 변환) : 컴파일러가 자동으로 형 변환해주는 경우    --> 드러내지 않고. 
		//2. 강제형변환 ( 명시적 형 변환) : 개발자 (프로그래머)가 인위적으로 강제 형 변환하는 경우. ---> 명시해줘야지만 변하는. 
		
		//-2 자동형 변환 
		//범위가 넓은 자료형에 범위가 좁은 자료형이 대입되는 경우 
		// 컴파일러가 알아서 형 변환을 해준다는건 데이터 손실 가능성이 낮거나 없을 때라는 것 !!
		
		//byte < short < int < long < float(실수기 때무네 롱보다 크다) < double - 데이터 손실을 최소화
		// 1 바이트  < 2     < 4 - <8 <4 
	
	
	     
	      System.out.println("--------------------- 자동형변환 예제 -------------------------");
	      byte bytevar = 100;                  // 변수 초기화
	      int intvar = bytevar;               // 자동 형변환
	      System.out.println("intvar : " + intvar);
	      
	      char charvar = '가';                  // 변수 초기화
	      intvar = charvar;                  // 자동 형변환   강제로 문자를 정수로 변환해서 유니코드, 아스키 코드 숫자로 표기 됨. 
	      System.out.println("가 의 유니코드 : " + intvar);
	      
	      
	      intvar = 120;                     // 변수 값 변경
	      long longvar = intvar;               // 자동 형변환
	      System.out.println("longvar : " + longvar);
	      
	      
	      longvar = 100;                     
	      float floatvar = longvar;            // 자동 형변환(주의), 정수형 자료형 --> 실수형 자료형
	      System.out.println("floatvar : " + floatvar);
	      
	      floatvar = 100.5F;
	      double doublevar= floatvar;
	      System.out.println("doublevar : " + doublevar);
	      System.out.println();
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
