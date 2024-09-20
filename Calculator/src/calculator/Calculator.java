/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
Noms : PINCEDE Edesse
Groupe : TDB 
Rôle du programme : TP0
Date : 20/09/2024**/
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("1)Add \n2)Susbtract \n3)Multiply \n4)Divide \n5)Modulo");
     int operateur;
     Scanner sc = new Scanner(System.in);
     System.out.println("\n Entrer l'operateur que vous souhaitez utiliser :");
    
     operateur=sc.nextInt();
      if (operateur<1)
          System.out.println("Erreur");
           System.exit(0);
       if (operateur>5)
          System.out.println("Erreur");
           System.exit(0);
      
     

 
 
  System.out.println("\n Entrer une première valeur :");
  int operande1;
  operande1=sc.nextInt();
  
    System.out.println("\n Entrer une deuxième valeur :");
  int operande2;
  operande2=sc.nextInt();
  
  if (operateur == 1){
      System.out.println("Le resultat vaut "+(operande1 + operande2)+"");
      
    }
  if (operateur == 2){
      System.out.println("Le resultat vaut "+ (operande1-operande2)+"");
      
    }
   if (operateur == 3){
      System.out.println("Le resultat vaut "+ (operande1*operande2)+"");
    }
     if (operateur == 4){
      System.out.println("Le resultat vaut "+ (operande1*operande2)+"");
    }
       if (operateur == 5){
      System.out.println("Le resultat vaut "+ (operande1%operande2)+"");
    }
  }
}