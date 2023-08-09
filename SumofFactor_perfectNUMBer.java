package programs;

import java.util.Scanner;

public class SumofFactor_perfectNUMBer {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sum += i;
			}
		}
		if (sum == num1) {
			System.out.println("perfect");
		} else {
			System.out.println("not perfect");
		}
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.println(i + " ");
			}

		}
	}
}
