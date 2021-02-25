package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.InputScreenModel;

public class GradesSteps {
	
	InputScreenModel inputScreen = new InputScreenModel();
	
	@Given("^Преподавателя отваря страницата за въвеждане на оценка\\.$")
	public void openInputScreen() throws Throwable {
		inputScreen.navigateToMe();
	}

	@When("^Въвежда предмета, по който преподава \"([^\"]*)\"$")
	public void addSubject(final String subject) throws Throwable {
		inputScreen.insertSubject(subject);
	}

	@When("^Въвежда име на ученик \"([^\"]*)\"$")
	public void addName(String name) throws Throwable {
		inputScreen.insertName(name);
	}

	@When("^Въвежда оценка \"([^\"]*)\"$")
	public void addGrade(String grade) throws Throwable {
		inputScreen.insertGrade(grade);
	}

	@When("^Натиска върху бутона за добавяне на оценката\\.$")
	public void clickAddButton() throws Throwable {
		inputScreen.clickAddButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"\\.$")
	public void checkAddMessage(String expectedMessage) throws Throwable {
	   assertEquals(expectedMessage, inputScreen.getAddMessage());  
	}
	
	
}
