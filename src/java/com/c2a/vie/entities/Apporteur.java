/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2a.vie.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author desire.mensah
 */
@Entity
@Table(name = "apporteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apporteur.findAll", query = "SELECT a FROM Apporteur a")})
public class Apporteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "codeapp")
    private String codeapp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nomapp")
    private int nomapp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telapp")
    private int telapp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "adresseapp")
    private int adresseapp;
    @Column(name = "statutapp")
    private Integer statutapp;
    @JoinColumn(name = "idtypeapporteur", referencedColumnName = "idtypeapporteur")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Typeapporteur idtypeapporteur;
    @OneToMany(mappedBy = "codeapp", fetch = FetchType.LAZY)
    private List<Contrat> contratList;

    public Apporteur() {
    }

    public Apporteur(String codeapp) {
        this.codeapp = codeapp;
    }

    public Apporteur(String codeapp, int nomapp, int telapp, int adresseapp) {
        this.codeapp = codeapp;
        this.nomapp = nomapp;
        this.telapp = telapp;
        this.adresseapp = adresseapp;
    }

    public String getCodeapp() {
        return codeapp;
    }

    public void setCodeapp(String codeapp) {
        this.codeapp = codeapp;
    }

    public int getNomapp() {
        return nomapp;
    }

    public void setNomapp(int nomapp) {
        this.nomapp = nomapp;
    }

    public int getTelapp() {
        return telapp;
    }

    public void setTelapp(int telapp) {
        this.telapp = telapp;
    }

    public int getAdresseapp() {
        return adresseapp;
    }

    public void setAdresseapp(int adresseapp) {
        this.adresseapp = adresseapp;
    }

    public Integer getStatutapp() {
        return statutapp;
    }

    public void setStatutapp(Integer statutapp) {
        this.statutapp = statutapp;
    }

    public Typeapporteur getIdtypeapporteur() {
        return idtypeapporteur;
    }

    public void setIdtypeapporteur(Typeapporteur idtypeapporteur) {
        this.idtypeapporteur = idtypeapporteur;
    }

    @XmlTransient
    public List<Contrat> getContratList() {
        return contratList;
    }

    public void setContratList(List<Contrat> contratList) {
        this.contratList = contratList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeapp != null ? codeapp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apporteur)) {
            return false;
        }
        Apporteur other = (Apporteur) object;
        if ((this.codeapp == null && other.codeapp != null) || (this.codeapp != null && !this.codeapp.equals(other.codeapp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Apporteur[ codeapp=" + codeapp + " ]";
    }
    
}
