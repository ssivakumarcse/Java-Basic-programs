package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String num1 = sc.next();
			sc.close();
		if (num.length() == num1.length()) {
			char array1[] = num.toCharArray();
			char array2[] = num1.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);

			boolean result = Arrays.equals(array1, array2);
			if (result) {
				System.out.println("an anagram");
			} else {
				System.out.println("Not an anagram");
			}
		} else {
			System.out.println("Not an anagram");
		}
	}

}
