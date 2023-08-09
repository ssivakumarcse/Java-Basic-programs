package programs;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		System.out.println("Before Swap " + a + " " + b);
		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swap " + a + " " + b);
		// Without third variable
		System.out.println("Before Swap " + a + " " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap " + a + " " + b);

	}
}
