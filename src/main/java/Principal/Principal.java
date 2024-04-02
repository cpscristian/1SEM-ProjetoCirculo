package Principal;

import javax.swing.JOptionPane;
import model.Circulo;

public class Principal {
    public static void main(String[] args){
        
    Circulo circ = new Circulo();
    
    circ.setRaio(Double.parseDouble(JOptionPane.
            showInputDialog("Digite o raio:")));
    
    JOptionPane.showMessageDialog(null,"A área do círculo é " + circ.getArea());
    }
}
