package prog;

class Employee1 {
		String name;
		int joinyear;
		int salary;
		String Address;
		
		public Employee1(String n, int y, int s, String a) {
			name = n;
			joinyear = y;
			salary = s;
			Address = a;
		}
		
		public void Display() {
			System.out.println(name +"  "+ joinyear+"  "+salary+"  "+Address);
		}

}

public class Employee{
		public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("Robert", 1994, 50000, "64C- WallsStreet");
		Employee1 e2 = new Employee1("Sam", 2000, 60000, "68D- WallsStreet");
		Employee1 e3 = new Employee1("John", 1999, 55000, "26B- WallsStreet");
		
		System.out.println(" name " +" "+ " year "+" "+" salary "+" "+" Address");
		
		e1.Display();
		e2.Display();
		e3.Display();
	}
}
