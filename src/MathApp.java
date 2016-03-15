import java.util.Scanner;

public class MathApp {
	static Scanner sc = new Scanner(System.in);
	static int response;
	static double num1 ,num2 ,result;
	public MathApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Logic lc=new Logic();
		System.out.println("Enter the First No:");
		num1=sc.nextDouble();
		System.out.println("Enter the First No:");
		num2=sc.nextDouble();
		System.out.println("Enter: \n1.Addition \n2. Subtraction \n3.Multiplication \n4.Division \n5.Modulo");
		response=sc.nextInt();
		switch(response)
		{
		case 1:
		{
			
			System.out.println(lc.add(num1, num2));
			break;
		
		}
		case 2:
		{

			System.out.println(lc.subtract(num1, num2));
			break;
		}
		case 3:
		{

			System.out.println(lc.multiply(num1, num2));
			break;
		
		}
		case 4:
		{

			System.out.println(lc.divide(num1,num2));
			break;
		}
		case 5:
		{
			System.out.println(lc.modulo(num1, num2));
			break;
		}
		}

	}

}
