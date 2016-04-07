package accenture.trainings.spring.mvc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Oxana on 08.11.2015.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features="classpath:springXMLsecurity.feature",
        glue = {"accenture.trainings.spring.mvc"})
public class CucumberTest {
}
