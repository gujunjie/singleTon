package project02;



public class SingleTon {
	
	private static SingleTon singleTon=new SingleTon();
	
	private SingleTon(){}

	public static SingleTon getInstance() {
		return singleTon;
	}//饿汉式，类加载的时候就实例化对象，浪费内存，容易产生垃圾对象，但是它不会有多线程的同步问题
	  //也是最常用的一种创建单例的方式
	
	public void showMessage()
	{
		System.out.println("hi you son of a bitch");
	}
}
