
public class Logic {
	private double num1;
	private double num2;
	public Logic()
	{
		
	}

	public Logic(double number1 ,double number2) {
		this.num1=number1;
		this.num2=number2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double add(double no1 ,double no2)
	{
		
		return (no1+no2);
	}
	public double subtract(double no1 ,double no2)
	{
		double sub;
		if(no1>no2)
			sub =no1-no2;
		else
			sub=no2-no1;
		return sub;
	}
	public double multiply(double no1 ,double no2)
	{
		return (no1*no2);
	}
	public double divide(double no1 ,double no2)
	{
		double result = 0;
		try
		{
			result= (no1/no2);
		}
		catch(ArithmeticException e)
		{
			e.getMessage();
		}
		return result;
	}
	public double modulo(double no1 ,double no2)
	{
		return (no1%no2);
	}

}
