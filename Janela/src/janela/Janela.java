package janela;

import javax.swing.*;
import java.awt.*;

/*@author Vitor
 */
public class Janela extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8;
    JTextField caixa1,caixa2,caixa3,caixa4,caixa5,caixa6,caixa7,caixa8;

    
    public Janela (){
            
        super("Janela Principal");
        //Define a Imagem da página
        ImageIcon icone;
        icone = new ImageIcon ("teste.gif");
        setIconImage(icone.getImage());
        
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(new Color(128,125,150));//muda a cor da tela
        
        //Cria o conteudo dos rótulos
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        rotulo5 = new JLabel ("CPF:");
        rotulo6 = new JLabel ("Endereço:");
        rotulo7 = new JLabel ("CEP:");
        rotulo8 = new JLabel ("Estado:");
        
        //Cria a caixa de texto e o tamanho
        caixa1 = new JTextField(50);
        caixa2 = new JTextField(3);
        caixa3 = new JTextField(14);
        caixa4 = new JTextField(10);
        caixa5 = new JTextField(11);
        caixa6 = new JTextField(50);
        caixa7 = new JTextField(8);
        caixa8 = new JTextField(20);
        
        //Define as cordenadas dos rótulos
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);  
        rotulo4.setBounds(50,140,80,20);
        rotulo5.setBounds(50,180,80,20);
        rotulo6.setBounds(50,220,80,20);
        rotulo7.setBounds(50,260,80,20);
        rotulo8.setBounds(50,300,80,20);
        
        //Define a posição das caixas de textos
        caixa1.setBounds (140,20,200,20);
        caixa2.setBounds (140,60,20,20);
        caixa3.setBounds (140,100,80,20);
        caixa4.setBounds (140,140,80,20);
        caixa5.setBounds (140,180,80,20);
        caixa6.setBounds (140,220,80,20);
        caixa7.setBounds (140,260,80,20);
        caixa8.setBounds (140,300,80,20);
        
        //Define a cor dos rótulos
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color (190,152,142));
        rotulo4.setForeground(new Color (201,200,100));
        rotulo5.setForeground(Color.darkGray);
        rotulo6.setForeground(Color.darkGray);
        rotulo7.setForeground(Color.darkGray);
        rotulo8.setForeground(Color.darkGray);
        
        //Define a fonte dos rótulos
        rotulo1.setFont(new Font ("Arial",Font.BOLD,14));
        rotulo2.setFont(new Font ("Comic Sans MS",Font.BOLD,16));
        rotulo3.setFont(new Font ("Courier New",Font.BOLD,16));
        rotulo4.setFont(new Font ("Times New Roman",Font.BOLD,20));
        rotulo5.setFont(new Font ("Arial",Font.BOLD,16));
        rotulo6.setFont(new Font ("Arial",Font.BOLD,16));
        rotulo7.setFont(new Font ("Arial",Font.BOLD,16));
        rotulo8.setFont(new Font ("Arial",Font.BOLD,16));
        
        //Apresenta os rótulos na tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        
        //Apresenta as caixas de textos na tela
        tela.add(caixa1);
        tela.add(caixa2);
        tela.add(caixa3);
        tela.add(caixa4);
        tela.add(caixa5);
        tela.add(caixa6);
        tela.add(caixa7);
        tela.add(caixa8);
        
        //Configurações do tamanho da tela
        setSize(400,250);
        setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH);// Abre a tela de forma maximizada
        //setExtendedState(ICONIFIED); // Só abre a tela se o icone for minimizada
        //setResizable(true); //Não pode mudar o tamanho da janela nem maximizar
        setLocationRelativeTo(null);//Deixa a tela centralizada
       
    }

}