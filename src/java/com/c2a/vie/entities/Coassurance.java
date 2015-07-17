/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2a.vie.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "coassurance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coassurance.findAll", query = "SELECT c FROM Coassurance c")})
public class Coassurance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "codecoass")
    private String codecoass;
    @Column(name = "tauxcoass")
    private Integer tauxcoass;
    @Column(name = "tauxcommis")
    private Integer tauxcommis;
    @Column(name = "identcoass")
    private Integer identcoass;
    @JoinColumn(name = "codecoass", referencedColumnName = "codecoass", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Coassureurs coassureurs;
    @JoinColumn(name = "numpolice", referencedColumnName = "numpolice")
    @ManyToOne(fetch = FetchType.LAZY)
    private Contrat numpolice;

    public Coassurance() {
    }

    public Coassurance(String codecoass) {
        this.codecoass = codecoass;
    }

    public String getCodecoass() {
        return codecoass;
    }

    public void setCodecoass(String codecoass) {
        this.codecoass = codecoass;
    }

    public Integer getTauxcoass() {
        return tauxcoass;
    }

    public void setTauxcoass(Integer tauxcoass) {
        this.tauxcoass = tauxcoass;
    }

    public Integer getTauxcommis() {
        return tauxcommis;
    }

    public void setTauxcommis(Integer tauxcommis) {
        this.tauxcommis = tauxcommis;
    }

    public Integer getIdentcoass() {
        return identcoass;
    }

    public void setIdentcoass(Integer identcoass) {
        this.identcoass = identcoass;
    }

    public Coassureurs getCoassureurs() {
        return coassureurs;
    }

    public void setCoassureurs(Coassureurs coassureurs) {
        this.coassureurs = coassureurs;
    }

    public Contrat getNumpolice() {
        return numpolice;
    }

    public void setNumpolice(Contrat numpolice) {
        this.numpolice = numpolice;
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
        if (!(object instanceof Coassurance)) {
            return false;
        }
        Coassurance other = (Coassurance) object;
        if ((this.codecoass == null && other.codecoass != null) || (this.codecoass != null && !this.codecoass.equals(other.codecoass))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Coassurance[ codecoass=" + codecoass + " ]";
    }
    
}
