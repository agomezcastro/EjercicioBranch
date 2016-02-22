package ejercicioramas;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Ramas {
    // Ejercicio sobre las ramas
    private int num1, num2, res;
    
    
    public int suma(){
        res =  num1 + num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 1er numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 2º numero"));
        System.out.println("Resultado= "+ res);
        return res;
    }
}
