import static org.junit.Assert.*;

import org.junit.Test;

public class Logic1 {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void test_returnadd()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.add(100, 200)==300);
		
	}
	@Test
	public void test_returnadd1()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.add(100,-200)==-100);
	}
	@Test
	public void test_returnadd2()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.add(100,0)==100);
	}
	@Test
	public void test_returnadd3()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.add(0,0)==0);
	}
	@Test
	public void test_returnadd4()
	{
		System.out.println("test if the numbers get added");
		Logic lc =new Logic();
		assertTrue(lc.add(-4,-4)==-8);
	}

}
