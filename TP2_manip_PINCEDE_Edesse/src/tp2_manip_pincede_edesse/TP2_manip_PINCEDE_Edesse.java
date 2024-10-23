/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_pincede_edesse;

/**
 *
 * @author Edess
 */
public class TP2_manip_PINCEDE_Edesse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Tartiflette assiette1 = new Tartiflette(500) ; 
    Tartiflette assiette2 = new Tartiflette(600) ;
    Tartiflette assiette3 = assiette2 ; 
    //En réalité, deux tartiflettes ont été crées car un objet est crée ssi il y a le mot new. 
    
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;   
    assiette2 = assiette1;
    assiette1= assiette3;
    //Moussaka assiette666 = assiette1 ; est faux car assiette1 est de la classe tartiflette donc elle ne peut pas appartenir à la classe moussaka
   //Moussaka assiette667 = new Tartiflette() ; est aussi faux car il n'y a pas d'argument dans tartiflette
    
   Moussaka[] moussakas = new Moussaka[10];  
    for (int i = 0; i < moussakas.length; i++) {
        moussakas[i]= new Moussaka(i*100); //Je choisis arbitrairement de donner la valeur i*100 pour chaque case.
    
    }//Oui il est possible qu'une référence vers un objet soit l'attribut d'un autre, cela permet de créer des relations entre les objets.
    
}
}


    
