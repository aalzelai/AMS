package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import net.sourceforge.jwebunit.exception.TestingEngineResponseException;
import net.sourceforge.jwebunit.*;
import net.sourceforge.jwebunit.exception.*;
//import net.sourceforge.jwebunit.exception.TestingEngineResponseException;
import net.sourceforge.jwebunit.junit.WebTester;

public class WebLoginTest extends WebTester{
	
	@Before
	public void setUp() throws Exception {
		 setBaseUrl("http://localhost:8080/WebLogin");
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testLoginOK() throws TestingEngineRegistryException {
		 beginAt("/index.jsp");
		 assertTitleEquals("Login Page");
	     setTextField("username", "Rosy");
	     setTextField("password", "p@ssw0rd");
	     submit();
	     assertTitleEquals("User Logged Successfully");
	}
	

}
