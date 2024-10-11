/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_pincede;

import java.util.Scanner;

/**
 *
 * @author Edess
 */
public class Convertisseur {
    int nbConversions = 0;
        
    public double CelciusVersKelvin (double tCelcius){
    tCelcius+= 273;
    nbConversions+=1;
     return tCelcius;
}
public  double FarenheitVersCelcius(double tFarenheit){
    tFarenheit = (tFarenheit-32)/1.8;
    nbConversions+=1;
    return tFarenheit;
}

public double CelciusVersFarenheit (double tCelcius){
    tCelcius = (tCelcius*9/5)+32;
    nbConversions+=1;
    return tCelcius;
}

public double KelvinVersFarenheit (double tCelcius){
    tCelcius+= -273+CelciusVersFarenheit(tCelcius) ;
    nbConversions+=1;
    return tCelcius;
}


public double FarenheitVersKelvin (double tFarenheit){
    tFarenheit+= +273+ FarenheitVersCelcius(tFarenheit);
    nbConversions+=1;
    return tFarenheit;
}

@Override 
public String toString () { 
return "nb de conversions"+ nbConversions;
}



    
}
