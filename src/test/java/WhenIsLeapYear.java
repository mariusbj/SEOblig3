import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhenIsLeapYear {

    @Test()
    public void YearsDivisibleBy4ButNotBy100AreLeapYears() {

        Assertions.assertEquals(true, Main.isLeapYear(4));
        Assertions.assertEquals(false, Main.isLeapYear(200));

    }
    @Test()
    public void YearsDivisibleBy400AreLeapYears(){

        Assertions.assertEquals(true, Main.isLeapYear(400));


    }
    @Test()
    public void YearsIndivisibleBy4AreNotLeapYears() {

        Assertions.assertEquals(false, Main.isLeapYear(5));


    }
    @Test()
    public void YearsDivisibleBy100ButNot400AreNotLeapYears() {

        Assertions.assertEquals(false, Main.isLeapYear(100));


    }
}
