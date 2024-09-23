/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_convertisseur_pincede;

import java.util.Scanner;

/**
 *
 * @author Edess
 */
public class TP1_convertisseur_PINCEDE {
public static double CelciusVersKelvin (double tCelcius){
    tCelcius+= 273;
    return tCelcius;
}
public static double FareinheitVersCelcius(double tFareinheit){
    tFareinheit = (tFareinheit-32)/1.8;
    return tFareinheit;
}

public static double CelciusVersFareinheit (double tCelcius){
    tCelcius = (tCelcius*9/5)+32;
    return tCelcius;
}

public static double KelvinVersFareinheit (double tCelcius){
    tCelcius+= -273+CelciusVersFareinheit(tCelcius) ;
    return tCelcius;
}


public static double FareinheitVersKelvin (double tFareinheit){
    tFareinheit+= +273+ FareinheitVersCelcius(tFareinheit);
    return tFareinheit;
}



    public static void main(String[] args) {
//1
Scanner sc = new Scanner(System.in);
System.out.println("Bonjour, saisissez une valeur:\n");
double valeur = sc.nextDouble(); // je crée ma variable nommée valeur, l'utilisateur lui attribue une variable
System.out.println(valeur); // j'affiche cette valeur 

System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius  \n3)CelciusVersFarenheit() \n4)KelvinVersFarenheit() \n5)FarenheitVersKelvin() \n6) De Farenheit vers Kelvin" );

/*2)
double valeur_K = valeur + 273; // je crée ma nouvelle valeur qui convertir les celsius en kelvin
System.out.println(valeur_K); // je l'affiche 


//3) Cette fois ci, j'utilise la méthode que j'ai crée 

System.out.println("La valeur convertit en kelvin vaut "+CelciusVersKelvin(valeur)+"");
*/




        
    }
}
