/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 17 02:38:23 GMT 2025
 */

package maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import maven.Money;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Money_ESTest extends Money_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Money money0 = new Money(3548, "jb7");
      Money money1 = money0.add(money0);
      boolean boolean0 = money1.equals(money0);
      assertFalse(money0.equals((Object)money1));
      assertFalse(boolean0);
      assertEquals(7096, money1.getAmount());
      assertEquals(3548, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Money money0 = new Money(92, (String) null);
      money0.getCurrency();
      assertEquals(92, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Money money0 = new Money(2718, "$7}l");
      money0.getCurrency();
      assertEquals(2718, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Money money0 = new Money(775, "");
      int int0 = money0.getAmount();
      assertEquals(775, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Money money0 = new Money((-1), "");
      int int0 = money0.getAmount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Money money0 = new Money(0, (String) null);
      Money money1 = money0.add(money0);
      assertEquals(0, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Money money0 = new Money((-1066), "c$b");
      Money money1 = money0.add(money0);
      assertEquals((-2132), money1.getAmount());
      assertEquals((-1066), money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Money money0 = new Money(92, (String) null);
      // Undeclared exception!
      try { 
        money0.equals(money0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Money money0 = new Money(283, "HE[gS>M");
      // Undeclared exception!
      try { 
        money0.add((Money) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("maven.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Money money0 = new Money(0, "");
      money0.getCurrency();
      assertEquals(0, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Money money0 = new Money(0, "");
      int int0 = money0.getAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Money money0 = new Money(3496, "X");
      Money money1 = new Money(3496, "W");
      boolean boolean0 = money0.equals(money1);
      assertFalse(boolean0);
      assertEquals(3496, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Money money0 = new Money(3518, "");
      Money money1 = money0.add(money0);
      boolean boolean0 = money0.equals(money1);
      assertEquals(7036, money1.getAmount());
      assertEquals(3518, money0.getAmount());
      assertFalse(boolean0);
      assertFalse(money1.equals((Object)money0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Money money0 = new Money(3518, "");
      boolean boolean0 = money0.equals("");
      assertEquals(3518, money0.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Money money0 = new Money(3518, "");
      boolean boolean0 = money0.equals(money0);
      assertTrue(boolean0);
      assertEquals(3518, money0.getAmount());
  }
}
