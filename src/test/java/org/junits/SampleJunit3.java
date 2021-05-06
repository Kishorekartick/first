package org.junits;

import org.junit.Test;
import org.testng.Assert;

public class SampleJunit3 {
	@Test
	public void tc5() {
		System.out.println("test 1");

	}
	
	@Test
	public void tc6() {
		
		System.out.println("test 3");

	}
	
	@Test
	public void tc7() {
		String s = "jhkhghjg";
		Assert.assertNotEquals("jjhhvhjvjh", s);
		System.out.println("test 4");
	}
	@Test
	public void tc8() {
		System.out.println("test5");
}

}
