package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.BuscarCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer2 implements Question<Boolean> {
    private String question;

    public Answer2(String question) {
        this.question = question;
    }

    public static Answer2 toThe(String question){
        return new Answer2(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(BuscarCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
