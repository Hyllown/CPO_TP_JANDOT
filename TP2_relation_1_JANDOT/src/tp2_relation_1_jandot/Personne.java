/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_jandot;

/**
 *
 * @author achil
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures = 0;
    Voiture [] liste_voitures;
    
    public Personne(String nm, String pr){
        nom = nm;
        prenom = pr;
        liste_voitures = new Voiture[3];
    }
    
    public boolean ajouter_voiture(Voiture vaj) { 
        if (vaj.Proprietaire != null){
            return false;
        }
        if (nbVoitures == 3){
            return false;
        }
        else{
            liste_voitures[nbVoitures] = vaj;
            nbVoitures += 1;
            vaj.Proprietaire = this;
            return true;
        }
        
    }
    

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}
