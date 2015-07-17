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
@Table(name = "groupe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupe.findAll", query = "SELECT g FROM Groupe g")})
public class Groupe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgroupe")
    private Integer idgroupe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "libgroupe")
    private String libgroupe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "telgroup")
    private String telgroup;
    @Column(name = "statutgroup")
    private Integer statutgroup;
    @OneToMany(mappedBy = "idgroupe", fetch = FetchType.LAZY)
    private List<Contrat> contratList;

    public Groupe() {
    }

    public Groupe(Integer idgroupe) {
        this.idgroupe = idgroupe;
    }

    public Groupe(Integer idgroupe, String libgroupe, String telgroup) {
        this.idgroupe = idgroupe;
        this.libgroupe = libgroupe;
        this.telgroup = telgroup;
    }

    public Integer getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(Integer idgroupe) {
        this.idgroupe = idgroupe;
    }

    public String getLibgroupe() {
        return libgroupe;
    }

    public void setLibgroupe(String libgroupe) {
        this.libgroupe = libgroupe;
    }

    public String getTelgroup() {
        return telgroup;
    }

    public void setTelgroup(String telgroup) {
        this.telgroup = telgroup;
    }

    public Integer getStatutgroup() {
        return statutgroup;
    }

    public void setStatutgroup(Integer statutgroup) {
        this.statutgroup = statutgroup;
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
        hash += (idgroupe != null ? idgroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupe)) {
            return false;
        }
        Groupe other = (Groupe) object;
        if ((this.idgroupe == null && other.idgroupe != null) || (this.idgroupe != null && !this.idgroupe.equals(other.idgroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Groupe[ idgroupe=" + idgroupe + " ]";
    }
    
}
