/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Controller;

import fr.ufrsciencestech.panier.Modele.Panier;
import fr.ufrsciencestech.panier.Modele.Orange;
import fr.ufrsciencestech.panier.View.VueGswing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jd790080
 */
public class Controler implements ActionListener{
    private Panier p;
    private VueGswing vue;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();
        if(b.equals(vue.getjButton2())){
            p.putOrange(new Orange(1,"Allemagne"));
        }
        if(b.equals(vue.getjButton3())){
            p.retire();
        }
    }

    /**
     * @param p the p to set
     */
    public void setP(Panier p) {
        this.p = p;
    }

    /**
     * @param vue the vue to set
     */
    public void setVue(VueGswing vue) {
        this.vue = vue;
    }
    
    
    
}