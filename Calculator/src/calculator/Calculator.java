
/*
*TP0 Exercice 1
*AJ
*Septembre 2024
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author achil
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int operateur;
        int operande1;
        int operande2;
        
        System.out.println("Please enter the operator :");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        Scanner sc = new Scanner(System.in);
        operateur = sc.nextInt();
        while((operateur < 1) ||(operateur > 5)){
            Scanner sc2 = new Scanner(System.in);
            operateur = sc2.nextInt();
        }
        
        System.out.println("Entrez un nombre :");
        Scanner sc1 = new Scanner(System.in);
        operande1 = sc1.nextInt();
        System.out.println("Entrez un autre nombre :");
        Scanner sc2 = new Scanner(System.in);
        operande2 = sc2.nextInt();
        
        if (operateur == 1){
            System.out.println("The result is : " +(operande1 + operande2));
        }
        if (operateur == 2){
            System.out.println("The result is : "+(operande1 - operande2));
        }
        if (operateur == 3){
            System.out.println("The result is : " + (operande1 * operande2));
        }
        if (operateur == 4){
            System.out.println("The result is : " +(operande1 / operande2));
        }
        if (operateur == 5){
            System.out.println("The result is : " +(operande1 % operande2));
        }
    }
    
}
