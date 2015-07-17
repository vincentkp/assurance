package com.c2a.vie.service.impl.deces;

import com.c2a.vie.service.impl.BaseServiceBean;
import com.c2a.vie.dao.BaseDaoBeanLocal;
import javax.ejb.Stateless;
import javax.ejb.EJB;
import com.c2a.vie.service.deces.CompterreassServiceBeanLocal;
import com.c2a.vie.dao.deces.CompterreassDaoBeanLocal;
import com.c2a.vie.entities.Compterreass;

/**
 *
 * @author K.M.A
 */
@Stateless
public class CompterreassServiceBean extends BaseServiceBean<Compterreass, String> implements CompterreassServiceBeanLocal {

@EJB
private CompterreassDaoBeanLocal dao;
    
      @Override
    protected BaseDaoBeanLocal<Compterreass, String> getDAO() {
        return this.dao;
    }
}