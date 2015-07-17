package com.c2a.vie.managedbeans.deces;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import com.c2a.vie.entities.Modepayement;
import com.c2a.vie.service.deces.ModepayementServiceBeanLocal;
import java.util.ArrayList;

/**
 *
 * @author K.M.A
 */
@ManagedBean(name = "modepayementManagedBean")
@ViewScoped
public class ModepayementManagedBean  implements Serializable{

    @EJB
    private ModepayementServiceBeanLocal modepayementService;
    private Modepayement formModepayement = new Modepayement();
    private Modepayement selectedModepayement;
    private List<Modepayement> dataListModepayement;
private Boolean desactiverBoutonSuppr = true, desactiverCode;
    private int index;
    /**
     * Creates a new instance of ModepayementManagedBean
     */
    public ModepayementManagedBean() {
     formModepayement = new Modepayement();
     selectedModepayement = new Modepayement();
    dataListModepayement = new ArrayList<Modepayement>();
    }
    
    public void enregistrer(){
        if(selectedModepayement != null){
            modepayementService.modifier(formModepayement);
        }else{
            modepayementService.ajouter(formModepayement);
        }
    }
    
    public void effacer(){
        formModepayement = new Modepayement();
        selectedModepayement = null;
    }
    
    public void supprimer(){
        if(selectedModepayement != null){
            modepayementService.supprimer(selectedModepayement);
        }
    }

 public void rowSelected() {
        formModepayement = selectedModepayement;
        this.desactiverCode = true;
        this.index = this.dataListModepayement.indexOf(this.selectedModepayement);
        this.desactiverBoutonSuppr = false;
    }    public Modepayement getFormModepayement() {
        return formModepayement;
    }

    public void setFormModepayement(Modepayement formModepayement) {
        this.formModepayement = formModepayement;
    }

    public Modepayement getSelectedModepayement() {
        return selectedModepayement;
    }

    public void setSelectedModepayement(Modepayement selectedModepayement) {
        this.selectedModepayement = selectedModepayement;
    }

    public List<Modepayement> getDataListModepayement() {
        return dataListModepayement;
    }

    public void setDataListModepayement(List<Modepayement> dataListModepayement) {
        this.dataListModepayement = dataListModepayement;
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
