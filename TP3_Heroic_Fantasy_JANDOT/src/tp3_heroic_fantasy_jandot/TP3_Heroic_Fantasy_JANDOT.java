/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_jandot;
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
        Baton Chene = new Baton(4,"Chene",5);
        Baton Charme = new Baton(5,"Charme",6);
        
        ArrayList<Arme> tab = new ArrayList<Arme>();
        tab.add(Excalibur);
        tab.add(Durandal);
        tab.add(Chene);
        tab.add(Charme);
        System.out.println(tab.get(1));
        System.out.println(tab.size());
        
        

    }
    
}
