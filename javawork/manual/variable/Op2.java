class Op2 {
	public static void main(String[] args){
		// 캐스팅 연산자!!
		
		double d1=3.5, d2=2.0; //실수형 변수
		//int var1 = d1 + d2; //정수형에 담으면
		//java.lang.System.out.println(var1);//에러발생
		
		// 어쩔 수 없이 위와 같이 타입이 다른 변수끼리 작업이 필요하다면 캐스팅연산자를 사용해서 강제로 형식을 바꾸는 것
		int var1 = (int)d1 + (int)d2; //캐스팅연산자를 사용해 여기서만 잠깐 형을 변환시켜주는거임
		java.lang.System.out.println(var1); //결과값 5 (정수형으로 변환하면서 0.5가 절사됨)
		
		var1 = (int)(d1 + d2); // 결과값을 먼저 내고 형변환하는 것도 가능
		java.lang.System.out.println(var1); //결과값 5 (정수형으로 변환하면서 0.5가 절사됨)
		
		double d3 = (double)var1;
		java.lang.System.out.println("d3="+d3); //결과값 5.0
		
		byte b = (byte)var1;
		java.lang.System.out.println("b="+b); //결과값 5
		
		b = 100; //여기서 100은 리터럴 값
		java.lang.System.out.println("b="+b); //결과값 100
		
		// b = b + 5; // 에러발생 / 왜?
		/*
		b = 100
		→ 파이썬의 경우 변수 b는 값을 저장하는 '장소'를 저장함
		→ 자바의 경우 b에 실제의 값을 저장함
		
		b = b + 5
		→ 이 경우에는 연산이 되므로 어딘가 임시 공간에 105라는 값을 저장한 후 b에 다시 저장해야함
		→ 정수형 저장 시 별도 데이터타입 할당이 없으면 디폴트로 int, 위와같이 임시로 저장하며 int로 저장됨
		→ byte 변수에 int를 넣으려고 하니까 에러발생됨		
		*/
		//java.lang.System.out.println("b="+b);
		
		b = (byte)(b + 5); //→→→ 요렇게 데이터타입을 변수에 맞게 지정해줘야 다시 넣을 수 있는거여
		java.lang.System.out.println("b="+b); // 105
		
		b += 5; //→→→ 혹은 요렇게 자체적으로 대입연산자 사용
		java.lang.System.out.println("b="+b); // 105
		
		float f = (float)3.14; // 가수3&소수.14로 임시메모리에 저장돼 합쳐지기때문에 리터럴 값이 아님
		java.lang.System.out.println("f="+f); // 
		f = 3.14f; // 실수형으로 캐스팅하라는 꼬리표
		java.lang.System.out.println("f="+f);
		
		f = (float)(f + 2.5);
		java.lang.System.out.println("f="+f); // 5.6400003???? 컴퓨터는 실수 계산이 정확하지 않은 놈이기 때문에, 실수를 연산할 때는 반드시 실수값을 어떻게 처리할지를 정해야합니다
		f = f + 2.5f;
		java.lang.System.out.println("f="+f); // 
		f += 2.5;
		java.lang.System.out.println("f="+f); // 
		
		long var2 = 100;
		var2 = var2 + 1000; //long 임시메모이레 디폴트로 담기는 int보다 큰 데이터타입이라서 에러가 발생하지 않음
		var2 = 2500000000L; // long형으로 캐스팅을 하라는 꼬리표
		java.lang.System.out.println("var2="+var2); // 
		
		int i = 'a'; // 정수형인데 문자를 넣었지만 아스키코드로 자동 형변환이 되기때문에 에러가 나지 않음
		java.lang.System.out.println("i="+i);
		
		char c = 97; // 문자형인데 숫자를 넣었지만 아스키코드로 자동 형변환이 되기때문에 에러가 나지 않음
		java.lang.System.out.println("c="+c);
		
		
		
		// 실습예제
		java.lang.System.out.println("\n\n\n");
		
		
		int data = 10;
		
		char result = (data>5) ? 'T':'F'; // if문을 이렇게 쓰는건가요???
		java.lang.System.out.println(result);		
	}
}