package janela;

import javax.swing.*;
import java.awt.*;

/*@author Vitor
 */
public class Janela extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    
    public Janela (){
            
        super("Janela Principal");
        ImageIcon icone;
        icone = new ImageIcon ("teste.gif");
        setIconImage(icone.getImage());
        Container tela = getContentPane();
        tela.setBackground(new Color(128,125,150));//muda a cor da tela
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);  
        rotulo4.setBounds(50,140,80,20);
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color (190,152,142));
        rotulo4.setForeground(new Color (201,200,100));
        rotulo1.setFont(new Font ("Arial",Font.BOLD,14));
        rotulo2.setFont(new Font ("Comic Sans MS",Font.BOLD,16));
        rotulo3.setFont(new Font ("Courier New",Font.BOLD,16));
        rotulo4.setFont(new Font ("Times New Roman",Font.BOLD,20));
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        setSize(400,250);
        setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH);// Abre a tela de forma maximizada
        //setExtendedState(ICONIFIED); // Só abre a tela se o icone for minimizada
        //setResizable(true); //Não pode mudar o tamanho da janela nem maximizar
        setLocationRelativeTo(null);//Deixa a tela centralizada
       
    }

}