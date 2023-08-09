package programs;

import java.util.Scanner;

public class Recfact {

	static int recursion(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * recursion(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(recursion(n));
	}

}
