/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Edess
 */
public class Magicien extends Personnage {
    
    boolean confirme;

    //On crée le constructeur associé
    public Magicien(String nom,  int vie,boolean confirme) {
        super(nom, vie);
        this.confirme = confirme;
    }

    //On crée le setter pour modifier la valeur du booléen
    public void setconfirmé(boolean confirme) {
        this.confirme = confirme;
    }
    
    
    
}
