import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookUsers {
    private JPanel panelBookUsers;
    private JTextField Nombre;
    private JTextField Correo;
    private JButton Guardar;
    private JTextField Numeroid;
    private JComboBox <String>Tipoid;

    public BookUsers() {
        Guardar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                String nombre = Nombre.getText();
                String correo = Correo.getText();
                String Tipo = (String) Tipoid.getSelectedItem();
                String Numero = Numeroid.getText();

                if (nombre.isEmpty() || correo.isEmpty() || Numero.isEmpty() )  {
                    JOptionPane.showMessageDialog(null,"falta nombre ,correo 0 Numero de indentidad");

                } else {

                    Datos.agregarUsuario(nombre,correo,Tipo,Numero);
                    JOptionPane.showMessageDialog(null, "Guardado: " + nombre + " - " + correo
                            + Tipo + " : " + Numero);
                    Nombre.setText("");
                    Correo.setText("");
                    Numeroid.setText("");
                    Tipoid.setSelectedIndex(0);
                }
            }
        });
    }
    public JPanel getPanel() {
        return panelBookUsers;
    }
}

