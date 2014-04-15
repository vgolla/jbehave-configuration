package com.thoughtworks.jbehave_configuration.junit_configuration;

import org.jbehave.core.junit.JUnitStories;

import java.util.Arrays;
import java.util.List;

public class SimpleJBehave extends JUnitStories {

    public SimpleJBehave() {
        super();
        this.configuredEmbedder().candidateSteps().add(new ExampleSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("com/thoughtworks/jbehave_configuration/Stories.story");
    }
}