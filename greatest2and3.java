package programs;

import java.util.Scanner;

public class greatest2and3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		// geatest of 2

		if (num1 > num2)
			System.out.println("num1 greatest");
		else
			System.out.println("num2 greatest");

		// geatest of 3

		if (num1 > num2 && num1 > num3)
			System.out.println("num1 greatest");
		else if (num2 > num1 && num2 > num3)
			System.out.println("num2 greatest");
		else
			System.out.println("num3 greatest");
	}

}
