/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2a.vie.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "typeapporteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typeapporteur.findAll", query = "SELECT t FROM Typeapporteur t")})
public class Typeapporteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtypeapporteur")
    private Integer idtypeapporteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "libtypeapporteur")
    private String libtypeapporteur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtypeapporteur", fetch = FetchType.LAZY)
    private List<Apporteur> apporteurList;

    public Typeapporteur() {
    }

    public Typeapporteur(Integer idtypeapporteur) {
        this.idtypeapporteur = idtypeapporteur;
    }

    public Typeapporteur(Integer idtypeapporteur, String libtypeapporteur) {
        this.idtypeapporteur = idtypeapporteur;
        this.libtypeapporteur = libtypeapporteur;
    }

    public Integer getIdtypeapporteur() {
        return idtypeapporteur;
    }

    public void setIdtypeapporteur(Integer idtypeapporteur) {
        this.idtypeapporteur = idtypeapporteur;
    }

    public String getLibtypeapporteur() {
        return libtypeapporteur;
    }

    public void setLibtypeapporteur(String libtypeapporteur) {
        this.libtypeapporteur = libtypeapporteur;
    }

    @XmlTransient
    public List<Apporteur> getApporteurList() {
        return apporteurList;
    }

    public void setApporteurList(List<Apporteur> apporteurList) {
        this.apporteurList = apporteurList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtypeapporteur != null ? idtypeapporteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typeapporteur)) {
            return false;
        }
        Typeapporteur other = (Typeapporteur) object;
        if ((this.idtypeapporteur == null && other.idtypeapporteur != null) || (this.idtypeapporteur != null && !this.idtypeapporteur.equals(other.idtypeapporteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Typeapporteur[ idtypeapporteur=" + idtypeapporteur + " ]";
    }
    
}
