
import javax.swing.JOptionPane;
public class Entrada {
    public static void main(String[] args){
        String nombreUsuario = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        System.out.println("Tu nombre es " + nombreUsuario);
    }
}