package pckg;
import main.pckg.*;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class RecLerpTest extends TestCase {

    // Test that the class variable hi from main contains 12
    @Test
    public void testMain() throws Exception {
        RecLerp reclerp = new RecLerp();
        assertEquals(12, reclerp.hi);
    }

    // Test that reclerp(22, 23) == 67
    @Test
    public void testReclerp() throws Exception {
        double result = RecLerp.reclerp(22, 23);
        assertEquals(67.0, result);
    }

    // Test that reclerp(0, 23) == 97
    @Test
    public void testReclerp2() throws Exception {
        double result = RecLerp.reclerp(0, 23);
        System.out.println(result);
        assertEquals(97.0, result);
    }

}