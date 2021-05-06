package org.junits;

import org.junit.Ignore;
import org.junit.Test;

public class SampleJunit {

	
	@Test
	public void tc0() {
		System.out.println("end of assert");
	}
	@Test
	public void tc1() {
		System.out.println("test 1");

	}
	@Test
	public void tc2() {
		System.out.println("test 3");

	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("test 4");
	}
	@Test
	public void tc4() {
		System.out.println("test5");

	}
}
