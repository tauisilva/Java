import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JCheckBox;

public class FrmManter extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JTable table;

    /**
     * Create the dialog.
     */
    public FrmManter() {
//        setBounds(100, 100, 450, 300);
        setTitle("Manter de Contatos");
        setSize(450, 300);
        setLocationByPlatform(true);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setLayout(new FlowLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        {
            JScrollPane scrollPane = new JScrollPane();
            contentPanel.add(scrollPane);
            {
                table = new JTable();
                scrollPane.setViewportView(table);
            }
        }
        {
            JPanel textPane = new JPanel();
            textPane.setLayout(new GridLayout(0, 2));
            getContentPane().add(textPane, BorderLayout.NORTH);
            {
                JLabel lblNome = new JLabel("Nome");
                textPane.add(lblNome);
            }
            {
                txtNome = new JTextField();
                textPane.add(txtNome);
                txtNome.setColumns(10);
            }
            {
                JLabel lblTelefone = new JLabel("Telefone");
                textPane.add(lblTelefone);
            }
            {
                txtTelefone = new JTextField();
                textPane.add(txtTelefone);
                txtTelefone.setColumns(10);
            }
            {
                JLabel lblNewLabel = new JLabel("Email");
                textPane.add(lblNewLabel);
            }
            {
                txtEmail = new JTextField();
                textPane.add(txtEmail);
                txtEmail.setColumns(10);
            }

            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton btnRemover = new JButton("Remover");
                btnRemover.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    }
                });
                {
                    JButton btnAdicionar = new JButton("Adicionar");
                    btnAdicionar.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Contato novo = new Contato();
                            novo.setNome(txtNome.getText());
                            novo.setTelefone(txtTelefone.getText());
                            novo.setEmail(txtEmail.getText());
                            ContatoServicos cts = new ContatoServicos();
                            cts.addContato(novo);
                            limparTxt();
                        }

                        private void limparTxt() {
                            txtNome.setText("");
                            txtTelefone.setText("");
                            txtEmail.setText("");
                            txtNome.setFocusable(true);
                        }
                    });
                    buttonPane.add(btnAdicionar);
                }
                {
                    JButton btnAtualizar = new JButton("Atualizar");
                    buttonPane.add(btnAtualizar);
                }
                btnRemover.setActionCommand("OK");
                buttonPane.add(btnRemover);
                getRootPane().setDefaultButton(btnRemover);
            }
            {
                JButton btnFechar = new JButton("Fechar");
                btnFechar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        FrmManter.this.setVisible(false);
                        FrmManter.this.dispose();

                    }
                });
                buttonPane.add(btnFechar);
            }
        }
    }

}
