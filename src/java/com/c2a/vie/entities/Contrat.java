/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2a.vie.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author desire.mensah
 */
@Entity
@Table(name = "contrat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrat.findAll", query = "SELECT c FROM Contrat c")})
public class Contrat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numpolice")
    private Integer numpolice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateeffet")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateeffet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateexp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateexp;
    @Column(name = "datesaisie")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datesaisie;
    @Column(name = "tauxremise")
    private Long tauxremise;
    @Size(max = 254)
    @Column(name = "etatcontrat")
    private String etatcontrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capitgarantitotale")
    private long capitgarantitotale;
    @Column(name = "primres")
    private long primesiliation;
    @Column(name = "primemontant")
    private Long primemontant;
    @Column(name = "primettc")
    private Long primettc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "caracterecontrat")
    private String caracterecontrat;
    @Column(name = "commisapporteur")
    private Long commisapporteur;
    @Size(max = 254)
    @Column(name = "rapportmedical")
    private String rapportmedical;
    @OneToMany(mappedBy = "numpolice", fetch = FetchType.LAZY)
    private List<Dossiersinistre> dossiersinistreList;
    @JoinColumn(name = "codeapp", referencedColumnName = "codeapp")
    @ManyToOne(fetch = FetchType.LAZY)
    private Apporteur codeapp;
    @JoinColumn(name = "codassure", referencedColumnName = "codassure")
    @ManyToOne(fetch = FetchType.LAZY)
    private Assures codassure;
    @JoinColumn(name = "idgarantie", referencedColumnName = "idgarantie")
    @ManyToOne(fetch = FetchType.LAZY)
    private Garantie idgarantie;
    @JoinColumn(name = "idgroupe", referencedColumnName = "idgroupe")
    @ManyToOne(fetch = FetchType.LAZY)
    private Groupe idgroupe;
    @JoinColumn(name = "idmodeayement", referencedColumnName = "idmodeayement")
    @ManyToOne(fetch = FetchType.LAZY)
    private Modepayement idmodeayement;
    @JoinColumn(name = "idproducteur", referencedColumnName = "idproducteur")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producteur idproducteur;
    @JoinColumn(name = "idtypecontrat", referencedColumnName = "idtypecontrat")
    @ManyToOne(fetch = FetchType.LAZY)
    private Typecontrat idtypecontrat;
    @OneToMany(mappedBy = "numpolice", fetch = FetchType.LAZY)
    private List<Coassurance> coassuranceList;
    @OneToMany(mappedBy = "numpolice", fetch = FetchType.LAZY)
    private List<Reassurance> reassuranceList;

    public Contrat() {
    }

    public Contrat(Integer numpolice) {
        this.numpolice = numpolice;
    }

    public Contrat(Integer numpolice, Date dateeffet, Date dateexp, long capitgarantitotale, String caracterecontrat) {
        this.numpolice = numpolice;
        this.dateeffet = dateeffet;
        this.dateexp = dateexp;
        this.capitgarantitotale = capitgarantitotale;
        this.caracterecontrat = caracterecontrat;
    }

    public Integer getNumpolice() {
        return numpolice;
    }

    public void setNumpolice(Integer numpolice) {
        this.numpolice = numpolice;
    }

    public Date getDateeffet() {
        return dateeffet;
    }

    public void setDateeffet(Date dateeffet) {
        this.dateeffet = dateeffet;
    }

    public Date getDateexp() {
        return dateexp;
    }

    public void setDateexp(Date dateexp) {
        this.dateexp = dateexp;
    }

    public Date getDatesaisie() {
        return datesaisie;
    }

    public void setDatesaisie(Date datesaisie) {
        this.datesaisie = datesaisie;
    }

    public Long getTauxremise() {
        return tauxremise;
    }

    public void setTauxremise(Long tauxremise) {
        this.tauxremise = tauxremise;
    }

    public String getEtatcontrat() {
        return etatcontrat;
    }

    public void setEtatcontrat(String etatcontrat) {
        this.etatcontrat = etatcontrat;
    }

    public long getCapitgarantitotale() {
        return capitgarantitotale;
    }

    public void setCapitgarantitotale(long capitgarantitotale) {
        this.capitgarantitotale = capitgarantitotale;
    }

    public long getPrimesiliation() {
        return primesiliation;
    }

    public void setPrimesiliation(long primesiliation) {
        this.primesiliation = primesiliation;
    }
    

    public Long getPrimemontant() {
        return primemontant;
    }

    public void setPrimemontant(Long primemontant) {
        this.primemontant = primemontant;
    }

    public Long getPrimettc() {
        return primettc;
    }

    public void setPrimettc(Long primettc) {
        this.primettc = primettc;
    }

    public String getCaracterecontrat() {
        return caracterecontrat;
    }

    public void setCaracterecontrat(String caracterecontrat) {
        this.caracterecontrat = caracterecontrat;
    }

    public Long getCommisapporteur() {
        return commisapporteur;
    }

    public void setCommisapporteur(Long commisapporteur) {
        this.commisapporteur = commisapporteur;
    }

    public String getRapportmedical() {
        return rapportmedical;
    }

    public void setRapportmedical(String rapportmedical) {
        this.rapportmedical = rapportmedical;
    }

    @XmlTransient
    public List<Dossiersinistre> getDossiersinistreList() {
        return dossiersinistreList;
    }

    public void setDossiersinistreList(List<Dossiersinistre> dossiersinistreList) {
        this.dossiersinistreList = dossiersinistreList;
    }

    public Apporteur getCodeapp() {
        return codeapp;
    }

    public void setCodeapp(Apporteur codeapp) {
        this.codeapp = codeapp;
    }

    public Assures getCodassure() {
        return codassure;
    }

    public void setCodassure(Assures codassure) {
        this.codassure = codassure;
    }

    public Garantie getIdgarantie() {
        return idgarantie;
    }

    public void setIdgarantie(Garantie idgarantie) {
        this.idgarantie = idgarantie;
    }

    public Groupe getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(Groupe idgroupe) {
        this.idgroupe = idgroupe;
    }

    public Modepayement getIdmodeayement() {
        return idmodeayement;
    }

    public void setIdmodeayement(Modepayement idmodeayement) {
        this.idmodeayement = idmodeayement;
    }

    public Producteur getIdproducteur() {
        return idproducteur;
    }

    public void setIdproducteur(Producteur idproducteur) {
        this.idproducteur = idproducteur;
    }

    public Typecontrat getIdtypecontrat() {
        return idtypecontrat;
    }

    public void setIdtypecontrat(Typecontrat idtypecontrat) {
        this.idtypecontrat = idtypecontrat;
    }

    @XmlTransient
    public List<Coassurance> getCoassuranceList() {
        return coassuranceList;
    }

    public void setCoassuranceList(List<Coassurance> coassuranceList) {
        this.coassuranceList = coassuranceList;
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
        hash += (numpolice != null ? numpolice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrat)) {
            return false;
        }
        Contrat other = (Contrat) object;
        if ((this.numpolice == null && other.numpolice != null) || (this.numpolice != null && !this.numpolice.equals(other.numpolice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c2a.vie.entities.Contrat[ numpolice=" + numpolice + " ]";
    }
    
}
