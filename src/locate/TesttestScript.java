package locate;
import org.testng.Assert;
import org.testng.annotations.Test;

import locate.TestScript;
public class TesttestScript
{
	@Test
	public void testAdditionOfNumbers1()
	{
	TestScript test=new TestScript();
	int a=test.m1();
	Assert.assertEquals(a,20);
	}
	
	@Test
	public void testAdditionOfNumbers2()
	{
	TestScript test=new TestScript();
	int a=test.m1();
	Assert.assertEquals(a,30);
	}
	
	@Test
	public void testAdditionOfNumbers3()
	{
	TestScript test=new TestScript();
	int a=test.m1();
	Assert.assertEquals(a,50);
	}
}
