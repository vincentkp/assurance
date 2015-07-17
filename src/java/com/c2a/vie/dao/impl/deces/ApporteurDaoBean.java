package com.c2a.vie.dao.impl.deces;

import com.c2a.vie.dao.deces.ApporteurDaoBeanLocal;
import com.c2a.vie.dao.impl.BaseDaoBean;
import com.c2a.vie.entities.Apporteur;
import javax.ejb.Stateless;

/**
 *
 * @author K.M.A
 */
@Stateless
public class ApporteurDaoBean extends BaseDaoBean<Apporteur,Integer> implements ApporteurDaoBeanLocal {

    public ApporteurDaoBean() {
        super(Apporteur.class);
    }

    
}
