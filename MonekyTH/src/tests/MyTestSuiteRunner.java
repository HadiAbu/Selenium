package tests;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@RunWith(Suite.class)
@SuiteClasses({FirstTestClass.class})
public class MyTestSuiteRunner {
	
	  @Rule
	  public ErrorCollector errCollect = new ErrorCollector();
	
	  @Test
	  public void f2() {
		  System.out.println("Second test!");
		  AssertJUnit.assertFalse("Monkey is not true", false);
		  
	  }

}
