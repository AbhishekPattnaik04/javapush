package arraysAndstrings;
import java.util.Arrays;
import java.util.Scanner;

public class partnership {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("enter the number of partnerships");
		int n= num.nextInt();
		if(n<0) {
			System.out.println("invalid input");
		}
		num.nextLine();
		int i,j;
		String[][] partner=new String[n][3];
		System.out.println("enter the names of players and their partnership");
		for(i=0;i<n;i++) {
			for(j=0;j<3;j++) {
			partner[i][j]=num.nextLine();
		}
	}
				System.out.println(Arrays.deepToString(partner));
			
				num.close();

     }
		
  }
