import customMath.Basic;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BasicTest {
  Basic basic;
  
  @Before
  public void setUp() throws Exception {
    basic = new Basic();
  }
  
  @Test
  public void CheckIsEven() {
    assertTrue(basic.isEven(4));
    assertFalse(basic.isEven(5));
    
  }
  
  @Test
  public void checkIsOdd() {
    assertTrue(basic.isOdd(5));
    assertFalse(basic.isOdd(12));
  }
  
  @Test
  public void checkSquare() {
    assertThat(basic.getSquare(4),is(16.0));
  }
  
  @Test
  public void checkCube() {
    assertThat(basic.getCube(2),is(8.0));
  }
  
  @Test
  public void checkGCD() {
    assertThat(basic.getGCD(4,8),is(4));
    assertThat(basic.getGCD(4,14),is(2));
  }
  
  @Test
  public void checkLCM() {
    assertThat(basic.getLCM(4,8),is(8));
    assertThat(basic.getLCM(4,30),is(60));
  }
  
  @Test
  public void checkSimpleInterest() {
    assertThat(basic.getSimpleInterest(100,1,8),is(8.0));
  }
  
  @Test
  public void checkCompoundInterest() {
    assertThat(basic.getCompoundInterest(100,2,6),is(12.36));
  }
  
  @Test
  public void checkTemperatureFahrenheitToCelsius() {
    assertThat(basic.getCelsiusTempFrom(40),is(4.44));
  }
  
  @Test
  public void checkTempCelsiusToFahrenheit() {
    assertThat(basic.getFahrenheitTempFrom(40),is(104.0));
  }
  
  @Test
  public void checkSum() {
    assertThat(basic.getSumOfOneTo(4),is(10));
  }
  
  @Test
  public void checkGreatestAmongThree() {
    assertThat(basic.getGreatest(2,5,8),is(8));
    assertThat(basic.getGreatest(9,5,3),is(9));
    assertThat(basic.getGreatest(2,10,6),is(10));
  }
  
  @Test
  public void checkAverage() {
    assertThat(basic.getAverageOf(4,5,6),is(5.0));
  }
  
  @Test
  public void checkAveragePercentage() {
    assertThat(basic.getAvgasPercentage(3,4,5,10),is(40.0));
  }
}