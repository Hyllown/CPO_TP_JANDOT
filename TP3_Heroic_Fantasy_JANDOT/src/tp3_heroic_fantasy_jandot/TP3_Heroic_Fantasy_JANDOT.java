/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_jandot;
import Personnages.Magicien;
import Personnages.Personnage;
import Personnages.Guerrier;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author achil
 */
public class TP3_Heroic_Fantasy_JANDOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee(5,"Excalibur",7);
        Epee Durandal = new Epee(4,"Durandal",7);
        Epee Cimeterre = new Epee(1,"Cimeterre",2);
        Baton Chene = new Baton(4,"Chene",5);
        Baton Charme = new Baton(5,"Charme",6);
        Baton Branche = new Baton(2,"Branche",1);
        Magicien Gandalf = new Magicien(true,"Gandalf",65);
        Magicien Garcimore = new Magicien(false,"Garcimore",44);
        Guerrier Conan = new Guerrier(false,"Conan",78);
        Guerrier Lannister = new Guerrier(true,"Lannister",45);
        
        Conan.ajouter_Arme(Branche);
        Conan.ajouter_Arme(Durandal);
        Conan.ajouter_Arme(Excalibur);
        Conan.equiper_Arme(Durandal);
        
        Gandalf.ajouter_Arme(Chene);
        Gandalf.ajouter_Arme(Charme);
        Gandalf.ajouter_Arme(Cimeterre);


    }
    
}
