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

//39
Aragon.ajouterArme(Gladius);
Aragon.ajouterArme(Mortel);
Aragon.ajouterArme(Magique);

//40
Morgane.Equiper(Cerisier);
Morgane.Equiper(Erable);
Morgane.Equiper(LameNoire);

System.out.println(Morgane);

Guerrier Mulan = new Guerrier("Mulan",50,true);
Magicien Merlin = new Magicien("Merlin",70,false);

Merlin.attaquer(Mulan);
System.out.println(Mulan);
if (Mulan.estVivant()==true) System.out.println("Mulan est vivant");
else System.out.println("Mulan est mort");

Mulan.attaquer(Merlin);
System.out.println(Merlin);
System.out.println(Mulan);



// pour 60 et 62 on a déjà défini des personnages que l'on va utiliser pour le combat 


//62
// Attribuer une épée et un bâton au Guerrier et au Magicien
Gandalf.ajouterArme(Chene);    // Ajouter le bâton "Chêne" au Magicien
Gandalf.ajouterArme(Charme);   // Ajouter le bâton "Charme" au Magicien

Conan.ajouterArme(Exca);  // Ajouter l'épée "Excalibur" au Guerrier
Conan.ajouterArme(Durandal);   // Ajouter l'épée "Durandal" au Guerrier

//63
// Choisir l'arme pour chaque personnage
Gandalf.Equiper(Chene);   // Équiper le bâton "Chêne" pour Gandalf
Conan.Equiper(Exca); // Équiper l'épée "Excalibur" pour Conan

//64
// Faire attaquer le Magicien
Gandalf.attaquer(Conan);  // Gandalf attaque Conan

// Visualiser les données des deux personnages
System.out.println(Gandalf);  // Afficher les informations sur Gandalf
System.out.println(Conan);    // Afficher les informations sur Conan

//65
// Faire attaquer le Guerrier
Conan.attaquer(Gandalf);    // Conan attaque Gandalf

// Visualiser les données des deux personnages après l'attaque
System.out.println(Gandalf);  // Afficher les informations sur Gandalf
System.out.println(Conan);    // Afficher les informations sur Conan

//66
// Vérifier si les personnages sont vivants après les attaques
if (Gandalf.estVivant()) {
    System.out.println("Gandalf est vivant");
} else {
    System.out.println("Gandalf est mort");
}

if (Conan.estVivant()) {
    System.out.println("Conan est vivant");
} else {
    System.out.println("Conan est mort");
}

}


    }
    

   