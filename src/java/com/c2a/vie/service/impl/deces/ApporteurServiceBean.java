package com.c2a.vie.service.impl.deces;

import com.c2a.vie.service.impl.BaseServiceBean;
import com.c2a.vie.dao.BaseDaoBeanLocal;
import javax.ejb.Stateless;
import javax.ejb.EJB;
import com.c2a.vie.dao.deces.ApporteurDaoBeanLocal;
import com.c2a.vie.entities.Apporteur;
import com.c2a.vie.service.deces.ApporteurServiceBeanLocal;

/**
 *
 * @author K.M.A
 */
@Stateless
public class ApporteurServiceBean extends BaseServiceBean<Apporteur, Integer> implements ApporteurServiceBeanLocal {

@EJB
private ApporteurDaoBeanLocal dao;
    
      @Override
    protected BaseDaoBeanLocal<Apporteur, Integer> getDAO() {
        return this.dao;
    }
}