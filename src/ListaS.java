import javax.swing.*;

public class ListaS {
    private JPanel panelLista;
    private JButton actualizarButton;
    private JList <String>ListaUsuarios;

    public ListaS() {
        ListaUsuarios.setModel(Datos.modelo);
        actualizarButton.addActionListener(e -> {
            String sel = ListaUsuarios.getSelectedValue();
            if (sel != null) JOptionPane.showMessageDialog(null, "Seleccionaste: " + sel);
            else JOptionPane.showMessageDialog(null, "Total: " + Datos.modelo.size());


        });
    }

    public JPanel getPanel() {
        return panelLista;
    }
}