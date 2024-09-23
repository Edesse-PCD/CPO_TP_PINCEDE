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
public static double FarenheitVersCelcius(double tFarenheit){
    tFarenheit = (tFarenheit-32)/1.8;
    return tFarenheit;
}

public static double CelciusVersFarenheit (double tCelcius){
    tCelcius = (tCelcius*9/5)+32;
    return tCelcius;
}

public static double KelvinVersFarenheit (double tCelcius){
    tCelcius+= -273+CelciusVersFarenheit(tCelcius) ;
    return tCelcius;
}


public static double FarenheitVersKelvin (double tFarenheit){
    tFarenheit+= +273+ FarenheitVersCelcius(tFarenheit);
    return tFarenheit;
}



    public static void main(String[] args) {
//1
Scanner sc = new Scanner(System.in);
System.out.println("Bonjour, saisissez une valeur:\n");
double valeur = sc.nextDouble(); // je crée ma variable nommée valeur, l'utilisateur lui attribue une variable
System.out.println(valeur); // j'affiche cette valeur 

System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n1)De Celcius vers Kelvin \n2)De Kelvin vers Celcius  \n3)De Celcius vers Farenheit \n4)De Kelvin vers Farenheit \n5)De Farenheit vers Kelvin \n6)De Farenheit vers Kelvin" );
int conversion = sc.nextInt();
/*2)
double valeur_K = valeur + 273; // je crée ma nouvelle valeur qui convertir les celsius en kelvin
System.out.println(valeur_K); // je l'affiche 


//3) Cette fois ci, j'utilise la méthode que j'ai créée

System.out.println("La valeur convertit en kelvin vaut "+CelciusVersKelvin(valeur)+"");
*/

// A present je vais crer un algorithme permettant de déterminer comment fomruler la phrase 

switch (conversion){ //J'utilise switch pour alléger mon code 
    case 1: System.out.println(""+valeur+" degrés Celcius est égal à "+CelciusVersKelvin(valeur)+" degres Kelvin");break; //Je prends la valeur et je la convertis en fonction de ce que demande l'utilisateur 
    case 2: System.out.println(""+valeur+" degrés Farenheit est égal à "+FarenheitVersCelcius(valeur)+" degres Celcius");break; //Je répète l'opération pour chaque conversions.
    case 3: System.out.println(""+valeur+" degrés Celcius est égal à "+CelciusVersFarenheit(valeur)+" degres Farenheit");break;
    case 4: System.out.println(""+valeur+" degré Kelvin est égal à "+KelvinVersFarenheit(valeur)+" degres Farenheit");break;
    case 5: System.out.println(""+valeur+" degré Farenheit est égal à "+FarenheitVersKelvin(valeur)+" degres Kelvin");break;
}
        


        
    }
}
