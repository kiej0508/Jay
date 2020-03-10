class Op1 {
	public static void main(String[] args){
		// 연산자!
		int num1 = 10;
		num1 = num1 + 1; // 10 + 1 해서 다시 담기
		java.lang.System.out.println(num1); // → 11출력됨
		
		num1++; // 기존 값에서 증가
		java.lang.System.out.println(num1); // → 12출력됨
		
		num1--; // 기존 값에서 감소
		java.lang.System.out.println(num1); // → 11출력됨
		
		++num1; // 앞에 붙여도 됨
		java.lang.System.out.println(num1); // → 12출력됨
		--num1; // 앞에 붙여도 됨 but.....
		java.lang.System.out.println(num1); // → 11출력됨
		
		
		int num2 = 10, num3 = 0;
		num3 = ++num2; // 이렇게 앞에 붙이게 될 경우에는 
		java.lang.System.out.println("num2:"+num2+", num3:"+num3); // 둘 다 11로 출력
		
		num3 = num2++; // 이렇게 뒤에 붙이게 될 경우에는 
		java.lang.System.out.println("num2:"+num2+", num3:"+num3); // 왜 num3에 ++이 반영안됨?
		/*
		연산자의 우선순위 때문에 이런거임
		num3 = ++num2; → 산술연산자 ++가 적용된 후 대입연산자 =가 적용 / num2와 num3의 값이 동일
		num3 = num2++; → 대입연산자 =가 적용된 후 산술연산자 ++가 적용 / num3은 변경되기 전의 num2값이 들어감
		
		★ 그래서 증감연산자는 되도록 다른 연산자와 같이 사용하지 않는다 ★
		*/
		
		
	}
}