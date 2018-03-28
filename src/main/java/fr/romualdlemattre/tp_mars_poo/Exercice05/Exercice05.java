/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.romualdlemattre.tp_mars_poo.Exercice05;

import java.util.Scanner;

/**
 *
 * @author romua
 */
public class Exercice05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int age;
    int taille;
    
    do {
        
       System.out.println("Veuillez saisir votre age (Ou 0 pour sortir): ");
       age = sc.nextInt();
       System.out.println("Veuillez saisir votre taille en cm : ");
       taille = sc.nextInt();
       
       if (age > 20 && taille < 100) {
           System.out.println("Vous êtes peut-être un nain adulte ?");
       }
       else {
           if (age > 20 && taille > 200) {
               System.out.println("Vous êtes un adulte géant :-) ");
           }
           else {
               if (age < 3 || taille < 50) {
                System.out.println("Vous êtes peut-être un bébé :-) ");
               }
               else {
                   if (age > 15 && age < 18 && taille > 150 && taille < 180) {
                       System.out.println("Vous êtes un ado");
                   }
                   else {
                       System.out.println("Je ne sais pas quoi dire ;-) ");
                   }
               }
           }
       }
       
    }
    while (age != 0);

    }
    
}
