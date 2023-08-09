package programs;

import java.util.Scanner;

public class sumofNnatural {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
//sum of n natural number
		for (int i = 1; i <= num; i++) {
			sum += i;

		}
		System.out.println(sum);

		// sum of num in a given range

		int sum1 = 0;
		for (int i = num; i <= num2; i++) {
			sum1 += i;

		}
		System.out.println(sum1);
	}
}
