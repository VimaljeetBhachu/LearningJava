package com.learn.java.challenge.section5;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge challenge = new Challenge();
//		checkNumber(1);
		printConversion(25.42);
	}
	
	public static void checkNumber(int number) {
		System.out.println((number > 0) ? "positive" : (number < 0) ? "negative" : "zero");
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		long milesPerHour = 0;
		double temp;
		if(kilometersPerHour < 0 ) return -1;
		else {
			temp = (kilometersPerHour/ 1.609);
			milesPerHour = (long)Math.round(temp);
		}
		return milesPerHour;
	}
	
	public static void printConversion(double kilometersPerHour) {
		if(toMilesPerHour(kilometersPerHour) == -1) System.out.println("Invalid Value");
		else System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
	}
}
