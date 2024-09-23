/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_jandot;

import java.util.Scanner;

/**
 *
 * @author achil
 */
public class TP1_convertisseur_Jandot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double nb1;
        int nb;
        
        System.out.println("Bonjour, saisissez une valeur :");
        Scanner sc1 = new Scanner(System.in);
        nb1 = sc1.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        Scanner sc2 = new Scanner(System.in);
        nb = sc2.nextInt();
        
        switch (nb){
            case 1 -> CelciusVersKelvin(nb1);
            case 2 -> KelvinVersCelcius(nb1);
            case 3 -> FarenheitVersCelcius(nb1);
            case 4 -> CelciusVersFarenheit(nb1);
            case 5 -> KelvinVersFarenheit(nb1);
            case 6 -> FarenheitVersKelvin(nb1);
            default -> {
            }
        }
    }
    
    public static double CelciusVersKelvin (double tCelcius) {
        
        System.out.println(tCelcius + " en degré est egal a " +(tCelcius+273) +" Kelvin");
        return tCelcius;
    }
    
    public static double KelvinVersCelcius (double tKel) {
        
        
        System.out.println(tKel +" en Kelvin est egal a " +(tKel-273) + " Celcius");
        return tKel;
    }
    public static double FarenheitVersCelcius (double tFar) {
        
        
        System.out.println(tFar +" en Farenheit est egal a " +((tFar - 32)/9 *5)+" Celcius");
        return tFar;
    }
    
    public static double CelciusVersFarenheit (double tCelcius) {
        
        System.out.println(tCelcius + " en Celcius est egal a " +(tCelcius*1.8 + 32) +" Farenheit");
        return tCelcius;
    }
    
    public static double KelvinVersFarenheit (double tKel) {
        
        
        tKel = KelvinVersCelcius(tKel);
        tKel = CelciusVersFarenheit(tKel);
        
        System.out.println(tKel + " en Kelvin est egal a " +tKel + " Farenheit");
        return tKel;
    }
    
    public static double FarenheitVersKelvin (double tFar) {
        
        tFar = FarenheitVersCelcius(tFar);
        tFar = CelciusVersKelvin(tFar);
        
        System.out.println(tFar + "en Farenheit est egal a " + tFar + " Kelvin");
        return tFar;
    }
    
}
