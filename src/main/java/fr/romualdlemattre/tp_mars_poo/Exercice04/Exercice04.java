/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.romualdlemattre.tp_mars_poo.Exercice04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice04 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Random hasard = new Random();
    
        int choixJoueur;
        int chiffreAuHasard;
        int rejouer;
        boolean sortie = false;
        ArrayList<Integer> tableauDesScores = new ArrayList();
        int meilleurScore = 1;
              
        chiffreAuHasard = hasard.nextInt(101);

        do {
            int coups = 0;
        do {
            System.out.println("Choisir un chiffre entier entre 0 et 100 : ");
            choixJoueur = sc.nextInt();
                       
            if (choixJoueur == chiffreAuHasard) {
                coups++;
                System.out.println("Bonne réponse, vous avez trouvé en " + coups + " coups !");
            }
            else {
                if (choixJoueur < chiffreAuHasard) {
               coups++;
               System.out.println("Mauvaise réponse ! Le chiffre mystère est plus grand.");
                }
                else {
                coups++;
                System.out.println("Mauvaise réponse ! Le chiffre mystère est plus petit.");
                }
            }
        }
        while (choixJoueur != chiffreAuHasard);
        
        tableauDesScores.add(coups);
        
        System.out.println("Voulez-vous rejouer ? \n 1.oui \n 2.non");
        rejouer = sc.nextInt();
        
        if (rejouer == 2) {
            
            for (int nombreDeCoups : tableauDesScores) {
            if (nombreDeCoups > meilleurScore){
                meilleurScore = coups;
            }
            else {
            }
            }
            sortie = true;
            System.out.println("Merci de votre participation.");
            System.out.println("Le meilleur score de cette partie est de " + meilleurScore + " coups.");
            System.out.println("A bientôt");
        }
        else {
            sortie = false;
            chiffreAuHasard = hasard.nextInt(101);
        }
        }
        while (sortie != true);    
        }
        }
  
