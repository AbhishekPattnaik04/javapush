package arraysAndstrings;
import java.util.Scanner;

public class tournament {
	public static void main(String[] args) {
		Scanner championship=new Scanner(System.in);
		System.out.println("enter value for the code");
		int code=championship.nextInt();
		System.out.println("Harry has to swim at "+code+" meters deep and rescue "+code+" sea maidens");
		championship.close();
	}

}
