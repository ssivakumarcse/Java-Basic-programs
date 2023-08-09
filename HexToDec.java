package programs;

import java.util.*;

public class HexToDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String decimal = sc.next();

		String s = "0123456789ABCDEF";
		decimal = decimal.toUpperCase();
		int val = 0;
		for (int i = 0; i < decimal.length(); i++) {
			char c = decimal.charAt(i);
			int n = s.indexOf(c);
			val = 16 * val + n;
		}

		System.out.println(val);
	}

}
