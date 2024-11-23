/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;


/**
 *
 * @author achil
 */
public class Magicien extends Personnage {
    boolean confirme;
    int nbMage = 0;
    
    public Magicien(boolean confirme, String nom, int PV) {
        super(nom, PV);
        this.confirme = confirme;
        nbMage++;
    }

    public int getNbMage() {
        return nbMage;
    }
    
    @Override
    public void finalize() {
        nbMage--;
    }

    

    @Override
    public String toString() {
        return "Magicien{nom=" + nom + " ; confirme=" + confirme + " ; PV=" + PV + " ; Arme_en_Main=" + Arme_en_Main + '}';
    }
    
}
