/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_pincede;

/**
 *
 * @author Edess
 */
public class TP2_Bieres_PINCEDE {

    public static void main(String[] args) {
BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7,"Dubuisson"); ;
    uneBiere.nom="Cuvée des trolls";
    uneBiere.degreAlcool = 7.0 ; 
    uneBiere.brasserie = "Dubuisson";
    uneBiere.ouverte = true;
    uneBiere.lireEtiquette();
    
    
BouteilleBiere uneBiere2=new BouteilleBiere("Leffe",6.6,"Dubuisson");//je crée ma leffe
    uneBiere2.nom="Leffe";
    uneBiere2.degreAlcool = 6.6 ; 
    uneBiere2.brasserie = "Abbaye de Leffe";
    uneBiere2.ouverte = false;
    uneBiere2.lireEtiquette();
    
    
//Créons nos 3 autres bouteilles : 
BouteilleBiere uneBiere3 = new BouteilleBiere("Leffe Blonde", 6, "Abbaye de Leffe");
BouteilleBiere uneBiere4 = new BouteilleBiere("Chimay Bleue", 9, "Abbaye de Scourmont");
BouteilleBiere uneBiere5 = new BouteilleBiere("Heineken", 5, "Heineken International");
  uneBiere5.lireEtiquette();
  uneBiere3.lireEtiquette();
  uneBiere4.lireEtiquette();
  
 //Je teste ma fonction decapsuler
 //System.out.println(uneBiere2.Decapsuler());
 
 
 //Je teste ma classe toString()
  System.out.println(uneBiere2);
 System.out.println(uneBiere); //Je l'ai fermée pour voir ce que ça donne
    }
    
}
