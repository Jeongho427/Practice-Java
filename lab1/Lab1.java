package lab1;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		int num, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 9: ");
		while(true) {
			num = sc.nextInt();
			if(num<0||num>9) {
				System.out.print("Please enter a number between 1 and 9: ");
			}
			else {
				break;
			}
		}
		for(int i=1;i<num+1;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i + "*" + j + "=" + i*j);
				sum+=i*j;
			}
		}
		System.out.println("The sum of the all the computed numbers is: " + sum);
	}
}
