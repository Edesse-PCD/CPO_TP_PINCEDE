/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_guessmynumber_pincede;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edess
 */
public class TP1_guessMyNumber_PINCEDE {

    public static void main(String[] args) {
    Random generateurAleat = new Random(); 
    Scanner sc = new Scanner(System.in);
    int n = 0; // je déclare la valeur aléatoire que va prendre mon code pour qu'elle existe ailleurs que dans mes boucles if 
    int nbu=0; //je crée la variable nombre utilisateur 
    int cpt=0;  //je crée la variable compteur 
    int val_max = 0; // je crée une variable qui définit la valeur max de ma valeur aléatoire 
    System.out.println("Choisissez la difficulté : 1,2 ou 3");
    int difficulte = sc.nextInt();
    if (difficulte==1){
        n = generateurAleat.nextInt(10);
        val_max=10;
    }
    if (difficulte == 2){
        n = generateurAleat.nextInt(100);
        val_max=100;
    }
    if (difficulte==3){
       n = generateurAleat.nextInt(1000);
       val_max=1000; 
    }
    while (n!=nbu){
    System.out.println("Saissez un nombre compris entre 1 et "+val_max+"");
    nbu = sc.nextInt(); // je nomme la valeur saisie par l'utilisateur nbu en référence à "nombre utilisateur"
    if (nbu<n) {
        System.out.println("trop petit");
    }
    if (nbu>n) {
        System.out.println("trop grand");
    }
    if (nbu==n) {
        System.out.println("gagné");
    
    }
     cpt+=1; 
    }  
}
}
