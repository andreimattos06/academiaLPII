/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import javax.swing.JOptionPane;
import java.util.Date;
import entidade.Aluno;
import entidade.Endereço;

/**
 *
 * @author 05320469195
 */
public class CadastrarAluno extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarAluno
     */
    public CadastrarAluno() {
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

        nome_alunoLabel = new javax.swing.JLabel();
        nome_TextField = new javax.swing.JTextField();
        sobrenome_alunoLabel = new javax.swing.JLabel();
        sobrenome_TextField = new javax.swing.JTextField();
        cpf_alunoLabel = new javax.swing.JLabel();
        cpf_TextField = new javax.swing.JTextField();
        data_nascimento_alunoLabel = new javax.swing.JLabel();
        altura_alunoLabel = new javax.swing.JLabel();
        peso_alunoLabel = new javax.swing.JLabel();
        nome_rua_Label = new javax.swing.JLabel();
        logradouro_TextField = new javax.swing.JTextField();
        bairro_Label = new javax.swing.JLabel();
        bairro_TextField = new javax.swing.JTextField();
        numero_Label = new javax.swing.JLabel();
        cep_Label = new javax.swing.JLabel();
        cep_TextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cadastrar_alunoButton = new javax.swing.JButton();
        alterar_alunoButton = new javax.swing.JButton();
        remover_alunoButton = new javax.swing.JButton();
        consultar_alunoButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        lista_alunoLabel = new javax.swing.JLabel();
        lista_alunosComboBox = new javax.swing.JComboBox<>();
        data_nascimento_TextField = new javax.swing.JFormattedTextField();
        altura_TextField = new javax.swing.JFormattedTextField();
        peso_TextField = new javax.swing.JFormattedTextField();
        numero_TextField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        cidade_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nome_alunoLabel.setText("Nome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(14, 0, 0, 0);
        getContentPane().add(nome_alunoLabel, gridBagConstraints);

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

        sobrenome_alunoLabel.setText("Sobrenome:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(sobrenome_alunoLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 1, 0, 61);
        getContentPane().add(sobrenome_TextField, gridBagConstraints);

        cpf_alunoLabel.setText("CPF:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(cpf_alunoLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        getContentPane().add(cpf_TextField, gridBagConstraints);

        data_nascimento_alunoLabel.setText("Data da Nascimento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        getContentPane().add(data_nascimento_alunoLabel, gridBagConstraints);

        altura_alunoLabel.setText("Altura:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(altura_alunoLabel, gridBagConstraints);

        peso_alunoLabel.setText("Peso:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(peso_alunoLabel, gridBagConstraints);

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

        cadastrar_alunoButton.setText("Cadastrar");
        cadastrar_alunoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_alunoButtonActionPerformed(evt);
            }
        });

        alterar_alunoButton.setText("Alterar");

        remover_alunoButton.setText("Remover");

        consultar_alunoButton.setText("Consultar");

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
                .addComponent(cadastrar_alunoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterar_alunoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remover_alunoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultar_alunoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrar_alunoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterar_alunoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remover_alunoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(consultar_alunoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limparButton))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 60);
        getContentPane().add(jPanel1, gridBagConstraints);

        lista_alunoLabel.setText("Lista de Alunos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(53, 0, 0, 0);
        getContentPane().add(lista_alunoLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        getContentPane().add(lista_alunosComboBox, gridBagConstraints);

        data_nascimento_TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        data_nascimento_TextField.setText("(dd/mm/aaaa)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 31);
        getContentPane().add(data_nascimento_TextField, gridBagConstraints);

        altura_TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 51;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        getContentPane().add(altura_TextField, gridBagConstraints);

        peso_TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 51;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(peso_TextField, gridBagConstraints);

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

    private void cadastrar_alunoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_alunoButtonActionPerformed
        Aluno aluno = obterAluno();
       
        if (aluno != null){
           
        }
    }//GEN-LAST:event_cadastrar_alunoButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limparCampos();
    }//GEN-LAST:event_limparButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar_alunoButton;
    private javax.swing.JFormattedTextField altura_TextField;
    private javax.swing.JLabel altura_alunoLabel;
    private javax.swing.JLabel bairro_Label;
    private javax.swing.JTextField bairro_TextField;
    private javax.swing.JButton cadastrar_alunoButton;
    private javax.swing.JLabel cep_Label;
    private javax.swing.JTextField cep_TextField;
    private javax.swing.JTextField cidade_TextField;
    private javax.swing.JButton consultar_alunoButton;
    private javax.swing.JTextField cpf_TextField;
    private javax.swing.JLabel cpf_alunoLabel;
    private javax.swing.JFormattedTextField data_nascimento_TextField;
    private javax.swing.JLabel data_nascimento_alunoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel lista_alunoLabel;
    private javax.swing.JComboBox<String> lista_alunosComboBox;
    private javax.swing.JTextField logradouro_TextField;
    private javax.swing.JTextField nome_TextField;
    private javax.swing.JLabel nome_alunoLabel;
    private javax.swing.JLabel nome_rua_Label;
    private javax.swing.JLabel numero_Label;
    private javax.swing.JFormattedTextField numero_TextField;
    private javax.swing.JFormattedTextField peso_TextField;
    private javax.swing.JLabel peso_alunoLabel;
    private javax.swing.JButton remover_alunoButton;
    private javax.swing.JTextField sobrenome_TextField;
    private javax.swing.JLabel sobrenome_alunoLabel;
    // End of variables declaration//GEN-END:variables

    private Aluno obterAluno(){
        String nome = null, sobrenome = null, cpf = null, data_nascimento = null, logradouro = null, bairro = null, cep = null, peso = null, altura = null, num = null, cidade = null;
        int ano, mes, dia;
         nome = nome_TextField.getText();
         sobrenome = sobrenome_TextField.getText();
         cpf = cpf_TextField.getText();
         data_nascimento = data_nascimento_TextField.getText();
         logradouro = logradouro_TextField.getText();
         bairro = bairro_TextField.getText();
         cidade = cidade_TextField.getText();
         cep = cep_TextField.getText();
         peso = peso_TextField.getText();
         altura = altura_TextField.getText();
         num = numero_TextField.getText();
        
      if (nome.isEmpty() || sobrenome.isEmpty() || cpf.isEmpty() || data_nascimento.isEmpty() || logradouro.isEmpty() || bairro.isEmpty() || cep.isEmpty() || peso.isEmpty() ||altura.isEmpty() || num.isEmpty() || cidade.isEmpty()){
            JOptionPane.showMessageDialog(this, "Algum campo está em branco.", "ERRO!", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
      dia = Integer.parseInt(Character.toString(data_nascimento.charAt(0)) + Character.toString(data_nascimento.charAt(1)));
      mes = Integer.parseInt(Character.toString(data_nascimento.charAt(3)) + Character.toString(data_nascimento.charAt(4)));
      ano = Integer.parseInt(Character.toString(data_nascimento.charAt(6)) + Character.toString(data_nascimento.charAt(7)) + Character.toString(data_nascimento.charAt(8))+ Character.toString(data_nascimento.charAt(9)));
        return new Aluno (nome, sobrenome, cpf, new Date(ano, mes, dia), Float.parseFloat(peso.replace(',', '.')), Float.parseFloat(altura.replace(',', '.')), new Endereço(logradouro, bairro, cep, Integer.parseInt(num), cidade));
    }
    
    private void limparCampos(){
        nome_TextField.setText("");
        sobrenome_TextField.setText("");
        cpf_TextField.setText("");
        data_nascimento_TextField.setText("");
        logradouro_TextField.setText("");
        bairro_TextField.setText("");
        cep_TextField.setText("");
        peso_TextField.setText("");
        numero_TextField.setText("");
        altura_TextField.setText("");
        cidade_TextField.setText("");    
    }
    
}

