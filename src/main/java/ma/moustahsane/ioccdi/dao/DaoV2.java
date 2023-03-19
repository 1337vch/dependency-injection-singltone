package ma.moustahsane.ioccdi.dao;

public class DaoV2 implements  IDao{
    @Override
    public double data() {
        System.out.println("Dao V2");
        return 2;
    }
}
