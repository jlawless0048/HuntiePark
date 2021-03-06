import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Josh
 */
public class main extends javax.swing.JFrame {
    private Park park1 = new Park();
    getOutThread thready = new getOutThread(park1);

    public main() {
        initComponents();
        updateThread updater = new updateThread(jTable1);

        thready.start();
        updater.start();
    }
    
    private void initComponents() {
        setSize(500, 500);
        setVisible(true);

        setTitle("HuntiePark 2.0 - Now With Game");

        picture = new ImageIcon("abstract-amusement-park-mindy-newman.jpg");
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel(picture);
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        Upgrades = new javax.swing.JMenu("Upgrades ($1000)");
        font = new Font("Courier", Font.BOLD,12);

        setBackground(Color.CYAN);

        upTicket = new JMenuItem("Used Tickets");
        upTicket.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upTicketActionPerformed(evt);
            }
        });

        upEff = new JMenuItem("Energy Efficiency");
        upEff.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upEffActionPerformed(evt);
            }
        });

        upMax = new JMenuItem("Max Riders");
        upMax.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upMaxActionPerformed(evt);
            }
        });

        upVom = new JMenuItem("Puke Factor");
        upVom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upVomActionPerformed(evt);
            }
        });

        upScare = new JMenuItem("Scare Factor");
        upScare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upScareActionPerformed(evt);
            }
        });

        Upgrades.add(upTicket);Upgrades.add(upEff);Upgrades.add(upMax);Upgrades.add(upVom);Upgrades.add(upScare);
        jMenuBar.add(Upgrades);
        setJMenuBar(jMenuBar);
        add(jMenuBar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jScrollPane1.setViewportView(jLabel2);

        jLabel1.setText("Huntie Park 1.0 - Dinosaurs not included, Sold Separately.");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"Money", null},
                        {"Attendants", null},
                        {"Tickets Per", null},
                        {"Efficiency", null},
                        {"Max Riders", null},
                        {"Puke Factor", null},
                        {"Scare Factor", null},
                        {"Coasters", null},
                        {"Towers", null},
                        {"Ad Level", null}
                },
                new String[]{
                        "Asset", "Value"
                }
        ));

        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Hand Out Fliers");
        jButton1.setFont(font);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, park1);
            }
        });

        jButton2.setText("Buy Roller Coaster ($500)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt, park1);
            }
        });

        jButton3.setText("Buy Tower of Terror ($750)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt, park1);
            }
        });

        jButton4.setText("Buy Advertisement ($100)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt, park1);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Park park) {
        park.comeBack();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, Park park) {
        park.addCoaster();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt, Park park) {
        park.addTower();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt, Park park) {
        park.increaseAdLevel();
    }

    private void upVomActionPerformed(java.awt.event.ActionEvent evt){
        RollerCoaster.addVomit();
    }

    private void upMaxActionPerformed(java.awt.event.ActionEvent evt){
        Attraction.upMax();
    }

    private void upEffActionPerformed(java.awt.event.ActionEvent evt){
        Attraction.upEfficiency();
    }

    private void upScareActionPerformed(java.awt.event.ActionEvent evt){
        TowerOfTerror.upgradeScare();
    }

    private void upTicketActionPerformed(java.awt.event.ActionEvent evt){
        Attraction.upTicket();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu Upgrades;
    private javax.swing.Icon picture;
    private javax.swing.JMenuItem upVom,upMax,upEff,upScare, upTicket;
    private Font font;
}
