package com.c2a.vie.entities;

import com.c2a.vie.entities.Contrat;
import com.c2a.vie.entities.Reassureurs;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-03T11:41:58")
@StaticMetamodel(Reassurance.class)
public class Reassurance_ { 

    public static volatile SingularAttribute<Reassurance, Contrat> numpolice;
    public static volatile SingularAttribute<Reassurance, Integer> tauxreass;
    public static volatile SingularAttribute<Reassurance, Integer> tauxcommireass;
    public static volatile SingularAttribute<Reassurance, Reassureurs> idreass;
    public static volatile SingularAttribute<Reassurance, Integer> idereassur;

}