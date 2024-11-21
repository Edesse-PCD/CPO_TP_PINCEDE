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
    
    //1.3 Création des objets
    public static void main(String[] args) {
        
        //11 Création des armes
        Epee Exca  = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        Baton Chene = new Baton("Chêne", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        
        //12 Ajout des armes dans l'inventaire
        ArrayList<Arme> inventaire = new ArrayList<Arme>();
        inventaire.add(Exca);
        inventaire.add(Durandal);
        inventaire.add(Chene);
        inventaire.add(Charme);
        
        //13 Affichage de l'inventaire
        for (int i = 0; i < inventaire.size(); i++) {
            System.out.println(inventaire.get(i));      
        }
        
        //26 Création des magiciens
        Magicien Gandalf = new Magicien("Gandalf", 65, true);  
        Magicien Garcimore = new Magicien("Garcimore", 44, false);
     
        //27 Création des guerriers
        Guerrier Conan = new Guerrier("Conan", 78, false);
        Guerrier Lannister = new Guerrier("Lannister", 45, true);
        
        //28 Création du tableau dynamique de personnages
        ArrayList<Personnage> personnages = new ArrayList<Personnage>();
        personnages.add(Conan);
        personnages.add(Lannister);
        personnages.add(Gandalf);
        personnages.add(Garcimore);
        
        // Affichage des personnages
        System.out.println(personnages);
//38 
//Création des bâtons 
Baton Magique = new Baton("Magique", 4, 5);
Baton Erable = new Baton("Érable", 3, 6);
Baton Cerisier = new Baton("Cerisier", 5, 4);

//Création des épées 
Epee Gladius = new Epee("Gladius", 8, 4);
Epee Mortel = new Epee("Mortel", 6, 8);
Epee LameNoire = new Epee("Lame Noire", 5, 6);

//Création du magicien et du guerrier 
Magicien Morgane = new Magicien("Morgane", 55, false);
Guerrier Aragon = new Guerrier("Aragorn", 80, true);


Morgane.ajouterArme(Gladius);
Morgane.ajouterArme(Mortel);
Morgane.ajouterArme(Magique);

Morgane.Equiper(Mortel);





    }
}
   