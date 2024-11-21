package Personnages;

import java.util.ArrayList;
import Armes.Arme;
import tp3_heroic_fantasy_pincede.etreVivant;
import Armes.Baton;
import Armes.Epee;
import Personnages.Guerrier;

abstract public class Personnage implements etreVivant {

    private String nom;
    public int vie;
    private ArrayList<Arme> sac; // Liste pour contenir les armes
    private Arme armePortee; // Arme actuellement équipée
    private int nbpersonnages = 0;

    // Constructeur
    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;

        // Initialisation du sac avec 5 emplacements vides (null)
        sac = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sac.add(null);
        }
    }

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Personnage{" + "nom='" + nom + '\'' + ", vie=" + vie + " Arme portée=" + armePortee + '}';
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    // Méthode pour ajouter une arme dans le sac
    public void ajouterArme(Arme nouvelleArme) {
        for (int i = 0; i < sac.size(); i++) {
            if (sac.get(i) == null) { // Trouve un emplacement vide
                sac.set(i, nouvelleArme);
                System.out.println(nouvelleArme.getNom() + " a été ajoutée au sac.");
                return;
            }
        }
        System.out.println("Le sac est plein. Impossible d'ajouter une nouvelle arme.");
    }

    // Méthode pour équiper une arme
    public void Equiper(Arme nomArme) {
        for (Arme arme : sac) {
            if (arme != null && arme.getNom().equals(nomArme)) {
                armePortee = arme;
                System.out.println(nomArme + " a été équipée.");
                return;
            }
        }
        System.out.println("L'arme " + nomArme + " n'a pas été trouvée dans le sac.");
    }

    // Méthode pour récupérer l'arme équipée
    public Arme getArmeEnMain() {
        return armePortee;
    }

    public int getNbpersonnages() {
        return nbpersonnages;
    }

    public void seFatiguer() {
        this.vie -= 10;  // La fatigue réduit la vie du personnage
        System.out.println(this.nom + " se fatigue et perd 10 points de vie.");
    }

    public boolean estVivant() {
        return vie > 0;  // Un personnage est vivant si sa vie est positive
    }

    public void estAttaqué(int points) {
        this.vie -= points;
        System.out.println(this.nom + " a été attaqué et perd " + points + " points de vie.");
    }

    public void attaquer(Personnage cible) {
    if (this.armePortee != null) {
        int degats = 0;

        // Vérification du type de personnage et application des règles spécifiques
        if (this instanceof Guerrier) {
            // Un Guerrier utilise une épée
            if (armePortee instanceof Epee) {
                degats = 30 * ((Epee) armePortee).getMultiplicateur(); // Multiplier par la finesse de l'épée
            }
            if (((Guerrier) this).isCheval()) {
                degats /= 2;  // Diviser par 2 si le Guerrier est à cheval
            }
        } else if (this instanceof Magicien) {
            // Un Magicien utilise un bâton
            if (armePortee instanceof Baton) {
                degats = 20 * ((Baton) armePortee).getMultiplicateur(); // Multiplier par l'âge du bâton
            }
            if (((Magicien) this).isConfirme()) {
                degats /= 2;  // Diviser par 2 si le Magicien est confirmé
            }
        }

        // Appliquer les dégâts à la cible
        cible.estAttaqué(degats);
        System.out.println(this.nom + " attaque " + cible.nom + " et lui fait perdre " + degats + " points de vie.");

        // Fatigue du personnage après l'attaque
        this.seFatiguer();
    } else {
        System.out.println(this.nom + " ne peut pas attaquer, car il n'a pas d'arme équipée.");
    }
    }
}