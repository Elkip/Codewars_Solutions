import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class TestAll {
    @Test
    public void test_TwoOldestAges() {
        System.out.println("Testing: listOf(1,5,87,45,8,8)");
        Integer[] input = new Integer[] { 1, 2, 3 };
        Integer[] output = new Integer[] {2, 3};
        assertEquals(RunnerKt.twoOldestAges(Arrays.asList(input)), Arrays.asList(output));
    }
}
