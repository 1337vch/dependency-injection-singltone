package ma.moustahsane.ioccdi;

import ma.moustahsane.ioccdi.dao.IDao;
import ma.moustahsane.ioccdi.services.IMetier;


public class MainDynamic {
    public static void main(String[] args) throws Exception {


        IDao dao = (IDao) Class.forName("ma.moustahsane.ioccdi.dao.Dao").newInstance();

        IMetier metier= (IMetier) Class.forName("ma.moustahsane.ioccdi.services.ext.MetierImpl").getConstructor(IDao.class).newInstance(dao);

        System.out.println(metier.calcul());
    }
}