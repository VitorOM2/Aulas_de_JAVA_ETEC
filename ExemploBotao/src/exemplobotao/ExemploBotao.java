package exemplobotao;

/**
 *
 * @author Vitor
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploBotao extends JFrame
{
    JButton botao1,botao2,botao3,botao4;
    
    public ExemploBotao () 
    {
        super ("Exemplo com vários botões");
        Container tela = getContentPane();
        setLayout(null);
        
        botao1 = new JButton ("Procurar");
        botao2 = new JButton ("Voltar >>");
        botao3 = new JButton ("Próximo >>");
        botao4 = new JButton ("Sair");
        
        botao1.setMnemonic(KeyEvent.VK_P);
        botao2.setMnemonic(KeyEvent.VK_V);
        botao3.setMnemonic(KeyEvent.VK_X);
        botao4.setMnemonic(KeyEvent.VK_S);
        getRootPane().setDefaultButton(botao1);
        
        botao1.setBounds(50,20,100,20);
        botao2.setBounds(50,60,100,20);
        botao3.setBounds(50,100,100,20);
        botao4.setBounds(50,140,100,20);
        
        /*botao1.setBackground(Color.yellow);
        botao2.setBackground(Color.red);
        botao3.setBackground(Color.blue);
        botao4.setBackground(Color.white);*/
        
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
        
        setSize(400,250);
        setVisible(true);
    }
}
