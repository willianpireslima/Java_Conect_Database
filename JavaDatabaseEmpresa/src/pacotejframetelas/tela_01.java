package pacotejframetelas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tela_01 extends javax.swing.JFrame {

    public tela_01() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        bntUpFun4 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bntShowDepen = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        bntUpFun1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bntaddDepen = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        bntShowProj = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        bntUpFun2 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        bntaddProj = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bntShowFunc = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        bntUpFun = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        bntaddFunc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        bntShowDepart = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        bntUpFun3 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        bntaddDepart = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        bntLog = new javax.swing.JButton();
        bntDepart = new javax.swing.JButton();
        bntProj = new javax.swing.JButton();
        bntDep = new javax.swing.JButton();
        bntFun = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario", "Dependentes", "Departamento", "Projeto" }));

        jLabel22.setText("Selecione A Tabela onde esta  o Item");

        jLabel23.setText("Digite o ID do Item a ser Excluido");

        jButton2.setText("Deletar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField34))
                .addContainerGap(560, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(51, 153, 255));

        jLabel48.setText("Atualizar Dados");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Custo", "ID Depart" }));

        bntUpFun4.setText("Atualizar");
        bntUpFun4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpFun4ActionPerformed(evt);
            }
        });

        jLabel49.setText("ID do Dado");

        jLabel50.setText("Novo Dado");

        jLabel51.setText("Coluna");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntUpFun4))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntUpFun4)
                    .addComponent(jLabel48))
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane2.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Genero", "Nascimento", "Relacao", "ID Funcio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        bntShowDepen.setText("Mostrar Tabela Dependentes");
        bntShowDepen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntShowDepenActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));

        jLabel30.setText("Atualizar Dados");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Genero", "Nascimento", "Relacao", "Id Funcio" }));

        jLabel31.setText("Coluna");

        jLabel32.setText("Novo Dado");

        jLabel33.setText("ID do Dado");

        bntUpFun1.setText("Atualizar");
        bntUpFun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpFun1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntUpFun1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntUpFun1))
                .addGap(15, 15, 15))
        );

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));

        jLabel34.setText("Deletar Dados");

        jLabel35.setText("ID do Dado");

        jButton4.setText("Deletar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addGap(0, 68, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(15, 15, 15))
        );

        jPanel19.setBackground(new java.awt.Color(204, 102, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Dados Do Dependente");

        jLabel12.setText("Nome");

        jLabel11.setText("Genero");

        jLabel10.setText("Nascimento");

        jLabel9.setText("Relacao");

        jLabel8.setText("ID Funcio");

        bntaddDepen.setText("Adicionar");
        bntaddDepen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntaddDepenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(bntaddDepen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel14)))
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(bntaddDepen)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        jLabel54.setText("Buscar Id");

        jButton8.setText("Buscar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntShowDepen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jLabel54)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntShowDepen)
                        .addGap(12, 12, 12))
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane2.addTab("tab3", jPanel2);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Custo", "ID Depart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        bntShowProj.setText("Mostrar Tabela Projeto");
        bntShowProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntShowProjActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(51, 153, 255));

        jLabel36.setText("Atualizar Dados");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Custo", "ID Depart" }));

        bntUpFun2.setText("Atualizar");
        bntUpFun2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpFun2ActionPerformed(evt);
            }
        });

        jLabel39.setText("ID do Dado");

        jLabel38.setText("Novo Dado");

        jLabel37.setText("Coluna");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntUpFun2))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntUpFun2))
                .addGap(15, 15, 15))
        );

        jPanel11.setBackground(new java.awt.Color(0, 204, 204));

        jLabel40.setText("Deletar Dados");

        jLabel41.setText("ID do Dado");

        jButton5.setText("Deletar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(14, 14, 14))
        );

        jPanel18.setBackground(new java.awt.Color(204, 102, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Dados Do Projeto");

        jLabel13.setText("ID");

        jLabel16.setText("Custo");

        jLabel17.setText("ID Depart");

        bntaddProj.setText("Adcionar");
        bntaddProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntaddProjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntaddProj, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel13)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntaddProj)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLabel13)
                    .addContainerGap(186, Short.MAX_VALUE)))
        );

        jLabel55.setText("Buscar");

        jButton9.setText("Buscar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bntShowProj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jLabel55)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bntShowProj))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab4", jPanel4);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Genero", "Nascimento", "Altura", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bntShowFunc.setText("Mostrar Tabela Funcionarios");
        bntShowFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntShowFuncActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));

        jLabel24.setText("Atualizar Dados");

        jLabel28.setText("Coluna");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Genero", "Nascimento", "Altura", "Departamento" }));

        jLabel25.setText("Novo Dado");

        bntUpFun.setText("Atualizar");
        bntUpFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpFunActionPerformed(evt);
            }
        });

        jLabel26.setText("ID do Dado");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jLabel24)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bntUpFun))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel26)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26)
                        .addComponent(jLabel28))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntUpFun)
                        .addComponent(jLabel24))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));

        jLabel27.setText("Deletar Dados");

        jLabel29.setText("ID do Dado");

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(15, 15, 15))
        );

        jPanel16.setBackground(new java.awt.Color(204, 102, 255));

        jLabel2.setText("ID");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Inserir Dados");

        jLabel3.setText("Nome");

        jLabel4.setText("Genero");

        jLabel5.setText("Nascimento");

        jLabel6.setText("Altura");

        jLabel7.setText("Departamento");

        bntaddFunc.setText("Adicionar");
        bntaddFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntaddFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(bntaddFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntaddFunc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel52.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntShowFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(569, 569, 569))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel52)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntShowFunc)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab1", jPanel1);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Custo", "ID Supervisor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        bntShowDepart.setText("Mostrar Tabela Departamento");
        bntShowDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntShowDepartActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(51, 153, 255));

        jLabel42.setText("Atualizar Dados");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Localizacao", "ID Supervisor" }));

        jLabel43.setText("Coluna");

        jLabel44.setText("Novo Dado");

        jLabel45.setText("ID do Dado");

        bntUpFun3.setText("Atualizar");
        bntUpFun3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpFun3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntUpFun3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntUpFun3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(0, 204, 204));

        jLabel46.setText("Deletar Dados");

        jLabel47.setText("ID do Dado");

        jButton6.setText("Deletar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(4, 4, 4)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jButton6))
                .addGap(14, 14, 14))
        );

        jPanel17.setBackground(new java.awt.Color(204, 102, 255));

        bntaddDepart.setText("Adcionar");
        bntaddDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntaddDepartActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Dados Do Departamento");

        jLabel19.setText("ID");

        jLabel20.setText("Localizacao");

        jLabel21.setText("ID Supervisor");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(bntaddDepart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(5, 5, 5)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(bntaddDepart)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        jLabel53.setText("Buscar Id");

        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bntShowDepart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(37, 37, 37))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jLabel53)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntShowDepart)
                        .addGap(12, 12, 12))
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("tab2", jPanel3);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 810, 320));
        jTabbedPane2.getAccessibleContext().setAccessibleName("tab1");

        jPanel6.setBackground(new java.awt.Color(51, 0, 204));

        bntLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotejframetelas/icone_saida.png"))); // NOI18N
        bntLog.setText("Logout");
        bntLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLogActionPerformed(evt);
            }
        });

        bntDepart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotejframetelas/icone_departamento.png"))); // NOI18N
        bntDepart.setText("Departamento");
        bntDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDepartActionPerformed(evt);
            }
        });

        bntProj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotejframetelas/icone_projeto.png"))); // NOI18N
        bntProj.setText("Projeto");
        bntProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntProjActionPerformed(evt);
            }
        });

        bntDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotejframetelas/icone_dependente.png"))); // NOI18N
        bntDep.setText("Depedente");
        bntDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDepActionPerformed(evt);
            }
        });

        bntFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotejframetelas/icone_funcionario.png"))); // NOI18N
        bntFun.setText("Funcionario");
        bntFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntFun)
                .addGap(18, 18, 18)
                .addComponent(bntDep)
                .addGap(17, 17, 17)
                .addComponent(bntProj)
                .addGap(18, 18, 18)
                .addComponent(bntDepart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntLog)
                .addGap(138, 138, 138))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntLog)
                    .addComponent(bntDepart)
                    .addComponent(bntProj)
                    .addComponent(bntDep)
                    .addComponent(bntFun))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLogActionPerformed
    int a = JOptionPane.showConfirmDialog(
            null, "Voce quer sair",
            "Select",
            JOptionPane.YES_NO_OPTION);
    
    if(a==0)
    setVisible(false);        // TODO add your handling code here:
        
    }//GEN-LAST:event_bntLogActionPerformed

    private void bntFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFunActionPerformed
    jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_bntFunActionPerformed

    private void bntDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDepartActionPerformed
    jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_bntDepartActionPerformed

    private void bntProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntProjActionPerformed
    jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_bntProjActionPerformed

    private void bntDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDepActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_bntDepActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    Object id =jTextField34.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();

        String sql ="delete from funcionarios where id_funcionario = '"+id+"'";

        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField34.setText("");

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bntUpFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpFunActionPerformed
    String opcao = jComboBox2.getSelectedItem().toString();
    Object novo = jTextField7.getText();
    Object id = jTextField19.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();

        String sql ="";

        if (opcao == "ID") {
            sql = "update funcionarios set id_funcionario = '"+novo+"' where id_funcionario = '"+id+"'";
        }else if (opcao == "Nome") {
            sql = "update funcionarios set nome = '"+novo+"' where id_funcionario = '"+id+"'";
        }else if (opcao == "Genero") {
            sql = sql = "update funcionarios set genero = '"+novo+"' where id_funcionario = '"+id+"'";
        }else if (opcao == "Nascimento") {
            sql = sql = "update funcionarios set nascimento = '"+novo+"' where id_funcionario = '"+id+"'";
        }else if (opcao == "Altura") {
            sql = sql = "update funcionarios set altura = '"+novo+"' where id_funcionario = '"+id+"'";
        }else if (opcao == "Departamento") {
            sql = sql = "update funcionarios set id_departamento = '"+novo+"' where id_funcionario = '"+id+"'";
        }

        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField7.setText("");
        jTextField19.setText("");

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_bntUpFunActionPerformed

    private void bntShowFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntShowFuncActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable1.getModel();
    tbmodel.setRowCount(0);
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from  funcionarios";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String id =  String.valueOf(rs.getInt("id_funcionario"));
            String nome = rs.getString("nome");
            String genero = rs.getString("genero");
            String nasc = rs.getString("nascimento");
            String altura = String.valueOf(rs.getFloat("altura"));
            String depart = rs.getString("id_departamento");

            String tbData [] = {id,nome,genero,nasc,altura,depart };
            tbmodel = (DefaultTableModel)jTable1.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

        }catch (Exception e) {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_bntShowFuncActionPerformed

    private void bntaddFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntaddFuncActionPerformed
    int id = Integer.parseInt(jTextField1.getText());
    String nome =  jTextField2.getText();
    String genero = jTextField3.getText();
    String nasc =  jTextField4.getText();
    float altura = Float.parseFloat(jTextField5.getText());
    String depart = jTextField6.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "Insert INTO funcionarios VALUES "
        + "('"+id+"','"+nome+"','"+genero+"','"+nasc+"',"
        + "'"+altura+"','"+depart+"')";
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");

        stm.close(); // close statement
        con.close(); //feachando a conexao

    }catch (Exception e) {
    System.out.println(e.getMessage());
    }

    }//GEN-LAST:event_bntaddFuncActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    Object id =jTextField26.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();

        String sql ="delete from projetos where id_projeto = '"+id+"'";

        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField26.setText("");

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bntUpFun2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpFun2ActionPerformed
    String opcao = jComboBox4.getSelectedItem().toString();
    Object novo = jTextField24.getText();
    Object id = jTextField25.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();

        String sql ="";

        if (opcao == "ID") {
            sql = "update projetos set id_projeto = '"+novo+"' where id_projeto = '"+id+"'";
        }else if (opcao == "Custo") {
            sql = sql = "update projetos set custo = '"+novo+"' where id_projeto = '"+id+"'";
        }else if (opcao == "ID Depart") {
            sql = sql = "update projetos set id_departamento = '"+novo+"' where id_projeto = '"+id+"'";
        }

        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField24.setText("");
        jTextField25.setText("");

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_bntUpFun2ActionPerformed

    private void bntShowProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntShowProjActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable3.getModel();
    tbmodel.setRowCount(0);
           
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from  projetos";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String idProj = rs.getString("id_projeto");
            String custo = String.valueOf(rs.getFloat("custo"));
            String idDepart = rs.getString("id_departamento");

            String tbData [] = {idProj,custo,idDepart,idDepart};
            tbmodel = (DefaultTableModel)jTable3.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_bntShowProjActionPerformed

    private void bntaddProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntaddProjActionPerformed
    String idProj = jTextField13.getText();
    int custo = Integer.parseInt(jTextField14.getText());
    String idDepart = jTextField15.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "Insert INTO projetos VALUES "
        + "('"+idProj+"','"+custo+"','"+idDepart+"')";
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");

        stm.close(); // close statement
        con.close(); //feachando a conexao

    }catch (Exception e) {
    System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_bntaddProjActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    Object id =jTextField23.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();

        String sql ="delete from dependentes where nome = '"+id+"'";

        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField23.setText("");

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bntUpFun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpFun1ActionPerformed
    String opcao = jComboBox3.getSelectedItem().toString();
    Object novo = jTextField21.getText();
    Object id = jTextField22.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();

        String sql ="";

        if (opcao == "Nome") {
                sql = "update dependentes set nome = '"+novo+"' where nome = '"+id+"'";
        }else if (opcao == "Genero") {
                sql = sql = "update dependentes set genero = '"+jTextField21.getText()+"' where nome = '"+jTextField21.getText()+"'";
        }else if (opcao == "Nascimento") {
                sql = sql = "update dependentes set nascimento = '"+novo+"' where nome = '"+id+"'";
        }else if (opcao == "Relacao") {
                sql = sql = "update dependentes set relacao = '"+novo+"' where nome = '"+id+"'";
        }else if (opcao == "Id Funcio") {
                sql = sql = "update dependentes set id_funcionario = '"+novo+"' where nome = '"+id+"'";
        }

        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField21.setText("");
        jTextField22.setText("");

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_bntUpFun1ActionPerformed

    private void bntShowDepenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntShowDepenActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable2.getModel();
    tbmodel.setRowCount(0);    
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from  dependentes";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String nome = rs.getString("nome");
            String genero = rs.getString("genero");
            String nasc = rs.getString("nascimento");
            String relacao = rs.getString("relacao");
            String id_func = String.valueOf(rs.getInt("id_funcionario"));

            String tbData [] = {nome,genero,nasc,relacao,id_func };
            tbmodel = (DefaultTableModel)jTable2.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_bntShowDepenActionPerformed

    private void bntaddDepenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntaddDepenActionPerformed

    String nome =  jTextField8.getText();
    String genero = jTextField9.getText();
    String nasc =  jTextField10.getText();
    String rela = jTextField11.getText();
    int idFun = Integer.parseInt(jTextField12.getText());

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "Insert INTO dependentes VALUES "
        + "('"+nome+"','"+genero+"','"+nasc+"','"+rela+"',"
        + "'"+idFun+"')";
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");

        stm.close(); // close statement
        con.close(); //feachando a conexao

    }catch (Exception e) {
       System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_bntaddDepenActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Object id =jTextField29.getText();

    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

         //inserindo dados na tabela
        Statement stm = con.createStatement();

        String sql ="delete from departamento where id_departamento = '"+id+"'";

        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField29.setText("");

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bntShowDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntShowDepartActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable4.getModel();
    tbmodel.setRowCount(0);  
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from  departamento";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String idDepart = rs.getString("id_departamento");
            String locali = rs.getString("localizacao");
            String idSuper = rs.getString("id_funcionario_Super");

            String tbData [] = {idDepart,locali,idSuper};
            tbmodel = (DefaultTableModel)jTable4.getModel();
            tbmodel.addRow(tbData);
        }

            stm.close(); // close statement
            con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_bntShowDepartActionPerformed

    private void bntaddDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntaddDepartActionPerformed
        String idDepart = jTextField16.getText();
        String locali = jTextField17.getText();
        int idSuper = Integer.parseInt(jTextField18.getText());

        try {
            //Abrindo e estabelecendo conexao
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Iniciando uma instancia com a conexao da database
            //por meio meio da url contendo nome host,porta, usuario ,senha
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/empresa","root","1234");

            //inserindo dados na tabela
            Statement stm = con.createStatement();
            String sql = "Insert INTO departamento VALUES "
            + "('"+idDepart+"','"+locali+"','"+idSuper+"')";
            stm.executeUpdate(sql); //inserindo a consulta

            //Limpando os Campos
            jTextField16.setText("");
            jTextField17.setText("");
            jTextField18.setText("");

            stm.close(); // close statement
            con.close(); //feachando a conexao

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bntaddDepartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String opcao = jComboBox.getSelectedItem().toString();
        Object id =jTextField34.getText();

        try {
            //Abrindo e estabelecendo conexao
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Iniciando uma instancia com a conexao da database
            //por meio meio da url contendo nome host,porta, usuario ,senha
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/empresa","root","1234");

            //inserindo dados na tabela
            Statement stm = con.createStatement();

            String sql ="";

            if (opcao == "Departamento") {
                sql = "delete from departamento where id_departamento = '"+id+"'";
            } else if (opcao == "Dependentes") {
                sql = "delete from dependentes where nome = '"+id+"'";
            }else if (opcao == "Funcionario") {
                sql = "delete from funcionarios where id_funcionario = '"+id+"'";
            }else if (opcao == "Projeto") {
                sql = "delete from projetos where id_projeto = '"+id+"'";
            }

            stm.executeUpdate(sql); //inserindo a consulta

            //Limpando os Campos
            jTextField34.setText("");

            stm.close(); // close statement
            con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bntUpFun4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpFun4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntUpFun4ActionPerformed

    private void bntUpFun3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpFun3ActionPerformed

        String opcao = jComboBox5.getSelectedItem().toString();
        Object novo = jTextField27.getText();
        Object id = jTextField28.getText();

        try {
            //Abrindo e estabelecendo conexao
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Iniciando uma instancia com a conexao da database
            //por meio meio da url contendo nome host,porta, usuario ,senha
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/empresa","root","1234");

            //inserindo dados na tabela
            Statement stm = con.createStatement();

            String sql ="";

            if (opcao == "ID") {
                sql = "update departamento set id_departamento = '"+novo+"' where id_departamento = '"+id+"'";
            }else if (opcao == "Localizacao") {
                sql = sql = "update departamento set localizacao = '"+novo+"' where id_departamento = '"+id+"'";
            }else if (opcao == "ID Supervisor") {
                sql = sql = "update departamento set id_funcionario_Super = '"+novo+"' where id_departamento = '"+id+"'";
            }

            stm.executeUpdate(sql); //inserindo a consulta

            //Limpando os Campos
            jTextField24.setText("");
            jTextField25.setText("");

            stm.close(); // close statement
            con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_bntUpFun3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable1.getModel();
    tbmodel.setRowCount(0);
        
    int idBusca = Integer.parseInt(jTextField32.getText());
    
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from  funcionarios where id_funcionario = '"+idBusca+"' ";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String id =  String.valueOf(rs.getInt("id_funcionario"));
            String nome = rs.getString("nome");
            String genero = rs.getString("genero");
            String nasc = rs.getString("nascimento");
            String altura = String.valueOf(rs.getFloat("altura"));
            String depart = rs.getString("id_departamento");

            String tbData [] = {id,nome,genero,nasc,altura,depart };
            tbmodel = (DefaultTableModel)jTable1.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

        }catch (Exception e) {
    JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable4.getModel();
    tbmodel.setRowCount(0);
    
    String idBusca = jTextField33.getText();
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from  departamento where id_departamento = '"+idBusca+"' ";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String idDepart = rs.getString("id_departamento");
            String locali = rs.getString("localizacao");
            String idSuper = rs.getString("id_funcionario_Super");

            String tbData [] = {idDepart,locali,idSuper};
            tbmodel = (DefaultTableModel)jTable4.getModel();
            tbmodel.addRow(tbData);
        }

            stm.close(); // close statement
            con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable2.getModel();
    tbmodel.setRowCount(0);
    int idBusca = Integer.parseInt (jTextField35.getText());
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from  dependentes where id_funcionario = '"+idBusca+"'";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String nome = rs.getString("nome");
            String genero = rs.getString("genero");
            String nasc = rs.getString("nascimento");
            String relacao = rs.getString("relacao");
            String id_func = String.valueOf(rs.getInt("id_funcionario"));

            String tbData [] = {nome,genero,nasc,relacao,id_func };
            tbmodel = (DefaultTableModel)jTable2.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable3.getModel();
    tbmodel.setRowCount(0);
    String idBusca = jTextField36.getText();
           
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/empresa","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from  projetos where id_projeto = '"+idBusca+"'";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String idProj = rs.getString("id_projeto");
            String custo = String.valueOf(rs.getFloat("custo"));
            String idDepart = rs.getString("id_departamento");

            String tbData [] = {idProj,custo,idDepart,idDepart};
            tbmodel = (DefaultTableModel)jTable3.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDep;
    private javax.swing.JButton bntDepart;
    private javax.swing.JButton bntFun;
    private javax.swing.JButton bntLog;
    private javax.swing.JButton bntProj;
    private javax.swing.JButton bntShowDepart;
    private javax.swing.JButton bntShowDepen;
    private javax.swing.JButton bntShowFunc;
    private javax.swing.JButton bntShowProj;
    private javax.swing.JButton bntUpFun;
    private javax.swing.JButton bntUpFun1;
    private javax.swing.JButton bntUpFun2;
    private javax.swing.JButton bntUpFun3;
    private javax.swing.JButton bntUpFun4;
    private javax.swing.JButton bntaddDepart;
    private javax.swing.JButton bntaddDepen;
    private javax.swing.JButton bntaddFunc;
    private javax.swing.JButton bntaddProj;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
