class Op2 {
	public static void main(String[] args){
		// ĳ���� ������!!
		
		double d1=3.5, d2=2.0; //�Ǽ��� ����
		//int var1 = d1 + d2; //�������� ������
		//java.lang.System.out.println(var1);//�����߻�
		
		// ��¿ �� ���� ���� ���� Ÿ���� �ٸ� �������� �۾��� �ʿ��ϴٸ� ĳ���ÿ����ڸ� ����ؼ� ������ ������ �ٲٴ� ��
		int var1 = (int)d1 + (int)d2; //ĳ���ÿ����ڸ� ����� ���⼭�� ��� ���� ��ȯ�����ִ°���
		java.lang.System.out.println(var1); //����� 5 (���������� ��ȯ�ϸ鼭 0.5�� �����)
		
		var1 = (int)(d1 + d2); // ������� ���� ���� ����ȯ�ϴ� �͵� ����
		java.lang.System.out.println(var1); //����� 5 (���������� ��ȯ�ϸ鼭 0.5�� �����)
		
		double d3 = (double)var1;
		java.lang.System.out.println("d3="+d3); //����� 5.0
		
		byte b = (byte)var1;
		java.lang.System.out.println("b="+b); //����� 5
		
		b = 100; //���⼭ 100�� ���ͷ� ��
		java.lang.System.out.println("b="+b); //����� 100
		
		// b = b + 5; // �����߻� / ��?
		/*
		b = 100
		�� ���̽��� ��� ���� b�� ���� �����ϴ� '���'�� ������
		�� �ڹ��� ��� b�� ������ ���� ������
		
		b = b + 5
		�� �� ��쿡�� ������ �ǹǷ� ��� �ӽ� ������ 105��� ���� ������ �� b�� �ٽ� �����ؾ���
		�� ������ ���� �� ���� ������Ÿ�� �Ҵ��� ������ ����Ʈ�� int, ���Ͱ��� �ӽ÷� �����ϸ� int�� �����
		�� byte ������ int�� �������� �ϴϱ� �����߻���		
		*/
		//java.lang.System.out.println("b="+b);
		
		b = (byte)(b + 5); //���� �䷸�� ������Ÿ���� ������ �°� ��������� �ٽ� ���� �� �ִ°ſ�
		java.lang.System.out.println("b="+b); // 105
		
		b += 5; //���� Ȥ�� �䷸�� ��ü������ ���Կ����� ���
		java.lang.System.out.println("b="+b); // 105
		
		float f = (float)3.14; // ����3&�Ҽ�.14�� �ӽø޸𸮿� ����� �������⶧���� ���ͷ� ���� �ƴ�
		java.lang.System.out.println("f="+f); // 
		f = 3.14f; // �Ǽ������� ĳ�����϶�� ����ǥ
		java.lang.System.out.println("f="+f);
		
		f = (float)(f + 2.5);
		java.lang.System.out.println("f="+f); // 5.6400003???? ��ǻ�ʹ� �Ǽ� ����� ��Ȯ���� ���� ���̱� ������, �Ǽ��� ������ ���� �ݵ�� �Ǽ����� ��� ó�������� ���ؾ��մϴ�
		f = f + 2.5f;
		java.lang.System.out.println("f="+f); // 
		f += 2.5;
		java.lang.System.out.println("f="+f); // 
		
		long var2 = 100;
		var2 = var2 + 1000; //long �ӽø޸��̷� ����Ʈ�� ���� int���� ū ������Ÿ���̶� ������ �߻����� ����
		var2 = 2500000000L; // long������ ĳ������ �϶�� ����ǥ
		java.lang.System.out.println("var2="+var2); // 
		
		int i = 'a'; // �������ε� ���ڸ� �־����� �ƽ�Ű�ڵ�� �ڵ� ����ȯ�� �Ǳ⶧���� ������ ���� ����
		java.lang.System.out.println("i="+i);
		
		char c = 97; // �������ε� ���ڸ� �־����� �ƽ�Ű�ڵ�� �ڵ� ����ȯ�� �Ǳ⶧���� ������ ���� ����
		java.lang.System.out.println("c="+c);
		
		
		
		// �ǽ�����
		java.lang.System.out.println("\n\n\n");
		
		
		int data = 10;
		
		char result = (data>5) ? 'T':'F'; // if���� �̷��� ���°ǰ���???
		java.lang.System.out.println(result);		
	}
}