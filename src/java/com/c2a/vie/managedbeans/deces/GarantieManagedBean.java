package com.c2a.vie.managedbeans.deces;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import com.c2a.vie.entities.Garantie;
import com.c2a.vie.service.deces.GarantieServiceBeanLocal;
import java.util.ArrayList;

/**
 *
 * @author K.M.A
 */
@ManagedBean(name = "garantieManagedBean")
@ViewScoped
public class GarantieManagedBean  implements Serializable{

    @EJB
    private GarantieServiceBeanLocal garantieService;
    private Garantie formGarantie = new Garantie();
    private Garantie selectedGarantie;
    private List<Garantie> dataListGarantie;
private Boolean desactiverBoutonSuppr = true, desactiverCode;
    private int index;
    /**
     * Creates a new instance of GarantieManagedBean
     */
    public GarantieManagedBean() {
     formGarantie = new Garantie();
     selectedGarantie = new Garantie();
    dataListGarantie = new ArrayList<Garantie>();
    }
    
    public void enregistrer(){
        if(selectedGarantie != null){
            garantieService.modifier(formGarantie);
        }else{
            garantieService.ajouter(formGarantie);
        }
    }
    
    public void effacer(){
        formGarantie = new Garantie();
        selectedGarantie = null;
    }
    
    public void supprimer(){
        if(selectedGarantie != null){
            garantieService.supprimer(selectedGarantie);
        }
    }

 public void rowSelected() {
        formGarantie = selectedGarantie;
        this.desactiverCode = true;
        this.index = this.dataListGarantie.indexOf(this.selectedGarantie);
        this.desactiverBoutonSuppr = false;
    }    public Garantie getFormGarantie() {
        return formGarantie;
    }

    public void setFormGarantie(Garantie formGarantie) {
        this.formGarantie = formGarantie;
    }

    public Garantie getSelectedGarantie() {
        return selectedGarantie;
    }

    public void setSelectedGarantie(Garantie selectedGarantie) {
        this.selectedGarantie = selectedGarantie;
    }

    public List<Garantie> getDataListGarantie() {
        return dataListGarantie;
    }

    public void setDataListGarantie(List<Garantie> dataListGarantie) {
        this.dataListGarantie = dataListGarantie;
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
