package programs;

import java.util.Scanner;

public class removevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String vowelout = "";
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == 'a' || num.charAt(i) == 'e' || num.charAt(i) == 'i' || num.charAt(i) == 'o'
					|| num.charAt(i) == 'u' || num.charAt(i) == 'A' || num.charAt(i) == 'E' || num.charAt(i) == 'I'
					|| num.charAt(i) == 'O' || num.charAt(i) == 'U') {
				vowelout += "";
			} else {
				vowelout += num.charAt(i);
			}
		}
		System.out.println(vowelout);
	}

}
