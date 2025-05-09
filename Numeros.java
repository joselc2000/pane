import javax.swing.JOptionPane;
public class Numeros {
    public static void main(String[] args){
        //Enteros
        String numero1 = JOptionPane.showInputDialog("Ingresa um mumero: ");
        String numero2 = JOptionPane.showInputDialog("Ingresa un numero: ");
        int numeroEntero1 = Integer.parseInt(numero1);
        int numeroEntero2 = Integer.parseInt(numero2);
        System.out.println(numero1 + numero2);
        System.out.println(numeroEntero1 + numeroEntero2);
        //Decimales
        String numero3 = JOptionPane.showInputDialog("Ingresa un numero: ");
        String numero4 = JOptionPane.showInputDialog("Ingresa un numero: ");
        double numeroEntero3 = Double.parseDouble(numero3);
        double numeroEntero4 = Double.parseDouble(numero4);
        System.out.println(numero3 + numero4);
        System.out.println(numeroEntero3 + numeroEntero4);
    }
}