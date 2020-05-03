/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programarotinasfuncao02;

/**
 *
 * @author Pricilla
 */
public class ProgramaRotinasFuncao02 {

    /**
     * @param args the command line arguments
     */
    static int soma(int a, int b) {
        int s = a + b;
         return s;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Começou o programa!");
        int sm = soma(5, 6);
        System.out.println("A soma vale " + sm);
    }

}
