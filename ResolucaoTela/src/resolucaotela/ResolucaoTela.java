
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension resolucao = tela.getScreenSize();
        System.out.println("A resolução da tela de seu sistema é: " + resolucao.width + " x " + resolucao.height);
      
    }
    
}
