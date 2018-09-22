package project02;

public class Single {
     private static Single single;
     
     private Single() {}
     
     public static Single getInstance()
     {
    	 if(single==null) {
    		 single=new Single();
    		 return single;
    	 }else {
    		 return single;
    	 }
     }//懒汉式,该方式只是声明对象，只有调用getInstance方法才会实例化，会有线程同步问题，一般不建议使用该方式
     
     public void showMessage()
     {
    	 System.out.println("hey guy,how is doing");
     }
}
