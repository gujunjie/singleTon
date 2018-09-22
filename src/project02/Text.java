package project02;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SingleTon singleTon=SingleTon.getInstance();
        singleTon.showMessage();
        
        Single single=Single.getInstance();
        single.showMessage();
        
        SingleStatic singleStatic=SingleStatic.getInstance();
        singleStatic.showMessage();
	}

}
