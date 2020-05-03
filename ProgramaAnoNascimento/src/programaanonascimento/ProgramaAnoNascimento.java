/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaanonascimento;

import java.util.Scanner;

/**
 *
 * @author Pricilla
 */
public class ProgramaAnoNascimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2020 - nasc;
        System.out.println("Sua idade é: "+ i + " anos.");

        if (i >= 18) {
            System.out.println("Portanto você é maior de idade.");
        }
        else{
                        System.out.println("Portanto você é menor de idade.");
                         };

    }
;
