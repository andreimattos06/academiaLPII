package interfaces;

import entidade.Instrutor;
import entidade.Endereço;
import entidade.Data;
import javax.swing.JOptionPane;
import controlador.ControladorCadastroInstrutor;
import entidade.Visão;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;




public class CadastrarInstrutor extends javax.swing.JFrame {

    ControladorCadastroInstrutor controlador;
    Vector<Visão<String>> instrutores_cadastrados;
    
    
    public CadastrarInstrutor(ControladorCadastroInstrutor controlador) {
        this.controlador = controlador;
        instrutores_cadastrados = Instrutor.getVisões();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        nome_instrutorLabel = new javax.swing.JLabel();
        nome_TextField = new javax.swing.JTextField();
        sobrenome_instrutorLabel = new javax.swing.JLabel();
        sobrenome_TextField = new javax.swing.JTextField();
        cpf_instrutorLabel = new javax.swing.JLabel();
        cpf_TextField = new javax.swing.JTextField();
        data_nascimento_instrutorLabel = new javax.swing.JLabel();
        cref_instrutorLabel = new javax.swing.JLabel();
        nome_rua_Label = new javax.swing.JLabel();
        logradouro_TextField = new javax.swing.JTextField();
        bairro_Label = new javax.swing.JLabel();
        bairro_TextField = new javax.swing.JTextField();
        numero_Label = new javax.swing.JLabel();
        cep_Label = new javax.swing.JLabel();
        cep_TextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cadastrar_instrutorButton = new javax.swing.JButton();
        alterar_instrutorButton = new javax.swing.JButton();
        remover_instrutorButton = new javax.swing.JButton();
        consultar_instrutorButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        lista_instrutorLabel = new javax.swing.JLabel();
        lista_instrutoresComboBox = new javax.swing.JComboBox<>();
        data_nascimento_TextField = new javax.swing.JFormattedTextField();
        cref_TextField = new javax.swing.JFormattedTextField();
        numero_TextField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        cidade_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nome_instrutorLabel.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(14, 0, 0, 0);
        getContentPane().add(nome_instrutorLabel, gridBagConstraints);

        nome_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_TextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 1, 0, 1);
        getContentPane().add(nome_TextField, gridBagConstraints);

        sobrenome_instrutorLabel.setText("Sobrenome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(sobrenome_instrutorLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 1, 0, 61);
        getContentPane().add(sobrenome_TextField, gridBagConstraints);

        cpf_instrutorLabel.setText("CPF:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(cpf_instrutorLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        getContentPane().add(cpf_TextField, gridBagConstraints);

        data_nascimento_instrutorLabel.setText("Data da Nascimento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        getContentPane().add(data_nascimento_instrutorLabel, gridBagConstraints);

        cref_instrutorLabel.setText("CREF:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(cref_instrutorLabel, gridBagConstraints);

        nome_rua_Label.setText("Nome da Rua:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        getContentPane().add(nome_rua_Label, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 142;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        getContentPane().add(logradouro_TextField, gridBagConstraints);

        bairro_Label.setText("Bairro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(bairro_Label, gridBagConstraints);

        bairro_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairro_TextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        getContentPane().add(bairro_TextField, gridBagConstraints);

        numero_Label.setText("Número:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(numero_Label, gridBagConstraints);

        cep_Label.setText("CEP:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(cep_Label, gridBagConstraints);

        cep_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cep_TextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 62);
        getContentPane().add(cep_TextField, gridBagConstraints);

        cadastrar_instrutorButton.setText("Cadastrar");
        cadastrar_instrutorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_instrutorButtonActionPerformed(evt);
            }
        });

        alterar_instrutorButton.setText("Alterar");

        remover_instrutorButton.setText("Remover");

        consultar_instrutorButton.setText("Consultar");
        consultar_instrutorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_instrutorButtonActionPerformed(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cadastrar_instrutorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterar_instrutorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remover_instrutorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultar_instrutorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrar_instrutorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterar_instrutorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remover_instrutorButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(consultar_instrutorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limparButton))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 60);
        getContentPane().add(jPanel1, gridBagConstraints);

        lista_instrutorLabel.setText("Lista de Instrutores:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(53, 0, 0, 0);
        getContentPane().add(lista_instrutorLabel, gridBagConstraints);

        lista_instrutoresComboBox.setModel(new DefaultComboBoxModel(instrutores_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        getContentPane().add(lista_instrutoresComboBox, gridBagConstraints);

        data_nascimento_TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        data_nascimento_TextField.setText("(dd/mm/aaaa)");
        data_nascimento_TextField.setMinimumSize(new java.awt.Dimension(74, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 31);
        getContentPane().add(data_nascimento_TextField, gridBagConstraints);

        cref_TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("######"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        getContentPane().add(cref_TextField, gridBagConstraints);

        numero_TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("######"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(numero_TextField, gridBagConstraints);

        jLabel1.setText("Cidade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 2);
        getContentPane().add(cidade_TextField, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_TextFieldActionPerformed

    private void bairro_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairro_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairro_TextFieldActionPerformed

    private void cep_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cep_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cep_TextFieldActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limparCampos();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void cadastrar_instrutorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_instrutorButtonActionPerformed
        Instrutor novo = null;
        novo = obterInstrutor();
        String erro = null;
        if (novo != null){
            erro = ControladorCadastroInstrutor.inserirInstrutor(novo);
            if (erro != null){
                JOptionPane.showMessageDialog(this, erro, "ERRO!", JOptionPane.INFORMATION_MESSAGE); 
            }
            else{
                JOptionPane.showMessageDialog(this, "Instrutor inserido com sucesso!", "SUCESSO!", JOptionPane.INFORMATION_MESSAGE); 
                Visão<String> novavisao = new Visão<String>(novo.getCref(), novo.getNome() + " - " + novo.getCref());
                instrutores_cadastrados.add(novavisao);
                lista_instrutoresComboBox.updateUI();
                lista_instrutoresComboBox.setSelectedItem(novavisao);
            }
        }
    }//GEN-LAST:event_cadastrar_instrutorButtonActionPerformed

    private void consultar_instrutorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_instrutorButtonActionPerformed
        Instrutor instrutor;
        Visão<String> index = ((Visão<String>)lista_instrutoresComboBox.getSelectedItem());
        if (index != null){
            instrutor = Instrutor.buscarInstrutor(index.getChave());
            if (instrutor != null){
               nome_TextField.setText(instrutor.getNome());
               sobrenome_TextField.setText(instrutor.getSobrenome());
               cpf_TextField.setText(instrutor.getCPF());
               cref_TextField.setText(instrutor.getCref());
               data_nascimento_TextField.setText(instrutor.getData_nascimento().toString());
               logradouro_TextField.setText(instrutor.getEndereço().getLogradouro());
               bairro_TextField.setText(instrutor.getEndereço().getBairro());
               cidade_TextField.setText(instrutor.getEndereço().getCidade());
               cep_TextField.setText(instrutor.getEndereço().getCEP());
               numero_TextField.setText(Integer.toString(instrutor.getEndereço().getNumero()));
            }
           else{
               JOptionPane.showMessageDialog(this, "O CREF não foi encontrado!", "ERRO!", JOptionPane.INFORMATION_MESSAGE);            
                }
        }
        else{
              JOptionPane.showMessageDialog(this, "Nenhum instrutor selecionado!", "ERRO!", JOptionPane.INFORMATION_MESSAGE);  
              }

        
    }//GEN-LAST:event_consultar_instrutorButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar_instrutorButton;
    private javax.swing.JLabel bairro_Label;
    private javax.swing.JTextField bairro_TextField;
    private javax.swing.JButton cadastrar_instrutorButton;
    private javax.swing.JLabel cep_Label;
    private javax.swing.JTextField cep_TextField;
    private javax.swing.JTextField cidade_TextField;
    private javax.swing.JButton consultar_instrutorButton;
    private javax.swing.JTextField cpf_TextField;
    private javax.swing.JLabel cpf_instrutorLabel;
    private javax.swing.JFormattedTextField cref_TextField;
    private javax.swing.JLabel cref_instrutorLabel;
    private javax.swing.JFormattedTextField data_nascimento_TextField;
    private javax.swing.JLabel data_nascimento_instrutorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel lista_instrutorLabel;
    private javax.swing.JComboBox<String> lista_instrutoresComboBox;
    private javax.swing.JTextField logradouro_TextField;
    private javax.swing.JTextField nome_TextField;
    private javax.swing.JLabel nome_instrutorLabel;
    private javax.swing.JLabel nome_rua_Label;
    private javax.swing.JLabel numero_Label;
    private javax.swing.JFormattedTextField numero_TextField;
    private javax.swing.JButton remover_instrutorButton;
    private javax.swing.JTextField sobrenome_TextField;
    private javax.swing.JLabel sobrenome_instrutorLabel;
    // End of variables declaration//GEN-END:variables

    
private Instrutor obterInstrutor(){
        String nome = null, sobrenome = null, cpf = null, data_nascimento = null, logradouro = null, bairro = null, cep = null, num = null, cidade = null, cref = null;
        String ano, mes, dia;
         nome = nome_TextField.getText();
         sobrenome = sobrenome_TextField.getText();
         cpf = cpf_TextField.getText();
         data_nascimento = data_nascimento_TextField.getText();
         cref = cref_TextField.getText();
         logradouro = logradouro_TextField.getText();
         bairro = bairro_TextField.getText();
         cidade = cidade_TextField.getText();
         cep = cep_TextField.getText();
         num = numero_TextField.getText();
        
      if (nome.isEmpty() || sobrenome.isEmpty() || cpf.isEmpty() || data_nascimento.isEmpty() || logradouro.isEmpty() || bairro.isEmpty() || cep.isEmpty() || num.isEmpty() || cidade.isEmpty() || cref.isEmpty() || data_nascimento_TextField.getText().equals("(dd/mm/aaaa)")){
            JOptionPane.showMessageDialog(this, "Algum campo está em branco.", "ERRO!", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
      dia = Character.toString(data_nascimento.charAt(0)) + Character.toString(data_nascimento.charAt(1));
      mes = Character.toString(data_nascimento.charAt(3)) + Character.toString(data_nascimento.charAt(4));
      ano = Character.toString(data_nascimento.charAt(6)) + Character.toString(data_nascimento.charAt(7)) + Character.toString(data_nascimento.charAt(8))+ Character.toString(data_nascimento.charAt(9));

        return new Instrutor(nome, sobrenome, cpf, new Data(dia, mes, ano), cref, new Endereço(logradouro, bairro, cep, Integer.parseInt(num), cidade));
    }

     private void limparCampos(){
        nome_TextField.setText("");
        sobrenome_TextField.setText("");
        cpf_TextField.setText("");
        cref_TextField.setText("");
        data_nascimento_TextField.setText("");
        logradouro_TextField.setText("");
        bairro_TextField.setText("");
        cep_TextField.setText("");
        numero_TextField.setText("");
        cidade_TextField.setText("");    
    }


}
