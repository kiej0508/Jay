class Var2 {
	public static void main(String[] args){
		int a = 10;
		{
			int b = 20;
			java.lang.System.out.println("b=" + b);
			java.lang.System.out.println("a=" + a);
			/*
			java.lang.System.out.println("a=" + a);
			������ ����� ���� ���� ���̱� ������
			���� ����� �ʾ��� ���� �׷��� ��� ���� ����
			*/
		}
		/*
		java.lang.System.out.println("b=" + b);
		������ ����� ���� ����� ������� ������ (like ��������)
		���⼭�� ������ ã�� �� ���� ���� �� ���� �߻�
		*/
	}
}