package com.c2a.vie.managedbeans.deces;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import com.c2a.vie.entities.Typeapporteur;
import com.c2a.vie.service.deces.TypeapporteurServiceBeanLocal;
import java.util.ArrayList;

/**
 *
 * @author K.M.A
 */
@ManagedBean(name = "typeapporteurManagedBean")
@ViewScoped
public class TypeapporteurManagedBean  implements Serializable{

    @EJB
    private TypeapporteurServiceBeanLocal typeapporteurService;
    private Typeapporteur formTypeapporteur = new Typeapporteur();
    private Typeapporteur selectedTypeapporteur;
    private List<Typeapporteur> dataListTypeapporteur;
private Boolean desactiverBoutonSuppr = true, desactiverCode;
    private int index;
    /**
     * Creates a new instance of TypeapporteurManagedBean
     */
    public TypeapporteurManagedBean() {
     formTypeapporteur = new Typeapporteur();
     selectedTypeapporteur = new Typeapporteur();
    dataListTypeapporteur = new ArrayList<Typeapporteur>();
    }
    
    public void enregistrer(){
        if(selectedTypeapporteur != null){
            typeapporteurService.modifier(formTypeapporteur);
        }else{
            typeapporteurService.ajouter(formTypeapporteur);
        }
    }
    
    public void effacer(){
        formTypeapporteur = new Typeapporteur();
        selectedTypeapporteur = null;
    }
    
    public void supprimer(){
        if(selectedTypeapporteur != null){
            typeapporteurService.supprimer(selectedTypeapporteur);
        }
    }

 public void rowSelected() {
        formTypeapporteur = selectedTypeapporteur;
        this.desactiverCode = true;
        this.index = this.dataListTypeapporteur.indexOf(this.selectedTypeapporteur);
        this.desactiverBoutonSuppr = false;
    }    public Typeapporteur getFormTypeapporteur() {
        return formTypeapporteur;
    }

    public void setFormTypeapporteur(Typeapporteur formTypeapporteur) {
        this.formTypeapporteur = formTypeapporteur;
    }

    public Typeapporteur getSelectedTypeapporteur() {
        return selectedTypeapporteur;
    }

    public void setSelectedTypeapporteur(Typeapporteur selectedTypeapporteur) {
        this.selectedTypeapporteur = selectedTypeapporteur;
    }

    public List<Typeapporteur> getDataListTypeapporteur() {
        return dataListTypeapporteur;
    }

    public void setDataListTypeapporteur(List<Typeapporteur> dataListTypeapporteur) {
        this.dataListTypeapporteur = dataListTypeapporteur;
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
