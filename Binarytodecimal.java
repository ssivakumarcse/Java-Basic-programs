package programs;

import java.util.*;

public class Binarytodecimal {

	public static void main(String[] args) {
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
		System.out.println(decimal);

	}

}
