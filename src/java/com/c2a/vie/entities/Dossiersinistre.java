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
@Table(name = "dossiersinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dossiersinistre.findAll", query = "SELECT d FROM Dossiersinistre d")})
public class Dossiersinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "numdossiersin")
    private String numdossiersin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datedeclarsin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datedeclarsin;
    @Column(name = "datedecessin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datedecessin;
    @Column(name = "dateemisschec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateemisschec;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "motifsin")
    private String motifsin;
    @Column(name = "partreass")
    private Long partreass;
    @Column(name = "partcoass")
    private Long partcoass;
    @Size(max = 254)
    @Column(name = "etatdossiersin")
    private String etatdossiersin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montantsin")
    private Double montantsin;
    @Size(max = 50)
    @Column(name = "codproducteur")
    private String codproducteur;
    @JoinColumn(name = "numpolice", referencedColumnName = "numpolice")
    @ManyToOne(fetch = FetchType.LAZY)
    private Contrat numpolice;

    public Dossiersinistre() {
    }

    public Dossiersinistre(String numdossiersin) {
        this.numdossiersin = numdossiersin;
    }

    public Dossiersinistre(String numdossiersin, Date datedeclarsin, String motifsin) {
        this.numdossiersin = numdossiersin;
        this.datedeclarsin = datedeclarsin;
        this.motifsin = motifsin;
    }

    public String getNumdossiersin() {
        return numdossiersin;
    }

    public void setNumdossiersin(String numdossiersin) {
        this.numdossiersin = numdossiersin;
    }

    public Date getDatedeclarsin() {
        return datedeclarsin;
    }

    public void setDatedeclarsin(Date datedeclarsin) {
        this.datedeclarsin = datedeclarsin;
    }

    public Date getDatedecessin() {
        return datedecessin;
    }

    public void setDatedecessin(Date datedecessin) {
        this.datedecessin = datedecessin;
    }

    public Date getDateemisschec() {
        return dateemisschec;
    }

    public void setDateemisschec(Date dateemisschec) {
        this.dateemisschec = dateemisschec;
    }

    public String getMotifsin() {
        return motifsin;
    }

    public void setMotifsin(String motifsin) {
        this.motifsin = motifsin;
    }

    public Long getPartreass() {
        return partreass;
    }

    public void setPartreass(Long partreass) {
        this.partreass = partreass;
    }

    public Long getPartcoass() {
        return partcoass;
    }

    public void setPartcoass(Long partcoass) {
        this.partcoass = partcoass;
    }

    public String getEtatdossiersin() {
        return etatdossiersin;
    }

    public void setEtatdossiersin(String etatdossiersin) {
        this.etatdossiersin = etatdossiersin;
    }

    public Double getMontantsin() {
        return montantsin;
    }

    public void setMontantsin(Double montantsin) {
        this.montantsin = montantsin;
    }

    public String getCodproducteur() {
        return codproducteur;
    }

    public void setCodproducteur(String codproducteur) {
        this.codproducteur = codproducteur;
    }

    public Contrat getNumpolice() {
        return numpolice;
    }

    public void setNumpolice(Contrat numpolice) {
        this.numpolice = numpolice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numdossiersin != null ? numdossiersin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dossiersinistre)) {
            return false;
        }
        Dossiersinistre other = (Dossiersinistre) object;
        if ((this.numdossiersin == null && other.numdossiersin != null) || (this.numdossiersin != null && !this.numdossiersin.equals(other.numdossiersin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Dossiersinistre[ numdossiersin=" + numdossiersin + " ]";
    }
    
}
