/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_pincede;

/**
 *
 * @author Edess
 */
public class Epee extends Arme {
    
    int finesse; 

    public Epee(int finesse, String nom, int N_attaque) {
        super(nom, N_attaque);
        if (finesse<=100){
           this.finesse = finesse;
        } else {
            this.finesse = 100;
        }
        
    }
    
    
}
