package Classical_Cryprtography;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Form_1 extends javax.swing.JFrame {


    public Form_1() {
        initComponents();
        color_default();
        this.setSize(1080, 680);
        this.setTitle("Classical Cryprtography");
        this.setLocationRelativeTo(null);
        this.setVisible(true); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        email_Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Home_Pane = new javax.swing.JTabbedPane();
        Home_Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Product_Cipher_Label = new javax.swing.JLabel();
        Affine_Cipher_Label = new javax.swing.JLabel();
        Cesar_Cipher_Label = new javax.swing.JLabel();
        Additive_Cipher_Label = new javax.swing.JLabel();
        Abatch_Cipher_Label = new javax.swing.JLabel();
        Rot13_Cipher_Label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plainText_TextArea_1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cipher_text_TextArea_1 = new javax.swing.JTextArea();
        Cipher_Button_1 = new javax.swing.JButton();
        Save_Button_1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        plainText_TextArea_3 = new javax.swing.JTextArea();
        Cipher_Button_3 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        cipher_text_TextArea_3 = new javax.swing.JTextArea();
        Save_Button_3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        plainText_TextArea_4 = new javax.swing.JTextArea();
        Cipher_Button_4 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        cipher_text_TextArea_4 = new javax.swing.JTextArea();
        Save_Button_4 = new javax.swing.JButton();
        ComboBox_key = new javax.swing.JComboBox();
        Label_key2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        plainText_TextArea_5 = new javax.swing.JTextArea();
        Cipher_Button_5 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        cipher_text_TextArea_5 = new javax.swing.JTextArea();
        Save_Button_5 = new javax.swing.JButton();
        Label_key1 = new javax.swing.JLabel();
        ComboBox_key_product = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        plainText_TextArea_6 = new javax.swing.JTextArea();
        Cipher_Button_6 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        cipher_text_TextArea_6 = new javax.swing.JTextArea();
        Save_Button_6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ComboBox_key_alpha = new javax.swing.JComboBox();
        ComboBox_key_beta = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        Manuela = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        Manuela1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane13.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255))));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Company : IdiSoft");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        email_Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        email_Label.setForeground(new java.awt.Color(0, 0, 255));
        email_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email_Label.setText("Email: idrisseaa93@gmail.com");
        email_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tel :+249 967 85 10 06");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187)
                .addComponent(email_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        Home_Pane.setFont(email_Label.getFont());

        Home_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255))));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Classical Cryprtography");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        Product_Cipher_Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Product_Cipher_Label.setForeground(new java.awt.Color(0, 0, 255));
        Product_Cipher_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Product_Cipher_Label.setText("Product   Cipher");
        Product_Cipher_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        Affine_Cipher_Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Affine_Cipher_Label.setForeground(new java.awt.Color(0, 0, 255));
        Affine_Cipher_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Affine_Cipher_Label.setText("Affine   Cipher");
        Affine_Cipher_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        Cesar_Cipher_Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Cesar_Cipher_Label.setForeground(new java.awt.Color(0, 0, 255));
        Cesar_Cipher_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cesar_Cipher_Label.setText("Cesar   Cipher");
        Cesar_Cipher_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        Additive_Cipher_Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Additive_Cipher_Label.setForeground(new java.awt.Color(0, 0, 255));
        Additive_Cipher_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Additive_Cipher_Label.setText("Additive   Cipher");
        Additive_Cipher_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        Abatch_Cipher_Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Abatch_Cipher_Label.setForeground(new java.awt.Color(0, 0, 255));
        Abatch_Cipher_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Abatch_Cipher_Label.setText("Abatch   Cipher");
        Abatch_Cipher_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        Rot13_Cipher_Label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Rot13_Cipher_Label.setForeground(new java.awt.Color(0, 0, 255));
        Rot13_Cipher_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rot13_Cipher_Label.setText("Rot13   Cipher");
        Rot13_Cipher_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));

        javax.swing.GroupLayout Home_PanelLayout = new javax.swing.GroupLayout(Home_Panel);
        Home_Panel.setLayout(Home_PanelLayout);
        Home_PanelLayout.setHorizontalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_PanelLayout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rot13_Cipher_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Abatch_Cipher_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(422, 422, 422))
            .addGroup(Home_PanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Home_PanelLayout.createSequentialGroup()
                        .addComponent(Product_Cipher_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Affine_Cipher_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_PanelLayout.createSequentialGroup()
                        .addComponent(Cesar_Cipher_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Additive_Cipher_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );
        Home_PanelLayout.setVerticalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_PanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Abatch_Cipher_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cesar_Cipher_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Additive_Cipher_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Product_Cipher_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Affine_Cipher_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rot13_Cipher_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        Home_Pane.addTab("Home", Home_Panel);

        plainText_TextArea_1.setBackground(new java.awt.Color(0, 0, 0));
        plainText_TextArea_1.setColumns(20);
        plainText_TextArea_1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        plainText_TextArea_1.setForeground(new java.awt.Color(255, 255, 255));
        plainText_TextArea_1.setRows(5);
        plainText_TextArea_1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)), "Enter the plain text here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        plainText_TextArea_1.setCaretColor(new java.awt.Color(255, 255, 255));
        plainText_TextArea_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plainText_TextArea_1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(plainText_TextArea_1);

        cipher_text_TextArea_1.setBackground(new java.awt.Color(0, 0, 0));
        cipher_text_TextArea_1.setColumns(20);
        cipher_text_TextArea_1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        cipher_text_TextArea_1.setForeground(new java.awt.Color(255, 255, 255));
        cipher_text_TextArea_1.setRows(5);
        cipher_text_TextArea_1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)), "The cipher text appers here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        cipher_text_TextArea_1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(cipher_text_TextArea_1);

        Cipher_Button_1.setFont(email_Label.getFont());
        Cipher_Button_1.setText("Click here to encrypt  by  using  Rot13  encryption  method");
        Cipher_Button_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cipher_Button_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cipher_Button_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cipher_Button_1MouseExited(evt);
            }
        });
        Cipher_Button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cipher_Button_1ActionPerformed(evt);
            }
        });

        Save_Button_1.setFont(email_Label.getFont());
        Save_Button_1.setForeground(email_Label.getForeground());
        Save_Button_1.setText("Click here to SAVE the cipher text");
        Save_Button_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save_Button_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Save_Button_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Save_Button_1MouseExited(evt);
            }
        });
        Save_Button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Button_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(Cipher_Button_1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(Save_Button_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Cipher_Button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Save_Button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Home_Pane.addTab("Rot13   Cipher", jPanel3);

        plainText_TextArea_3.setBackground(new java.awt.Color(0, 0, 0));
        plainText_TextArea_3.setColumns(20);
        plainText_TextArea_3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        plainText_TextArea_3.setForeground(new java.awt.Color(255, 255, 255));
        plainText_TextArea_3.setRows(5);
        plainText_TextArea_3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)), "Enter the  plaintext here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        plainText_TextArea_3.setCaretColor(new java.awt.Color(255, 255, 255));
        plainText_TextArea_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plainText_TextArea_3KeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(plainText_TextArea_3);

        Cipher_Button_3.setFont(email_Label.getFont());
        Cipher_Button_3.setForeground(email_Label.getForeground());
        Cipher_Button_3.setText("Click here to encrypt  by  using  Cesar  encryption  method");
        Cipher_Button_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cipher_Button_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cipher_Button_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cipher_Button_3MouseExited(evt);
            }
        });
        Cipher_Button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cipher_Button_3ActionPerformed(evt);
            }
        });

        cipher_text_TextArea_3.setBackground(new java.awt.Color(0, 0, 0));
        cipher_text_TextArea_3.setColumns(20);
        cipher_text_TextArea_3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        cipher_text_TextArea_3.setForeground(new java.awt.Color(255, 255, 255));
        cipher_text_TextArea_3.setRows(5);
        cipher_text_TextArea_3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)), "The cipher text appers here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        cipher_text_TextArea_3.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(cipher_text_TextArea_3);

        Save_Button_3.setFont(email_Label.getFont());
        Save_Button_3.setForeground(email_Label.getForeground());
        Save_Button_3.setText("Click here to SAVE the cipher text");
        Save_Button_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save_Button_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Save_Button_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Save_Button_3MouseExited(evt);
            }
        });
        Save_Button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Button_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(Save_Button_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cipher_Button_3, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cipher_Button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Save_Button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Home_Pane.addTab("Cesar  Cipher", jPanel2);

        plainText_TextArea_4.setBackground(new java.awt.Color(0, 0, 0));
        plainText_TextArea_4.setColumns(20);
        plainText_TextArea_4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        plainText_TextArea_4.setForeground(new java.awt.Color(255, 255, 255));
        plainText_TextArea_4.setRows(5);
        plainText_TextArea_4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)), "Enter the plaintext here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        plainText_TextArea_4.setCaretColor(new java.awt.Color(255, 255, 255));
        plainText_TextArea_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plainText_TextArea_4KeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(plainText_TextArea_4);

        Cipher_Button_4.setFont(email_Label.getFont());
        Cipher_Button_4.setForeground(email_Label.getForeground());
        Cipher_Button_4.setText("Click here to encrypt  by  using  Additive  encryption  method");
        Cipher_Button_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cipher_Button_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cipher_Button_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cipher_Button_4MouseExited(evt);
            }
        });
        Cipher_Button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cipher_Button_4ActionPerformed(evt);
            }
        });

        cipher_text_TextArea_4.setBackground(new java.awt.Color(0, 0, 0));
        cipher_text_TextArea_4.setColumns(20);
        cipher_text_TextArea_4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        cipher_text_TextArea_4.setForeground(new java.awt.Color(255, 255, 255));
        cipher_text_TextArea_4.setRows(5);
        cipher_text_TextArea_4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue), "The cipher text appers here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        cipher_text_TextArea_4.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(cipher_text_TextArea_4);

        Save_Button_4.setFont(email_Label.getFont());
        Save_Button_4.setForeground(email_Label.getForeground());
        Save_Button_4.setText("Click here to SAVE the cipher text");
        Save_Button_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save_Button_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Save_Button_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Save_Button_4MouseExited(evt);
            }
        });
        Save_Button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Button_4ActionPerformed(evt);
            }
        });

        ComboBox_key.setFont(email_Label.getFont());
        ComboBox_key.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        Label_key2.setFont(email_Label.getFont());
        Label_key2.setForeground(email_Label.getForeground());
        Label_key2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_key2.setText("Choose the key ");
        Label_key2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(Save_Button_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(Label_key2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(Cipher_Button_4)))
                .addGap(137, 137, 137))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Cipher_Button_4, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(ComboBox_key)
                    .addComponent(Label_key2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Save_Button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        Home_Pane.addTab("Additive  Cipher", jPanel7);

        plainText_TextArea_5.setBackground(new java.awt.Color(0, 0, 0));
        plainText_TextArea_5.setColumns(20);
        plainText_TextArea_5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        plainText_TextArea_5.setForeground(new java.awt.Color(255, 255, 255));
        plainText_TextArea_5.setRows(5);
        plainText_TextArea_5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)), "Enter the plain text here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        plainText_TextArea_5.setCaretColor(new java.awt.Color(255, 255, 255));
        plainText_TextArea_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plainText_TextArea_5KeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(plainText_TextArea_5);

        Cipher_Button_5.setFont(email_Label.getFont());
        Cipher_Button_5.setForeground(email_Label.getForeground());
        Cipher_Button_5.setText("Click here to encrypt  by  using  Product cipher encryption  method");
        Cipher_Button_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cipher_Button_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cipher_Button_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cipher_Button_5MouseExited(evt);
            }
        });
        Cipher_Button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cipher_Button_5ActionPerformed(evt);
            }
        });

        cipher_text_TextArea_5.setBackground(new java.awt.Color(0, 0, 0));
        cipher_text_TextArea_5.setColumns(20);
        cipher_text_TextArea_5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        cipher_text_TextArea_5.setForeground(new java.awt.Color(255, 255, 255));
        cipher_text_TextArea_5.setRows(5);
        cipher_text_TextArea_5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.blue, new java.awt.Color(0, 0, 255)), "The Cipher text appers here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        cipher_text_TextArea_5.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(cipher_text_TextArea_5);

        Save_Button_5.setFont(email_Label.getFont());
        Save_Button_5.setForeground(email_Label.getForeground());
        Save_Button_5.setText("Click here to SAVE the cipher text");
        Save_Button_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save_Button_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Save_Button_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Save_Button_5MouseExited(evt);
            }
        });
        Save_Button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Button_5ActionPerformed(evt);
            }
        });

        Label_key1.setFont(email_Label.getFont());
        Label_key1.setForeground(email_Label.getForeground());
        Label_key1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_key1.setText("Choose the key ");
        Label_key1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ComboBox_key_product.setFont(email_Label.getFont());
        ComboBox_key_product.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10)
                    .addComponent(Save_Button_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Label_key1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_key_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cipher_Button_5)))
                .addGap(115, 115, 115))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ComboBox_key_product, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cipher_Button_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(Label_key1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Save_Button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Home_Pane.addTab("Product  Cipher", jPanel8);

        plainText_TextArea_6.setBackground(new java.awt.Color(0, 0, 0));
        plainText_TextArea_6.setColumns(20);
        plainText_TextArea_6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        plainText_TextArea_6.setForeground(new java.awt.Color(255, 255, 255));
        plainText_TextArea_6.setRows(5);
        plainText_TextArea_6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)), "Enter the plain text here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Sans Typewriter", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        plainText_TextArea_6.setCaretColor(new java.awt.Color(255, 255, 255));
        plainText_TextArea_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plainText_TextArea_6KeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(plainText_TextArea_6);

        Cipher_Button_6.setFont(email_Label.getFont());
        Cipher_Button_6.setForeground(email_Label.getForeground());
        Cipher_Button_6.setText("Click here to encrypt  by  using  Abatch  encryption  method");
        Cipher_Button_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cipher_Button_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cipher_Button_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cipher_Button_6MouseExited(evt);
            }
        });
        Cipher_Button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cipher_Button_6ActionPerformed(evt);
            }
        });

        cipher_text_TextArea_6.setBackground(new java.awt.Color(0, 0, 0));
        cipher_text_TextArea_6.setColumns(20);
        cipher_text_TextArea_6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        cipher_text_TextArea_6.setForeground(new java.awt.Color(255, 255, 255));
        cipher_text_TextArea_6.setRows(5);
        cipher_text_TextArea_6.setBorder(cipher_text_TextArea_3.getBorder());
        cipher_text_TextArea_6.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane12.setViewportView(cipher_text_TextArea_6);

        Save_Button_6.setFont(email_Label.getFont());
        Save_Button_6.setForeground(email_Label.getForeground());
        Save_Button_6.setText("Click here to SAVE the cipher text");
        Save_Button_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save_Button_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Save_Button_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Save_Button_6MouseExited(evt);
            }
        });
        Save_Button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Button_6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("&");

        ComboBox_key_alpha.setFont(email_Label.getFont());
        ComboBox_key_alpha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        ComboBox_key_beta.setFont(email_Label.getFont());
        ComboBox_key_beta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("B");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12)
                    .addComponent(Save_Button_6, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_key_alpha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_key_beta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cipher_Button_6)))
                .addGap(150, 150, 150))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBox_key_beta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBox_key_alpha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cipher_Button_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Save_Button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        Home_Pane.addTab("Affine  Cipher", jPanel9);

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));

        Manuela.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Manuela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Manuela.setText("Manual for the user of this software");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea2.setRows(5);
        jTextArea2.setText(" Write   the   plaintext  in  the \n indicated   place,  then   click\n on   the   cipher   button   so \n the   cipher  text  will  apper\n in   the   indicated   place.\n\n You can save your cipher\n text after the end of the \n encryption process.\n\n Each encryption method has,\n its plaintex  and cipher place,\n its cipher  and  save  button.   \n\n For more information contact us. ");
        jScrollPane14.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14)
                    .addComponent(Manuela, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manuela, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));

        Manuela1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Manuela1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Manuela1.setText("About this software");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Classical_Cryprtography/background.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("IdiSoft Company");

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("All  rights  reserved");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Manuela1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manuela1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        Home_Pane.addTab("Help", jPanel10);

        getContentPane().add(Home_Pane, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Save_Button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Button_6ActionPerformed
        save_function (cipher_text_TextArea_6);
    }//GEN-LAST:event_Save_Button_6ActionPerformed

    private void Save_Button_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_6MouseExited
        color_changement_exited(Save_Button_6);
    }//GEN-LAST:event_Save_Button_6MouseExited

    private void Save_Button_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_6MouseEntered
        color_changement_enterd(Save_Button_6);
    }//GEN-LAST:event_Save_Button_6MouseEntered

    private void Cipher_Button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cipher_Button_6ActionPerformed
        int key_aplha =Integer.parseInt(ComboBox_key_alpha.getSelectedItem().toString());
        int key_beta =Integer.parseInt(ComboBox_key_beta.getSelectedItem().toString());
        affine_encryption_function(key_aplha,key_beta);
    }//GEN-LAST:event_Cipher_Button_6ActionPerformed

    private void Cipher_Button_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_6MouseExited
        color_changement_exited(Cipher_Button_6);
    }//GEN-LAST:event_Cipher_Button_6MouseExited

    private void Cipher_Button_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_6MouseEntered
        color_changement_enterd(Cipher_Button_6);
    }//GEN-LAST:event_Cipher_Button_6MouseEntered

    private void plainText_TextArea_6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plainText_TextArea_6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_plainText_TextArea_6KeyReleased

    private void Save_Button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Button_5ActionPerformed
        save_function (cipher_text_TextArea_5);
    }//GEN-LAST:event_Save_Button_5ActionPerformed

    private void Save_Button_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_5MouseExited
        color_changement_exited(Save_Button_5);
    }//GEN-LAST:event_Save_Button_5MouseExited

    private void Save_Button_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_5MouseEntered
        color_changement_enterd(Save_Button_5);
    }//GEN-LAST:event_Save_Button_5MouseEntered

    private void Cipher_Button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cipher_Button_5ActionPerformed
        int key=Integer.parseInt(ComboBox_key_product.getSelectedItem().toString());
        product_encryption_function( key);
    }//GEN-LAST:event_Cipher_Button_5ActionPerformed

    private void Cipher_Button_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_5MouseExited
        color_changement_exited(Cipher_Button_5);
    }//GEN-LAST:event_Cipher_Button_5MouseExited

    private void Cipher_Button_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_5MouseEntered
        color_changement_enterd(Cipher_Button_5);
    }//GEN-LAST:event_Cipher_Button_5MouseEntered

    private void plainText_TextArea_5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plainText_TextArea_5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_plainText_TextArea_5KeyReleased

    private void Save_Button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Button_4ActionPerformed
        save_function (cipher_text_TextArea_4);
    }//GEN-LAST:event_Save_Button_4ActionPerformed

    private void Save_Button_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_4MouseExited

    }//GEN-LAST:event_Save_Button_4MouseExited

    private void Save_Button_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_4MouseEntered
        color_changement_enterd(Save_Button_4);
    }//GEN-LAST:event_Save_Button_4MouseEntered

    private void Cipher_Button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cipher_Button_4ActionPerformed
        int key=Integer.parseInt(ComboBox_key.getSelectedItem().toString());
        additive_encryption_function(key);
    }//GEN-LAST:event_Cipher_Button_4ActionPerformed

    private void Cipher_Button_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_4MouseExited
        color_changement_exited(Cipher_Button_4);
    }//GEN-LAST:event_Cipher_Button_4MouseExited

    private void Cipher_Button_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_4MouseEntered
        color_changement_enterd(Cipher_Button_4);
    }//GEN-LAST:event_Cipher_Button_4MouseEntered

    private void plainText_TextArea_4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plainText_TextArea_4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_plainText_TextArea_4KeyReleased

    private void Save_Button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Button_3ActionPerformed
        save_function (cipher_text_TextArea_3);
    }//GEN-LAST:event_Save_Button_3ActionPerformed

    private void Save_Button_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_3MouseExited
        color_changement_exited(Save_Button_3);
    }//GEN-LAST:event_Save_Button_3MouseExited

    private void Save_Button_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_3MouseEntered
        color_changement_enterd(Save_Button_3);
    }//GEN-LAST:event_Save_Button_3MouseEntered

    private void Cipher_Button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cipher_Button_3ActionPerformed
        int length=plainText_TextArea_3.getText().length();
        String plainText_string = plainText_TextArea_3.getText() ;
        String ar[]= new String[length];

        for (int i = 1; i <= length; i++) {
            ar[i-1]=plainText_string.charAt(i-1)+"";
        }

        int integer_arr [] = Class_alphabet.get_number(ar);

        int integer_cipher[]=new int[length];
        for (int i = 0; i < length; i++) {
            if(integer_arr[i]==0)
            continue;
            else integer_cipher[i]=((integer_arr[i]+3)%26);
        }

        String cipher_text_array []= Class_alphabet.get_letter(integer_cipher);

        String Cipher_text="";
        for (int i = 0; i < length; i++) {
            Cipher_text=Cipher_text+cipher_text_array[i];
        }

        cipher_text_TextArea_3.setText(Cipher_text.toLowerCase());
    }//GEN-LAST:event_Cipher_Button_3ActionPerformed

    private void Cipher_Button_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_3MouseExited
        color_changement_exited(Cipher_Button_3);
    }//GEN-LAST:event_Cipher_Button_3MouseExited

    private void Cipher_Button_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_3MouseEntered
        color_changement_enterd(Cipher_Button_3);
    }//GEN-LAST:event_Cipher_Button_3MouseEntered

    private void plainText_TextArea_3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plainText_TextArea_3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_plainText_TextArea_3KeyReleased

    private void Save_Button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Button_1ActionPerformed
        save_function (cipher_text_TextArea_1);
    }//GEN-LAST:event_Save_Button_1ActionPerformed

    private void Save_Button_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_1MouseExited
        color_changement_exited(Save_Button_1);
    }//GEN-LAST:event_Save_Button_1MouseExited

    private void Save_Button_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Button_1MouseEntered
        color_changement_enterd(Save_Button_1);
    }//GEN-LAST:event_Save_Button_1MouseEntered

    private void Cipher_Button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cipher_Button_1ActionPerformed
        int length=plainText_TextArea_1.getText().length();
        String plainText_string = plainText_TextArea_1.getText() ;
        String ar[]= new String[length];

        for (int i = 1; i <= length; i++) {
            ar[i-1]=plainText_string.charAt(i-1)+"";
        }

        int integer_arr [] = Class_alphabet.get_number(ar);

        int integer_cipher[]=new int[length];
        for (int i = 0; i < length; i++) {
            if(integer_arr[i]==0)
            continue;
            else integer_cipher[i]=((integer_arr[i]+13)%26);
        }

        String cipher_text_array []= Class_alphabet.get_letter(integer_cipher);

        String Cipher_text="";
        for (int i = 0; i < length; i++) {
            Cipher_text=Cipher_text+cipher_text_array[i];
        }

        cipher_text_TextArea_1.setText(Cipher_text.toLowerCase());
    }//GEN-LAST:event_Cipher_Button_1ActionPerformed

    private void Cipher_Button_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_1MouseExited
        color_changement_exited(Cipher_Button_1);
    }//GEN-LAST:event_Cipher_Button_1MouseExited

    private void Cipher_Button_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cipher_Button_1MouseEntered
        color_changement_enterd(Cipher_Button_1);
    }//GEN-LAST:event_Cipher_Button_1MouseEntered

    private void plainText_TextArea_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plainText_TextArea_1KeyReleased

    }//GEN-LAST:event_plainText_TextArea_1KeyReleased
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Abatch_Cipher_Label;
    private javax.swing.JLabel Additive_Cipher_Label;
    private javax.swing.JLabel Affine_Cipher_Label;
    private javax.swing.JLabel Cesar_Cipher_Label;
    private javax.swing.JButton Cipher_Button_1;
    private javax.swing.JButton Cipher_Button_3;
    private javax.swing.JButton Cipher_Button_4;
    private javax.swing.JButton Cipher_Button_5;
    private javax.swing.JButton Cipher_Button_6;
    private javax.swing.JComboBox ComboBox_key;
    private javax.swing.JComboBox ComboBox_key_alpha;
    private javax.swing.JComboBox ComboBox_key_beta;
    private javax.swing.JComboBox ComboBox_key_product;
    private javax.swing.JTabbedPane Home_Pane;
    private javax.swing.JPanel Home_Panel;
    private javax.swing.JLabel Label_key1;
    private javax.swing.JLabel Label_key2;
    private javax.swing.JLabel Manuela;
    private javax.swing.JLabel Manuela1;
    private javax.swing.JLabel Product_Cipher_Label;
    private javax.swing.JLabel Rot13_Cipher_Label;
    private javax.swing.JButton Save_Button_1;
    private javax.swing.JButton Save_Button_3;
    private javax.swing.JButton Save_Button_4;
    private javax.swing.JButton Save_Button_5;
    private javax.swing.JButton Save_Button_6;
    private javax.swing.JTextArea cipher_text_TextArea_1;
    private javax.swing.JTextArea cipher_text_TextArea_3;
    private javax.swing.JTextArea cipher_text_TextArea_4;
    private javax.swing.JTextArea cipher_text_TextArea_5;
    private javax.swing.JTextArea cipher_text_TextArea_6;
    private javax.swing.JLabel email_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea plainText_TextArea_1;
    private javax.swing.JTextArea plainText_TextArea_3;
    private javax.swing.JTextArea plainText_TextArea_4;
    private javax.swing.JTextArea plainText_TextArea_5;
    private javax.swing.JTextArea plainText_TextArea_6;
    // End of variables declaration//GEN-END:variables


  public void additive_encryption_function(int key)
    {
       int length=plainText_TextArea_4.getText().length();
       String plainText_string = plainText_TextArea_4.getText() ;
       String ar[]= new String[length];
       
        for (int i = 1; i <= length; i++) {
            ar[i-1]=plainText_string.charAt(i-1)+"";
        }
      
        int integer_arr [] = Class_alphabet.get_number(ar);
         
        int integer_cipher[]=new int[length];
        for (int i = 0; i < length; i++) {
            if(integer_arr[i]==0)
            continue;
            else integer_cipher[i]=((integer_arr[i]+key)%26);
        }
        
        String cipher_text_array []= Class_alphabet.get_letter(integer_cipher);
        
        String Cipher_text="";
        for (int i = 0; i < length; i++) {
            Cipher_text=Cipher_text+cipher_text_array[i];
        }
        
        cipher_text_TextArea_4.setText(Cipher_text.toLowerCase());
    }
    
  public void product_encryption_function(int key)
    {
       int length=plainText_TextArea_5.getText().length();
       String plainText_string = plainText_TextArea_5.getText() ;
       String ar[]= new String[length];
       
        for (int i = 1; i <= length; i++) {
            ar[i-1]=plainText_string.charAt(i-1)+"";
        }
      
        int integer_arr [] = Class_alphabet.get_number(ar);
 
        int integer_cipher[]=new int[length];
        for (int i = 0; i < length; i++) {
            integer_cipher[i]=((integer_arr[i]*key)%26);
        }
        
        String cipher_text_array []= Class_alphabet.get_letter(integer_cipher);
        
        String Cipher_text="";
        for (int i = 0; i < length; i++) {
            Cipher_text=Cipher_text+cipher_text_array[i];
        }
        
        cipher_text_TextArea_5.setText(Cipher_text.toLowerCase());
    }

   public void affine_encryption_function(int key_aplha, int key_beta)
    {
       int length=plainText_TextArea_6.getText().length();
       String plainText_string = plainText_TextArea_6.getText() ;
       String ar[]= new String[length];
       
        for (int i = 1; i <= length; i++) {
            ar[i-1]=plainText_string.charAt(i-1)+"";
        }
      
        int integer_arr [] = Class_alphabet.get_number(ar);
 
        int integer_cipher[]=new int[length];
        for (int i = 0; i < length; i++) {
            integer_cipher[i]=(((integer_arr[i]*key_aplha)+key_beta)%26);
        }
        
        String cipher_text_array []= Class_alphabet.get_letter(integer_cipher);
        
        String Cipher_text="";
        for (int i = 0; i < length; i++) {
            Cipher_text=Cipher_text+cipher_text_array[i];
        }
        
        cipher_text_TextArea_6.setText(Cipher_text.toLowerCase());
    }
 
   public void save_function (JTextArea text_area)
   {
       try {
            String cipher_text_name=JOptionPane.showInputDialog(null, "Enter the name of your cipher text");
            File file_cipher = new File(cipher_text_name+"txt");
            if(file_cipher.createNewFile()==true)
            {
             JOptionPane.showMessageDialog(null, cipher_text_name+".txt  is  succefully  created");   
            } else {JOptionPane.showMessageDialog(null, cipher_text_name+".txt  is  failed on  creating");}
            
            String cipher_text_for_save = text_area.getText();
            FileWriter f_write = new FileWriter(file_cipher);
            BufferedWriter b_write = new BufferedWriter(f_write);
            int lenght = cipher_text_for_save.length();
            b_write.write(cipher_text_for_save,(int)file_cipher.length(),lenght);
            b_write.close();
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Error is occured during saving the cipher text");}
   }

public void color_changement_enterd(JButton b)
{
    b.setBackground(Color.GREEN);
    b.setFont(new java.awt.Font("Comic Sans MS", 0, 22));

}

public void color_changement_exited(JButton b)
{
    b.setBackground(Color.getHSBColor(236,233,216));
    b.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
}

public void color_default()
{
    Save_Button_1.setBackground(Color.getHSBColor(236,233,216));
    Save_Button_3.setBackground(Color.getHSBColor(236,233,216));
    Save_Button_4.setBackground(Color.getHSBColor(236,233,216));
    Save_Button_5.setBackground(Color.getHSBColor(236,233,216));
    Save_Button_6.setBackground(Color.getHSBColor(236,233,216));
    Cipher_Button_1.setBackground(Color.getHSBColor(236,233,216));
    Cipher_Button_3.setBackground(Color.getHSBColor(236,233,216));
    Cipher_Button_4.setBackground(Color.getHSBColor(236,233,216));
    Cipher_Button_5.setBackground(Color.getHSBColor(236,233,216));
    Cipher_Button_6.setBackground(Color.getHSBColor(236,233,216));
    
}

}
