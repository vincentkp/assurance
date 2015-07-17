package com.c2a.vie.entities;

import com.c2a.vie.entities.Compterreass;
import com.c2a.vie.entities.Reassurance;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-03T11:41:58")
@StaticMetamodel(Reassureurs.class)
public class Reassureurs_ { 

    public static volatile SingularAttribute<Reassureurs, Integer> statutreass;
    public static volatile ListAttribute<Reassureurs, Compterreass> compterreassList;
    public static volatile SingularAttribute<Reassureurs, Integer> identreass;
    public static volatile SingularAttribute<Reassureurs, String> nomreass;
    public static volatile ListAttribute<Reassureurs, Reassurance> reassuranceList;
    public static volatile SingularAttribute<Reassureurs, String> categorireass;
    public static volatile SingularAttribute<Reassureurs, String> idreass;
    public static volatile SingularAttribute<Reassureurs, String> telreass;

}