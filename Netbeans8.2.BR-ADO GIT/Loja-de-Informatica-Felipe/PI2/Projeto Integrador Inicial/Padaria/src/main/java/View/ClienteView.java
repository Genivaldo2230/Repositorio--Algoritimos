/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Model.Cliente;
import Generic.Validador;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteView extends javax.swing.JFrame {

    private String modoTela;

    public ClienteView() {
        initComponents();
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();

    }

    public void LoadTable() {

        //Peço ao controller resgatar os clientes do banco de dados
        ArrayList<Cliente> clientes = ClienteController.selectLista();

        //Opção 1 - Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmClientes = new DefaultTableModel();
        tmClientes.addColumn("ID");
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");
        tblClientes.setModel(tmClientes);

        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(150);
    }

    public void LimparFormulario() {
        txtIDCliente.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtDataNascimento.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");

    }

    public void DesabilitarFormulario() {
        txtIDCliente.setEditable(false);
        txtNome.setEditable(false);
        txtCPF.setEditable(false);
        txtDataNascimento.setEditable(false);
        txtEndereco.setEditable(false);
        txtTelefone.setEditable(false);
        txtEmail.setEditable(false);

        btnSalvarCliente.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    /**
     * Método auxiliar para habilitar campos do formulário
     */
    public void HabilitarFormulario() {
        txtIDCliente.setEditable(true);
        txtNome.setEditable(true);
        txtCPF.setEditable(true);
        txtDataNascimento.setEditable(true);
        txtEndereco.setEditable(true);
        txtTelefone.setEditable(true);
        txtEmail.setEditable(true);

        btnSalvarCliente.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAbaCadastroCliente = new javax.swing.JPanel();
        pnlFormulario = new javax.swing.JPanel();
        txtIDCliente = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNomeCliente1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        cboCargoUsuario1 = new javax.swing.JComboBox<>();
        lblDataNascimento = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        lblIDCliente = new javax.swing.JLabel();
        pnlTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnSalvarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        txtIDCliente.setEnabled(false);

        lblValorUnitario.setText("CPF:");

        lblNomeCliente.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        lblNomeCliente1.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyTyped(evt);
            }
        });

        lblEndereco.setText("Endereço:");

        lblSexo.setText("Sexo:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));

        lblEstadoCivil.setText("Estado Civil:");

        cboCargoUsuario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Separado", "Divorciado ", "Viúvo" }));

        lblDataNascimento.setText("Data Nascimento:");

        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });

        lblTelefone.setText("Telefone:");

        lblIDCliente.setText("ID:");

        pnlTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tblClientes.getColumnModel().getColumn(1).setMinWidth(250);
            tblClientes.getColumnModel().getColumn(2).setMinWidth(60);
        }

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirCliente)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditarCliente, btnExcluirCliente, btnNovo});

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTabelaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setToolTipText("");

        txtDataNascimento.setToolTipText("");
        txtDataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDataNascimentoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSexo)
                    .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEndereco)
                        .addComponent(lblNomeCliente1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstadoCivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboCargoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblValorUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvarCliente))
                .addGap(43, 43, 43))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDCliente)
                            .addComponent(lblValorUnitario)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeCliente)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(lblDataNascimento)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnSalvarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeCliente1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(cboCargoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAbaCadastroClienteLayout = new javax.swing.GroupLayout(pnlAbaCadastroCliente);
        pnlAbaCadastroCliente.setLayout(pnlAbaCadastroClienteLayout);
        pnlAbaCadastroClienteLayout.setHorizontalGroup(
            pnlAbaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAbaCadastroClienteLayout.setVerticalGroup(
            pnlAbaCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAbaCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar Cliente", pnlAbaCadastroCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed

        if (tblClientes.getRowCount() > 0) {
            // int numeroLinha = tblClientes.getSelectedRow();
            int numeroLinha = 0;

            //if(ClienteController.excluir( Integer.parseInt(tblClientes.getValueAt(numeroLinha,0).toString()) ) )
            if (ClienteController.excluir(0)) {
                this.LoadTable();
                JOptionPane.showMessageDialog(this, "Cliente excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o cliente!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para excluir!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        //Verifico se há linhas para poder editar
        if (tblClientes.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            if (tblClientes.getSelectedRow() >= 0) {
                HabilitarFormulario();

                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
                txtIDCliente.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 0).toString());
                txtNome.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 1).toString());
                txtCPF.setText(tblClientes.getModel().getValueAt(tblClientes.getSelectedRow(), 2).toString());
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para editar!");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed

        if (ValidarFormulario()) {
            if (modoTela.equals("Criar")) {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if (ClienteController.salvar(txtNome.getText(), txtCPF.getText())) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();

                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    LimparFormulario();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente!");
                }

            } else {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                // if(ClienteController.atualizar(Integer.parseInt(txtIDCliente.getText()), txtNome.getText(),txtCPF.getText()))
                if (ClienteController.atualizar(0, txtNome.getText(), txtCPF.getText())) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao atualizar cliente!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();

        }


    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DesabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        if (txtNome.getText().length() > 50) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Somente 50 caracteres");
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACKSPACE)) {
            evt.consume();
        }

        if (txtTelefone.getText().length() > 12) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "atingiu o limte");
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if (txtEmail.getText().length() > 70) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Somente 70 caracteres");
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtDataNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataNascimentoKeyTyped
       char c = evt.getKeyChar();
       
       if(c != '/'){
           if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACKSPACE)    ) {
            evt.consume();
        }
       }
            
        if(txtDataNascimento.getText().length() > 9){
             evt.consume();
            JOptionPane.showMessageDialog(this, "atingiu o limte");
        }
    }//GEN-LAST:event_txtDataNascimentoKeyTyped

    private void txtEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyTyped
       if(txtEndereco.getText().length() > 70){
             evt.consume();
            JOptionPane.showMessageDialog(this, "atingiu o limte de caracteres");
        }
    }//GEN-LAST:event_txtEnderecoKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JComboBox<String> cboCargoUsuario1;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeCliente1;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JPanel pnlAbaCadastroCliente;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JTable tblClientes;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {

        if (this.txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um nome para o cliente!");
            return false;
        }

        if (this.txtCPF.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        } else {
            Generic.Validador validador = new Validador();

            boolean cpf = validador.isCPF(this.txtCPF.getText());
            if (!cpf) {
                JOptionPane.showMessageDialog(this, "Defina um CPF válido para cliente!");
                return false;
            }

        }
        if (this.txtDataNascimento.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina uma Data de Nascimento  para cliente!");
            return false;
        }
        if (this.txtEndereco.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um Endereco para cliente!");
            return false;
        }
        if (this.txtTelefone.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um Telefone para cliente!");
            return false;
        }
        if (this.txtEmail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um Email para cliente!");
            return false;
        }

        return true;

    }
}
