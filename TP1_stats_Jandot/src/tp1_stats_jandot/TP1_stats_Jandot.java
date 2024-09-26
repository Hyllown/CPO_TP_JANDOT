/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_jandot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author achil
 */
public class TP1_stats_Jandot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int [] tab = new int[6];
        int m;
        
        System.out.println("Saisissez un entier quelconque :");
        Scanner sc = new Scanner(System.in);            
        m = sc.nextInt();
        for (int i = 0; i < m; i++){
            int n = generateurAleat.nextInt(0,6);
            tab[n] += 1;
        }
        
        for(int i =0; i<tab.length;i++){
            double tmp = tab[i];
            tmp = (tmp/m) * 100;
            System.out.print( tmp+ "% ");
        }
    }
    
}
