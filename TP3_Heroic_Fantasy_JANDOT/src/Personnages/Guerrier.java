/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;


/**
 *
 * @author achil
 */
public class Guerrier extends Personnage{
    boolean Acheval;
    int nbGuerrier = 0;
    public Guerrier(boolean Acheval, String nom, int PV) {
        super(nom, PV);
        this.Acheval = Acheval;
        nbGuerrier++;
    }

    public int getNbGuerrier() {
        return nbGuerrier;
    }
    
    @Override
    public void finalize() {
        nbGuerrier--;
    }
    
    

    @Override
    public String toString() {
        return "Guerrier{nom=" + nom + " ; Acheval=" + Acheval + " ; PV=" + PV + " ; Arme_en_Main=" + Arme_en_Main + '}';
    }

    
}
