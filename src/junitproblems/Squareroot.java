package junitproblems;

import java.util.Scanner;

public class Squareroot {
	static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}
		return t;
	}
	public static void main(String[] args) throws Exception {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter no to find square root");
			double c = s.nextDouble();
			System.out.println("square root is " + sqrt(c));
			s.close();
		} catch (Exception e) {
			System.out.println("inter integer value " + e.getMessage());
		}
	}
}