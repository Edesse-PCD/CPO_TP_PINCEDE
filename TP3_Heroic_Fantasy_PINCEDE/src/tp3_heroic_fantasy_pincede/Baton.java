/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_pincede;

/**
 *
 * @author Edess
 */
public class Baton extends Arme {
    
    int age; 

    public Baton(int age, String nom, int N_attaque) {
        super(nom, N_attaque);
        if (this.age<=100) this.age = age;
        else this.age=100;
        }
    
    }   

