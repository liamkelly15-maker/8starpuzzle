package eightpuzzle;

//Declare imports.
import javax.swing.JOptionPane;


//Class has to be named "is" followed by one of our student IDs.
public class is15136051{
	
	
	
	//Create the main method.
	public static void main(String [] args){
			
			//Declare the Array and the variables needed at the beginning of the main method.
			//An array which will be the pseudo 8 puzzle board.
			int [] puzzle = new int [8];
			int [] puzzleEnd = new int [8];
	//should array be 9 to hold empty space ?-Liam
			//A string to hold the start sequence entered by the user.
			String startSequence;
			//A string to hold the end sequence entered by the user.
			String endSequence;
			//Create two Integers to hold values when converting the start sequence and end sequence from Strings.
			int startSequenceInt;
			int endSequenceInt;
			//Create Integers (A-I) for end and start sequences to hold the individual integer values.
			int startA, startB, startC, startD, startE, startF, startG, startH, startI;
			int endA, endB, endC, endD, endE, endF, endG, endH, endI;
			
//should we generate a random start sequence ? - Liam			
			//The first window asking the user to enter the start sequence.
			startSequence = JOptionPane.showInputDialog(null,"Enter the Start Sequence (0-8) leaving a space between numbers: ");
	
//is the end sequence not pre-defined ? Liam	
			//The second window asking the user to enter the end sequence.
			endSequence = JOptionPane.showInputDialog(null,"Enter the End Sequence (0-8) leaving a space between numbers: ");
			
			//Remove the spaces between the numbers in the start sequence.
			startSequence = startSequence.replaceAll("\\s","");
			
			//Remove the spaces between the numbers in the end sequence.
			endSequence = endSequence.replaceAll("\\s","");
			
			//Convert the start sequence from a String to an Integer.
			startSequenceInt = Integer.parseInt(startSequence);
			
			//Convert the end sequence from a String to an Integer.
			endSequenceInt = Integer.parseInt(endSequence);
			
			//Check that the conversion was successful.
			System.out.println(startSequenceInt);
			System.out.println(endSequenceInt);
			
			
			//Using modulo extract the digits from the start sequence. From (I - A)
			startI = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			startH = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			startG = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			startF = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			startE = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			startD = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			startC = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			startB = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			startA = startSequenceInt % 10;
			startSequenceInt = startSequenceInt/10;
			
			//Check that the digits were extracted correctly.
			System.out.println(startA);
			System.out.println(startB);
			System.out.println(startC);
			System.out.println(startD);
			System.out.println(startE);
			System.out.println(startF);
			System.out.println(startG);
			System.out.println(startH);
			System.out.println(startI);
		
		//is puzzle array 8 or 9 in length - Liam
			//Assign the digits to the correct index in the array(puzzle).
			puzzle[0] = startA;
			puzzle[1] = startB;
			puzzle[2] = startC;
			puzzle[3] = startD;
			puzzle[4] = startE;
			puzzle[5] = startF;
			puzzle[6] = startG;
			puzzle[7] = startH;
			puzzle[8] = startI;
			
			//Using modulo extract the digits from the end sequence.  From (I - A).
			endI = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			endH = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			endG = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			endF = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			endE = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			endD = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			endC = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			endB = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			endA = endSequenceInt % 10;
			endSequenceInt = endSequenceInt/10;
			
			
			//Check that the digits were extracted correctly.
			System.out.println(endA);
			System.out.println(endB);
			System.out.println(endC);
			System.out.println(endD);
			System.out.println(endE);
			System.out.println(endF);
			System.out.println(endG);
			System.out.println(endH);
			System.out.println(endI);
			
			//Assign the digits to the correct index in the array(puzzle) for the end goal.
			puzzleEnd[0] = endA;
			puzzleEnd[1] = endB;
			puzzleEnd[2] = endC;
			puzzleEnd[3] = endD;
			puzzleEnd[4] = endE;
			puzzleEnd[5] = endF;
			puzzleEnd[6] = endG;
			puzzleEnd[7] = endH;
			puzzleEnd[8] = endI;
			
		
	}
	
	
}
