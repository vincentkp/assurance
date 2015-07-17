package com.c2a.vie.entities;

import com.c2a.vie.entities.Contrat;
import com.c2a.vie.entities.Typeapporteur;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-07-03T11:41:58")
@StaticMetamodel(Apporteur.class)
public class Apporteur_ { 

    public static volatile SingularAttribute<Apporteur, Integer> nomapp;
    public static volatile SingularAttribute<Apporteur, Integer> telapp;
    public static volatile SingularAttribute<Apporteur, Integer> statutapp;
    public static volatile SingularAttribute<Apporteur, String> codeapp;
    public static volatile SingularAttribute<Apporteur, Integer> adresseapp;
    public static volatile SingularAttribute<Apporteur, Typeapporteur> idtypeapporteur;
    public static volatile ListAttribute<Apporteur, Contrat> contratList;

}