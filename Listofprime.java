package programs;

import java.util.Scanner;

public class Listofprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count;
		for (int i = num1; i <= num2; i++) {
			count = 0;
			/*
			 * if (i == 19) { break; }
			 */
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count++;
					break;
				}

			}
			if (count == 0) {
				System.out.print(i + " ");

			}
		}

	}

}
