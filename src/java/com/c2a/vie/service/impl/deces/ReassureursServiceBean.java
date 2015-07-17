package com.c2a.vie.service.impl.deces;

import com.c2a.vie.service.impl.BaseServiceBean;
import com.c2a.vie.dao.BaseDaoBeanLocal;
import javax.ejb.Stateless;
import javax.ejb.EJB;
import com.c2a.vie.service.deces.ReassureursServiceBeanLocal;
import com.c2a.vie.dao.deces.ReassureursDaoBeanLocal;
import com.c2a.vie.entities.Reassureurs;

/**
 *
 * @author K.M.A
 */
@Stateless
public class ReassureursServiceBean extends BaseServiceBean<Reassureurs, String> implements ReassureursServiceBeanLocal {

@EJB
private ReassureursDaoBeanLocal dao;
    
      @Override
    protected BaseDaoBeanLocal<Reassureurs, String> getDAO() {
        return this.dao;
    }
}