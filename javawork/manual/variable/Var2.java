class Var2 {
	public static void main(String[] args){
		int a = 10;
		{
			int b = 20;
			java.lang.System.out.println("b=" + b);
			java.lang.System.out.println("a=" + a);
			/*
			java.lang.System.out.println("a=" + a);
			변수가 선언된 블럭에 하위 블럭이기 때문에
			블럭을 벗어나지 않았음 ㅇㅇ 그래서 얘는 실행 가능
			*/
		}
		/*
		java.lang.System.out.println("b=" + b);
		변수가 선언된 블럭을 벗어나면 사라지기 때문에 (like 지역변수)
		여기서는 변수를 찾을 수 없어 실행 시 에러 발생
		*/
	}
}