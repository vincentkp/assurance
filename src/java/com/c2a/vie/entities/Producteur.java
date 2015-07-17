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
@Table(name = "producteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producteur.findAll", query = "SELECT p FROM Producteur p")})
public class Producteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "idproducteur")
    private String idproducteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "nomproducteur")
    private String nomproducteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "prenproducteur")
    private String prenproducteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "adrproducteur")
    private String adrproducteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "telproducteur")
    private String telproducteur;
    @Size(max = 30)
    @Column(name = "statutproducteur")
    private String statutproducteur;
    @OneToMany(mappedBy = "idproducteur", fetch = FetchType.LAZY)
    private List<Contrat> contratList;

    public Producteur() {
    }

    public Producteur(String idproducteur) {
        this.idproducteur = idproducteur;
    }

    public Producteur(String idproducteur, String nomproducteur, String prenproducteur, String adrproducteur, String telproducteur) {
        this.idproducteur = idproducteur;
        this.nomproducteur = nomproducteur;
        this.prenproducteur = prenproducteur;
        this.adrproducteur = adrproducteur;
        this.telproducteur = telproducteur;
    }

    public String getIdproducteur() {
        return idproducteur;
    }

    public void setIdproducteur(String idproducteur) {
        this.idproducteur = idproducteur;
    }

    public String getNomproducteur() {
        return nomproducteur;
    }

    public void setNomproducteur(String nomproducteur) {
        this.nomproducteur = nomproducteur;
    }

    public String getPrenproducteur() {
        return prenproducteur;
    }

    public void setPrenproducteur(String prenproducteur) {
        this.prenproducteur = prenproducteur;
    }

    public String getAdrproducteur() {
        return adrproducteur;
    }

    public void setAdrproducteur(String adrproducteur) {
        this.adrproducteur = adrproducteur;
    }

    public String getTelproducteur() {
        return telproducteur;
    }

    public void setTelproducteur(String telproducteur) {
        this.telproducteur = telproducteur;
    }

    public String getStatutproducteur() {
        return statutproducteur;
    }

    public void setStatutproducteur(String statutproducteur) {
        this.statutproducteur = statutproducteur;
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
        hash += (idproducteur != null ? idproducteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producteur)) {
            return false;
        }
        Producteur other = (Producteur) object;
        if ((this.idproducteur == null && other.idproducteur != null) || (this.idproducteur != null && !this.idproducteur.equals(other.idproducteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Producteur[ idproducteur=" + idproducteur + " ]";
    }
    
}
