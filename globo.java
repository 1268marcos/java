package aovivo01julho2020globodobingo;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Globo {
	
	private static Random rnd = new Random();
	
	private static List<Integer> mListBalls = new ArrayList<Integer>();
	
	private static int mUnitBallsSorted = 0;
	
	private static int mTotalBalls = 3;
	
	private static String mLetter;
	
	public static void initializeBalls() { 
		for( int i = 0; i < mTotalBalls ; i++) {
			mListBalls.add(0);
		}
	}
	
	public static boolean checkNumber( int number ) {
		boolean result = true;
		if( mListBalls.get(number).equals(1) ) {
			result = false;
		}
		return result;
	}
	
    public static void rotateGlobe() {
    	int randomNumber = rnd.nextInt(mTotalBalls);  //0   1   2   3    74
    	while ( !checkNumber(randomNumber) ) {
    		randomNumber = rnd.nextInt(mTotalBalls);
    	} 
    	mListBalls.set(randomNumber, 1);
    	showMessage(randomNumber); //********************************
    }

    public static String defineLetterColumn( int number) {
    	if( number >= 61 ) {
    		mLetter = "O ";
    	} else if( number >= 46) {
    		mLetter = "G ";
    	} else if( number >= 31) {
    		mLetter = "N ";
    	} else if( number >= 16) {
    		mLetter = "I ";
    	} else {
    		mLetter = "B ";
    	}
    	return mLetter;
    }
	
    public static void showMessage( int randomNumber ) {
    	System.out.println("BOLA... ");
    	System.out.println( defineLetterColumn(randomNumber + 1) + (randomNumber + 1) );
    }
	
    public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		boolean cont = true;
		String resp = "";
		initializeBalls();
		while( cont ) {
			mUnitBallsSorted++; //quantidade bolas sorteadas
			System.out.println("Tecle algo");
			resp = tcd.next();
			if( mUnitBallsSorted == mTotalBalls ) {
				cont = false;
				System.out.println("Fim das bolas");
			}
			rotateGlobe();
		}
		
	}
    
}
