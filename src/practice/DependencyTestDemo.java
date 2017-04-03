package practice;

import org.testng.annotations.Test;

public class DependencyTestDemo {
	
	@Test
	public void meth1()
	{
		int x=10,y=2;
		int z=x/y;
		System.out.println("Z="+z);
		System.out.println("Meth1");
	}
	@Test(dependsOnMethods="meth1")
	public void meth2()
	{
		System.out.println("Meth2");
	}

}
