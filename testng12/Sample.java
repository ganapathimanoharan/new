package org.testng12;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample {

	@Test
	private void tc0() {
		System.out.println("method1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc1() {
		System.out.println("method2");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc2() {
		//Assert.assertTrue(false);
		System.out.println("method3");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc3() {
		System.out.println("method4");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc4() {
		System.out.println("method5");
		//System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc5() {
		System.out.println("method6");
		

	}

}
