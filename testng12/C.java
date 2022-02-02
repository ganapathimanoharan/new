package org.testng12;

import org.click.LibGlobal;
import org.testng.annotations.Test;

public class C extends LibGlobal{
	@Test
	private void beforeClass() {

		getDriverChrome();
		loadUrl("http://demo.automationtesting.in/Register.html");
		maxWindow();
	}

}
