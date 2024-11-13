/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author Edess
 */
public class Epee extends Arme {
    
    int finesse; 

    public Epee(String nom,int finesse,  int N_attaque) {
        super(nom, N_attaque);
        if (finesse<=100){
           this.finesse = finesse;
        } else {
            this.finesse = 100;
        }
        
    }

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + finesse + '}';
    }

        
    }
    
    

