class Op1 {
	public static void main(String[] args){
		// ������!
		int num1 = 10;
		num1 = num1 + 1; // 10 + 1 �ؼ� �ٽ� ���
		java.lang.System.out.println(num1); // �� 11��µ�
		
		num1++; // ���� ������ ����
		java.lang.System.out.println(num1); // �� 12��µ�
		
		num1--; // ���� ������ ����
		java.lang.System.out.println(num1); // �� 11��µ�
		
		++num1; // �տ� �ٿ��� ��
		java.lang.System.out.println(num1); // �� 12��µ�
		--num1; // �տ� �ٿ��� �� but.....
		java.lang.System.out.println(num1); // �� 11��µ�
		
		
		int num2 = 10, num3 = 0;
		num3 = ++num2; // �̷��� �տ� ���̰� �� ��쿡�� 
		java.lang.System.out.println("num2:"+num2+", num3:"+num3); // �� �� 11�� ���
		
		num3 = num2++; // �̷��� �ڿ� ���̰� �� ��쿡�� 
		java.lang.System.out.println("num2:"+num2+", num3:"+num3); // �� num3�� ++�� �ݿ��ȵ�?
		/*
		�������� �켱���� ������ �̷�����
		num3 = ++num2; �� ��������� ++�� ����� �� ���Կ����� =�� ���� / num2�� num3�� ���� ����
		num3 = num2++; �� ���Կ����� =�� ����� �� ��������� ++�� ���� / num3�� ����Ǳ� ���� num2���� ��
		
		�� �׷��� ���������ڴ� �ǵ��� �ٸ� �����ڿ� ���� ������� �ʴ´� ��
		*/
		
		
	}
}