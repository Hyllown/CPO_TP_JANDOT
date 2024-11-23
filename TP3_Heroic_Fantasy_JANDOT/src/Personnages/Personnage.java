/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;
import tp3_heroic_fantasy_jandot.etreVivant;

/**
 *
 * @author achil
 */
public abstract class Personnage implements etreVivant{
    String nom;
    int PV;
    int nbPerso = 0;
    Arme Arme_en_Main = null;
    ArrayList<Arme> inventaire = new ArrayList<Arme>();
    ArrayList<Personnage> ListPerso = new ArrayList<Personnage>();


    public Personnage(String nom, int PV){
        this.nom = nom;
        this.PV = PV;
        nbPerso++;
        
    }

    public int getNbPerso() {
        return nbPerso;
    }
    
    @Override
    public void finalize() {
        nbPerso--;
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    
    public boolean ajouter_Arme(Arme weapon) { 
        if (inventaire.size() < 5){
            inventaire.add(weapon);
            return true;
        }
        return false;
    }
    
    public String equiper_Arme(Arme weapon){
        int i = 0;
        while (i < inventaire.size() && inventaire.get(i) != weapon){
            i++;
        }
        if (i < inventaire.size()){
            Arme_en_Main = inventaire.get(i);
            return "L'arme a bien ete trouve et affactee !";
        }
        return "L'arme demandee n'a pas ete trouvee";
    }
    
    public void Arme_Pref(){
        if (this instanceof Magicien){
            int nbPref=0;
            for (int i = 0; i < this.inventaire.size() ;i++){
                Arme test = this.inventaire.get(i);
                if (test instanceof Baton){
                    nbPref++;
                }
            }
            System.out.println(nbPref +" Armes Preferees");
        }
        else{
            int nbPref=0;
            for (int i = 0; i < this.inventaire.size() ;i++){
                Arme test = this.inventaire.get(i);
                if (test instanceof Epee){
                    nbPref++;
                }
            }
            System.out.println(nbPref +" Armes Preferees");
        }
    }
    
    @Override
    public void seFatiguer(){
        PV-=10;
    }
    
    @Override
    public boolean estVivant(){
        return PV > 0;
    }
    
    @Override    
    public void estAttaque(int points){
        PV-=points;
    }
    /*
    public void Attaque(String neuil){
        Personnage test =
        if (this instanceof Magicien){
            estAttaque(20);
        }
    }
    */
    
       
    @Override
    public String toString() {
        return "Personnage {nom=" + nom + ", PV=" + PV + ", Arme_en_Main=" + Arme_en_Main + ", inventaire=" + inventaire + '}';
    }
}
