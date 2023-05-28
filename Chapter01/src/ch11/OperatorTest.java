package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		int gameScore = 150;
		
//		int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore + 1; 151 151
		int lastScore = gameScore++; // gameScore += 1; gameScore = gameScore + 1; 150 151
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
