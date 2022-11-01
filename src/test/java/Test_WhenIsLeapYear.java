import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_WhenIsLeapYear {

    @Test()
    public void Test_YearsDivisibleBy4ButNotBy100AreLeapYears() {

        Assertions.assertTrue(Main.isLeapYear(4));
        Assertions.assertFalse(Main.isLeapYear(200));

    }
    @Test()
    public void Test_YearsDivisibleBy400AreLeapYears(){

        Assertions.assertTrue(Main.isLeapYear(400));


    }
    @Test()
    public void Test_YearsIndivisibleBy4AreNotLeapYears() {

        Assertions.assertFalse(Main.isLeapYear(5));


    }
    @Test()
    public void Test_YearsDivisibleBy100ButNot400AreNotLeapYears() {

        Assertions.assertFalse(Main.isLeapYear(100));


    }
}
