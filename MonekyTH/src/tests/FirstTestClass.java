package tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class FirstTestClass {
	
	  @Test
	  public void f2() {
		  System.out.println("Second test!");
		  AssertJUnit.assertFalse("Monkey is not true", false);
	  }
	  

}
