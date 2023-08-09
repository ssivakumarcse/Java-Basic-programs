package programs;

import java.util.Scanner;

public class LargeandsmallArray {

	public static int large(int arr[], int n) {

		int max = arr[0];
		for (int i = 0; i <= n; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		return max;

	}

	public static int small(int arr[], int n) {

		int min = arr[0];
		for (int i = 0; i <= n; i++) {
			if (arr[i] < min)
				min = arr[i];
		}

		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int arr[] = new int[num1];
		for (int i = 0; i < num1; i++) {
			arr[i] = sc.nextInt();
		}

		int n = arr.length - 1;

		System.out.println(large(arr, n));
		System.out.println(small(arr, n));

	}
}
