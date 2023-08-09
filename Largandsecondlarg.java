package programs;

import java.util.Scanner;

public class Largandsecondlarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				if (arr[j] > arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;

				}
			}
		}
		System.out.println("largest is " + arr[n - 1]);
		System.out.println("seond largest is " + arr[n - 2]);
		System.out.println("smallest is " + arr[0]);
	}

}
