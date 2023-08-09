package programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, count = 0;

		while (num != 0) {
			int temp = num % 10;
			sum += temp;
			num = num / 10;
			count++;
		}
		System.out.println(sum + " digit count is " + count);
	}

}
