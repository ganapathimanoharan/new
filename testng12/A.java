package org.testng12;

import org.click.LibGlobal;
import org.testng.annotations.Test;

public class A extends LibGlobal {

	@Test
	private void beforeClass() {

		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		maxWindow();
	}

	@Test
	private void beforeClass1() {

		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		maxWindow();
	}

	@Test(enabled = false)
	private void beforeClass11() {

		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		maxWindow();
	}

	@Test
	private void beforeClass12() {

		System.out.println(10 / 0);
	}

}
