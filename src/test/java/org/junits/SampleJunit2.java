package org.junits;

import org.junit.Ignore;
import org.junit.Test;

public class SampleJunit2 {

	@Test
	public void tc5() {
		System.out.println("test 1");

	}
	@Test
	public void tc6() {
		System.out.println("test 3");

	}
	@Ignore
	@Test
	public void tc7() {
		System.out.println("test 4");
	}
	@Test
	public void tc8() {
		System.out.println("test5");
}
}