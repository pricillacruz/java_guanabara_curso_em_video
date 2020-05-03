/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscomloop;

import java.util.Scanner;

/**
 *
 * @author Pricilla
 */
public class NumerosComLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;                
        //Scanner para pegar dados do usuario;
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
        }while (resp.equals("s"));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
