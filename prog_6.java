package prog;

public class Student1 {
	private String name;
	private int id;
	private int age;
	private int mobile;
	
	public void getData() {
		name = "Kunj";
		id = 1;
		age = 20;
		mobile = 94080;
	}
	
	public void Display() {
		System.out.println(name + " "+ id+ " "+ age+ " "+ mobile);
	}
}
