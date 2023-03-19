package ma.moustahsane.ioccdi.dao;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class DaoV2 implements  IDao{
    @Override
    public double data() {
        System.out.println("Dao V2");
        return 2;
    }
}
