package programs;

import java.util.Scanner;

public class Floydstri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int nums = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(nums + " ");
				nums++;
			}
			System.out.println();
		}

	}

}
