package com.c2a.vie.managedbeans.deces;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import com.c2a.vie.entities.Apporteur;
import com.c2a.vie.service.deces.ApporteurServiceBeanLocal;
import java.util.ArrayList;

/**
 *
 * @author K.M.A
 */
@ManagedBean(name = "apporteurManagedBean")
@ViewScoped
public class ApporteurManagedBean  implements Serializable{

    @EJB
    private ApporteurServiceBeanLocal apporteurService;
    private Apporteur formApporteur = new Apporteur();
    private Apporteur selectedApporteur;
    private List<Apporteur> dataListApporteur;
private Boolean desactiverBoutonSuppr = true, desactiverCode;
    private int index;
    /**
     * Creates a new instance of ApporteurManagedBean
     */
    public ApporteurManagedBean() {
     formApporteur = new Apporteur();
     selectedApporteur = new Apporteur();
    dataListApporteur = new ArrayList<Apporteur>();
    }
    
    public void enregistrer(){
        if(selectedApporteur != null){
            apporteurService.modifier(formApporteur);
        }else{
            apporteurService.ajouter(formApporteur);
        }
    }
    
    public void effacer(){
        formApporteur = new Apporteur();
        selectedApporteur = null;
    }
    
    public void supprimer(){
        if(selectedApporteur != null){
            apporteurService.supprimer(selectedApporteur);
        }
    }

 public void rowSelected() {
        formApporteur = selectedApporteur;
        this.desactiverCode = true;
        this.index = this.dataListApporteur.indexOf(this.selectedApporteur);
        this.desactiverBoutonSuppr = false;
    }    public Apporteur getFormApporteur() {
        return formApporteur;
    }

    public void setFormApporteur(Apporteur formApporteur) {
        this.formApporteur = formApporteur;
    }

    public Apporteur getSelectedApporteur() {
        return selectedApporteur;
    }

    public void setSelectedApporteur(Apporteur selectedApporteur) {
        this.selectedApporteur = selectedApporteur;
    }

    public List<Apporteur> getDataListApporteur() {
        return dataListApporteur;
    }

    public void setDataListApporteur(List<Apporteur> dataListApporteur) {
        this.dataListApporteur = dataListApporteur;
    }
    
 public Boolean isDesactiverBoutonSuppr() {
        return desactiverBoutonSuppr;
    }

    public void setDesactiverBoutonSuppr(Boolean desactiverBoutonSuppr) {
        this.desactiverBoutonSuppr = desactiverBoutonSuppr;
    }

    public Boolean isDesactiverCode() {
        return desactiverCode;
    }

    public void setDesactiverCode(Boolean desactiverCode) {
        this.desactiverCode = desactiverCode;
    }
}
