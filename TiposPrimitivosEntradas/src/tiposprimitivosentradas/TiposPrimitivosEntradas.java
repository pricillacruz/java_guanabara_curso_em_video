/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivosentradas;

import java.util.Scanner;

/**
 *
 * @author Pricilla
 */
public class TiposPrimitivosEntradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); //Importando entrada de dados no java
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();  //Pode ser utiliada nsxtFloat - nextInt - nextLine
        System.out.format("A nota da %s é %.1f \n", nome, nota);
       
    }
    
}
