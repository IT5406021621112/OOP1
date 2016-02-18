import java.util.Scanner;
 
 class Seven_Dwarves {
 	static int num1,num2,num3,num4,num5,num6,num7,num8,num9;
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input num1 : ");
		num1 = scan.nextInt();
		System.out.print("Input num2 : ");
		num2 = scan.nextInt();
		System.out.print("Input num3 : ");
		num3 = scan.nextInt();
		System.out.print("Input num4 : ");
		num4 = scan.nextInt();
		System.out.print("Input num5 : ");
		num5 = scan.nextInt();
		System.out.print("Input num6 : ");
		num6 = scan.nextInt();
		System.out.print("Input num7 : ");
		num7 = scan.nextInt();
		System.out.print("Input num8 : ");
		num8 = scan.nextInt();
		System.out.print("Input num9 : ");
		num9 = scan.nextInt();

		Seven_Dwarves obj1 = new Seven_Dwarves();
		obj1.Cal(num1,num2,num3,num4,num5,num6,num7,num8,num9);
		
	}
	public static void Cal (int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9)
	{
		if (num1 + num2 + num3 + num4 + num5 + num6 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num1 + num2 + num3 + num4 + num5 + num6 + num8 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num8);
		}
		if (num1 + num2 + num3 + num4 + num5 + num6 + num9 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num9);
		}
		if (num1 + num2 + num3 + num4 + num5 + num8 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num8);
			System.out.println(num7);
		}
		if (num1 + num2 + num3 + num4 + num5 + num9 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num9);
			System.out.println(num7);
		}
		if (num1 + num2 + num3 + num4 + num8 + num6 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num8);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num1 + num2 + num3 + num4 + num9 + num6 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num9);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num1 + num2 + num3 + num8 + num5 + num6 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num8);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num1 + num2 + num3 + num9 + num5 + num6 + num7 <= 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num9);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num1 + num2 + num8 + num4 + num5 + num6 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num8);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num1 + num2 + num9 + num4 + num5 + num6 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num9);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num1 + num8 + num3 + num4 + num5 + num6 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num8);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num1 + num9 + num3 + num4 + num5 + num6 + num7 == 100) {
			System.out.println(num1);
			System.out.println(num9);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num8 + num2 + num3 + num4 + num5 + num6 + num7 == 100) {
			System.out.println(num8);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
		if (num9 + num2 + num3 + num4 + num5 + num6 + num7 == 100) {
			System.out.println(num9);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			System.out.println(num6);
			System.out.println(num7);
		}
	}
}
