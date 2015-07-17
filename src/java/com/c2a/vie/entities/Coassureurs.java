/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2a.vie.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desire.mensah
 */
@Entity
@Table(name = "coassureurs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coassureurs.findAll", query = "SELECT c FROM Coassureurs c")})
public class Coassureurs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "codecoass")
    private String codecoass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "nomcoass")
    private String nomcoass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "telcoass")
    private String telcoass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "identcoass")
    private int identcoass;
    @Size(max = 254)
    @Column(name = "statutcoass")
    private String statutcoass;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "coassureurs", fetch = FetchType.LAZY)
    private Coassurance coassurance;

    public Coassureurs() {
    }

    public Coassureurs(String codecoass) {
        this.codecoass = codecoass;
    }

    public Coassureurs(String codecoass, String nomcoass, String telcoass, int identcoass) {
        this.codecoass = codecoass;
        this.nomcoass = nomcoass;
        this.telcoass = telcoass;
        this.identcoass = identcoass;
    }

    public String getCodecoass() {
        return codecoass;
    }

    public void setCodecoass(String codecoass) {
        this.codecoass = codecoass;
    }

    public String getNomcoass() {
        return nomcoass;
    }

    public void setNomcoass(String nomcoass) {
        this.nomcoass = nomcoass;
    }

    public String getTelcoass() {
        return telcoass;
    }

    public void setTelcoass(String telcoass) {
        this.telcoass = telcoass;
    }

    public int getIdentcoass() {
        return identcoass;
    }

    public void setIdentcoass(int identcoass) {
        this.identcoass = identcoass;
    }

    public String getStatutcoass() {
        return statutcoass;
    }

    public void setStatutcoass(String statutcoass) {
        this.statutcoass = statutcoass;
    }

    public Coassurance getCoassurance() {
        return coassurance;
    }

    public void setCoassurance(Coassurance coassurance) {
        this.coassurance = coassurance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codecoass != null ? codecoass.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coassureurs)) {
            return false;
        }
        Coassureurs other = (Coassureurs) object;
        if ((this.codecoass == null && other.codecoass != null) || (this.codecoass != null && !this.codecoass.equals(other.codecoass))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Coassureurs[ codecoass=" + codecoass + " ]";
    }
    
}
