
package visao;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbMenuBarra = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmCadastro = new javax.swing.JMenu();
        jmiCidade = new javax.swing.JMenuItem();
        jmiBairro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiTipoContato = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiContatos = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        setResizable(false);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquivo.png"))); // NOI18N
        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo");

        jmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jmCadastro.setMnemonic('C');
        jmCadastro.setText("Cadastro");

        jmiCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cidade.png"))); // NOI18N
        jmiCidade.setText("Cidade");
        jmCadastro.add(jmiCidade);

        jmiBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bairro.png"))); // NOI18N
        jmiBairro.setText("Bairro");
        jmCadastro.add(jmiBairro);
        jmCadastro.add(jSeparator2);

        jmiTipoContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiTipoContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipo.png"))); // NOI18N
        jmiTipoContato.setText("Tipos de Contato");
        jmCadastro.add(jmiTipoContato);

        jmArquivo.add(jmCadastro);
        jmArquivo.add(jSeparator1);

        jmiContatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contato.png"))); // NOI18N
        jmiContatos.setText("Contatos");
        jmiContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContatosActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiContatos);

        jmbMenuBarra.add(jmArquivo);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/me.png"))); // NOI18N
        jmSobre.setMnemonic('S');
        jmSobre.setText("Sobre");
        jmbMenuBarra.add(jmSobre);

        setJMenuBar(jmbMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setSize(new java.awt.Dimension(816, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContatosActionPerformed
        // TODO add your handling code here:
        FormPadrao formTela = new FormPadrao();
        jDesktop.add(formTela);
        formTela.setVisible(true);
    }//GEN-LAST:event_jmiContatosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbMenuBarra;
    private javax.swing.JMenuItem jmiBairro;
    private javax.swing.JMenuItem jmiCidade;
    private javax.swing.JMenuItem jmiContatos;
    private javax.swing.JMenuItem jmiTipoContato;
    // End of variables declaration//GEN-END:variables
}
