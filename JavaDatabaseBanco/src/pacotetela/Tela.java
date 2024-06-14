package pacotetela;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;  


public class Tela extends javax.swing.JFrame {


    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotetela/icone_banco.png"))); // NOI18N
        jButton1.setText("Banco");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotetela/icone_conta.png"))); // NOI18N
        jButton2.setText("Conta");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotetela/icone_cliente.png"))); // NOI18N
        jButton3.setText("Cliente");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotetela/icone_transass.png"))); // NOI18N
        jButton4.setText("Trasacao");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacotetela/icone_sair.png"))); // NOI18N
        jButton21.setText("Sair");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton21MouseExited(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton21)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(473, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereco"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("BANCO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("Endereco");

        jButton5.setBackground(new java.awt.Color(51, 153, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Adcionar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 153, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Atualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 153, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Mostrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 153, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Deletar");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton5)
                                    .addGap(84, 84, 84)
                                    .addComponent(jButton6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Conta");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("Balanco");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("Banco");

        jButton9.setBackground(new java.awt.Color(51, 153, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Adcionar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(51, 153, 0));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Atualizar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(51, 153, 0));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Deletar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Balanco", "Banco", "Cliente"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton12.setBackground(new java.awt.Color(51, 153, 0));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Mostrar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("Cliente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(84, 84, 84)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel5)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("Cliente");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 0));
        jLabel11.setText("ID");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 0));
        jLabel12.setText("Nome");

        jButton13.setBackground(new java.awt.Color(51, 153, 0));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Adcionar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(51, 153, 0));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Atualizar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 153, 0));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Deletar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton16.setBackground(new java.awt.Color(51, 153, 0));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Mostrar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jButton13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton14)
                            .addGap(84, 84, 84)
                            .addComponent(jButton15))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(jLabel10)
                    .addContainerGap(209, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton15)
                    .addComponent(jButton14))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addGap(15, 15, 15))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel10)
                    .addContainerGap(332, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 0));
        jLabel13.setText("Transacao");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 0));
        jLabel14.setText("ID");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 153, 0));
        jLabel15.setText("Moeda");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 153, 0));
        jLabel16.setText("Hora");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 153, 0));
        jLabel17.setText("Quantia");

        jButton17.setBackground(new java.awt.Color(51, 153, 0));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Adcionar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(51, 153, 0));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Atualizar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(51, 153, 0));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Deletar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Balanco", "Banco", "Quantia", "Depositante", "Retirante"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jButton20.setBackground(new java.awt.Color(51, 153, 0));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Mostrar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 153, 0));
        jLabel18.setText("Depositante");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 153, 0));
        jLabel19.setText("Retirante");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton17)
                                .addGap(84, 84, 84)
                                .addComponent(jButton18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton19))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel13)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton19)
                            .addComponent(jButton17)
                            .addComponent(jButton18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    if(jTextField1.getText().equals("") || 
       jTextField2.getText().equals("") || 
       jTextField3.getText().equals("")) {
    
        JOptionPane.showMessageDialog(null,
        "Preencha Todos os Campo");
    }
          
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "Insert INTO banco VALUES "
                + "('"+Integer.parseInt(jTextField1.getText())+"',"
                + "'"+jTextField2.getText()+"',"
                + "'"+jTextField3.getText()+"')";
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
  
        stm.close(); // close statement
        con.close(); //feachando a conexao
        
        JOptionPane.showMessageDialog(null, "Banco Adicionado");

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "";
        if (!jTextField1.getText().isEmpty()) { // Verifica se o campo não está vazio
            sql = "UPDATE banco SET id_banco = "
            + "'" + jTextField1.getText() + "' WHERE id_banco = "
            + "'" + jTextField1.getText() + "'";
        }
        
        if (!jTextField2.getText().isEmpty()) {
            sql = "UPDATE banco SET nome = "
            + "'" + jTextField2.getText() + "' WHERE id_banco = "
            + "'" + jTextField1.getText() + "'";
        }
        if (!jTextField3.getText().isEmpty()) {
            sql = "UPDATE banco SET endereco = "
            + "'" + jTextField3.getText() + "' WHERE id_banco = "
            + "'" + jTextField1.getText() + "'"; 
        }
        
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
  
        stm.close(); // close statement
        con.close(); //feachando a conexao
        
        JOptionPane.showMessageDialog(null, "Banco Atualizado");

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
    int a = JOptionPane.showConfirmDialog(
        null, "Voce Realmente quer Excluir",
        "Select",
        JOptionPane.YES_NO_OPTION);
    
    if(a==0) {    
        
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "DELETE FROM banco WHERE id_banco = '" + jTextField1.getText() + "'";
   
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
  
        stm.close(); // close statement
        con.close(); //feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable1.getModel();
    tbmodel.setRowCount(0);    
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from banco";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String id = String.valueOf(rs.getInt("id_banco"));
            String nome = rs.getString("nome");
            String endere = rs.getString("endereco");

            String tbData [] = {id,nome,endere};
            tbmodel = (DefaultTableModel)jTable1.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
     if(jTextField4.getText().equals("") || 
        jTextField5.getText().equals("") || 
        jTextField6.getText().equals("") ||
        jTextField7.getText().equals("") ) {
    
        JOptionPane.showMessageDialog(null,
        "Preencha Todos os Campo");
    }    
           
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "Insert INTO banco_conta VALUES "
                + "('"+Integer.parseInt(jTextField4.getText())+ "',"
                + "'"+jTextField5.getText()+ "',"
                + "'"+Integer.parseInt(jTextField6.getText())+ "',"
                + "'"+Integer.parseInt(jTextField7.getText())+ "' )";
        
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
  
        stm.close(); // close statement
        con.close(); //feachando a conexao
        
        JOptionPane.showMessageDialog(null, "Conta Adicionada");

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "";
        if (!jTextField4.getText().isEmpty()) { // Verifica se o campo não está vazio
            sql = "UPDATE banco_conta SET id_banco_conta = "
            + "'" + jTextField4.getText() + "' WHERE id_banco_conta = "
            + "'" + jTextField4.getText() + "'";
        }
        
        if (!jTextField5.getText().isEmpty()) {
            sql = "UPDATE banco_conta SET balaco = "
            + "'" + jTextField5.getText() + "' WHERE id_banco_conta = "
            + "'" + jTextField4.getText() + "'";
        }
        if (!jTextField6.getText().isEmpty()) {
            sql = "UPDATE banco_conta SET id_banco = "
            + "'" + jTextField6.getText() + "' WHERE id_banco_conta = "
            + "'" + jTextField4.getText() + "'"; 
        }
        if (!jTextField7.getText().isEmpty()) {
            sql = "UPDATE banco_conta SET id_cliente = "
            + "'" + jTextField7.getText() + "' WHERE id_banco_conta = "
            + "'" + jTextField4.getText() + "'"; 
        }
        
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
  
        stm.close(); // close statement
        con.close(); //feachando a conexao
        
        JOptionPane.showMessageDialog(null, "Conta Atulizada");

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
                                            
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int a = JOptionPane.showConfirmDialog(
        null, "Voce Realmente quer Excluir",
        "Select",
        JOptionPane.YES_NO_OPTION);
    
    if(a==0) {     
        
        
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "DELETE FROM banco_conta WHERE id_banco_conta = '" + jTextField4.getText() + "'";
   
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
  
        stm.close(); // close statement
        con.close(); //feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable2.getModel();
    tbmodel.setRowCount(0);    
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from banco_conta";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String conta = String.valueOf(rs.getInt("id_banco_conta"));
            String balaco = rs.getString("balaco");
            String banco = String.valueOf(rs.getInt("id_banco"));
            String cliente = String.valueOf(rs.getInt("id_cliente"));

            String tbData [] = {conta,balaco,banco,cliente};
            tbmodel = (DefaultTableModel)jTable2.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
    if(jTextField8.getText().equals("") || 
       jTextField9.getText().equals("") ) {
    
      JOptionPane.showMessageDialog(null,
      "Preencha Todos os Campo");
    }        
           
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "Insert INTO cliente VALUES "
                + "('"+Integer.parseInt(jTextField8.getText())+ "',"
                + "'"+jTextField9.getText()+ "' )";
        
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField8.setText("");
        jTextField9.setText("");

        stm.close(); // close statement
        con.close(); //feachando a conexao
        
        JOptionPane.showMessageDialog(null, "Cliente Adicionado");

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "";
        if (!jTextField8.getText().isEmpty()) { // Verifica se o campo não está vazio
            sql = "UPDATE cliente SET id_cliente = "
            + "'" + jTextField8.getText() + "' WHERE id_cliente = "
            + "'" + jTextField8.getText() + "'";
        }
        
        if (!jTextField9.getText().isEmpty()) {
            sql = "UPDATE cliente SET nome_cliente = "
            + "'" + jTextField9.getText() + "' WHERE id_cliente = "
            + "'" + jTextField8.getText() + "'";
        }
        
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField8.setText("");
        jTextField9.setText("");
  
        stm.close(); // close statement
        con.close(); //feachando a conexao
        
        JOptionPane.showMessageDialog(null, "Cliente Atualizado");

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int a = JOptionPane.showConfirmDialog(
        null, "Voce Realmente quer Excluir",
        "Select",
        JOptionPane.YES_NO_OPTION);
    
    if(a==0) {     
        
        
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "DELETE FROM cliente WHERE id_cliente = '" + jTextField8.getText() + "'";
   
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField8.setText("");
        jTextField9.setText("");
 
        stm.close(); // close statement
        con.close(); //feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable3.getModel();
    tbmodel.setRowCount(0);    
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from cliente";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String id = String.valueOf(rs.getInt("id_cliente"));
            String nome = rs.getString("nome_cliente");

            String tbData [] = {id,nome};
            tbmodel = (DefaultTableModel)jTable3.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String data = sdf.format(jDateChooser1.getDate());
        
       if(jTextField10.getText().equals("") || 
          jTextField11.getText().equals("") || 
          jTextField13.getText().equals("") ||
          jTextField14.getText().equals("") ||
          jTextField14.getText().equals("") ) {
    
          JOptionPane.showMessageDialog(null,
          "Preencha Todos os Campo");
    }        
           
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "Insert INTO transacao VALUES "
                + "('"+Integer.parseInt(jTextField10.getText())+ "',"
                + " '"+jTextField11.getText()+ "',"
                + " '"+data+ "', "
                + " '"+Float.parseFloat(jTextField13.getText())+ "',"
                + " '"+Integer.parseInt(jTextField14.getText())+ "',"
                + " '"+Integer.parseInt(jTextField15.getText())+ "')";
        
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");

        stm.close(); // close statement
        con.close(); //feachando a conexao
        
        JOptionPane.showMessageDialog(null, "Transacao Adicionada");

    }catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String data = sdf.format(jDateChooser1.getDate());
        
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "";
        if (!jTextField10.getText().isEmpty()) { // Verifica se o campo não está vazio
            sql = "UPDATE transacao SET id_trasacao = "
            + "'" + jTextField10.getText() + "' WHERE id_trasacao = "
            + "'" + jTextField10.getText() + "'";
        }
        
        if (!jTextField11.getText().isEmpty()) {
            sql = "UPDATE transacao SET moeda = "
            + "'" + jTextField11.getText() + "' WHERE id_trasacao = "
            + "'" + jTextField10.getText() + "'";
        }

        if (jDateChooser1.getDate() != null) { // Verifica se o campo não está vazio
            sql = "UPDATE transacao SET hora_transacao = "
            + "'" + data + "' WHERE id_trasacao = "
            + "'" + jTextField10.getText() + "'";
        }
        
        if (!jTextField13.getText().isEmpty()) {
            sql = "UPDATE transacao SET quantia = "
            + "'" + jTextField13.getText() + "' WHERE id_trasacao = "
            + "'" + jTextField10.getText() + "'";
        }
        
         if (!jTextField14.getText().isEmpty()) { // Verifica se o campo não está vazio
            sql = "UPDATE transacao SET conta_depositante = "
            + "'" + jTextField8.getText() + "' WHERE id_trasacao = "
            + "'" + jTextField10.getText() + "'";
        }
        
        if (!jTextField14.getText().isEmpty()) {
            sql = "UPDATE transacao SET conta_retirante = "
            + "'" + jTextField14.getText() + "' WHERE id_cliente = "
            + "'" + jTextField10.getText() + "'";
        }
        
        if (!jTextField15.getText().isEmpty()) {
            sql = "UPDATE transacao SET nome_cliente = "
            + "'" + jTextField15.getText() + "' WHERE id_cliente = "
            + "'" + jTextField10.getText() + "'";
        }
        
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
  
        stm.close(); // close statement
        con.close(); //feachando a conexao
        
        JOptionPane.showMessageDialog(null, "Transacao Atualizada");

    }catch (Exception e) {
       JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    
    int a = JOptionPane.showConfirmDialog(
        null, "Voce Realmente quer Excluir",
        "Select",
        JOptionPane.YES_NO_OPTION);
    
    if(a==0) {
        
        try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "DELETE FROM transacao WHERE "
                + "id_trasacao = '" + jTextField10.getText() + "'";
   
        stm.executeUpdate(sql); //inserindo a consulta

        //Limpando os Campos
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
 
        stm.close(); // close statement
        con.close(); //feachando a conexao

        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
        }    
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    DefaultTableModel tbmodel = (DefaultTableModel) jTable4.getModel();
    tbmodel.setRowCount(0);    
        
    try {
        //Abrindo e estabelecendo conexao
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Iniciando uma instancia com a conexao da database
        //por meio meio da url contendo nome host,porta, usuario ,senha
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/sistembank","root","1234");

        //inserindo dados na tabela
        Statement stm = con.createStatement();
        String sql = "select * from transacao";
        ResultSet rs = stm.executeQuery(sql);

        //os nomes dentro da string sao os nomes das colunas da tabela produto
        //os tipo das variveis da propriedade do jTable deve ser string
        while (rs.next()) {

            String id = String.valueOf(rs.getInt("id_trasacao"));
            String moeda = rs.getString("moeda");
            String hora = rs.getString("hora_transacao");
            String quant = String.valueOf(rs.getFloat("quantia"));
            String depo = String.valueOf(rs.getInt("conta_depositante"));
            String reti = String.valueOf(rs.getInt("conta_retirante"));

            String tbData [] = {id,moeda,hora,quant,depo,reti};
            tbmodel = (DefaultTableModel)jTable4.getModel();
            tbmodel.addRow(tbData);
        }

        stm.close(); // close statement
        con.close();//feachando a conexao

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       int a = JOptionPane.showConfirmDialog(
            null, "Voce quer sair",
            "Select",
            JOptionPane.YES_NO_OPTION);
    
    if(a==0)
    setVisible(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
    jButton1.setBackground(java.awt.Color.decode("#00FF00"));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
    jButton2.setBackground(java.awt.Color.decode("#00FF00"));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
    jButton3.setBackground(java.awt.Color.decode("#00FF00"));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
    jButton4.setBackground(java.awt.Color.decode("#00FF00"));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseEntered
    jButton21.setBackground(java.awt.Color.decode("#00FF00"));
    }//GEN-LAST:event_jButton21MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
    jButton1.setBackground(java.awt.Color.decode("#FFFFFF"));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
    jButton2.setBackground(java.awt.Color.decode("#FFFFFF"));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
    jButton3.setBackground(java.awt.Color.decode("#FFFFFF"));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
    jButton4.setBackground(java.awt.Color.decode("#FFFFFF"));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseExited
    jButton21.setBackground(java.awt.Color.decode("#FFFFFF"));
    }//GEN-LAST:event_jButton21MouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
