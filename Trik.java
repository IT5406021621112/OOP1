import java.util.Scanner;
import java.io.*;

public class Trik {
	static boolean glass1 = true, glass2 = false, glass3 = false;
	static String plan = "";

	public static void main(String[] args) {
		
		char[] planChar;
		boolean flagOver = true;
		
		Scanner scan = new Scanner(System.in);

		while (flagOver) {
			System.out.print("Enter plan : ");
			plan = scan.next();
			if (plan.length() > 50) {
				System.out.println("Your plan are over 50 char.\nPlease try again.");
			} else {
				if (CheckABC(plan)) {
					flagOver = false;
				} else {
					System.out.println("Your plan must Only have A B C \nPlease try again.");
				}
			}
		}

		Trik obj1 = new Trik();
		obj1.starts(glass1,glass2,glass3);
		obj1.Display(glass1,glass2,glass3);

		
		

	}

	public static void starts ( boolean glass1, boolean glass2, boolean glass3)
	{
		for (int i = 0; i < plan.length(); i++) {
			if (plan.charAt(i) == 'A') {
				boolean temp;
				temp = glass1;
				glass1 = glass2;
				glass2 = temp;

			} else if (plan.charAt(i) == 'B') {
				boolean temp;
				temp = glass2;
				glass2 = glass3;
				glass3 = temp;

			} else if (plan.charAt(i) == 'C') {
				boolean temp;
				temp = glass1;
				glass1 = glass3;
				glass3 = temp;

			}
		}
	}
	public void Display( boolean glass1, boolean glass2, boolean glass3)
	{
		if (glass1) {
			System.out.println("Ball in glass 1");
		} else if (glass2) {
			System.out.println("Ball in glass 2");
		} else if (glass3) {
			System.out.println("Ball in glass 3");
		}
	}

	public static boolean CheckABC(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'A') {
				if (str.charAt(i) != 'B') {
					if (str.charAt(i) != 'C') {
						return false;
					}
				}
			}

		}
		return true;
	}
}
