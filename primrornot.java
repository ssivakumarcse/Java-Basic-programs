package programs;

import java.util.Scanner;

public class primrornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("prime");
		else
			System.out.println("Not prime");

	}

}
