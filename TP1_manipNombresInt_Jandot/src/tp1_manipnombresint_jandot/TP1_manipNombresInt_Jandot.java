/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_jandot;

import java.util.Scanner;

/**
 *
 * @author achil
 */
public class TP1_manipNombresInt_Jandot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1;
        int nb2;
        
        System.out.println("Entrez un nombre :");
        Scanner sc1 = new Scanner(System.in);
        nb1 = sc1.nextInt();
        System.out.println("Entrez un autre nombre :");
        Scanner sc2 = new Scanner(System.in);
        nb2 = sc2.nextInt();
        
        System.out.println("La somme de ces deux nombres est : " +(nb1+nb2));
        System.out.println("La difference de ces deux nombres est : " +(nb1-nb2));
        System.out.println("Le produit de ces deux nombres est : " +(nb1*nb2));
        
        System.out.println("Le quotient de ces deux nombres est : " +(nb1/nb2));
        System.out.println("Le reste de la division euclidienne de ces deux nombres est : " +(nb1 % nb2));
        

    }
    
}
