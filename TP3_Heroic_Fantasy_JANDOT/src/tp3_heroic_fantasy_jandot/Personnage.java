/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_jandot;

/**
 *
 * @author achil
 */
public abstract class Personnage {
    String nom;
    int PV;

    public Personnage(String nom, int PV) {
        this.nom = nom;
        this.PV = PV;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", PV=" + PV + '}';
    }
    
}
