package com.thoughtworks.jbehave_configuration._5_most_useful_configuration;

import com.thoughtworks.jbehave_configuration._4_maximum_configuration.ExampleSteps;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;

public class SimpleJBehave extends JUnitStories {

    private Configuration configuration;


    public SimpleJBehave() {
        super();
        configuration = new MostUsefulConfiguration();
    }

    @Override
    public Configuration configuration() {
        return configuration;
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new ExampleSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("com/thoughtworks/jbehave_configuration/SquaringStories.story");
    }
}