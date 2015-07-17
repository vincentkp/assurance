/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2a.vie.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desire.mensah
 */
@Entity
@Table(name = "compterreass")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compterreass.findAll", query = "SELECT c FROM Compterreass c")})
public class Compterreass implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "codecompte")
    private String codecompte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datecreatcompte")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreatcompte;
    @Column(name = "montantcompte")
    private Long montantcompte;
    @Size(max = 254)
    @Column(name = "etatcompte")
    private String etatcompte;
    @JoinColumn(name = "idreass", referencedColumnName = "idreass")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reassureurs idreass;

    public Compterreass() {
    }

    public Compterreass(String codecompte) {
        this.codecompte = codecompte;
    }

    public Compterreass(String codecompte, Date datecreatcompte) {
        this.codecompte = codecompte;
        this.datecreatcompte = datecreatcompte;
    }

    public String getCodecompte() {
        return codecompte;
    }

    public void setCodecompte(String codecompte) {
        this.codecompte = codecompte;
    }

    public Date getDatecreatcompte() {
        return datecreatcompte;
    }

    public void setDatecreatcompte(Date datecreatcompte) {
        this.datecreatcompte = datecreatcompte;
    }

    public Long getMontantcompte() {
        return montantcompte;
    }

    public void setMontantcompte(Long montantcompte) {
        this.montantcompte = montantcompte;
    }

    public String getEtatcompte() {
        return etatcompte;
    }

    public void setEtatcompte(String etatcompte) {
        this.etatcompte = etatcompte;
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
        hash += (codecompte != null ? codecompte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compterreass)) {
            return false;
        }
        Compterreass other = (Compterreass) object;
        if ((this.codecompte == null && other.codecompte != null) || (this.codecompte != null && !this.codecompte.equals(other.codecompte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Compterreass[ codecompte=" + codecompte + " ]";
    }
    
}
