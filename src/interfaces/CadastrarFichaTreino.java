
package interfaces;

import entidade.Visão;
import java.util.Vector;
import controlador.ControladorCadastroFichaTreino;
import entidade.Aluno;
import entidade.Instrutor;
import javax.swing.DefaultComboBoxModel;
import entidade.Ficha_Treino;
import entidade.Ficha_Treino.TipoTreino;
import javax.swing.JOptionPane;


public class CadastrarFichaTreino extends javax.swing.JFrame {
    
    Vector<Visão<String>> alunos_cadastrados, instrutores_cadastrados;
    ControladorCadastroFichaTreino controlador;


    public CadastrarFichaTreino(ControladorCadastroFichaTreino controlador) {
        this.controlador = controlador;
        alunos_cadastrados = Aluno.getVisões();
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

        segundaButtonGroup = new javax.swing.ButtonGroup();
        terçaButtonGroup = new javax.swing.ButtonGroup();
        quartaButtonGroup = new javax.swing.ButtonGroup();
        quintaButtonGroup = new javax.swing.ButtonGroup();
        sextaButtonGroup = new javax.swing.ButtonGroup();
        sabadoButtonGroup = new javax.swing.ButtonGroup();
        lista_alunosLabel = new javax.swing.JLabel();
        lista_alunosComboBox = new javax.swing.JComboBox<>();
        lista_instrutoresLabel = new javax.swing.JLabel();
        lista_instrutoresComboBox = new javax.swing.JComboBox<>();
        horárioLabel = new javax.swing.JLabel();
        horárioTextField = new javax.swing.JFormattedTextField();
        id_Label = new javax.swing.JLabel();
        id_TextField = new javax.swing.JTextField();
        segunda_feiraLabel = new javax.swing.JLabel();
        segundaARadioButton = new javax.swing.JRadioButton();
        segundaBRadioButton = new javax.swing.JRadioButton();
        segundaCRadioButton = new javax.swing.JRadioButton();
        tercafeira_label = new javax.swing.JLabel();
        terçaARadioButton = new javax.swing.JRadioButton();
        terçaBRadioButton = new javax.swing.JRadioButton();
        terçaCRadioButton = new javax.swing.JRadioButton();
        quartafeiraLabel = new javax.swing.JLabel();
        quartaARadioButton = new javax.swing.JRadioButton();
        quartaBRadioButton = new javax.swing.JRadioButton();
        quartaCRadioButton = new javax.swing.JRadioButton();
        quartaNRadioButton = new javax.swing.JRadioButton();
        segundaNRadioButton = new javax.swing.JRadioButton();
        tercaNRadioButton = new javax.swing.JRadioButton();
        quintafeiraLabel1 = new javax.swing.JLabel();
        quintaARadioButton = new javax.swing.JRadioButton();
        quintaBRadioButton = new javax.swing.JRadioButton();
        quintaCRadioButton = new javax.swing.JRadioButton();
        quintaNRadioButton = new javax.swing.JRadioButton();
        sextafeiraLabel = new javax.swing.JLabel();
        sextaARadioButton = new javax.swing.JRadioButton();
        sextaBRadioButton = new javax.swing.JRadioButton();
        sextaCRadioButton = new javax.swing.JRadioButton();
        sextaNRadioButton = new javax.swing.JRadioButton();
        sabadoLabel = new javax.swing.JLabel();
        sabadoARadioButton = new javax.swing.JRadioButton();
        sabadoBRadioButton = new javax.swing.JRadioButton();
        sabadoCRadioButton = new javax.swing.JRadioButton();
        sabadoNRadioButton = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lista_alunosLabel.setText("Lista de Alunos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(55, 104, 0, 0);
        getContentPane().add(lista_alunosLabel, gridBagConstraints);

        lista_alunosComboBox.setModel(new DefaultComboBoxModel(alunos_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(52, 0, 0, 2);
        getContentPane().add(lista_alunosComboBox, gridBagConstraints);

        lista_instrutoresLabel.setText("Lista de Instrutores:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(9, 104, 0, 0);
        getContentPane().add(lista_instrutoresLabel, gridBagConstraints);

        lista_instrutoresComboBox.setModel(new DefaultComboBoxModel(instrutores_cadastrados));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 113);
        getContentPane().add(lista_instrutoresComboBox, gridBagConstraints);

        horárioLabel.setText("Horário:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(horárioLabel, gridBagConstraints);

        horárioTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(horárioTextField, gridBagConstraints);

        id_Label.setText("ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(id_Label, gridBagConstraints);

        id_TextField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 51;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(id_TextField, gridBagConstraints);

        segunda_feiraLabel.setText("Segunda-Feira:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        getContentPane().add(segunda_feiraLabel, gridBagConstraints);

        segundaButtonGroup.add(segundaARadioButton);
        segundaARadioButton.setText("Treino A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(segundaARadioButton, gridBagConstraints);
        segundaARadioButton.getAccessibleContext().setAccessibleParent(segunda_feiraLabel);

        segundaButtonGroup.add(segundaBRadioButton);
        segundaBRadioButton.setText("Treino B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(segundaBRadioButton, gridBagConstraints);

        segundaButtonGroup.add(segundaCRadioButton);
        segundaCRadioButton.setText("Treino C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        getContentPane().add(segundaCRadioButton, gridBagConstraints);

        tercafeira_label.setText("Terça-Feira:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(tercafeira_label, gridBagConstraints);

        terçaButtonGroup.add(terçaARadioButton);
        terçaARadioButton.setText("Treino A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        getContentPane().add(terçaARadioButton, gridBagConstraints);

        terçaButtonGroup.add(terçaBRadioButton);
        terçaBRadioButton.setText("Treino B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        getContentPane().add(terçaBRadioButton, gridBagConstraints);

        terçaButtonGroup.add(terçaCRadioButton);
        terçaCRadioButton.setText("Treino C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        getContentPane().add(terçaCRadioButton, gridBagConstraints);

        quartafeiraLabel.setText("Quarta-Feira:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(quartafeiraLabel, gridBagConstraints);

        quartaButtonGroup.add(quartaARadioButton);
        quartaARadioButton.setText("Treino A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        getContentPane().add(quartaARadioButton, gridBagConstraints);

        quartaButtonGroup.add(quartaBRadioButton);
        quartaBRadioButton.setText("Treino B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        getContentPane().add(quartaBRadioButton, gridBagConstraints);

        quartaButtonGroup.add(quartaCRadioButton);
        quartaCRadioButton.setText("Treino C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        getContentPane().add(quartaCRadioButton, gridBagConstraints);

        quartaButtonGroup.add(quartaNRadioButton);
        quartaNRadioButton.setSelected(true);
        quartaNRadioButton.setText("Nenhum");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        getContentPane().add(quartaNRadioButton, gridBagConstraints);

        segundaButtonGroup.add(segundaNRadioButton);
        segundaNRadioButton.setSelected(true);
        segundaNRadioButton.setText("Nenhum");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        getContentPane().add(segundaNRadioButton, gridBagConstraints);

        terçaButtonGroup.add(tercaNRadioButton);
        tercaNRadioButton.setSelected(true);
        tercaNRadioButton.setText("Nenhum");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        getContentPane().add(tercaNRadioButton, gridBagConstraints);

        quintafeiraLabel1.setText("Quinta-Feira:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(quintafeiraLabel1, gridBagConstraints);

        quintaButtonGroup.add(quintaARadioButton);
        quintaARadioButton.setText("Treino A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        getContentPane().add(quintaARadioButton, gridBagConstraints);

        quintaButtonGroup.add(quintaBRadioButton);
        quintaBRadioButton.setText("Treino B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        getContentPane().add(quintaBRadioButton, gridBagConstraints);

        quintaButtonGroup.add(quintaCRadioButton);
        quintaCRadioButton.setText("Treino C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        getContentPane().add(quintaCRadioButton, gridBagConstraints);

        quintaButtonGroup.add(quintaNRadioButton);
        quintaNRadioButton.setSelected(true);
        quintaNRadioButton.setText("Nenhum");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        getContentPane().add(quintaNRadioButton, gridBagConstraints);

        sextafeiraLabel.setText("Sexta-Feira:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(sextafeiraLabel, gridBagConstraints);

        sextaButtonGroup.add(sextaARadioButton);
        sextaARadioButton.setText("Treino A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        getContentPane().add(sextaARadioButton, gridBagConstraints);

        sextaButtonGroup.add(sextaBRadioButton);
        sextaBRadioButton.setText("Treino B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        getContentPane().add(sextaBRadioButton, gridBagConstraints);

        sextaButtonGroup.add(sextaCRadioButton);
        sextaCRadioButton.setText("Treino C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        getContentPane().add(sextaCRadioButton, gridBagConstraints);

        sextaButtonGroup.add(sextaNRadioButton);
        sextaNRadioButton.setSelected(true);
        sextaNRadioButton.setText("Nenhum");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        getContentPane().add(sextaNRadioButton, gridBagConstraints);

        sabadoLabel.setText("Sábado:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(sabadoLabel, gridBagConstraints);

        sabadoButtonGroup.add(sabadoARadioButton);
        sabadoARadioButton.setText("Treino A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        getContentPane().add(sabadoARadioButton, gridBagConstraints);

        sabadoButtonGroup.add(sabadoBRadioButton);
        sabadoBRadioButton.setText("Treino B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        getContentPane().add(sabadoBRadioButton, gridBagConstraints);

        sabadoButtonGroup.add(sabadoCRadioButton);
        sabadoCRadioButton.setText("Treino C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        getContentPane().add(sabadoCRadioButton, gridBagConstraints);

        sabadoButtonGroup.add(sabadoNRadioButton);
        sabadoNRadioButton.setSelected(true);
        sabadoNRadioButton.setText("Nenhum");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 11;
        getContentPane().add(sabadoNRadioButton, gridBagConstraints);

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirButtonActionPerformed(evt);
            }
        });

        alterarButton.setText("Alterar");

        removerButton.setText("Remover");

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
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
                .addComponent(inserirButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 47, 92);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
         limparCampos();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
            Ficha_Treino ficha = null;
            Visão<String> aluno, instrutor;
            aluno = (Visão<String>)lista_alunosComboBox.getSelectedItem();
            instrutor = (Visão<String>)lista_instrutoresComboBox.getSelectedItem();
            if (aluno != null && instrutor != null){
                ficha = Ficha_Treino.buscarFichaTreino(aluno.getChave(), instrutor.getChave());
                if (ficha != null){
                    horárioTextField.setText(ficha.getHorario());
                    id_TextField.setText(Integer.toString(ficha.getId()));
                    if (ficha.getSegunda() == TipoTreino.TreinoA)
                        segundaARadioButton.setSelected(true);
                    else if (ficha.getSegunda() == TipoTreino.TreinoB)
                        segundaBRadioButton.setSelected(true);
                    else if (ficha.getSegunda() == TipoTreino.TreinoC)
                        segundaCRadioButton.setSelected(true);
                    else
                        segundaNRadioButton.setSelected(true);

                    if (ficha.getTerça()== TipoTreino.TreinoA)
                       terçaARadioButton.setSelected(true);
                    else if (ficha.getTerça() == TipoTreino.TreinoB)
                        terçaBRadioButton.setSelected(true);
                    else if (ficha.getTerça() == TipoTreino.TreinoC)
                        terçaCRadioButton.setSelected(true);
                    else
                        tercaNRadioButton.setSelected(true);

                    if (ficha.getQuarta()== TipoTreino.TreinoA)
                       quartaARadioButton.setSelected(true);
                    else if (ficha.getQuarta() == TipoTreino.TreinoB)
                        quartaBRadioButton.setSelected(true);
                    else if (ficha.getQuarta() == TipoTreino.TreinoC)
                        quartaCRadioButton.setSelected(true);
                    else
                        quartaNRadioButton.setSelected(true);

                    if (ficha.getQuinta()== TipoTreino.TreinoA)
                       quintaARadioButton.setSelected(true);
                    else if (ficha.getQuinta() == TipoTreino.TreinoB)
                        quintaBRadioButton.setSelected(true);
                    else if (ficha.getQuinta() == TipoTreino.TreinoC)
                        quintaCRadioButton.setSelected(true);
                    else
                        tercaNRadioButton.setSelected(true);

                    if (ficha.getSexta()== TipoTreino.TreinoA)
                       sextaARadioButton.setSelected(true);
                    else if (ficha.getSexta() == TipoTreino.TreinoB)
                        sextaBRadioButton.setSelected(true);
                    else if (ficha.getSexta() == TipoTreino.TreinoC)
                            sextaCRadioButton.setSelected(true);
                    else
                        sextaNRadioButton.setSelected(true);

                    if (ficha.getSabado()== TipoTreino.TreinoA)
                       sabadoARadioButton.setSelected(true);
                    else if (ficha.getSabado() == TipoTreino.TreinoB)
                        sabadoBRadioButton.setSelected(true);
                    else if (ficha.getSabado() == TipoTreino.TreinoC)
                            sabadoCRadioButton.setSelected(true);
                    else
                        sabadoNRadioButton.setSelected(true);
               }
                else
                     JOptionPane.showMessageDialog(this, "Ficha de treino não encontrada!", "ERRO!", JOptionPane.INFORMATION_MESSAGE);
 
            }
            else 
                JOptionPane.showMessageDialog(this, "Aluno ou instrutor não selecionado!", "ERRO!", JOptionPane.INFORMATION_MESSAGE);
            
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirButtonActionPerformed
            Ficha_Treino ficha = null;
            String erro = null;
            ficha = obterFicha();
            if (ficha != null){
                erro = ControladorCadastroFichaTreino.inserirFichaTreino(ficha);
                if (erro == null){
                   JOptionPane.showMessageDialog(this, "Ficha de treino inserida com sucesso!", "ERRO!", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(this, erro, "ERRO!", JOptionPane.INFORMATION_MESSAGE);
            }
                
    }//GEN-LAST:event_inserirButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarFichaTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFichaTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFichaTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFichaTreino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel horárioLabel;
    private javax.swing.JFormattedTextField horárioTextField;
    private javax.swing.JLabel id_Label;
    private javax.swing.JTextField id_TextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparButton;
    private javax.swing.JComboBox<String> lista_alunosComboBox;
    private javax.swing.JLabel lista_alunosLabel;
    private javax.swing.JComboBox<String> lista_instrutoresComboBox;
    private javax.swing.JLabel lista_instrutoresLabel;
    private javax.swing.JRadioButton quartaARadioButton;
    private javax.swing.JRadioButton quartaBRadioButton;
    private javax.swing.ButtonGroup quartaButtonGroup;
    private javax.swing.JRadioButton quartaCRadioButton;
    private javax.swing.JRadioButton quartaNRadioButton;
    private javax.swing.JLabel quartafeiraLabel;
    private javax.swing.JRadioButton quintaARadioButton;
    private javax.swing.JRadioButton quintaBRadioButton;
    private javax.swing.ButtonGroup quintaButtonGroup;
    private javax.swing.JRadioButton quintaCRadioButton;
    private javax.swing.JRadioButton quintaNRadioButton;
    private javax.swing.JLabel quintafeiraLabel1;
    private javax.swing.JButton removerButton;
    private javax.swing.JRadioButton sabadoARadioButton;
    private javax.swing.JRadioButton sabadoBRadioButton;
    private javax.swing.ButtonGroup sabadoButtonGroup;
    private javax.swing.JRadioButton sabadoCRadioButton;
    private javax.swing.JLabel sabadoLabel;
    private javax.swing.JRadioButton sabadoNRadioButton;
    private javax.swing.JRadioButton segundaARadioButton;
    private javax.swing.JRadioButton segundaBRadioButton;
    private javax.swing.ButtonGroup segundaButtonGroup;
    private javax.swing.JRadioButton segundaCRadioButton;
    private javax.swing.JRadioButton segundaNRadioButton;
    private javax.swing.JLabel segunda_feiraLabel;
    private javax.swing.JRadioButton sextaARadioButton;
    private javax.swing.JRadioButton sextaBRadioButton;
    private javax.swing.ButtonGroup sextaButtonGroup;
    private javax.swing.JRadioButton sextaCRadioButton;
    private javax.swing.JRadioButton sextaNRadioButton;
    private javax.swing.JLabel sextafeiraLabel;
    private javax.swing.JRadioButton tercaNRadioButton;
    private javax.swing.JLabel tercafeira_label;
    private javax.swing.JRadioButton terçaARadioButton;
    private javax.swing.JRadioButton terçaBRadioButton;
    private javax.swing.ButtonGroup terçaButtonGroup;
    private javax.swing.JRadioButton terçaCRadioButton;
    // End of variables declaration//GEN-END:variables


    public void limparCampos(){
        horárioTextField.setText("");
        id_TextField.setText("");
        segundaButtonGroup.setSelected(segundaNRadioButton.getModel(), true);
        terçaButtonGroup.setSelected(tercaNRadioButton.getModel(), true);
        quartaButtonGroup.setSelected(quartaNRadioButton.getModel(), true);
        quintaButtonGroup.setSelected(quintaNRadioButton.getModel(), true);
        sextaButtonGroup.setSelected(sextaNRadioButton.getModel(), true);
        sabadoButtonGroup.setSelected(sabadoNRadioButton.getModel(), true);             
    }
    
    public Ficha_Treino obterFicha(){
        Visão<String> aluno = null, instrutor = null;
        String horario = null, id = null;
        TipoTreino segunda = null, terca = null, quarta = null, quinta = null, sexta = null, sabado = null;
        
        aluno = (Visão<String>)lista_alunosComboBox.getSelectedItem();   
        instrutor = (Visão<String>)lista_instrutoresComboBox.getSelectedItem();
        horario = horárioTextField.getText();
        id = id_TextField.getText();
        if (segundaARadioButton.isSelected())
            segunda = TipoTreino.TreinoA;
        else if (segundaBRadioButton.isSelected())
            segunda = TipoTreino.TreinoB;
        else if (segundaCRadioButton.isSelected())
            segunda = TipoTreino.TreinoC;
        else
            segunda = null;
        
        if (terçaARadioButton.isSelected())
            terca = TipoTreino.TreinoA;
        else if (terçaBRadioButton.isSelected())
            terca = TipoTreino.TreinoB;
        else if (terçaCRadioButton.isSelected())
            terca = TipoTreino.TreinoC;
        else
            terca = null;
        
        if (quartaARadioButton.isSelected())
            quarta = TipoTreino.TreinoA;
        else if (quartaBRadioButton.isSelected())
            quarta = TipoTreino.TreinoB;
        else if (quartaCRadioButton.isSelected())
            quarta = TipoTreino.TreinoC;
        else
            quarta = null;
        
        if (quintaARadioButton.isSelected())
            quinta = TipoTreino.TreinoA;
        else if (quintaBRadioButton.isSelected())
            quinta = TipoTreino.TreinoB;
        else if (quintaCRadioButton.isSelected())
            quinta = TipoTreino.TreinoC;
        else
            quinta = null;
        
        if (sextaARadioButton.isSelected())
            sexta = TipoTreino.TreinoA;
        else if (sextaBRadioButton.isSelected())
            sexta = TipoTreino.TreinoB;
        else if (sextaCRadioButton.isSelected())
            sexta = TipoTreino.TreinoC;
        else
            sexta = null;
        
        if (sabadoARadioButton.isSelected())
            sabado = TipoTreino.TreinoA;
        else if (sabadoBRadioButton.isSelected())
            sabado = TipoTreino.TreinoB;
        else if (sabadoCRadioButton.isSelected())
            sabado = TipoTreino.TreinoC;
        else
            sabado = null;
        
        if(aluno != null || instrutor != null || !horario.isEmpty() || segunda != null || terca != null || quarta != null || quinta != null || sexta != null || sabado != null){
            return new Ficha_Treino(Aluno.buscarAluno(aluno.getChave()), Instrutor.buscarInstrutor(instrutor.getChave()), horario, segunda, terca, quarta, quinta, sexta, sabado);
        }
        else{
            JOptionPane.showMessageDialog(this, "Algum campo está em branco!!", "ERRO!", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }

        
}
    
    
}