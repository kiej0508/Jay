class Var1 {
	public static void main(String[] args){
		int a; // ���� �ʱ�ȭ(����)
		a = 100; // ���� �ۼ�
		/*
		������ ������Ÿ�԰� �ٸ� ���� ���� �� ����
		a = "abc";
		a = 3.4
		*/
		
		byte c;
		c = 127;
		java.lang.System.out.println(c);
		/*
		byte	1byte	2^8(0~255 �� -128~127)
		�� 127�� ���� ��� �Ǵµ�, 128�� �ϸ� ������Ÿ���� ������ ����� �����߻�
		*/
		
		char d;
		d = '��'; // �ѱ����϶��� �ݵ�� Ȭ����ǥ!
		java.lang.System.out.println(d);
		/*
		- C, C++�� �� ���ڿ��� 1byte(ASCII)�� ���� �� ���� �� ��� ������ ���
		- java�� ASCII+1byte �� UNICODE�� ���� �� ���� �� ��� ������ ����
		*/
		
		boolean e;
		e = true;
		java.lang.System.out.println(e);
		/*
		C�� 0, 1�� ��ü �����ϳ�
		java�� �� true, false�θ� �����
		*/
	}
}