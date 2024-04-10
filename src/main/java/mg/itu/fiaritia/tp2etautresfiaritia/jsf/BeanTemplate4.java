/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.fiaritia.tp2etautresfiaritia.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raham
 */
@Named(value = "beantemplate4")
@RequestScoped
public class BeanTemplate4 {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    /**
     * Afficher le résultat correcte en prenant en compte le nombre saisi par l'user.
     * @return String
     */
    public String afficher() {
        return "affichage__4?nb="+nombre+"&faces-redirect=true";
    }
    
    /**
     * Creates a new instance of Bean
     */
    public BeanTemplate4() {
    }

}
