package bitCounting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void testGame() {
    assertEquals(5, Solution.countBits(1234)); 
    assertEquals(1, Solution.countBits(4)); 
    assertEquals(3, Solution.countBits(7)); 
    assertEquals(2, Solution.countBits(9)); 
    assertEquals(2, Solution.countBits(10)); 
  }
}