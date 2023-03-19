package ma.moustahsane.ioccdi;

import ma.moustahsane.ioccdi.dao.Dao;
import ma.moustahsane.ioccdi.dao.IDao;
import ma.moustahsane.ioccdi.services.IMetier;
import ma.moustahsane.ioccdi.services.ext.MetierImpl;


public class MainStatic {
    public static void main(String[] args) {


        IDao dao = new Dao();

        IMetier metier= new MetierImpl(dao);

        System.out.println(metier.calcul());
    }
}