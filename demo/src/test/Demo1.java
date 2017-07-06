package test;

public class Demo1 {
      public static void main(String[] args) {
		System.out.println("=========");
		//SingleObject object = new SingleObject();
		//SingleObject.getInstance().showMessage();
		 Image image = new ProxyImage("test_10mb.jpg");
		 image.display();
		 image.display(); 
syso		 
		
	}
}
