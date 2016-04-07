package accenture.trainings.spring.mvc;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.http.HttpMethod;

/**
 * Created by Oxana on 08.11.2015.
 */
public class MyStepdefs extends AbstractSteps {


    @When("^I performs operation \"([^\"]*)\"$")
    public void iPerformsOperation(String httpMethod) throws Throwable {
        HttpMethod m = HttpMethod.valueOf(httpMethod.toUpperCase());
        String finalUrl = getFinalUrl();
        serverResponse = doHttpMethod(m, finalUrl);

    }

    @Then("^I see \"([^\"]*)\" in response$")
    public void iSeeInResponse(String arg0) throws Throwable {
        String resp = serverResponse.getBody();
        System.out.println("resp = " + resp);
        assert(resp.contains(arg0));// Write code here that turns the phrase above into concrete actions

    }

    @Given("^I am on the start index page$")
    public void iAmOnTheStartIndexPage() throws Throwable {
        params.clear();
       // port=Integer.valueOf(portString);
        url="http://localhost:8080/";//+"/task_01/index";

    }
}
