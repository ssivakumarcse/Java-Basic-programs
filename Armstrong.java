package programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			sum = sum + digit * digit * digit;
			temp = temp / 10;
		}
		if (num == sum) {
			System.out.println("Armstrong number");
		} else
			System.out.println("Not Armstrong number");

	}

}
