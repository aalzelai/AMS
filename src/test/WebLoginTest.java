package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import net.sourceforge.jwebunit.exception.TestingEngineResponseException;


public class WebLoginTest {
	
	@Before
	public void setUp() throws Exception {	
		 setBaseUrl("http://localhost:52089/AMS/");
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testLoginOK() throws TestingEngineResponseException {
		 beginAt("/index.jsp");
		 assertTitleEquals("Struts 2 - Login Application");
	     setTextField("username", "admin1");
	     setTextField("password", "admin");
	     submit();
	     assertTitleEquals("Welcome");
	}
}
