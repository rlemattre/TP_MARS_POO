/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.romualdlemattre.tp_mars_poo.Exercice02;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nbNotes;
        double note;
        int compteur;
        double total = 0;
        double moyenne;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Combien de notes : ");
        nbNotes = sc.nextInt();
        
        for (compteur = 1 ; compteur <= nbNotes ; compteur++ ) {
            System.out.println("Entrez la note n°"+compteur+" : ");
            note = sc.nextDouble();
            total = total + note;
        }
        
        moyenne = total % nbNotes;
                
        System.out.printf("La moyenne des %d notes est %02d", nbNotes, moyenne);
    }
}
