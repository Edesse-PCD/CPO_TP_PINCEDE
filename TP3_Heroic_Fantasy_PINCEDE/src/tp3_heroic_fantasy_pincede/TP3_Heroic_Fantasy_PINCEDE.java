/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_pincede;
import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Arme;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author Edess
 */
public class TP3_Heroic_Fantasy_PINCEDE {

    /**
     * @param args the command line arguments
     */
    
    //1.3
    
    //11
    public static void main(String[] args) {
        Epee Exca  = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        Baton Chene = new Baton("Chêne",4,5);
        Baton Charme = new Baton("Charme",5,6);
        
    //12   
        ArrayList<Arme> inventaire = new ArrayList<Arme>();
        inventaire.add(Exca);
        inventaire.add(Durandal);
        inventaire.add(Chene);
        inventaire.add(Charme);
        
       
   //13
       for (int i = 0; i < inventaire.size(); i++) {
           System.out.println(inventaire.get(i));      
    }
    //26 Création des magiciens 
     Magicien Gandalf = new Magicien("Gandalf",65,true);  
     Magicien Garcimore = new Magicien("Garcimore",44,false);
     
     //27 Créations des guerriers 
     
     Guerrier Conan = new Guerrier("Conan",78,false);
     Guerrier Lannister = new Guerrier("Lannister",45,true);
     //28 Création du tableau dynamique 
     //On crée d'abord notre tableau nommé personnages 
      ArrayList<Personnage>  personnages = new ArrayList<Personnage>();
     
      //On ajoute tous nos personnages 
      personnages.add(Conan);
      personnages.add(Lannister);
      personnages.add(Gandalf);
      personnages.add(Garcimore);
     //On affiche le tableau  
      System.out.println(personnages);
     
     
     
   
              
              
              
              
              
       
     
     
     
    }
}
