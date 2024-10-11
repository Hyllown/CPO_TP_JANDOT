/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_jandot;

/**
 *
 * @author achil
 */
public class TP2_convertisseurObjet_JANDOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur test = new Convertisseur();
        
        test.KelvinVersFarenheit(test.CelciusVersKelvin(35));
        test.toString();
        System.out.print(test);
        
    }
    
}
