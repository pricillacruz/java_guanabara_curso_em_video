/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Pricilla
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Pricilla";
        String nome2 = "Pricilla";
        String nome3 = new String ("Pricilla");
        String res;
        res = (nome1 == nome2)? "igual":"diferente";
        //res = (nome1.equals(nome3))? "igual":"diferente"; //Verifica se um conteúdo de um objeto é igual a do outro;
        System.out.println(res);
    }
    
}
