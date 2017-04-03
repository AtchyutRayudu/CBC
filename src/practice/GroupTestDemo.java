package practice;

import org.testng.annotations.Test;

public class GroupTestDemo {
	
	
		@Test(groups="G1",priority=1)
		public void meth1()
		{
			System.out.println("Meth1 in GroupTest1");
		}
		@Test(groups="G2",priority=2)
		public void meth2()
		{
			System.out.println("Meth2 in GroupTest1");
		}
		@Test(groups="G1",priority=1)
		public void meth3()
		{
			System.out.println("Meth3 in GroupTest1");
		}
		@Test(groups="G2",priority=2)
		public void meth4()
		{
			System.out.println("Meth4 in GroupTest1");
		}

}
