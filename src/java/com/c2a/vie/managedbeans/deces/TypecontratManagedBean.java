package com.c2a.vie.managedbeans.deces;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import com.c2a.vie.entities.Typecontrat;
import com.c2a.vie.service.deces.TypecontratServiceBeanLocal;
import java.util.ArrayList;

/**
 *
 * @author K.M.A
 */
@ManagedBean(name = "typecontratManagedBean")
@ViewScoped
public class TypecontratManagedBean  implements Serializable{

    @EJB
    private TypecontratServiceBeanLocal typecontratService;
    private Typecontrat formTypecontrat = new Typecontrat();
    private Typecontrat selectedTypecontrat;
    private List<Typecontrat> dataListTypecontrat;
private Boolean desactiverBoutonSuppr = true, desactiverCode;
    private int index;
    /**
     * Creates a new instance of TypecontratManagedBean
     */
    public TypecontratManagedBean() {
     formTypecontrat = new Typecontrat();
     selectedTypecontrat = new Typecontrat();
    dataListTypecontrat = new ArrayList<Typecontrat>();
    }
    
    public void enregistrer(){
        if(selectedTypecontrat != null){
            typecontratService.modifier(formTypecontrat);
        }else{
            typecontratService.ajouter(formTypecontrat);
        }
    }
    
    public void effacer(){
        formTypecontrat = new Typecontrat();
        selectedTypecontrat = null;
    }
    
    public void supprimer(){
        if(selectedTypecontrat != null){
            typecontratService.supprimer(selectedTypecontrat);
        }
    }

 public void rowSelected() {
        formTypecontrat = selectedTypecontrat;
        this.desactiverCode = true;
        this.index = this.dataListTypecontrat.indexOf(this.selectedTypecontrat);
        this.desactiverBoutonSuppr = false;
    }    public Typecontrat getFormTypecontrat() {
        return formTypecontrat;
    }

    public void setFormTypecontrat(Typecontrat formTypecontrat) {
        this.formTypecontrat = formTypecontrat;
    }

    public Typecontrat getSelectedTypecontrat() {
        return selectedTypecontrat;
    }

    public void setSelectedTypecontrat(Typecontrat selectedTypecontrat) {
        this.selectedTypecontrat = selectedTypecontrat;
    }

    public List<Typecontrat> getDataListTypecontrat() {
        return dataListTypecontrat;
    }

    public void setDataListTypecontrat(List<Typecontrat> dataListTypecontrat) {
        this.dataListTypecontrat = dataListTypecontrat;
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
