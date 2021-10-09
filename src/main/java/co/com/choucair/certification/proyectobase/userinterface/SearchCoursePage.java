package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage  {

    public static final Target BUTON_UC = Target.the("Selecciona la universidad choucair")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[1]/div/div/div[1]/center/div/div/div/div[2]/a"));
    public static final Target INPUT_COURSE = Target.the("BUSCA EL CURSO")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("DA CLICK PARA BUSCAR EL CURSO")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE= Target.the("Extrae el Nombre del CURSO")
            .located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));


}
