/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_jandot;

/**
 *
 * @author achil
 */
public class Magicien extends Personnage {
    boolean confirme;

    public Magicien(boolean confirme, String nom, int PV) {
        super(nom, PV);
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        return "Magicien{" + "confirme=" + confirme + '}';
    }
    
}
