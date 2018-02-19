package by.htp.runner;

import by.htp.bean.A;
import by.htp.bean.B;
import by.htp.bean.C;

public class MainApp3 {

	static{
		new C();
	}
	
	
	public static void main(String[] args) {
		new C(new B());
	
	}

}
