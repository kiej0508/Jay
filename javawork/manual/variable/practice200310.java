class practice200310 {
	public static void main(String[] args){
		/*
		�� 1. ���͸� �������� �ٲ㺸��.
		�ΰ��� double������ �̿��ؼ� ���� ������ ���Ͱ��� �����ϰ� �������� �ش��ϴ� ���Ͱ����� �ٲ㺸��.(1������ 3.7584�����̴�)
		*/
		double g = 1, l1 = 3.7584f, cnt = 2;
		double g2l = (g*cnt)*l1;
		System.out.println("1. "+cnt+"���� : "+g2l+"����");
		
		
		/*
		�� 2. ���� �߷��� ���� �߷��� 17% �����̴�. �޿����� ����� ü���� ����ϴ� ���α׷��� �ۼ��϶�.
		*/
		float moon = (1.0f-0.17f), weight = 100f;
		float moon_weight = (float)(weight*moon);
		System.out.println("\n2. "+weight+"�� �޿��� ���� : "+moon_weight);
		
		
		/*
		�� 3. ������ �󸶳� �� ������ �߻��߳�?
		(���� �Ҹ��� ���� ����� ������ ġ�� ���������� �� ��Ʈ ���� ������ �ִ°��� ����϶�. �Ҹ��� ���� ���� �� 1,100 ��Ʈ/���� �ӵ��� �����Ѵ�.
		- ������ �� �ð��� õ�ռҸ��� ���� �ð� ������ �ð��� �˸� �Ÿ��� ����� �� �ִ�. ���⼭�� 7.2�ʷ� ��������)
		*/
		float dist = 0, s = 1100, term = 7.2f;
		dist = s*term;
		System.out.println("\n3. �Ÿ� : "+dist+"��Ʈ");
		
		
		/*
		�Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����) �� ���� ���ϴ� �ڵ��̴�. 
		���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 13���� �ٱ��ϰ� �ʿ��� ���̴� 
		(1)�� �˸��� �ڵ带 �����ÿ�.
		class Exercise1 { 
		public static void main(String[] args) { 
		int numOfApples = 123;  // ����� ���� 
		int sizeOfBucket = 10; // �ٱ����� ũ�� (�ٱ��Ͽ� ���� �� �ִ� ����� ����)  
		int numOfBucket = (  (1)  ) // ��� ����� ��µ� �ʿ��� �ٱ����� ��  
		
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);
		}
		}
		*/
		int numOfApples = 123;  // ����� ���� 
		int sizeOfBucket = 10; // �ٱ����� ũ�� (�ٱ��Ͽ� ���� �� �ִ� ����� ����)  
		int numOfBucket = (numOfApples/sizeOfBucket)+1; // ��� ����� ��µ� �ʿ��� �ٱ����� ��  
		System.out.println("\n4. �ʿ��� �ٱ����� �� :" + numOfBucket);
		
		
		/*
		�Ʒ��� ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴�.
		���� ���� num�� ���� ��456���̶�� ��400���� �ǰ�, ��111���̶�� ��100���� �ȴ�. 
		(1)�� �˸��� �ڵ带 �����ÿ�.
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

		������
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