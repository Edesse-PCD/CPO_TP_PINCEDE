/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;

/**
 *
 * @author Edess
 */
public class Guerrier extends Personnage{
    
//23    
    boolean cheval;
    
//24
    public Guerrier(String nom, int vie, boolean cheval) {
        super(nom, vie);
        this.cheval = cheval;
    }
    
//25
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    

    
    
    
}
