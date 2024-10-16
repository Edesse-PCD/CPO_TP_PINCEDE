/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_pincede;

import java.util.Scanner;

/**
 *
 * @author Edess
 */
public class TP2_convertisseurObjet_Pincede {

   
    /**
     * @padram args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);  
     
    Convertisseur Convertisseur1 = new Convertisseur();
    Convertisseur1.CelciusVersKelvin (10);
    System.out.println(Convertisseur1.nbConversions);
    
    
    
    Convertisseur Convertisseur2 = new Convertisseur();
    Convertisseur2.FarenheitVersCelcius(10);
    Convertisseur2.FarenheitVersKelvin(10);
    System.out.println(Convertisseur2.nbConversions);
    
    
    //Maintenant, nous allons créer un programme permettant de faire n'importe quelle conversion 
    
    Convertisseur Convertisseur3 = new Convertisseur(); //Je cree mon objet convertisseur 
   //Celcius vers kelvin 
   System.out.println("Veuiller saisir la valeur que vous souhaitez convertir");
    double valeur = sc.nextDouble();
    
    
    System.out.println("Quelle conversion souhaitez vous faire ?"
            + "1 : Celcius vers kelvin "
            + "2 : Celcius vers Farenheit "
            + "3 : Farenheit vers Celcius "
            + "4: Farenheit vers Kelvin "
            + "5: Kelvin vers fareinheit "
            + "6: Kelvin vers Celcius");
    int conversion = sc.nextInt();
    
   
    switch (conversion){
        
        case 1 : 

    double resultat1 = Convertisseur3.CelciusVersKelvin(valeur);
    System.out.println(resultat1);
    
    
        case 2: 
    //Celcius vers Fareinheit
 
   
    double resultat2 = Convertisseur3.CelciusVersFarenheit(valeur);
    System.out.println(resultat2);
    
  
        case 3: 
           
     //Farenheit vers Celcius

    double resultat3 = Convertisseur3.FarenheitVersCelcius(valeur);
    System.out.println(resultat3);
            case 4 : 
    //Farenheit vers Kelvin 



   double resultat4 =  Convertisseur3.FarenheitVersKelvin(valeur);
    System.out.println(resultat4);
    
            case 5 : 
    //Kelvin vers farenheit 

    
    double resultat5 = Convertisseur3.KelvinVersFarenheit(valeur);
    System.out.println(resultat5);
    
    
            case 6 : 
    //Kelvin vers Celcius 

    
    double resultat6 = Convertisseur3.KelvinVersFarenheit(valeur);
    double resultat7 = Convertisseur3.FarenheitVersCelcius(resultat6);
    System.out.println(resultat7);
    
    
    }
    
    
    
    
   
    
    }
    
}
