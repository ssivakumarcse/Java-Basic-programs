package programs;

import java.util.*;

public class OctalToDeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int octal = sc.nextInt();
		int decimal = 0, n = 0;
		while (true) {
			if (octal == 0) {
				break;
			} else {
				int temp = octal % 10;
				decimal += temp * Math.pow(8, n);
				octal = octal / 10;
				n++;
			}
		}
		System.out.println(decimal);
	}

}
