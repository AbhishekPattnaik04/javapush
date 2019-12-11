package arraysAndstrings;
import java.util.Scanner;

public class flag {
	public static void main(String[] args) {
		Scanner character=new Scanner(System.in);
		System.out.println("enter the character");
		String flag=character.nextLine();
		System.out.println("Harry has to pick the flag that has "+flag+" in it");
		character.close();
	}

}
