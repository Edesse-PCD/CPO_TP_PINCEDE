/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_manipnombresint_pincede;

import java.util.Scanner;

/**
 *
 * @author Edess
 */
public class TP1_manipNombresInt_PINCEDE {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // j'importe un module me permettant de demander à l'utilisateur de rentrer des valeurs 
    System.out.println("Saisissez un premier nombre");
    int nombre1 = sc.nextInt(); // Je lui demande de saisir un premier nombre 
    
    System.out.println("Saisissez un deuxième nombre");     
    int nombre2 = sc.nextInt(); // Ici, un deuxième nombre 

    System.out.println(nombre1+" "+nombre2); // J'affiche les deux nombres à la suite 
    int Somme = nombre1+nombre2;
    int Difference = nombre1 - nombre2;
    int Produit = nombre1*nombre2;
    System.out.println("La somme vaut "+Somme+", la difference vaut "+Difference+", le produit vaut "+Produit+".");  
    int Quotient = nombre1/nombre2;
    int Reste = nombre1%nombre2;
    System.out.println("Le quotient vaut "+Quotient+", le reste de la divison euclidienne vaut "+Reste+".");  
    
        
        
    }
}
