/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_pincede_edesse_carrera_valentin;

/**
 *
 * @author Edess
 */
public class TP2_relation_1_PINCEDE_Edesse_CARRERA_Valentin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
Personne bob = new Personne("Bobby", "Sixkiller"); 
Personne reno = new Personne("Reno", "Raines"); 
System.out.println("liste des voitures disponibles "+ uneClio  + 
"\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra ); 
    bob.liste_voitures[0] = uneClio ; 
    bob.nbVoitures = 1 ; 
    uneClio.Proprietaire = bob ;
    
    bob.liste_voitures[1] = uneAutreClio ; 
    bob.nbVoitures = 2 ; 
    uneAutreClio.Proprietaire = bob ;
    
    reno.liste_voitures[0] = une2008 ; 
    reno.nbVoitures = 1 ; 
    une2008.Proprietaire = reno ;
    
    reno.liste_voitures[1] = uneMicra ; 
    reno.nbVoitures = 2 ; 
    uneMicra.Proprietaire = reno ;
    
    
    
    
    System.out.println("les voitures de bob sont " + 
    bob.liste_voitures[0]+"et"+bob.liste_voitures[1] ) ; 
    
    System.out.println("les voitures de reno sont " + reno.liste_voitures[0] + " et " + reno.liste_voitures[1] + " ");
    

    }  
}
