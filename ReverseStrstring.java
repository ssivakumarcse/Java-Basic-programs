package programs;

import java.util.Scanner;

public class ReverseStrstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String reverse = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			reverse += num.charAt(i);
		}

		System.out.println(reverse);
	}

}
