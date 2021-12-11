package junitproblems;

import java.util.Scanner;

public class Vending_Machine {

	static int n, total;

	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	static int notes(int value) {
		if (value / notes[n] != 0) {
			total += (value / notes[n]);
			System.out.println(notes[n] + "rs notes :" + value / notes[n]);
			value = value % notes[n];
		}
		n++;
		if (value == 0) {
			System.out.println("total notes needed is :" + total);	
		}
		notes(value);
		return value;
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the amount");
			int value = s.nextInt();
			notes(value);
			s.close();
		} catch (Exception e) {
			System.out.println("enter value in integer");
		}
	}
}
