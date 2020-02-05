package weirdCheckerTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void testCase1() {
        int num = 3;
        String expected = "Weird";
        String actualResult = IsNumberWeirdChecker.getIsNumWeirdMessage(num);
        assertEquals(expected, actualResult);
    }
    @Test
    public void testCase2() {
        int num = 24;
        String expected = "Not Weird";
        String actualResult = IsNumberWeirdChecker.getIsNumWeirdMessage(num);
        assertEquals(expected, actualResult);
    }

}
