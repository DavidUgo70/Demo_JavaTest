
public class MakingChange {
private static int numberofoneDollar;

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		

//int money =Integer.parseInt(args[0]);
int money = 146;
//int moneyLeft = money;

int toonies = money/ 200;
int moneyLeft = money - (toonies * 200);


int loonies = moneyLeft/100;
moneyLeft = moneyLeft-(loonies * 100);

int quarters = moneyLeft/25;
moneyLeft = moneyLeft-(quarters * 25);

int dimes = moneyLeft / 10;
moneyLeft =moneyLeft-(dimes * 10);

int  nickels = moneyLeft /5;
moneyLeft = moneyLeft -(nickels*5);

int pennies = moneyLeft /1;
moneyLeft =moneyLeft-( pennies*1);

System.out.println("Amount consists of:"+toonies+ "toonies");
System.out.println(+loonies+"loonies");
System.out.println(+quarters+"quarters");
System.out.println(+dimes+"dimes");
System.out.println(+nickels+"nickels");
System.out.println(+pennies+"pennies");

	}

}
