/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_jandot;

/**
 *
 * @author achil
 */
public class TP2_Bieres_JANDOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("CuvEe des trolls", 7.0 ,"Dubuisson") ; 
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ; 
        BouteilleBiere Biere = new BouteilleBiere("La chouffe", 5.0 ,"Abbaye de Chouffe") ; 
        BouteilleBiere fullyfizz = new BouteilleBiere("Bleuvage", 100.0 ,"Fortnite") ; 

        fullyfizz.lireEtiquette();
        fullyfizz.Decapsuler();
        
        System.out.println(fullyfizz.ouverte);
        

    }
    
    
}
