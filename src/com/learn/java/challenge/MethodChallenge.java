package com.learn.java.challenge;

public class MethodChallenge {

	public int calculateHighScorePosition(int playerScore) {
		int position = 4;
		if(playerScore >= 1000) position = 1;
		else if(playerScore >= 500) position = 2;
		else if(playerScore >= 100) position = 3;
		else if(playerScore < 0) position = -1;
		return position;
	}
	
	public void displayHighScorePosition(String playerName, int playerPosition) {
		if(playerPosition == -1)
			System.out.println("Invalid score.");
		else
			System.out.println(playerName + " managed to get into position " + playerPosition + " on high score list.");
	}
	
	public static void main(String[] args) {
		MethodChallenge methodChallenge = new MethodChallenge();
		methodChallenge.displayHighScorePosition("Tim1", methodChallenge.calculateHighScorePosition(1500));
		methodChallenge.displayHighScorePosition("Tim2", methodChallenge.calculateHighScorePosition(1000));
		methodChallenge.displayHighScorePosition("Tim3", methodChallenge.calculateHighScorePosition(500));
		methodChallenge.displayHighScorePosition("Tim4", methodChallenge.calculateHighScorePosition(100));
		methodChallenge.displayHighScorePosition("Tim5", methodChallenge.calculateHighScorePosition(25));
		methodChallenge.displayHighScorePosition("Tim6", methodChallenge.calculateHighScorePosition(-1000));
	}
}
