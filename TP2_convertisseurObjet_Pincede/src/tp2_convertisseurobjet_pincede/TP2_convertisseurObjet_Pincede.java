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
    
    }
    
}
