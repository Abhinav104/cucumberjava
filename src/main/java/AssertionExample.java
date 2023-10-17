import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
    @Test
    public void testAssertion() {
        int actual = 10;
        int expected = 20;
        Assert.assertEquals(actual, expected); // This will fail
        System.out.println("This line won't be executed if the assertion fails.");
    }
}
