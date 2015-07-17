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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desire.mensah
 */
@Entity
@Table(name = "reassurance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reassurance.findAll", query = "SELECT r FROM Reassurance r")})
public class Reassurance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "tauxreass")
    private Integer tauxreass;
    @Column(name = "tauxcommireass")
    private Integer tauxcommireass;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idereassur")
    private Integer idereassur;
    @JoinColumn(name = "numpolice", referencedColumnName = "numpolice")
    @ManyToOne(fetch = FetchType.LAZY)
    private Contrat numpolice;
    @JoinColumn(name = "idreass", referencedColumnName = "idreass")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reassureurs idreass;

    public Reassurance() {
    }

    public Reassurance(Integer idereassur) {
        this.idereassur = idereassur;
    }

    public Integer getTauxreass() {
        return tauxreass;
    }

    public void setTauxreass(Integer tauxreass) {
        this.tauxreass = tauxreass;
    }

    public Integer getTauxcommireass() {
        return tauxcommireass;
    }

    public void setTauxcommireass(Integer tauxcommireass) {
        this.tauxcommireass = tauxcommireass;
    }

    public Integer getIdereassur() {
        return idereassur;
    }

    public void setIdereassur(Integer idereassur) {
        this.idereassur = idereassur;
    }

    public Contrat getNumpolice() {
        return numpolice;
    }

    public void setNumpolice(Contrat numpolice) {
        this.numpolice = numpolice;
    }

    public Reassureurs getIdreass() {
        return idreass;
    }

    public void setIdreass(Reassureurs idreass) {
        this.idreass = idreass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idereassur != null ? idereassur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reassurance)) {
            return false;
        }
        Reassurance other = (Reassurance) object;
        if ((this.idereassur == null && other.idereassur != null) || (this.idereassur != null && !this.idereassur.equals(other.idereassur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Reassurance[ idereassur=" + idereassur + " ]";
    }
    
}
