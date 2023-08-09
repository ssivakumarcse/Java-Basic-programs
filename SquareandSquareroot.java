package programs;

import java.util.*;

public class SquareandSquareroot {

	public static double Squareroot(double nums) {
		double t;
		double squareroot = nums / 2;
		do {
			t = squareroot;
			squareroot = (t + (nums / t)) / 2;

		} while ((t - squareroot) != 0);
		return squareroot;
	}

	public static double Squareroots(double nums) {
		double t;
		t = Math.sqrt(nums);
		return t;
	}

	public static double Square(double nums) {

		double f;
		f = Math.pow(nums, 2);
		return f;
	}

	public static double Squares(double nums) {

		double f;
		f = nums * nums;
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double root = Squareroot(num);
		double square = Squareroots(num);
		double squares = Square(num);
		double squaress = Squares(num);
		System.out.println(root);
		System.out.println(square);
		System.out.println(squares);
		System.out.println(squaress);
	}

}
