package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DivisibilityOfNumbersSteps implements En {
    private int number;
    private String answer;

    public DivisibilityOfNumbersSteps() {
        Given("the number is 3", () -> {
            this.number = 3;
        });
        Given("the number is 9", () -> {
            this.number = 9;
        });
        Given("the number is 15", () -> {
            this.number = 15;
        });
        Given("the number is 45", () -> {
            this.number = 45;
        });
        Given("the number is 200", () -> {
            this.number = 200;
        });
        Given("the number is 80", () -> {
            this.number = 80;
        });
        Given("the number is 82", () -> {
            this.number = 82;
        });
        Given("the number is 152", () -> {
            this.number = 152;
        });
        When("I ask whether it's divisible by one of said factors", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkDivisibilityOfNumbers(this.number);
        });
        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
