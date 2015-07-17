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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "assures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assures.findAll", query = "SELECT a FROM Assures a")})
public class Assures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codassure")
    private Integer codassure;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datnaisassure")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datnaisassure;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "nomasusure")
    private String nomasusure;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "prenassure")
    private String prenassure;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "telassure")
    private String telassure;
    @Size(max = 254)
    @Column(name = "statutreass")
    private String statutreass;
    @OneToMany(mappedBy = "codassure", fetch = FetchType.LAZY)
    private List<Contrat> contratList;
    @JoinColumn(name = "codsous", referencedColumnName = "codsous")
    @ManyToOne(fetch = FetchType.LAZY)
    private Souscripteur codsous;

    public Assures() {
    }

    public Assures(Integer codassure) {
        this.codassure = codassure;
    }

    public Assures(Integer codassure, Date datnaisassure, String nomasusure, String prenassure, String telassure) {
        this.codassure = codassure;
        this.datnaisassure = datnaisassure;
        this.nomasusure = nomasusure;
        this.prenassure = prenassure;
        this.telassure = telassure;
    }

    public Integer getCodassure() {
        return codassure;
    }

    public void setCodassure(Integer codassure) {
        this.codassure = codassure;
    }

    public Date getDatnaisassure() {
        return datnaisassure;
    }

    public void setDatnaisassure(Date datnaisassure) {
        this.datnaisassure = datnaisassure;
    }

    public String getNomasusure() {
        return nomasusure;
    }

    public void setNomasusure(String nomasusure) {
        this.nomasusure = nomasusure;
    }

    public String getPrenassure() {
        return prenassure;
    }

    public void setPrenassure(String prenassure) {
        this.prenassure = prenassure;
    }

    public String getTelassure() {
        return telassure;
    }

    public void setTelassure(String telassure) {
        this.telassure = telassure;
    }

    public String getStatutreass() {
        return statutreass;
    }

    public void setStatutreass(String statutreass) {
        this.statutreass = statutreass;
    }

    @XmlTransient
    public List<Contrat> getContratList() {
        return contratList;
    }

    public void setContratList(List<Contrat> contratList) {
        this.contratList = contratList;
    }

    public Souscripteur getCodsous() {
        return codsous;
    }

    public void setCodsous(Souscripteur codsous) {
        this.codsous = codsous;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codassure != null ? codassure.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assures)) {
            return false;
        }
        Assures other = (Assures) object;
        if ((this.codassure == null && other.codassure != null) || (this.codassure != null && !this.codassure.equals(other.codassure))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Assures[ codassure=" + codassure + " ]";
    }
    
}
