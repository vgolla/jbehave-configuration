package com.thoughtworks.jbehave_configuration._7_annotations;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class ExampleSteps extends Steps {
    int x;
    int result;

    @Given("a variable x with value $value")
    public void givenXValue(@Named("value") int value) {
        x = value;
    }

    @When("I multiply x by $value")
    public void whenImultiplyXBy(@Named("value") int value) {
        result = x * value;
    }

    @Then("the result should equal $value")
    public void thenXshouldBe(@Named("value") int value) {
        if (value != result)
            throw new RuntimeException("result is " + result + ", but should be " + value);
    }

    @When("I raise the power of x by $value")
    public void whenIRaiseXBy(@Named("value") int value ) {
        x = (int) Math.pow(x, value);
    }

}