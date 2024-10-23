/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author achil
 */
public abstract class Arme {
    String nom;
    int niv;
    public Arme(String nom, int niv){
        nom = this.nom;
        niv = this.niv;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niv=" + niv + '}';
    }
    
}
