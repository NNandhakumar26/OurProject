package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import calculator.Calci;

public class Testing {
	//type name = new type();
	Calci c=new Calci();
	@Test(priority=1)
	public void correction()
	{
		Assert.assertEquals(5, c.addition(3, 2));
		Assert.assertEquals(5, c.addition(2,3));
		Assert.assertEquals(2, c.subraction(5,3));
		Assert.assertEquals(3, c.multiplication(3,1));
		Assert.assertEquals(3, c.division(3,1));
		System.out.println("Every answer is correct");
		
	}
	@Test(priority=2)
	public void wrong()
	{
		Assert.assertNotEquals(5, c.addition(4,5));
		Assert.assertNotEquals(10, c.addition(3,4));
	}

}
