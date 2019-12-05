package finalproject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro da Fonte
 */
public class FinalProject extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form FinalProject
     */
    public FinalProject() {
        initComponents();

        /**
         * Connects to database
         */
        conn = DbConnection.ConnectDb();

        /**
         * Filling the comboboxes and setting Games combo box to unselected
         */
        FillPlayersCombo();
        FillGamesCombo();
        cboGameNum.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        lblFNameError = new javax.swing.JLabel();
        lblLNameError = new javax.swing.JLabel();
        lblAgeError = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cboPlayer1 = new javax.swing.JComboBox<>();
        lblP1 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblNumMoves = new javax.swing.JLabel();
        lblWinner = new javax.swing.JLabel();
        txtNumMoves = new javax.swing.JTextField();
        cboWinner = new javax.swing.JComboBox<>();
        btnInsertGame = new javax.swing.JButton();
        cboPlayer2 = new javax.swing.JComboBox<>();
        jDatePlayed = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        cboGameNum = new javax.swing.JComboBox<>();
        btnRetrieveGame = new javax.swing.JButton();
        lblGameNum = new javax.swing.JLabel();
        lblPOne = new javax.swing.JLabel();
        lblPTwo = new javax.swing.JLabel();
        lblGameDate = new javax.swing.JLabel();
        lblGameNumMoves = new javax.swing.JLabel();
        lblGameWinner = new javax.swing.JLabel();
        txtPlayer1 = new javax.swing.JTextField();
        txtPlayer2 = new javax.swing.JTextField();
        txtGameMoves = new javax.swing.JTextField();
        txtWinner = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(102, 102, 255));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Checkers Game");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Player"));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblFirstName.setText("First Name");

        txtFirstName.setToolTipText("Insert First Name");
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });

        lblLastName.setText("Last Name");

        txtLastName.setToolTipText("Insert Last Name");
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });

        lblAge.setText("Age");

        txtAge.setToolTipText("Insert Age");
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(0, 51, 51));
        btnInsert.setText("Insert");
        btnInsert.setToolTipText("");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        lblFNameError.setForeground(new java.awt.Color(255, 0, 0));

        lblLNameError.setForeground(new java.awt.Color(255, 0, 0));

        lblAgeError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsert)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName)
                    .addComponent(txtAge)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(lblAge)
                            .addComponent(lblFNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgeError, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblFNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblLNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgeError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsert)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        lblFirstName.getAccessibleContext().setAccessibleName("lblFirstName");
        txtFirstName.getAccessibleContext().setAccessibleName("txtFirstName");
        lblLastName.getAccessibleContext().setAccessibleName("lblLastName");
        txtLastName.getAccessibleContext().setAccessibleName("txtLastName");
        lblAge.getAccessibleContext().setAccessibleName("lblAge");
        txtAge.getAccessibleContext().setAccessibleName("txtAge");
        btnInsert.getAccessibleContext().setAccessibleName("btnInsert");

        jTabbedPane2.addTab("Add Player", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Game"));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lblP1.setText("Player One");

        lblP2.setText("Player Two");

        lblDate.setText("Date");

        lblNumMoves.setText("# Moves");

        lblWinner.setText("Winner");

        cboWinner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Player One", "Player Two" }));
        cboWinner.setSelectedIndex(-1);

        btnInsertGame.setBackground(new java.awt.Color(0, 51, 51));
        btnInsertGame.setText("Insert");
        btnInsertGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lblP2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboPlayer2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(lblP1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDate))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumMoves)
                            .addComponent(lblWinner))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInsertGame))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNumMoves)
                                        .addComponent(cboWinner, 0, 121, Short.MAX_VALUE))
                                    .addComponent(jDatePlayed, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblP1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP2)
                    .addComponent(cboPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(jDatePlayed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumMoves, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumMoves))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboWinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWinner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 72, Short.MAX_VALUE)
                .addComponent(btnInsertGame))
        );

        jTabbedPane2.addTab("Add Game", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Retrieve Game"));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        btnRetrieveGame.setBackground(new java.awt.Color(0, 51, 51));
        btnRetrieveGame.setText("Retrieve");
        btnRetrieveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveGameActionPerformed(evt);
            }
        });

        lblGameNum.setText("Game #");

        lblPOne.setText("Player One");

        lblPTwo.setText("Player Two");

        lblGameDate.setText("Date");

        lblGameNumMoves.setText("# Moves");

        lblGameWinner.setText("Winner");

        txtPlayer1.setEnabled(false);

        txtPlayer2.setEnabled(false);

        txtGameMoves.setEnabled(false);

        txtWinner.setEnabled(false);

        jDate.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGameNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboGameNum, 0, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetrieveGame))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPTwo)
                            .addComponent(lblPOne))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlayer1)
                            .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGameNumMoves)
                            .addComponent(lblGameWinner)
                            .addComponent(lblGameDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtWinner, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGameMoves, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGameNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetrieveGame)
                    .addComponent(lblGameNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPOne)
                    .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPTwo)
                    .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGameDate)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGameNumMoves)
                    .addComponent(txtGameMoves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGameWinner)
                    .addComponent(txtWinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jTabbedPane2.addTab("Retrieve Game", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String sql = "INSERT INTO Players(FirstName, LastName, Age) VALUES(?, ?, ?)";

        if (txtFirstName.getText().trim().isEmpty()) {
            lblFNameError.setText("First name is empty");
        }
        if (txtLastName.getText().trim().isEmpty()) {
            lblLNameError.setText("Last name is empty");
        }
        if (txtAge.getText().trim().isEmpty()) {
            lblAgeError.setText("Age is empty");
        } else {
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtFirstName.getText().trim());
                pst.setString(2, txtLastName.getText().trim());
                pst.setInt(3, Integer.parseInt(txtAge.getText().trim()));

                pst.execute();
                JOptionPane.showMessageDialog(null, "Insert Successfully");
                FillPlayersCombo();

                txtFirstName.setText("");
                txtLastName.setText("");
                txtAge.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }


    }//GEN-LAST:event_btnInsertActionPerformed

    private void FillPlayersCombo() {
        try {
            cboPlayer1.removeAllItems();
            cboPlayer2.removeAllItems();

            String sql = "SELECT PlayerID, FirstName || ' ' || LastName AS Name FROM Players";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String name = rs.getString("Name");
                cboPlayer1.addItem(name);
                cboPlayer2.addItem(name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void FillGamesCombo() {
        try {
            cboGameNum.removeAllItems();

            String sql = "SELECT * FROM Games";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String game = rs.getString("GameID");
                cboGameNum.addItem(game);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnInsertGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertGameActionPerformed
        String sql = "INSERT INTO Games(PlayerOne, PlayerTwo, DatePlayed, NumMoves, Winner) VALUES(?, ?, ?, ?, ?)";

        try {
            if (cboPlayer1.getSelectedIndex() == cboPlayer2.getSelectedIndex()) {
                JOptionPane.showMessageDialog(null, "Players cannot be the same");
            } else {
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

                pst = conn.prepareStatement(sql);
                pst.setString(1, (String) cboPlayer1.getSelectedItem());
                //pst.setInt(1, cboPlayer1.getSelectedIndex() + 1);
                pst.setString(2, (String) cboPlayer2.getSelectedItem());
                //pst.setInt(2, cboPlayer2.getSelectedIndex() + 1);
                pst.setDate(3, new java.sql.Date(jDatePlayed.getDate().getTime()));
                pst.setInt(4, Integer.parseInt(txtNumMoves.getText().trim()));
                pst.setString(5, (String) cboWinner.getSelectedItem());

                pst.execute();

                JOptionPane.showMessageDialog(null, "Insert Successfully");
                FillGamesCombo();

                cboPlayer1.setSelectedIndex(-1);
                cboPlayer2.setSelectedIndex(-1);
                jDatePlayed.setDate(null);
                txtNumMoves.setText("");
                cboWinner.setSelectedIndex(-1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnInsertGameActionPerformed

    private void btnRetrieveGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveGameActionPerformed
        String tmp = (String) cboGameNum.getSelectedItem();
        String sql = "SELECT * FROM Games WHERE GameID=?";
        //String sql = "SELECT g.DatePlayed, g.NumMoves, g.Winner, p.PlayerID, p.FirstName || ' ' || p.LastName AS Name FROM Games g INNER JOIN Players p ON p.PlayerID = PlayerOne AND p.PlayerID = PlayerTwo WHERE GameID=?";

        if (cboGameNum.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "You must select a game to retrieve first");
        } else {
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, tmp);
                rs = pst.executeQuery();

                if (rs.next()) {
                    String add1 = rs.getString("PlayerOne");
                    txtPlayer1.setText(add1);
                    String add2 = rs.getString("PlayerTwo");
                    txtPlayer2.setText(add2);
                    Date add3 = rs.getDate("DatePlayed");
                    jDate.setDate(add3);
                    String add4 = rs.getString("NumMoves");
                    txtGameMoves.setText(add4);
                    String add5 = rs.getString("Winner");
                    txtWinner.setText(add5);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btnRetrieveGameActionPerformed

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        lblFNameError.setText("");
    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        lblLNameError.setText("");
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        lblAgeError.setText("");
    }//GEN-LAST:event_txtAgeKeyReleased

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
            java.util.logging.Logger.getLogger(FinalProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsertGame;
    private javax.swing.JButton btnRetrieveGame;
    private javax.swing.JComboBox<String> cboGameNum;
    private javax.swing.JComboBox<String> cboPlayer1;
    private javax.swing.JComboBox<String> cboPlayer2;
    private javax.swing.JComboBox<String> cboWinner;
    private com.toedter.calendar.JDateChooser jDate;
    private com.toedter.calendar.JDateChooser jDatePlayed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeError;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFNameError;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGameDate;
    private javax.swing.JLabel lblGameNum;
    private javax.swing.JLabel lblGameNumMoves;
    private javax.swing.JLabel lblGameWinner;
    private javax.swing.JLabel lblLNameError;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNumMoves;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblPOne;
    private javax.swing.JLabel lblPTwo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWinner;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGameMoves;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNumMoves;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    private javax.swing.JTextField txtWinner;
    // End of variables declaration//GEN-END:variables
}
