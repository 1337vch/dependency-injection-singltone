package ma.moustahsane.ioccdi.services.ext;

import ma.moustahsane.ioccdi.dao.Dao;
import ma.moustahsane.ioccdi.dao.IDao;
import ma.moustahsane.ioccdi.services.IMetier;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {

    private IDao dao;
    public MetierImpl(IDao dao){
       this.dao = dao;
    }
    @Override
    public double calcul() {

        return dao.data();
    }

    public void setDao(Dao dao) {
    }
}
