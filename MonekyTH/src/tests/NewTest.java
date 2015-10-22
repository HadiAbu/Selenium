package tests;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class NewTest {
	
	@Rule
	public ErrorCollector errCollect = new ErrorCollector();
	
  @Test
  public void f1() {
	  System.out.println("First test!");
	  AssertJUnit.assertEquals(true, true);
  }
  @Test
  public void f2() {
	  System.out.println("Second test!");
	  AssertJUnit.assertFalse("Monkey is not true", false);
  }
  @Test
  public void f3() {
	  System.out.println("Third test!");
	  AssertJUnit.assertEquals("Monkey", "Monkey");
  }
  @Test
  public void f4() {
	  System.out.println("Forth test!");
	  AssertJUnit.assertNotNull(new Object());
  }
//  @Test
//  public void f5() {
//	  Monster m = new Monster();
//	  System.out.println("Fifth test!");
//	  AssertJUnit.assertNotNull();
//  }

}
