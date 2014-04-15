package com.thoughtworks.jbehave_configuration.step_factory;

import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.CompositeStepsFactory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;

public class SimpleJBehave extends JUnitStories {

    public SimpleJBehave() {
        super();
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new CompositeStepsFactory(
                new InstanceStepsFactory(configuration(), new ExampleSteps()),
                new InstanceStepsFactory(configuration(), new SubtractionSteps())
        );
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList(
                "com/thoughtworks/jbehave_configuration/SquaringStories.story",
                "com/thoughtworks/jbehave_configuration/SubtractionStories.story"
        );
    }
}