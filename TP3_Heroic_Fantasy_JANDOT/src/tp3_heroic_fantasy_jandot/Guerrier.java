/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_jandot;

/**
 *
 * @author achil
 */
public class Guerrier extends Personnage {
    boolean Acheval;

    public Guerrier(boolean Acheval, String nom, int PV) {
        super(nom, PV);
        this.Acheval = Acheval;
    }

    @Override
    public String toString() {
        return "Guerrier{" + "Acheval=" + Acheval + '}';
    }
    
}