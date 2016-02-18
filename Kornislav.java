import java.util.Scanner;

public class Kornislav {
	static int num1, num2, num3, num4, temp;
	public static void main(String[] args) {
		
		
		
		Kornislav obj1 = new Kornislav();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Number 1 : ");
		num1 = scan.nextInt();
		System.out.print("Input Number 2 : ");
		num2 = scan.nextInt();
		System.out.print("Input Number 3 : ");
		num3 = scan.nextInt();
		System.out.print("Input Number 4 : ");
		num4 = scan.nextInt();

		obj1.Cal(num1,num2,num3,num4);
		obj1.Display();

		
		
	}
	public static void Cal (int num1,int num2,int num3,int num4)
	{
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num1 > num4) {
			temp = num1;
			num1 = num4;
			num4 = temp;
		}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num2 > num4) {
			temp = num2;
			num2 = num4;
			num4 = temp;
		}
		if (num3 > num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
	}
	public void Display()
	{
		System.out.print("\nRectangle Area = : " + num3 * num1);
	}
}
