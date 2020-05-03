/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepitacomjanela;

import javax.swing.JOptionPane;

/**
 *
 * @author Pricilla
 */
public class ExercicioRepitaComJanela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mostrando mensagem com codigo na linha abaixo;
        // JOptionPane.showMessageDialog(null,"Olá, Mundo!", "Boas Vindas!", JOptionPane.WARNING_MESSAGE);

        //Solicitando alguma informação atraves da janela, no codigo abaixo;
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um numero: "));
        //JOptionPane.showMessageDialog(null,"Você digitou o valor: " + n);
        //Trabalhando com janelas e modulo de repetição;
        int n, s = 0, m;
        int val = 0, par = 0;
        int impar = 0, acimaCem = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero: <br><em><small>(0[zero] interrompe)</small></em></html>"));
            s += n;
            if(n % 2 == 0){
                par++;
            }else {
                impar++;
            }
            if(n > 100){
                acimaCem++;
            }
            if (n != 0){
                val++;
            }
            
        } while (n != 0);
        m = s / val;
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>" + 
                "Total da soma: " + s + "<br>" + 
                "Total da média: " + m + "<br>" + 
                "Total dos valores: " + val + "<br>" +
                "Total numero par: "+ par +  "<br>" +   
                "Total numero impar: " + impar +  "</html>");
    }

}
