/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_pincede;

/**
 *
 * @author Edess
 */
public abstract class Arme {
   private String nom;
   private int Nattaque;

    public Arme(String nom, int N_attaque) {
        this.nom = nom;
        if (Nattaque<=100){
            this.Nattaque = Nattaque;
                    
        } else{
            this.Nattaque = 100;
        }
        
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNattaque() {
        return Nattaque;
    }

    public void setNattaque(int Nattaque) {
        this.Nattaque = Nattaque;
    }
   
   
   
   
    

    
    
}
