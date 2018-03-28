/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.romualdlemattre.tp_mars_poo.Exercice03;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Execice03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int hauteur;
        int numeroLigne;
        int nbEspaces;
        int nbEtoiles;
        
        System.out.println("Choisissez la hauteur de votre sapin : ");
        hauteur = sc.nextInt();
        
        System.out.println("Le sapin plein :");
        
        for (numeroLigne = 1; numeroLigne <= hauteur; numeroLigne++) { // boucle jusqu'à ce que on atteigne la hauteur voulue
            
            for (nbEspaces = hauteur - numeroLigne; nbEspaces > 0; nbEspaces--) { // nombre d'espaces nécessaire
                System.out.print(" ");
            }
                    for (nbEtoiles = 0 ; nbEtoiles < 2 * numeroLigne - 1; nbEtoiles++) { // nombre d'astériques nécessaire
                    System.out.print("*");
                }
            System.out.println();
        }
        
        System.out.println("Un sapin couché :");
        
        for (numeroLigne = 1; numeroLigne <= hauteur; numeroLigne++) {
            
            for (nbEtoiles = 1 ; nbEtoiles <= numeroLigne ; nbEtoiles++) {
                System.out.print("*");
                }
            System.out.println();
        }
        for (numeroLigne = 1 ; numeroLigne <= hauteur; numeroLigne++) {
            
            for (nbEtoiles = hauteur -1; nbEtoiles >= numeroLigne; nbEtoiles--) {
                System.out.print("*");
                }
            System.out.println();
        }
    
        System.out.println("Un sapin évidé :");
        
        for (numeroLigne = 1; numeroLigne <= hauteur - 1; numeroLigne++) { 
            
            if (numeroLigne == 1) {
                for (nbEspaces = hauteur - numeroLigne; nbEspaces > 0; nbEspaces--) { 
                System.out.print(" ");
                }
                System.out.println("*");
            }
            else {
                for (nbEspaces = hauteur - numeroLigne;nbEspaces > 0; nbEspaces--) { 
                System.out.print(" ");
                }
                System.out.print("*");
                for (nbEspaces = 1; nbEspaces < 2 * numeroLigne - 2; nbEspaces++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
            for (nbEtoiles=1; nbEtoiles <= 2 * hauteur -1; nbEtoiles++) {
                System.out.print("*");
            }
        
        }
    }