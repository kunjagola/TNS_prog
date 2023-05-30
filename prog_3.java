package prog;
import java.util.*;


public class Gradesystem {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

	        int maths = sc.nextInt();
	        int science = sc.nextInt();
	        int physics = sc.nextInt();

	        int total_marks = (maths + science + physics) / 3;
	        System.out.println("Avg_marks = " + total_marks);

	        if (total_marks > 90) {
	                System.out.println("Grade A");
	        } 
	        else if (total_marks > 80 && total_marks <= 90) {
	                System.out.println("Grade B");
	        }
	        else if (total_marks > 70 && total_marks <= 80) {
	                System.out.println("Grade C");
	        }
	        else {
	                System.out.println("Grade D");
	        }
	}

}
