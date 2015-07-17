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
@Table(name = "garantie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Garantie.findAll", query = "SELECT g FROM Garantie g")})
public class Garantie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgarantie")
    private Integer idgarantie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "libgarantie")
    private String libgarantie;
    @Column(name = "statutgarantie")
    private Integer statutgarantie;
    @OneToMany(mappedBy = "idgarantie", fetch = FetchType.LAZY)
    private List<Contrat> contratList;

    public Garantie() {
    }

    public Garantie(Integer idgarantie) {
        this.idgarantie = idgarantie;
    }

    public Garantie(Integer idgarantie, String libgarantie) {
        this.idgarantie = idgarantie;
        this.libgarantie = libgarantie;
    }

    public Integer getIdgarantie() {
        return idgarantie;
    }

    public void setIdgarantie(Integer idgarantie) {
        this.idgarantie = idgarantie;
    }

    public String getLibgarantie() {
        return libgarantie;
    }

    public void setLibgarantie(String libgarantie) {
        this.libgarantie = libgarantie;
    }

    public Integer getStatutgarantie() {
        return statutgarantie;
    }

    public void setStatutgarantie(Integer statutgarantie) {
        this.statutgarantie = statutgarantie;
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
        hash += (idgarantie != null ? idgarantie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Garantie)) {
            return false;
        }
        Garantie other = (Garantie) object;
        if ((this.idgarantie == null && other.idgarantie != null) || (this.idgarantie != null && !this.idgarantie.equals(other.idgarantie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Garantie[ idgarantie=" + idgarantie + " ]";
    }
    
}
