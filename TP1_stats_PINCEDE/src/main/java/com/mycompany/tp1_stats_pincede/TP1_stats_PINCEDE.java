/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_stats_pincede;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edess
 */
public class TP1_stats_PINCEDE {

    public static void main(String[] args) {
        Random generateurAleat = new Random(); 
     int tab[];
     tab = new int[6];
     for(int i = 0; i < 6; i++)
         tab[i]=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Saisissez un nombre compris entre 1 et 6");
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
            int resultat = generateurAleat.nextInt(6); // Génère un nombre entre 0 et 5 
            tab[resultat]++;
    }
   
    for(int i = 0; i < 6; i++)
        System.out.println(tab[i]);
 System.out.println("Résultats des lancers de dés :");
        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + " : " + tab[i] + " fois.");
        }
        
    
        System.out.println("Résultats en pourcentage :");
        for (int i = 0; i < 6; i++) { 
            double pourcentage = (double) tab[i] / m * 100; // Calcul du pourcentage
            System.out.printf("Face %d : %.2f%%\n", (i + 1), pourcentage); //printf permet d'afficher du texte formaté, %% affiche littéralement, %d signifie qu'on va insérer un int, i+1 car i varie de 0 à 5 et non de 1 à 6
        }
    }
}
         
    
     
  