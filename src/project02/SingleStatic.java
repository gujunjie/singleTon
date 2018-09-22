package project02;

public class SingleStatic {
	
	private SingleStatic() {}
	
	private static class SingleInstance
	{
		public static final SingleStatic INSTANCE=new SingleStatic();
	}
	
	public static SingleStatic getInstance()
	{
		return SingleInstance.INSTANCE;
	}//��̬�ڲ���ķ�ʽ��Ч�ʸߣ��������̵߳�ͬ�����⣬��������ʽ���Ƽ�ʹ��
	
	public void showMessage()
	{
		System.out.println("ffffffffff");
	}

}
