package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import org.apache.catalina.webresources.*;

public class WebLoginTest {
	
	@Before
	public void setUp() throws Exception {
		 setBaseUrl("http://localhost:8080/WebLogin");
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testLoginOK() throws TestingEngineResponseException {
		 beginAt("/index.jsp");
		 assertTitleEquals("Login Page");
	     setTextField("username", "Rosy");
	     setTextField("password", "p@ssw0rd");
	     submit();
	     assertTitleEquals("User Logged Successfully");
	}
	

}
