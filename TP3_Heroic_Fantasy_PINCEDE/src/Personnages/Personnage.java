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

    
    
      //36 Méthode toString pour afficher les informations sur l'arme équipée
   

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
    //33 Méthode pour équiper une arme
    public void Equiper(Arme nomArme) {
        for (Arme arme : Sac) {
            if (arme != null && arme.getNom().equals(nomArme)) {
                ArmePortee = arme;
                System.out.println(nomArme + " a été équipée.");
                return;  
            }
        }
        System.out.println("L'arme " + nomArme + " n'a pas été trouvée dans l'inventaire.");
    }
  //31 Méthode pour ajouter une arme au sac
    ArrayList<Arme> Sac = new ArrayList<Arme>(5);  // Création du sac avec une capacité de 5 armes
     //34 La variable pour l'arme portée
    Arme ArmePortee = null;
    
   
    
    //35 Méthode pour récupérer l'arme en main
    public Arme getArme_en_main() {
        return ArmePortee;
    }

    public void ajouterArme(Arme nouvelleArme){
        for (int i =0;i<5;i++){
            
            if (Sac.get(i)==null){
                 Sac.set(i, nouvelleArme);
                 return;
            }else
            i+=1;
        }
    }
}
    
         
     
