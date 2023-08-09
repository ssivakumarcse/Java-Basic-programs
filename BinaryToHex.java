package programs;

import java.util.*;
import java.util.Scanner;

public class BinaryToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		int n = 0, decimal = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}

		}
		String scs = "";
		char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (decimal > 0) {
			int temp = decimal % 16;
			scs = ch[temp] + scs;
			decimal = decimal / 16;
		}
		System.out.println(scs);
	}

}
