package com.c2a.vie.managedbeans.deces;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import com.c2a.vie.entities.Compterreass;
import com.c2a.vie.service.deces.CompterreassServiceBeanLocal;
import java.util.ArrayList;

/**
 *
 * @author K.M.A
 */
@ManagedBean(name = "compterreassManagedBean")
@ViewScoped
public class CompterreassManagedBean  implements Serializable{

    @EJB
    private CompterreassServiceBeanLocal compterreassService;
    private Compterreass formCompterreass = new Compterreass();
    private Compterreass selectedCompterreass;
    private List<Compterreass> dataListCompterreass;
private Boolean desactiverBoutonSuppr = true, desactiverCode;
    private int index;
    /**
     * Creates a new instance of CompterreassManagedBean
     */
    public CompterreassManagedBean() {
     formCompterreass = new Compterreass();
     selectedCompterreass = new Compterreass();
    dataListCompterreass = new ArrayList<Compterreass>();
    }
    
    public void enregistrer(){
        if(selectedCompterreass != null){
            compterreassService.modifier(formCompterreass);
        }else{
            compterreassService.ajouter(formCompterreass);
        }
    }
    
    public void effacer(){
        formCompterreass = new Compterreass();
        selectedCompterreass = null;
    }
    
    public void supprimer(){
        if(selectedCompterreass != null){
            compterreassService.supprimer(selectedCompterreass);
        }
    }

 public void rowSelected() {
        formCompterreass = selectedCompterreass;
        this.desactiverCode = true;
        this.index = this.dataListCompterreass.indexOf(this.selectedCompterreass);
        this.desactiverBoutonSuppr = false;
    }    public Compterreass getFormCompterreass() {
        return formCompterreass;
    }

    public void setFormCompterreass(Compterreass formCompterreass) {
        this.formCompterreass = formCompterreass;
    }

    public Compterreass getSelectedCompterreass() {
        return selectedCompterreass;
    }

    public void setSelectedCompterreass(Compterreass selectedCompterreass) {
        this.selectedCompterreass = selectedCompterreass;
    }

    public List<Compterreass> getDataListCompterreass() {
        return dataListCompterreass;
    }

    public void setDataListCompterreass(List<Compterreass> dataListCompterreass) {
        this.dataListCompterreass = dataListCompterreass;
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
