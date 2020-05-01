/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author Pricilla
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        String nome = "Pricilla";
        float nota = 8.5f;
        // System.out.println("A nota é: " + nota); //printa e pula linha
       // System.out.print("A nota é: " + nota); //printa e não pula linha
       // System.out.printf("A nota de %s é %.2f \n",nome, nota); // %.2f o numero define a quantidade de casa depois da virgula. E  %s se refere a variavel que tem string.
        System.out.format("A nota de %s é %.1f \n",nome, nota);
    }
    
}
