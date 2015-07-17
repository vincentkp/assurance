package com.c2a.vie.dao.impl.deces;

import com.c2a.vie.dao.deces.TypeapporteurDaoBeanLocal;
import com.c2a.vie.dao.impl.BaseDaoBean;
import com.c2a.vie.entities.Typeapporteur;
import javax.ejb.Stateless;

/**
 *
 * @author K.M.A
 */
@Stateless
public class TypeapporteurDaoBean extends BaseDaoBean<Typeapporteur,Integer> implements TypeapporteurDaoBeanLocal {

    public TypeapporteurDaoBean() {
        super(Typeapporteur.class);
    }

    
}
