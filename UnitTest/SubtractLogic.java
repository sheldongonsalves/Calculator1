import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractLogic {

	@Test
	public void test_returnsubtract()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.subtract(10, 5)==5);
		
	}
	@Test
	public void test_returnsubtract1()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.subtract(10, 15)==5);
		
	}
	@Test
	public void test_returnsubtract2()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.subtract(-10, 15)==25);
		
	}
	@Test
	public void test_returnsubtract3()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.subtract(10, -15)==25);
		
	}
	@Test
	public void test_returnsubtract4()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.subtract(-10, -15)==5);
		
	}
	@Test
	public void test_returnsubtract5()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.subtract(0, 15)==15);
		
	}
	@Test
	public void test_returnsubtract6()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.subtract(10, 0)==10);
		
	}
	@Test
	public void test_returnsubtract7()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.subtract(0, 0)==0);
		
	}
}
