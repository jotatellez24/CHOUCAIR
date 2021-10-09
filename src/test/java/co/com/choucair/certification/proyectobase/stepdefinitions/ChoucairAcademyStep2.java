package co.com.choucair.certification.proyectobase.stepdefinitions;


import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer2;
import co.com.choucair.certification.proyectobase.tasks.Buscar;
import co.com.choucair.certification.proyectobase.tasks.Login2;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import java.util.List;

public class ChoucairAcademyStep2 {

    @Given("^that Rose want to learn automation at the Academy choucair$")
    public void thatRoseWantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChocairData) throws Exception {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thepage(),
                Login2.onThePage(academyChocairData.get(0).getStrUser(),academyChocairData.get(0).getStrPassword()));

    }
    @When("^she search for the course on the Choucair Academy$")
    public void sheSearchForTheCourseOnTheChoucairAcademy(List<AcademyChoucairData> academyChocairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(academyChocairData.get(0).getStrCourse()));
    }

    @Then("^she finds the course$")
    public void sheFindsTheCourse(List<AcademyChoucairData> academyChocairData) throws Exception{
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer2.toThe(academyChocairData.get(0).getStrCourse())));
    }
}
