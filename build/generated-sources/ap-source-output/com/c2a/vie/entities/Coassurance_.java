package com.c2a.vie.entities;

import com.c2a.vie.entities.Coassureurs;
import com.c2a.vie.entities.Contrat;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-03T11:41:58")
@StaticMetamodel(Coassurance.class)
public class Coassurance_ { 

    public static volatile SingularAttribute<Coassurance, String> codecoass;
    public static volatile SingularAttribute<Coassurance, Contrat> numpolice;
    public static volatile SingularAttribute<Coassurance, Coassureurs> coassureurs;
    public static volatile SingularAttribute<Coassurance, Integer> tauxcoass;
    public static volatile SingularAttribute<Coassurance, Integer> identcoass;
    public static volatile SingularAttribute<Coassurance, Integer> tauxcommis;

}