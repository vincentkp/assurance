package com.c2a.vie.dao.impl.deces;

import com.c2a.vie.dao.deces.ModepayementDaoBeanLocal;
import com.c2a.vie.dao.impl.BaseDaoBean;
import com.c2a.vie.entities.Modepayement;
import javax.ejb.Stateless;

/**
 *
 * @author K.M.A
 */
@Stateless
public class ModepayementDaoBean extends BaseDaoBean<Modepayement,Integer> implements ModepayementDaoBeanLocal {

    public ModepayementDaoBean() {
        super(Modepayement.class);
    }

    
}
