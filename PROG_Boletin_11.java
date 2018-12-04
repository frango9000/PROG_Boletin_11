/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_11;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = "frase frase";
        String texto = "";
        System.out.println("ESCRIBE A SEGUINTE FRASE : \n" + frase);
        long startTime = System.currentTimeMillis();

        while (!frase.equals(texto)) {
            texto = scan.nextLine();
        }
        System.out.println("Tardastes: " + ((System.currentTimeMillis() - startTime) / 1000F) + " segundos en terminar");
    }

}
