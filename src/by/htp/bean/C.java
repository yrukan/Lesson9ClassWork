package by.htp.bean;

public class C extends B {

	{
		System.out.println("CL1");
		
	}
	
	public C() {
		System.out.println("C ()");
	}

	public C(String C) {
		super();
		System.out.println("C (String C)");
	}
	
	public C(Object obj){
		this("a");
	}

}
