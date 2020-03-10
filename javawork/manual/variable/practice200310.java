class practice200310 {
	public static void main(String[] args){
		/*
		■ 1. 리터를 갤런으로 바꿔보자.
		두개의 double변수를 이용해서 각각 갤런과 리터값을 저장하고 갤런값을 해당하는 리터값으로 바꿔보자.(1갤런은 3.7584리터이다)
		*/
		double g = 1, l1 = 3.7584f, cnt = 2;
		double g2l = (g*cnt)*l1;
		System.out.println("1. "+cnt+"갤런 : "+g2l+"리터");
		
		
		/*
		■ 2. 달의 중력은 지구 중력의 17% 정도이다. 달에서의 당신의 체중을 계산하는 프로그램을 작성하라.
		*/
		float moon = (1.0f-0.17f), weight = 100f;
		float moon_weight = (float)(weight*moon);
		System.out.println("\n2. "+weight+"의 달에서 무게 : "+moon_weight);
		
		
		/*
		■ 3. 번개가 얼마나 먼 곳에서 발생했나?
		(번개 소리를 들은 사람이 번개가 치는 곳에서부터 몇 피트 정도 떨어져 있는가를 계산하라. 소리는 공기 중을 약 1,100 피트/초의 속도로 진행한다.
		- 번개를 본 시각과 천둥소리를 들은 시각 사이의 시간을 알면 거리를 계산할 수 있다. 여기서는 7.2초로 가정하자)
		*/
		float dist = 0, s = 1100, term = 7.2f;
		dist = s*term;
		System.out.println("\n3. 거리 : "+dist+"피트");
		
		
		/*
		아래의 코드는 사과를 담는데 필요한 바구니(버켓) 의 수를 구하는 코드이다. 
		만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다 
		(1)에 알맞은 코드를 넣으시오.
		class Exercise1 { 
		public static void main(String[] args) { 
		int numOfApples = 123;  // 사과의 개수 
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)  
		int numOfBucket = (  (1)  ) // 모든 사과를 담는데 필요한 바구니의 수  
		
		System.out.println("필요한 바구니의 수 :" + numOfBucket);
		}
		}
		*/
		int numOfApples = 123;  // 사과의 개수 
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)  
		int numOfBucket = (numOfApples/sizeOfBucket)+1; // 모든 사과를 담는데 필요한 바구니의 수  
		System.out.println("\n4. 필요한 바구니의 수 :" + numOfBucket);
		
		
		/*
		아래의 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
		만일 변수 num의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. 
		(1)에 알맞은 코드를 넣으시오.
		class Exercise2 {
		public static void main(String[] args) {
		int num = 456;
		System.out.println( (1) );
			}
		}
		*/
		int num = 111;
		System.out.println("\n5. "+num/100*100);
		
		
		/*
		class Exercise3 { 
		public static void main(String[] args) { 
		byte a = 10; 
		byte b = 20; 
		byte c = a + b; 

		char ch = 'A'; 
		ch = ch + 2; 

		float f = 3 / 2; 
		long l = 3000 * 3000 * 3000; 

		float f2 = 0.1f; 
		double d = 0.1; 

		boolean result = d==f2; 

		System.out.println("c="+c); 
		System.out.println("ch="+ch); 
		System.out.println("f="+f); 
		System.out.println("l="+l); 
		System.out.println("result="+result); 
		} 
		}

		실행결과
		c=30 
		ch=C 
		f=1.5 
		l=27000000000 
		result=true
		*/
		byte a = 10; 
		byte b = 20; 
		byte c = (byte)(a + b); 

		char ch = 'A'; 
		ch = (char)(int)(ch+2); 
		
		float f = 3f / 2f;
		
		long l = (3000L * 3000L * 3000L); 
		
		float f2 = 0.1f; 
		double d = 0.1f; 
		boolean result = d==f2; 
		
		
		System.out.println("c="+c); 
		System.out.println("ch="+ch); 
		System.out.println("f="+f); 
		System.out.println("l="+l); 
		System.out.println("result="+result); 
	}
}