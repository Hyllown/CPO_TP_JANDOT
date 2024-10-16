/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_jandot;

/**
 *
 * @author achil
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire; 

    public Voiture(String Mod, String MarqueV,int CV){
        Modele = Mod;
        Marque = MarqueV;
        PuissanceCV = CV;
        this.Proprietaire = null;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
}
