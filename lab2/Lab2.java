package lab2;

import java.util.Scanner;
import java.util.Random;

public class Lab2 {
	public static void main(String[] args) {
		int count, sum=0, lowerBound, upperBound;
		double avg;
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		do {
			System.out.print("count: ");
			count = sc.nextInt();
		}while(count<1);
		System.out.print("LowerBound: ");
		lowerBound = sc.nextInt();
		System.out.print("UpperBound: ");
		upperBound = sc.nextInt();
		int[] ary = new int[count];
		for(int i=0;i<count;) {
			int next = generator.nextInt(upperBound);
			if(next<lowerBound) {
				continue;
			}
			else {
				ary[i] = next;
				sum+=ary[i];
				i++;
			}
		}
		avg = (double)sum/count;
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(ary[i]>ary[j]) {
					int tempt = ary[i];
					ary[i]=ary[j];
					ary[j]=tempt;
				}
			}
		}
		System.out.print("Content of the array: ");
		for(int i=0;i<count;i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		System.out.println("Largest number in the array: " + ary[count-1]);
		System.out.println("Smallest number in the array: " + ary[0]);
		System.out.println("Avaerage value of the numbers in the array: " + avg);
		System.out.println("Sum of all the numbers in the array: " + sum);
	}
}
