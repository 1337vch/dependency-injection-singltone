package ma.moustahsane.ioccdi;

import ma.moustahsane.ioccdi.dao.IDao;
import ma.moustahsane.ioccdi.services.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainXML {
    public static void main(String[] args) throws Exception {


        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier= (IMetier) context.getBean("metier");
        System.out.println(metier.calcul());
    }
}