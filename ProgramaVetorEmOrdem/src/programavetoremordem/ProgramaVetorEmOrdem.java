/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programavetoremordem;

import java.util.Arrays;

/**
 *
 * @author Pricilla
 */
public class ProgramaVetorEmOrdem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {9, 7, 3, 15, 5};
        
        Arrays.sort(v);
        
        for(int valor: v){
            System.out.print(valor + " ");
        }
    }
    
}
