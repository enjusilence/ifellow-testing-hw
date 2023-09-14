import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {
//    @Test
//    public void main() {
//        open("https://demoqa.com/automation-practice-form");
//    }
    @Before
    public void beforeClass() {
        System.out.println("Before class");
    }

    @After
    public void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void correctTest() {
        System.out.println("Correct test");
        int a = 10;
        int b = 1;
        Assertions.assertTrue(a > b);
    }
    @Test
    public void failingTest() {
        System.out.println("Failing test");
        int a = 10;
        int b = 1;
        Assertions.assertTrue(a < b);
    }
}
