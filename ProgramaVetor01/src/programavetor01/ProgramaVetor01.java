/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programavetor01;

/**
 *
 * @author Pricilla
 */
public class ProgramaVetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de casas de n: " + " " + n.length);
        
                        //c < n.length;
        //for (int c = 0; c <= n.length-1; c++)  //deixando generico, ou seja, para qualquer tamanho de vetor;
        for (int c = 0; c <= 5; c++) {

            if (n[c] <= 8 && n[c] != 4) {
                System.out.print(n[c] + ", ");
            } else {
                System.out.print(n[c]);
            }
        }
    }
}
