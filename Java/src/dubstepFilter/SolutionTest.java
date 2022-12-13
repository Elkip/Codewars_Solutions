package dubstepFilter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void Test1() {
      assertEquals("ABC", Solution.SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
       assertEquals("R L", Solution.SongDecoder("RWUBWUBWUBLWUB"));
    }
}