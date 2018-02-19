package by.htp.bean;

public class MainApp {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100);
		System.out.println("Employee1 start salary: " + emp1.getSalary());
		
		Employee emp2 = new Employee(100); 
		System.out.println("Employee2 start salary: " + emp2.getSalary());
		
		Employee.setK(1.5);
		emp1.increaseSalary();
		System.out.println("Employee1 half year salary: " + emp1.getSalary());
		emp2.increaseSalary();
		System.out.println("Employee2 half year salary: " + emp2.getSalary());
		
		Employee emp3 = new Employee(100); 
		System.out.println("Employee1 start salary: " + emp3.getSalary());
		Employee emp4 = new Employee(100); 
		System.out.println("Employee1 start salary: " + emp4.getSalary());
		Employee emp5 = new Employee(100); 
		System.out.println("Employee1 start salary: " + emp5.getSalary());
		
		SuperEmployee se1 = new SuperEmployee(100);
		System.out.println("Super Employee1 start salary: " + se1.getSalary());
		
		se1.setK(2);
		se1.increaseSalary();
		System.out.println("Super Employee1 half year salary: " + se1.getSalary());
		
		SuperEmployee se2 = new SuperEmployee(100);		
		System.out.println("Super Employee1 start salary: " + se2.getSalary());
		
		System.out.println("==================================");
		Student st1 = new Student();
		st1.setAvgMark(10);
		Student.setGroup("Java group");
		
		Student st2 = new Student();
		st2.setAvgMark(8);
		//st2.setGroup("C++ group");
		
		Student st3 = new Student();
		st3.setAvgMark(9);
		//st3.setGroup("C-- group");
		
		Student st4 = new Student();
		st4.setAvgMark(9);
		//st4.setGroup("C# group");
		
		System.out.println("st1 group: " + st1.getGroup());
		System.out.println("st1 mark: " + st1.getAvgMark());
		System.out.println("------------------");
		
		System.out.println("st2 group: " + st2.getGroup());
		System.out.println("st2 mark: " + st2.getAvgMark());
		System.out.println("------------------");
		
		System.out.println("st3 group: " + st3.getGroup());
		System.out.println("st3 mark: " + st3.getAvgMark());
		System.out.println("------------------");
		
		System.out.println("st4 group: " + st4.getGroup());
		System.out.println("st4 mark: " + st4.getAvgMark());
		System.out.println("------------------");
		
		Student.setGroup("Number One");
		Student st5 = new Student();
		System.out.println("st5 group: " + st5.getGroup());

	}

}
