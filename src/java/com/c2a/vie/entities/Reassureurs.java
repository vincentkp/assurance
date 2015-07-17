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
@Table(name = "reassureurs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reassureurs.findAll", query = "SELECT r FROM Reassureurs r")})
public class Reassureurs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "idreass")
    private String idreass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "categorireass")
    private String categorireass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nomreass")
    private String nomreass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "telreass")
    private String telreass;
    @Column(name = "identreass")
    private Integer identreass;
    @Column(name = "statutreass")
    private Integer statutreass;
    @OneToMany(mappedBy = "idreass", fetch = FetchType.LAZY)
    private List<Compterreass> compterreassList;
    @OneToMany(mappedBy = "idreass", fetch = FetchType.LAZY)
    private List<Reassurance> reassuranceList;

    public Reassureurs() {
    }

    public Reassureurs(String idreass) {
        this.idreass = idreass;
    }

    public Reassureurs(String idreass, String categorireass, String nomreass, String telreass) {
        this.idreass = idreass;
        this.categorireass = categorireass;
        this.nomreass = nomreass;
        this.telreass = telreass;
    }

    public String getIdreass() {
        return idreass;
    }

    public void setIdreass(String idreass) {
        this.idreass = idreass;
    }

    public String getCategorireass() {
        return categorireass;
    }

    public void setCategorireass(String categorireass) {
        this.categorireass = categorireass;
    }

    public String getNomreass() {
        return nomreass;
    }

    public void setNomreass(String nomreass) {
        this.nomreass = nomreass;
    }

    public String getTelreass() {
        return telreass;
    }

    public void setTelreass(String telreass) {
        this.telreass = telreass;
    }

    public Integer getIdentreass() {
        return identreass;
    }

    public void setIdentreass(Integer identreass) {
        this.identreass = identreass;
    }

    public Integer getStatutreass() {
        return statutreass;
    }

    public void setStatutreass(Integer statutreass) {
        this.statutreass = statutreass;
    }

    @XmlTransient
    public List<Compterreass> getCompterreassList() {
        return compterreassList;
    }

    public void setCompterreassList(List<Compterreass> compterreassList) {
        this.compterreassList = compterreassList;
    }

    @XmlTransient
    public List<Reassurance> getReassuranceList() {
        return reassuranceList;
    }

    public void setReassuranceList(List<Reassurance> reassuranceList) {
        this.reassuranceList = reassuranceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreass != null ? idreass.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reassureurs)) {
            return false;
        }
        Reassureurs other = (Reassureurs) object;
        if ((this.idreass == null && other.idreass != null) || (this.idreass != null && !this.idreass.equals(other.idreass))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Reassureurs[ idreass=" + idreass + " ]";
    }
    
}
