package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.userinterface.BuscarCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar implements Task {

    private String strCourse;


    public Buscar(String strCourse) {
        this.strCourse = strCourse;
    }


    public static Buscar the(String strCourse) {
        return Tasks.instrumented(Buscar.class, strCourse);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BuscarCoursePage.BUTON_UC),
                Enter.theValue(strCourse).into(BuscarCoursePage.INPUT_COURSE),
                Click.on(BuscarCoursePage.BUTTON_GO),
                Click.on(BuscarCoursePage.SELECT_COURSE));
    }
}
