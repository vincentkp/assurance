package com.c2a.vie.dao.impl.deces;

import com.c2a.vie.dao.deces.CompterreassDaoBeanLocal;
import com.c2a.vie.dao.impl.BaseDaoBean;
import com.c2a.vie.entities.Compterreass;
import javax.ejb.Stateless;

/**
 *
 * @author K.M.A
 */
@Stateless
public class CompterreassDaoBean extends BaseDaoBean<Compterreass,String> implements CompterreassDaoBeanLocal {

    public CompterreassDaoBean() {
        super(Compterreass.class);
    }

    
}
