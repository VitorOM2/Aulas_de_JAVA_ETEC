package janela;

import javax.swing.*;
import java.awt.*;

/*@author Vitor
 */
public class Janela extends JFrame{
    
    public Janela (){
        
        super("Janela Principal");
        ImageIcon icone;
        icone = new ImageIcon ("teste.gif");
        setIconImage(icone.getImage());
        Container tela = getContentPane();
        tela.setBackground(new Color(128,125,150));//muda a cor da tela
        setSize(300,150);
        setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH);// Abre a tela de forma maximizada
        setExtendedState(ICONIFIED); // Só abre a tela se o icone for minimizada
        setResizable(false); //Não pode mudar o tamanho da janela nem maximizar
        setLocationRelativeTo(null);//Deixa a tela centralizada
       
    }

}