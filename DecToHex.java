package programs;

import java.util.*;

public class DecToHex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hexdecimal = sc.nextInt();
		String scs = "";
		char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (hexdecimal > 0) {
			int temp = hexdecimal % 16;
			scs = ch[temp] + scs;
			hexdecimal = hexdecimal / 16;
		}
		System.out.println(scs);
	}

}
