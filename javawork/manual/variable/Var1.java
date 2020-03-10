class Var1 {
	public static void main(String[] args){
		int a; // 변수 초기화(선언)
		a = 100; // 변수 작성
		/*
		선언한 데이터타입과 다른 값을 넣을 수 없음
		a = "abc";
		a = 3.4
		*/
		
		byte c;
		c = 127;
		java.lang.System.out.println(c);
		/*
		byte	1byte	2^8(0~255 → -128~127)
		→ 127일 때는 출력 되는데, 128로 하면 데이터타입의 범위를 벗어나서 오류발생
		*/
		
		char d;
		d = '한'; // 한글자일때는 반드시 홑따움표!
		java.lang.System.out.println(d);
		/*
		- C, C++은 한 문자열을 1byte(ASCII)로 저장 → 영어 외 언어 저장이 어렵
		- java는 ASCII+1byte → UNICODE로 저장 → 영어 외 언어 저장이 가능
		*/
		
		boolean e;
		e = true;
		java.lang.System.out.println(e);
		/*
		C는 0, 1로 대체 가능하나
		java는 딱 true, false로만 써야함
		*/
	}
}