
package br.com.projeto.model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilitarios {
    public void limparTelas(JPanel container){
        Component[] componente=container.getComponents();
        for(Component componentes:componente){
            if(componentes instanceof JTextField){
                ((JTextField)componentes).setText(null);
            }
        }
    }
}
