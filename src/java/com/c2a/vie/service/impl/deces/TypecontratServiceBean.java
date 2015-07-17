package com.c2a.vie.service.impl.deces;

import com.c2a.vie.service.impl.BaseServiceBean;
import com.c2a.vie.dao.BaseDaoBeanLocal;
import javax.ejb.Stateless;
import javax.ejb.EJB;
import com.c2a.vie.service.deces.TypecontratServiceBeanLocal;
import com.c2a.vie.dao.deces.TypecontratDaoBeanLocal;
import com.c2a.vie.entities.Typecontrat;

/**
 *
 * @author K.M.A
 */
@Stateless
public class TypecontratServiceBean extends BaseServiceBean<Typecontrat, Integer> implements TypecontratServiceBeanLocal {

@EJB
private TypecontratDaoBeanLocal dao;
    
      @Override
    protected BaseDaoBeanLocal<Typecontrat, Integer> getDAO() {
        return this.dao;
    }
}