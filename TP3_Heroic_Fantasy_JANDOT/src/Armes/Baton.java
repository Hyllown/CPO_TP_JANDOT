/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author achil
 */
public class Baton extends Arme {
    int age;

    public Baton(int age, String nom, int niv) {
        super(nom, niv);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
    
}
