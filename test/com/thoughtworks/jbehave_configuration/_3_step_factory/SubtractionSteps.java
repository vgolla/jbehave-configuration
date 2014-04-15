package com.thoughtworks.jbehave_configuration._3_step_factory;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SubtractionSteps {
    private Integer result;

    @When("I subtract $x from $y")
    public void subtractTwoNumber(Integer x, Integer y){
        result = y - x;
    }

    @Then("I get a result of $expectedResult")
    public void resultIsTwo(Integer expectedResult){
        assertThat(expectedResult, is(result));
    }

}