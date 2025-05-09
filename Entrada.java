
import javax.swing.JOptionPane;
public class Entrada {
    public static void main(String[] args){
        String nombreUsuario = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        System.out.println("Tu nombre es " + nombreUsuario);

        String apellidosUsuario = JOptionPane.showInputDialog("Ingresa tu apedillo: ");
        System.out.println("Tu apellido es " + apellidosUsuario);
        System.out.println("Tu nombre completo es " +nombreUsuario + " " + apellidosUsuario);

    }
}