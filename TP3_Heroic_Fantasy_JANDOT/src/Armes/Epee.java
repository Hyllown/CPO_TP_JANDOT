/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author achil
 */
public class Epee extends Arme{
    int indiceFinesse;

    public Epee(int indiceFinesse, String nom, int niv) {
        super(nom, niv);
        this.indiceFinesse = indiceFinesse;
    }

    @Override
    public String toString() {
        return "Epee{nom=" + nom + " ; indiceFinesse=" + indiceFinesse + " ; niv=" + niv +'}';
    }
    
}
