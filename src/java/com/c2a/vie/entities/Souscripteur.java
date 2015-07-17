/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2a.vie.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author desire.mensah
 */
@Entity
@Table(name = "souscripteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Souscripteur.findAll", query = "SELECT s FROM Souscripteur s")})
public class Souscripteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codsous")
    private Integer codsous;
    @Size(max = 254)
    @Column(name = "statutsous")
    private String statutsous;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datnaissous")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datnaissous;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "nomsous")
    private String nomsous;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "prensous")
    private String prensous;
    @Column(name = "adrsous")
    private Integer adrsous;
    @OneToMany(mappedBy = "codsous", fetch = FetchType.LAZY)
    private List<Assures> assuresList;

    public Souscripteur() {
    }

    public Souscripteur(Integer codsous) {
        this.codsous = codsous;
    }

    public Souscripteur(Integer codsous, Date datnaissous, String nomsous, String prensous) {
        this.codsous = codsous;
        this.datnaissous = datnaissous;
        this.nomsous = nomsous;
        this.prensous = prensous;
    }

    public Integer getCodsous() {
        return codsous;
    }

    public void setCodsous(Integer codsous) {
        this.codsous = codsous;
    }

    public String getStatutsous() {
        return statutsous;
    }

    public void setStatutsous(String statutsous) {
        this.statutsous = statutsous;
    }

    public Date getDatnaissous() {
        return datnaissous;
    }

    public void setDatnaissous(Date datnaissous) {
        this.datnaissous = datnaissous;
    }

    public String getNomsous() {
        return nomsous;
    }

    public void setNomsous(String nomsous) {
        this.nomsous = nomsous;
    }

    public String getPrensous() {
        return prensous;
    }

    public void setPrensous(String prensous) {
        this.prensous = prensous;
    }

    public Integer getAdrsous() {
        return adrsous;
    }

    public void setAdrsous(Integer adrsous) {
        this.adrsous = adrsous;
    }

    @XmlTransient
    public List<Assures> getAssuresList() {
        return assuresList;
    }

    public void setAssuresList(List<Assures> assuresList) {
        this.assuresList = assuresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codsous != null ? codsous.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Souscripteur)) {
            return false;
        }
        Souscripteur other = (Souscripteur) object;
        if ((this.codsous == null && other.codsous != null) || (this.codsous != null && !this.codsous.equals(other.codsous))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Souscripteur[ codsous=" + codsous + " ]";
    }
    
}
