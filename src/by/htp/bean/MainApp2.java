package by.htp.bean;

public class MainApp2 {

	{
	System.out.println("Main App2 logic block");
	}
	
	static{
		System.out.println("Main App2 static block");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		MainApp2 m = new MainApp2();
		A a2 = new A();
	}
	
	

}
