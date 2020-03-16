/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run(){
		while (frontIsClear()){
			moveUp();
			move();
			moveDown();
			move();
		}
	}
	private void moveUp(){
		turnLeft();
		putBeeper();
	    while (facingNorth()){
	    	if (frontIsClear()){
	    		move();
	    	} if (frontIsClear()){
	    		move();
	    		putBeeper();
	    	} else turnRight();
	   	} 
	}
	
	private void moveDown(){
		turnRight();
		putBeeper();
		while (facingSouth()){
			if (frontIsClear()){
	    		move();
	    	} if (frontIsClear()){
	    		move();
	    		putBeeper();
	    	} else turnLeft();
	   	} 
	}
}
