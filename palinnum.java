package programs;

import java.util.Scanner;

public class palinnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tempe = num;
		int reverse = 0;
		while (tempe != 0) {
			int temp = tempe % 10;
			reverse = reverse * 10 + temp;
			tempe = tempe / 10;
		}
		if (num == reverse) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");

	}

}
