package arraysAndstrings;

import java.util.Scanner;

public class cracker {
	public static void main(String[] args) {
		Scanner winner=new Scanner(System.in);
		System.out.println("Fang says");
		String name=winner.nextLine();
		if(name.length()<=20) {
			System.out.println("Hagrid must choose the cracker with name "+name);
		}
		winner.close();
	}

}
