package com.c2a.vie.dao.impl.deces;

import com.c2a.vie.dao.deces.ReassureursDaoBeanLocal;
import com.c2a.vie.dao.impl.BaseDaoBean;
import com.c2a.vie.entities.Reassureurs;
import javax.ejb.Stateless;

/**
 *
 * @author K.M.A
 */
@Stateless
public class ReassureursDaoBean extends BaseDaoBean<Reassureurs,String> implements ReassureursDaoBeanLocal {

    public ReassureursDaoBean() {
        super(Reassureurs.class);
    }

    
}
