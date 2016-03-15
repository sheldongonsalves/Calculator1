import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyLogic {

	Logic lc =new Logic();
	@Test
	public void test_returnmultiply()
	{
		System.out.println("test if the numbers get multiplied");
		assertTrue(lc.multiply(10, 5)==50);
		
	}
	@Test
	public void test_returnmultiply1()
	{
		System.out.println("test if the numbers get multiplied");
		assertTrue(lc.multiply(10, -5)==-50);
	}
	@Test
	public void test_returnmultiply2()
	{
		System.out.println("test if the numbers get multiplied");
		assertTrue(lc.multiply(10, 0)==0);
	}
	@Test
	public void test_returnmultiply3()
	{
		System.out.println("test if the numbers get multiplied");
		assertTrue(lc.multiply(-10, -5)==50);
	}
	@Test
	public void test_returnmultiply4()
	{
		System.out.println("test if the numbers get multiplied");
		assertTrue(lc.multiply(0, 0)==0.0);
	}
}
