package programs;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int f=0, f1 = 1, f2;
		 System.out.print(f+" "+f1+" ");
		for (int i = 0; i <= num; i++) {

			
			f2 = f + f1;
			System.out.print(f2 + " ");
			f = f1;
			f1 = f2;
		}
//using 2 variables
		/*Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int f=0, f1=0;
		f1++;
		for (int i = 0; i < num; i++) {
			System.out.print(f+" ");
			System.out.print(f1+" ");
		f=f+f1;
		f1=f+f1;
		
	}*/
	}

}
