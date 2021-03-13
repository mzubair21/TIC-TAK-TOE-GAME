
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Qureshi Home
 */
public class Tic_Tack_Toe_Game extends javax.swing.JFrame {

    private String startGame= "X";
    private int xCount = 0;
    private int oCount = 0;
    private int checkedblocks=0;
    /**
     * Creates new form Tic_Tack_Toe_Game
     */
    public Tic_Tack_Toe_Game() {
        initComponents();
    }
     private void gameScore(){
         playerxxx.setText(String.valueOf(xCount));
         playerooo.setText(String.valueOf(oCount));
     }
     
     private void choose_a_Player(){
         if(startGame.equalsIgnoreCase("X"))
         {
            startGame= "O"; 
         }
         else{
             startGame="X";
         }
     }
     private void disabled(){
        txtbtn1.setEnabled(false);
        txtbtn2.setEnabled(false);
        txtbtn3.setEnabled(false);
        txtbtn4.setEnabled(false);
        txtbtn5.setEnabled(false);
        txtbtn6.setEnabled(false);
        txtbtn7.setEnabled(false);
        txtbtn8.setEnabled(false);
        txtbtn9.setEnabled(false);
     }
     private void WinningGame()
     {
         String b1=txtbtn1.getText();
         String b2=txtbtn2.getText();
         String b3=txtbtn3.getText();
         String b4=txtbtn4.getText();
         String b5=txtbtn5.getText();
         String b6=txtbtn6.getText();
         String b7=txtbtn7.getText();
         String b8=txtbtn8.getText();
         String b9=txtbtn9.getText();
         //box Clicked
         checkedblocks++;
         
         //XWins
         if(b1==("X")&& b2==("X") && b3 =="X" ){
             JOptionPane.showMessageDialog(this,"PLayer X Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn1.setEnabled(true);
             txtbtn2.setEnabled(true);
             txtbtn3.setEnabled(true);
             txtbtn1.setBackground(Color.ORANGE);
             txtbtn2.setBackground(Color.ORANGE);
             txtbtn3.setBackground(Color.ORANGE);
         }
         else if(b4==("X")&& b5==("X") && b6 =="X" ){
             JOptionPane.showMessageDialog(this,"PLayer X Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn4.setEnabled(true);
             txtbtn5.setEnabled(true);
             txtbtn6.setEnabled(true);
             txtbtn4.setBackground(Color.ORANGE);
             txtbtn5.setBackground(Color.ORANGE);
             txtbtn6.setBackground(Color.ORANGE);
         }
         else if(b7==("X")&& b8==("X") && b9 =="X" ){
             JOptionPane.showMessageDialog(this,"PLayer X Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn7.setEnabled(true);
             txtbtn8.setEnabled(true);
             txtbtn9.setEnabled(true);
             txtbtn7.setBackground(Color.ORANGE);
             txtbtn8.setBackground(Color.ORANGE);
             txtbtn9.setBackground(Color.ORANGE);
         }
         else if(b1==("X")&& b4==("X") && b7 =="X" ){
             JOptionPane.showMessageDialog(this,"PLayer X Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn1.setEnabled(true);
             txtbtn4.setEnabled(true);
             txtbtn7.setEnabled(true);
             txtbtn1.setBackground(Color.ORANGE);
             txtbtn4.setBackground(Color.ORANGE);
             txtbtn7.setBackground(Color.ORANGE);
         }
         else  if(b2==("X")&& b5==("X") && b8 =="X" ){
             JOptionPane.showMessageDialog(this,"PLayer X Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn2.setEnabled(true);
             txtbtn5.setEnabled(true);
             txtbtn8.setEnabled(true);
             txtbtn2.setBackground(Color.ORANGE);
             txtbtn5.setBackground(Color.ORANGE);
             txtbtn8.setBackground(Color.ORANGE);
         }
         else  if(b3==("X")&& b6==("X") && b9 =="X" ){
             JOptionPane.showMessageDialog(this,"PLayer X Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn3.setEnabled(true);
             txtbtn6.setEnabled(true);
             txtbtn9.setEnabled(true);
             txtbtn3.setBackground(Color.ORANGE);
             txtbtn6.setBackground(Color.ORANGE);
             txtbtn9.setBackground(Color.ORANGE);
         }
         else if(b1==("X")&& b5==("X") && b9 =="X" ){
             JOptionPane.showMessageDialog(this,"PLayer X Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn1.setEnabled(true);
             txtbtn5.setEnabled(true);
             txtbtn9.setEnabled(true);
             txtbtn1.setBackground(Color.ORANGE);
             txtbtn5.setBackground(Color.ORANGE);
             txtbtn9.setBackground(Color.ORANGE);
         }
         else if(b3==("X")&& b5==("X") && b7 =="X" ){
             JOptionPane.showMessageDialog(this,"PLayer X Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn3.setEnabled(true);
             txtbtn5.setEnabled(true);
             txtbtn7.setEnabled(true);
             txtbtn3.setBackground(Color.ORANGE);
             txtbtn5.setBackground(Color.ORANGE);
             txtbtn7.setBackground(Color.ORANGE);
         }
         //O wins
         
         else if(b1==("O")&& b2==("O") && b3 =="O" ){
             JOptionPane.showMessageDialog(this,"PLayer O Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             disabled();
             txtbtn1.setEnabled(true);
             txtbtn2.setEnabled(true);
             txtbtn3.setEnabled(true);
             txtbtn1.setBackground(Color.ORANGE);
             txtbtn2.setBackground(Color.ORANGE);
             txtbtn3.setBackground(Color.ORANGE);
         }
         else if(b4==("O")&& b5==("O") && b6 =="O" ){
             JOptionPane.showMessageDialog(this,"PLayer O Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             disabled();
             txtbtn4.setEnabled(true);
             txtbtn5.setEnabled(true);
             txtbtn6.setEnabled(true);
             txtbtn4.setBackground(Color.ORANGE);
             txtbtn5.setBackground(Color.ORANGE);
             txtbtn6.setBackground(Color.ORANGE);
         }
         else if(b7==("O")&& b8==("O") && b9 =="O" ){
             JOptionPane.showMessageDialog(this,"PLayer O Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             disabled();
             txtbtn7.setEnabled(true);
             txtbtn8.setEnabled(true);
             txtbtn9.setEnabled(true);
             txtbtn7.setBackground(Color.ORANGE);
             txtbtn8.setBackground(Color.ORANGE);
             txtbtn9.setBackground(Color.ORANGE);
         }
         else if(b1==("O")&& b4==("O") && b7 =="O" ){
             JOptionPane.showMessageDialog(this,"PLayer O Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             disabled();
             txtbtn1.setEnabled(true);
             txtbtn4.setEnabled(true);
             txtbtn7.setEnabled(true);
             txtbtn1.setBackground(Color.ORANGE);
             txtbtn4.setBackground(Color.ORANGE);
             txtbtn7.setBackground(Color.ORANGE);
         }
         else if(b2==("O")&& b5==("O") && b8 =="O" ){
             JOptionPane.showMessageDialog(this,"PLayer O Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn2.setEnabled(true);
             txtbtn5.setEnabled(true);
             txtbtn8.setEnabled(true);
             txtbtn2.setBackground(Color.ORANGE);
             txtbtn5.setBackground(Color.ORANGE);
             txtbtn8.setBackground(Color.ORANGE);
         }
         else if(b3==("O")&& b6==("O") && b9 =="O" ){
             JOptionPane.showMessageDialog(this,"PLayer O Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             disabled();
             txtbtn3.setEnabled(true);
             txtbtn6.setEnabled(true);
             txtbtn9.setEnabled(true);
             txtbtn3.setBackground(Color.ORANGE);
             txtbtn6.setBackground(Color.ORANGE);
             txtbtn9.setBackground(Color.ORANGE);
         }
         else if(b1==("O")&& b5==("O") && b9 =="O" ){
             JOptionPane.showMessageDialog(this,"PLayer O Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             gameScore();
             disabled();
             txtbtn1.setEnabled(true);
             txtbtn5.setEnabled(true);
             txtbtn9.setEnabled(true);
             txtbtn1.setBackground(Color.ORANGE);
             txtbtn5.setBackground(Color.ORANGE);
             txtbtn9.setBackground(Color.ORANGE);
         }
         else if(b3==("O")&& b5==("O") && b7 =="O" ){
             JOptionPane.showMessageDialog(this,"PLayer O Win","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             disabled();
             txtbtn3.setEnabled(true);
             txtbtn5.setEnabled(true);
             txtbtn7.setEnabled(true);
             txtbtn3.setBackground(Color.ORANGE);
             txtbtn5.setBackground(Color.ORANGE);
             txtbtn7.setBackground(Color.ORANGE);
         }
         else if(checkedblocks==9){
             JOptionPane.showMessageDialog(this,"Game Drawn","Tic Tac Toe",
                     JOptionPane.INFORMATION_MESSAGE);
             checkedblocks=0;
         }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TACK TOE ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GMAE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(281, 281, 281))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 0, 51));
        txtexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(51, 153, 255));
        txtreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.darkGray));

        playero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playero.setText("Player 0:");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerx.setText("Player X:");

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(51, 153, 255));
        playerxxx.setText("0");

        playerooo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerooo.setForeground(new java.awt.Color(51, 153, 255));
        playerooo.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerooo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        if(txtbtn2.getText()==""){
            
        
        txtbtn2.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn2.setForeground(Color.RED);
         }
         else{
             txtbtn2.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        if(txtbtn3.getText()==""){
        txtbtn3.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn3.setForeground(Color.RED);
         }
         else{
             txtbtn3.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        if(txtbtn1.getText()==""){
        txtbtn1.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn1.setForeground(Color.RED);
         }
         else{
             txtbtn1.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        if(txtbtn4.getText()==""){
        txtbtn4.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn4.setForeground(Color.RED);
         }
         else{
             txtbtn4.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        if(txtbtn5.getText()==""){
        txtbtn5.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn5.setForeground(Color.RED);
         }
         else{
             txtbtn5.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        if(txtbtn6.getText()==""){
        txtbtn6.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn6.setForeground(Color.RED);
         }
         else{
             txtbtn6.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        if(txtbtn8.getText()==""){
        txtbtn8.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn8.setForeground(Color.RED);
         }
         else{
             txtbtn8.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        if(txtbtn9.getText()==""){
        txtbtn9.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn9.setForeground(Color.RED);
         }
         else{
             txtbtn9.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        if(txtbtn7.getText()==""){
        txtbtn7.setText(startGame);
         if(startGame.equalsIgnoreCase("X"))
         {
            txtbtn7.setForeground(Color.RED);
         }
         else{
             txtbtn7.setForeground(Color.MAGENTA);
         }
         choose_a_Player();
         WinningGame();
        }
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm If you want to Exit",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
         System.exit(0);
        }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText("");
        txtbtn2.setText("");
        txtbtn3.setText("");
        txtbtn4.setText("");
        txtbtn5.setText("");
        txtbtn6.setText("");
        txtbtn7.setText("");
        txtbtn8.setText("");
        txtbtn9.setText("");
        
        txtbtn1.setEnabled(true);
        txtbtn2.setEnabled(true);
        txtbtn3.setEnabled(true);
        txtbtn4.setEnabled(true);
        txtbtn5.setEnabled(true);
        txtbtn6.setEnabled(true);
        txtbtn7.setEnabled(true);
        txtbtn8.setEnabled(true);
        txtbtn9.setEnabled(true);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        
        
    }//GEN-LAST:event_txtresetActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Tack_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tack_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tack_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tack_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tack_Toe_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
