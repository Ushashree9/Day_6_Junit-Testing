package junitproblems;

import java.util.Scanner;

public class Payment{
	static double monthlyPayment(double p, double y, double R) {
		double n = 12 * y;
		double r = R / (12 * 100);
		double payment = p * r / (1 - Math.pow((1 + r), -n));
		return payment;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter principal ,year and rate");
		double p = s.nextDouble();
		double y = s.nextDouble();
		double R = s.nextDouble();
		s.close();
		System.out.println("mothly payment is " + monthlyPayment(p, y, R));
	}
}