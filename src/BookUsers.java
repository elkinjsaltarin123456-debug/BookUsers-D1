import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookUsers {
    private JPanel panelprincipal;
    private JTextField Nombre;
    private JTextField Correo;
    private JButton Guardar;
    private JTextArea Resultado;

    public BookUsers() {
        Guardar.addActionListener(new ActionListener()); {
            @Override
            public void actionPerformed(ActionEvent e){

                String nombre = Nombre.getText();
                String correo = Correo.getText();

                if (nombre.isEmpty() || correo.isEmpty()) {

                }
            }
        }
    }
}

