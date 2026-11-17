import javax.swing.*;


public class Principal {
    private JButton regristrarteButton;
    private JButton verInformacionButton;
    private JButton creditosButton;
    private JPanel panelPrincipal;

        private JFrame framePrincipal;

        public Principal() {
            creditosButton.addActionListener(e -> {
                Creditos ventanaCreditos = new Creditos();
                JFrame frameCreditos = new JFrame("Créditos");
                frameCreditos.setContentPane(ventanaCreditos.getPanel());
                frameCreditos.pack();
                frameCreditos.setLocationRelativeTo(framePrincipal);
                frameCreditos.setAlwaysOnTop(true);
                frameCreditos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameCreditos.setVisible(true);
                frameCreditos.toFront();
            });

            verInformacionButton.addActionListener(e -> {
                ListaS ventanaLista = new ListaS();
                JFrame frameLista = new JFrame("Lista");
                frameLista.setContentPane(ventanaLista.getPanel());
                frameLista.pack();
                frameLista.setLocationRelativeTo(framePrincipal);
                frameLista.setAlwaysOnTop(true);
                frameLista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameLista.setVisible(true);
                frameLista.toFront();
            });

            regristrarteButton.addActionListener(e -> {
                BookUsers ventanaBook = new BookUsers();
                JFrame frameBook = new JFrame("Registrarte");
                frameBook.setContentPane(ventanaBook.getPanel());
                frameBook.pack();
                frameBook.setLocationRelativeTo(framePrincipal);
                frameBook.setAlwaysOnTop(true);
                frameBook.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameBook.setVisible(true);
                frameBook.toFront();
            });
        }

        public JPanel getPanel() {
            return panelPrincipal;
        }

        public void setFramePrincipal(JFrame frame) {
            this.framePrincipal = frame;
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Principal");
            Principal principal = new Principal();
            principal.setFramePrincipal(frame);
            frame.setContentPane(principal.getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }


