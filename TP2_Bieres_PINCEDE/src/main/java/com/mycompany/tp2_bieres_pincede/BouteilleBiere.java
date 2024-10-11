/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_pincede;

/**
 *
 * @author Edess
 */
public class BouteilleBiere {
public void lireEtiquette() { 
System.out.println("Bouteille de " + nom +" (" + degreAlcool + 
" degres) \nBrasserie : " + brasserie ) ; 
}

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){ 
nom = unNom; 
degreAlcool = unDegre; 
brasserie = uneBrasserie; 
ouverte = false; 
} 
public boolean Decapsuler(){
    if (ouverte ==false){
        ouverte=true;
        return true;
    }
    if (ouverte ==true){
        System.out.println("erreur, biere deja ouverte");
        return false; 
    }
    return Decapsuler();
    
}
@Override 
public String toString() { 
String chaine_a_retourner; 
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) ouverte ? ";   
if (ouverte == true ) chaine_a_retourner += "oui" ; 
else chaine_a_retourner += "non" ; 
return chaine_a_retourner ;  
}
}

    


 






