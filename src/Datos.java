import javax.swing.*;

public class Datos {
    public static DefaultListModel<String> modelo = new DefaultListModel<>();
    static {
        modelo.addElement("Elkin - elkin@gmail.com");
        modelo.addElement("Javier - javier@gmail.com");
    }
    public static void agregarUsuario(String nombre, String correo, String tipo, String numero) {
        modelo.addElement(nombre + " - " + correo);
    }


}
