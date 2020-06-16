//import java.lang.*;
public class DnaUtilities {

	public static void main(String[] args) {
		// testing methods
		//System.out.println(watsonCrickComplement('A'));
		//System.out.println(watsonCrickComplement('C'));
		System.out.println(watsonCrickTripletComplement("ACT"));


	}
//Method that checks if something is a valid base(3.1)
	
	public static boolean isValidBase(char letter) {
		char acceptable1 = 'A';
		char acceptable2 = 'C';
		char acceptable3 = 'G';
		char acceptable4 = 'T';
		
		if (letter == acceptable1) {
			return true;
		}else if (letter == acceptable2) {
			return true;
		}else if (letter == acceptable3) {
			return true;
		}else if(letter == acceptable4) {
			return true;
		}else {
			return false;
		}
	}
	
	//Method to find Watson Crick Complement (3.2)
	public static char watsonCrickComplement(char letter) {
		//Crick complement
		char complement1 = 'T';// A -> T
		char complement2 = 'G';// C -> G
		char complement3 = 'C';// G -> C
		char complement4 = 'A';// T -> A
		if (isValidBase(letter)== true && letter == 'A') {
			return complement1;
		}else if (isValidBase(letter)== true && letter == 'C') {
			return complement2;
		}else if (isValidBase(letter)== true && letter == 'G') {
			return complement3;
		} else if (isValidBase(letter)== true && letter == 'T') {
			return complement4;
		}
		else {
			return letter;
		}
	}
	
	
	//Method to find the Watson complement of a 3 letter string
	
	public static String watsonCrickTripletComplement(String dnaSequence) {

		//storing first value of dnaSequence to check if acceptable
		char firstCharacter = dnaSequence.charAt(0);
		char secondCharacter = dnaSequence.charAt(1);
		char thirdCharacter = dnaSequence.charAt(2);
		
		if(dnaSequence.length() == 3 && isValidBase(firstCharacter) && isValidBase(secondCharacter) && isValidBase(thirdCharacter)) 
		{
			dnaSequence = watsonCrickComplement(firstCharacter) +""+ watsonCrickComplement(secondCharacter) + ""+watsonCrickComplement(thirdCharacter);
			return dnaSequence;
			}
		
		
		else {
			return " ";
		}
		//return dnaSequence;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
