package ma.moustahsane.ioccdi;

import ma.moustahsane.ioccdi.services.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx=new AnnotationConfigApplicationContext("ma.moustahsane.ioccdi.dao","ma.moustahsane.ioccdi.services.ext");
        IMetier metier=ctx.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}