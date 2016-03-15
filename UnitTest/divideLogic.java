import static org.junit.Assert.*;

import org.junit.Test;

public class divideLogic {
	Logic lc =new Logic();
	@Test
	public void test_returndivide()
	{
		System.out.println("test if the numbers get divided");
		assertTrue(lc.divide(-10, -5)==2);
	}
	@Test
	public void test_returndivide1()
	{
		System.out.println("test if the numbers get divided");
		assertTrue(lc.divide(-10, 5)==-2);
	}
	@Test
	public void test_returndivide2()
	{
		System.out.println("test if the numbers get divided");
		assertTrue(lc.divide(10, -5)==-2);
	}
	@Test
	public void test_returndivide3()
	{
		System.out.println("test if the numbers get divided");
		assertTrue(lc.divide(10, 0)==Double.POSITIVE_INFINITY);
	}
	@Test
	public void test_returndivide4()
	{
		System.out.println("test if the numbers get divided");
		assertTrue(lc.divide(10, 5)==2);
	}

}
