package tp2_relation_1_pincede_edesse_carrera_valentin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edess
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    
    Voiture[] liste_voitures;
    

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        liste_voitures = new Voiture [3];
        nbVoitures=0;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
  public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
       
      
        if (voiture_a_ajouter.Proprietaire != null) {
            System.out.println("Erreur : La voiture est déjà possédée !");
            return false;
        }
        
        
        if (nbVoitures >= 3) {
            System.out.println("Erreur : Le propriétaire possède déjà 3 voitures.");
            return false;
        }

   
        liste_voitures[nbVoitures] = voiture_a_ajouter;

 
        nbVoitures++;

        
        voiture_a_ajouter.Proprietaire = this;

       
        return true;
    }

   
    public void afficher_voitures() {
        System.out.println("Voitures possédées par " + nom + " : ");
        for (int i = 0; i < nbVoitures; i++) {
            System.out.println("- " + liste_voitures[i].Modele);
        }
    }
}
    
    

