/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_jandot;

/**
 *
 * @author achil
 */
public class TP2_relation_1_JANDOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
        Personne Bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines"); 
        System.out.println("liste des voitures disponibles "+ uneClio  + 
        "\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra ) ; 
        
        Bob.ajouter_voiture(uneClio);
        Bob.ajouter_voiture(une2008);
        System.out.println("voitures de Bob sont " + Bob.liste_voitures[0] + Bob.liste_voitures[1] );
        
    }
    
}
