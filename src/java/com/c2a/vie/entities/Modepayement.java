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
@Table(name = "modepayement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modepayement.findAll", query = "SELECT m FROM Modepayement m")})
public class Modepayement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmodeayement")
    private Integer idmodeayement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "libmodpayement")
    private String libmodpayement;
    @OneToMany(mappedBy = "idmodeayement", fetch = FetchType.LAZY)
    private List<Contrat> contratList;

    public Modepayement() {
    }

    public Modepayement(Integer idmodeayement) {
        this.idmodeayement = idmodeayement;
    }

    public Modepayement(Integer idmodeayement, String libmodpayement) {
        this.idmodeayement = idmodeayement;
        this.libmodpayement = libmodpayement;
    }

    public Integer getIdmodeayement() {
        return idmodeayement;
    }

    public void setIdmodeayement(Integer idmodeayement) {
        this.idmodeayement = idmodeayement;
    }

    public String getLibmodpayement() {
        return libmodpayement;
    }

    public void setLibmodpayement(String libmodpayement) {
        this.libmodpayement = libmodpayement;
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
        hash += (idmodeayement != null ? idmodeayement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modepayement)) {
            return false;
        }
        Modepayement other = (Modepayement) object;
        if ((this.idmodeayement == null && other.idmodeayement != null) || (this.idmodeayement != null && !this.idmodeayement.equals(other.idmodeayement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Modepayement[ idmodeayement=" + idmodeayement + " ]";
    }
    
}
