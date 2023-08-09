package programs;

import java.util.*;

public class DeciToOctal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		char Chars[] = { '0', '1', '2', '3', '4', '5', '6', '7' };
		String octal = "";
		while (decimal > 0) {
			int temp = decimal % 8;
			octal = Chars[temp] + octal;
			decimal = decimal / 8;
		}
		System.out.println(octal);
	}

}
