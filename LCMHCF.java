package programs;

import java.util.Scanner;

public class LCMHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int hcf = 0, lcm = 0;

		// HCf
		for (int i = 1; i <= num1 || i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				hcf = i;

		}
		System.out.println(hcf);

		// LCM

		int max = num1 > num2 ? num1 : num2;
		for (int i = max; i <= num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}

		System.out.println(lcm);
	}

}
