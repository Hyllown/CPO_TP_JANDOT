/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;
import Personnages.Personnage;
/**
 *
 * @author achil
 */
public abstract class Arme {

    String nom;
    Personnage pnj = null;
    int niv;
    int nbArmes =0;
    
    public Arme(String nom, int niv){
        nom = this.nom;
        niv = this.niv;
        this.pnj = null;
    }
    
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niv=" + niv + '}';
    }
    
}
