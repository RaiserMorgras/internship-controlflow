package pkg;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {
    IsNumberWeirdChecker inwc;
    @Before
    public void prep() {
        inwc = new IsNumberWeirdChecker();
    }
    @Test
    public void testCase1() {
        int num = 3;
        inwc.setNum(num);
        String expected = "Weird";
        assertEquals(expected, inwc.isWeird());
    }
    @Test
    public void testCase2() {
        int num = 24;
        inwc.setNum(num);
        String expected = "Not Weird";
        assertEquals(expected, inwc.isWeird());
    }

}
