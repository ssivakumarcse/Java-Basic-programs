package programs;

import java.util.Scanner;

public class AscandDesc {

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
		
		System.out.println("Asc order is");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
/*		System.out.println("first half ascending is");
		for (int i = 0; i <= arr.length/2; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println("second half descending is");
		for(int j=arr.length-1;j>=arr.length/2;j--) {
			System.out.print(arr[j] + " ");
		}*/
		System.out.println();
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				if (arr[j] < arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;

				}
			}
		}
		System.out.println("desc order is");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

}
