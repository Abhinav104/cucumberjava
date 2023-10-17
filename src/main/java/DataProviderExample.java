import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    // Step 1: Define a data provider method
    @DataProvider(name = "testdata")
    public Object[][] testData() {
        return new Object[][] {
            {"John", 25},
            {"Alice", 30},
            {"Bob", 22}
        };
    }

    // Step 2: Use the data provider in a test method
    @Test(dataProvider = "testdata")
    public void testWithDataProvider(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
        // Your test logic here
    }
}
