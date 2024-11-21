/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Edess
 */
public class Baton extends Arme {
    
    int age; 

    public Baton(String nom,int age,  int N_attaque) {
        super(nom, N_attaque);
        if (this.age<=100) this.age = age;
        else this.age=100;
        }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
        public int getMultiplicateur() {
        return age;  // Le multiplicateur est l'âge du bâton
    }

    }   

