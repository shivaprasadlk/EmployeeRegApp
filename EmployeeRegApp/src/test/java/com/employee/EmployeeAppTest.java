package test.java.com.employee;



import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeAppTest {

	@Test
   public void testEmployeeEmail() {
       EmployeeAppUnit empEmail=new EmployeeAppUnit();
		/*Act*/
       ;
		boolean result = empEmail.isValidEmailId("andy@testdomain.com");
		/*Assert*/
		assertTrue("Valid email ID failed ", result );

   }
}