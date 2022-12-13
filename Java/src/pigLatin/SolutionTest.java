package pigLatin;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", Solution.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", Solution.pigIt("This is my string"));
    }
}
