package com.learn.java.challenge.section5;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge challenge = new Challenge();
//		checkNumber(1);
//		printConversion(25.42);
//		printMegaBytesAndKiloBytes(5000);
		System.out.println(shouldWakeUp(false, 2));
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
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		if(kiloBytes < 0) System.out.println("Invalid Value");
		else {
			int megaBytes = kiloBytes/1000;
			long remainingKiloBytes = kiloBytes - ((megaBytes*1000) + (megaBytes*24));
			if(remainingKiloBytes<0) {
				megaBytes -= 1;
				remainingKiloBytes = 1024 - Math.abs(remainingKiloBytes);
			}
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
		}
		
	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay ) {
		if(0 <= hourOfDay && hourOfDay <= 23 && barking == true) {
			if(hourOfDay < 8 || hourOfDay > 22) return true;
		}
		return false;
	}
}
