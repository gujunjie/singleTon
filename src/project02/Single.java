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
     }//����ʽ,�÷�ʽֻ����������ֻ�е���getInstance�����Ż�ʵ�����������߳�ͬ�����⣬һ�㲻����ʹ�ø÷�ʽ
     
     public void showMessage()
     {
    	 System.out.println("hey guy,how is doing");
     }
}
