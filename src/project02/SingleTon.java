package project02;



public class SingleTon {
	
	private static SingleTon singleTon=new SingleTon();
	
	private SingleTon(){}

	public static SingleTon getInstance() {
		return singleTon;
	}//����ʽ������ص�ʱ���ʵ���������˷��ڴ棬���ײ����������󣬵����������ж��̵߳�ͬ������
	  //Ҳ����õ�һ�ִ��������ķ�ʽ
	
	public void showMessage()
	{
		System.out.println("hi you son of a bitch");
	}
}
