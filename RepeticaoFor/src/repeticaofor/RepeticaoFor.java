/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author Pricilla
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc = 0; cc <= 3; cc++) {
            System.out.println(cc);
        }

        //caso que queira tirar de 2 em 2, sigo o codigo abaixo:
        //for (int cc = 20; cc >= 0; cc-=2) {
        //    System.out.println(cc);
        //}
        
        //caso eu que contar de 2 em 2, sigo o codigo da linha abaixo:
        //for (int cc = 0; cc <= 20; cc += 2) {
        //    System.out.println(cc);
        // }
    }
}
