import course_aqa.L12_testng.Factorial;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class L12_testng {
    @DataProvider
    public Object[][] factorialData() {
        return new Object[][]{
                {0, 1}, {1, 1}, {5, 120},
        };
    }

    @Test(dataProvider = "factorialData")
    public void checkFactorialTest(int value, long expected) {
        assertEquals(Factorial.calculateFactorial(value), expected);
    }
}