package com.c2a.vie.dao.impl.deces;

import com.c2a.vie.dao.deces.GarantieDaoBeanLocal;
import com.c2a.vie.dao.impl.BaseDaoBean;
import com.c2a.vie.entities.Garantie;
import javax.ejb.Stateless;

/**
 *
 * @author K.M.A
 */
@Stateless
public class GarantieDaoBean extends BaseDaoBean<Garantie,Integer> implements GarantieDaoBeanLocal {

    public GarantieDaoBean() {
        super(Garantie.class);
    }

    
}
