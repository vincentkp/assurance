package com.c2a.vie.managedbeans.deces;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import com.c2a.vie.entities.Reassureurs;
import com.c2a.vie.service.deces.ReassureursServiceBeanLocal;
import java.util.ArrayList;

/**
 *
 * @author K.M.A
 */
@ManagedBean(name = "reassureursManagedBean")
@ViewScoped
public class ReassureursManagedBean  implements Serializable{

    @EJB
    private ReassureursServiceBeanLocal reassureursService;
    private Reassureurs formReassureurs = new Reassureurs();
    private Reassureurs selectedReassureurs;
    private List<Reassureurs> dataListReassureurs;
private Boolean desactiverBoutonSuppr = true, desactiverCode;
    private int index;
    /**
     * Creates a new instance of ReassureursManagedBean
     */
    public ReassureursManagedBean() {
     formReassureurs = new Reassureurs();
     selectedReassureurs = new Reassureurs();
    dataListReassureurs = new ArrayList<Reassureurs>();
    }
    
    public void enregistrer(){
        if(selectedReassureurs != null){
            reassureursService.modifier(formReassureurs);
        }else{
            reassureursService.ajouter(formReassureurs);
        }
    }
    
    public void effacer(){
        formReassureurs = new Reassureurs();
        selectedReassureurs = null;
    }
    
    public void supprimer(){
        if(selectedReassureurs != null){
            reassureursService.supprimer(selectedReassureurs);
        }
    }

 public void rowSelected() {
        formReassureurs = selectedReassureurs;
        this.desactiverCode = true;
        this.index = this.dataListReassureurs.indexOf(this.selectedReassureurs);
        this.desactiverBoutonSuppr = false;
    }    public Reassureurs getFormReassureurs() {
        return formReassureurs;
    }

    public void setFormReassureurs(Reassureurs formReassureurs) {
        this.formReassureurs = formReassureurs;
    }

    public Reassureurs getSelectedReassureurs() {
        return selectedReassureurs;
    }

    public void setSelectedReassureurs(Reassureurs selectedReassureurs) {
        this.selectedReassureurs = selectedReassureurs;
    }

    public List<Reassureurs> getDataListReassureurs() {
        return dataListReassureurs;
    }

    public void setDataListReassureurs(List<Reassureurs> dataListReassureurs) {
        this.dataListReassureurs = dataListReassureurs;
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
