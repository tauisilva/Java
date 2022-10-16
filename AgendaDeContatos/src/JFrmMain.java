import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JFrmMain extends JFrame {

    private static final long serialVersionUID = 1L;
    JMenuBar barraMenu;
    JMenu menuArquivo;
    JMenuItem menuItemFechar;
    JMenu menuAgenda;
    JMenuItem menuItemManter;
    JMenuItem menuItemListar;
    JMenu menuAjuda;
    JMenuItem menuItemSobre;

    public JFrmMain() {
        super();
        initialize();
    }

    private void initialize() {
        setTitle("Agenda de Contatos");
        setSize(800, 600);
        setLocationByPlatform(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(getJMenuBar());
    }

    public JMenuBar getJMenuBar() {
        barraMenu = new JMenuBar();
        barraMenu.add(getMenuArquivo());
        barraMenu.add(getMenuAgenda());
        barraMenu.add(getMenuAjuda());
        return barraMenu;
    }

    private JMenu getMenuAjuda() {
        menuAjuda = new JMenu();
        menuAjuda.setText("Ajuda");
        menuAjuda.add(getMenuItemSobre());
        return menuAjuda;
    }

    private JMenuItem getMenuItemSobre() {
        menuItemSobre = new JMenuItem();
        menuItemSobre.setText("Sobre");
        menuItemSobre.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, ""
                        + "Sobre:\n\n"
                        + "Agenda de Contatos\n"
                        + "Versão: 1.0\n"
                        + "Autor: Taui Silva Lima");

            }
        });
        return menuItemSobre;
    }

    private JMenu getMenuAgenda() {
        menuAgenda = new JMenu();
        menuAgenda.setText("Agenda");
        menuAgenda.add(getMenuItemManter());
        menuAgenda.add(getMenuItemListar());
        return menuAgenda;
    }

    private JMenuItem getMenuItemManter() {
        menuItemManter = new JMenuItem();
        menuItemManter.setText("Manter Contatos");
        menuItemManter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FrmManter dialog = new FrmManter();
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.setVisible(true);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        return menuItemManter;
    }

    private JMenuItem getMenuItemListar() {
        menuItemListar = new JMenuItem();
        menuItemListar.setText("Listar Contatos");
        menuItemListar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                List<Contato> lista = ContatoServicos.getALL();
                String dados = "Lista de contatos\n"
                        + "ID   - "
                        + "Nome - "
                        + "Telefone - "
                        + "Email \n";
                for (Contato c : lista) {
                    dados += c.getId() + " - "
                            + c.getNome() + " - "
                            + c.getTelefone() + " - "
                            + c.getEmail()
                            + "\n";
                }
                JOptionPane.showMessageDialog(null, dados);
            }
        });
        return menuItemListar;
    }

    private JMenu getMenuArquivo() {
        menuArquivo = new JMenu();
        menuArquivo.setText("Arquivo");
        menuArquivo.add(getMenuItemFechar());
        return menuArquivo;
    }

    private JMenuItem getMenuItemFechar() {
        menuItemFechar = new JMenuItem();
        menuItemFechar.setText("Fechar");
        menuItemFechar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fechando o Programa");
                System.exit(0);

            }
        });
        return menuItemFechar;
    }
}
