package com.c2a.vie.dao.impl.deces;

import com.c2a.vie.dao.deces.TypecontratDaoBeanLocal;
import com.c2a.vie.dao.impl.BaseDaoBean;
import com.c2a.vie.entities.Typecontrat;
import javax.ejb.Stateless;

/**
 *
 * @author K.M.A
 */
@Stateless
public class TypecontratDaoBean extends BaseDaoBean<Typecontrat,Integer> implements TypecontratDaoBeanLocal {

    public TypecontratDaoBean() {
        super(Typecontrat.class);
    }

    
}
