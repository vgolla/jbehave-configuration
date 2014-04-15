package com.thoughtworks.jbehave_configuration._6_reporting;

import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.FilePrintStreamFactory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML;

public class SimpleJBehave extends JUnitStories {

    private Configuration configuration;

    public SimpleJBehave() {
        super();
        Class<? extends Embeddable> embeddableClass = this.getClass();
        CrossReference xref = new CrossReference();
        Properties viewResources = new Properties();
        viewResources.put("decorateNonHtml", "true");
        configuration = new MostUsefulConfiguration()
                .useStoryReporterBuilder(
                        new StoryReporterBuilder()
                                .withViewResources(viewResources).withFormats(CONSOLE, HTML)
                                .withDefaultFormats().withPathResolver(new FilePrintStreamFactory.ResolveToPackagedName())
                );

//                .useStoryReporterBuilder(
//                    new StoryReporterBuilder()
//                            .withCodeLocation(CodeLocations.codeLocationFromClass(embeddableClass))
//                            .withDefaultFormats().withPathResolver(new FilePrintStreamFactory.ResolveToPackagedName())
//                            .withViewResources(viewResources).withFormats(CONSOLE, HTML)
//                            .withFailureTrace(true).withFailureTraceCompression(true).withCrossReference(xref));
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