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
	}//静态内部类的方式，效率高，不会有线程的同步问题，基于懒汉式，推荐使用
	
	public void showMessage()
	{
		System.out.println("ffffffffff");
	}

}
