package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(1, s.solution(new int[] {0}));
    }

    @Test
    public void testExample1() {
        Assert.assertEquals(5, s.solution(new int[] {1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void testExample2() {
        Assert.assertEquals(1, s.solution(new int[] {-1, -3, -6, -4, -1, -2}));
    }

    @Test
    public void testExample3() {
        Assert.assertEquals(1, s.solution(new int[] {10000000, -3, 432, 231, -1, -2}));
    }

    @Test
    public void testExample4() {
        Assert.assertEquals(7, s.solution(new int[] {1, 2, 3, 4, 5, 6}));
    }
}
