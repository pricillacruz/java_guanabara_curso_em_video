/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Pricilla
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //continue e break são utilizados para mudar o fluxo de um laço de repetição;
        //continue vai ocultar o que você mandar;
        //break vai parar seu loop e sair;
        int cc = 0;
        while (cc < 4) {
            System.out.println("Cambalhota " + cc);
            cc++;
        }
    }
}
