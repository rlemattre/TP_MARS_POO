/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.romualdlemattre.tp_mars_poo.Exercice01;

/**
 *
 * @author Formation
 */
public class Exercice01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int i = 1;
        int limite = 15;
        
        for (i=1; i <= limite; i++) {
            if (i == 1) {
                System.out.println(i + " kilomètre à pied, ça use, ça use, \n" + i + " kilomètre à pied, ça use les souliers.");
            }
            else {
                System.out.println(i + " kilomètres à pied, ça use, ça use, \n" + i + " kilomètres à pied, ça use les souliers.");
             }
        }
    }
}
