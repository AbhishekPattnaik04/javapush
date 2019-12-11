package arraysAndstrings;

import java.util.Arrays;
import java.util.Scanner;

public class bowlout {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=num.nextInt();
		if(size<0) {
			System.out.println("invalid input");
		}
		int[] score=new int[size];
		int[] score1=new int[size];
		int i;
		System.out.println("enter the scores for team A");
		for(i=0;i<size;i++) {
			score[i]=num.nextInt();
			int j=i+1;
			if(score[j]<0 || score[j]>1) {
				System.out.println("invalid input");
			
		}
		}
		int[] copy=Arrays.copyOf(score, size);
		System.out.println("the scores are");
		for(i=1;i<size;i++) {
		System.out.println(copy[i]);
	}
		System.out.println("enter the scores for team B");
		
		for(i=0;i<size;i++) {
			score1[i]=num.nextInt();
			if(score1[i+1]<0 || score1[i+1]>1) {
				System.out.println("invalid input");
			}
		}
		int[] copy1=Arrays.copyOf(score1, size);
		System.out.println("the scores are");
		for(i=1;i<size;i++) {
		System.out.println(copy1[i]);

  }
		num.close();
 }
}