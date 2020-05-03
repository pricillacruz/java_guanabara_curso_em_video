/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programarotinasfuncao;

/**
 *
 * @author Pricilla
 */
public class ProgramaRotinasFuncao {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b ){
       int s = a + b;
        System.out.println("A soma é: " + s);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       //chamando dentro do main, o metodo soma que esstá fora do main
        soma(5,6);
    }
    
}
