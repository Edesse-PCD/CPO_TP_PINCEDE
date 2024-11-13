/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import java.util.ArrayList;
import Armes.Arme;
/**
 *
 * @author Edess
 */
abstract public class Personnage {
    String nom;
    int vie; 

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", vie=" + vie + '}';
    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }
    
 //3 Gestion des armes par le personnages 
     //3.1 Ajouter gestion des armes par les personnages 
    
     //31
     ArrayList<Arme>  Sac_à_dos  = new ArrayList<Arme>();
     
     //32 
     public void Arme_perso(Arme arme){
         
         if (Sac_à_dos.size()<=5){
             Sac_à_dos.add(arme);      
         }
         
        
         
     }
}
