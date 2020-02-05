
package calcularbase;

import javax.swing.JOptionPane;
/**
 *
 * @author Vitor
 */
public class CalcularBase {

    public static void main(String[] args) {
         
        int B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base maior: "));
        int bm = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base menor: "));
        int h = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a altura: "));
        
        int a = ((B + bm )*h) / 2;
        
        JOptionPane.showMessageDialog(null,"A area do paralelograma é:  "+a);

    }
    
}
