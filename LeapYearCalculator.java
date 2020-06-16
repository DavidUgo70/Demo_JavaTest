
public class LeapYearCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test 1
		printIsLeapYear(1996);
		//System.out.println("\n");
		System.out.println("\n"+isLeapYear(1996));
		System.out.println("Next leap year is:"+subsequentLeapYear(1996));

	}
	//void method that prints something
	public static void printIsLeapYear(int year) {
		if (year % 4 ==0 || year <= 100) {
			System.out.print(year+" "+"is a leap year");
		} else if (year >100 &&(year % 100 == 0 && year % 400 == 0)) {
			System.out.print(year+" "+"is a leap year");
		}else if (year % 100 != 0 && year % 400 != 0 && year %4 ==0) {
			System.out.print(year+" "+"is a leap year");
		}
		else {
			System.out.print(year+" "+"is not a leap year");
		}
	}
	
	//Method that returns something
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year <= 100) {
			return true;
		}
		else if(year >100 && year % 4 ==0 && year % 100 == 0 && year % 400 == 0) {
			return true;
		}else if (year % 100 != 0 && year % 400 != 0 && year %4 ==0) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	// Method that calls another method
	
	public static int subsequentLeapYear(int year) {
		if (isLeapYear(year) == true) {
			int yearNew = year+4;
			return yearNew;
		}else {
			return year;
		}
		
	}
}
