/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Info.java
 *
 * Created on 2012/9/11, 下午 10:24:03
 */
package Interface;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class Info extends javax.swing.JFrame {

    /** Creates new form Info */
    public Info() {
        initComponents();
        
        centerScreen();
    }
    
    private void centerScreen() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width - this.getSize().width)/2;
        int y = (dim.height - this.getSize().height)/2;
        this.setLocation(x, y);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        classmate = new javax.swing.JLabel();
        teacher = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Millionaire");
        setName("Info"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Level 1 = 7");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel2.setText("Level 2 = 13");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel3.setText("Level 3 = 20");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel4.setText("Level 4 = 27");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel5.setText("Level 5 = 33");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel6.setText("Level 6 = 40");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel7.setText("Level 7 = 47");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel8.setText("Level 8 = 53");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel9.setText("Level 9 = 60");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Level 14 = 93");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel11.setText("Level 12 = 80");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel12.setText("Level 13 = 87");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel13.setText("Level 11 = 73");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel14.setText("Level 10 = 67");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel15.setText("Level 15 = 100");

        jLabel16.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel16.setText("電腦隨機抽出15條問題");

        jLabel17.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        jLabel17.setText("所有問題號碼為5的倍數者是保險線");

        jLabel18.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        jLabel18.setText("若成功過了保險線");

        jLabel19.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        jLabel19.setText("即使之後答錯也可以獲得保險線上的分數");

        jLabel20.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        jLabel20.setText("您有三個錦囊");

        delete.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc/delete.png"))); // NOI18N
        delete.setText("系統刪除：電腦幫您刪除兩個錯誤的答案。");

        classmate.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        classmate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc/classmate.png"))); // NOI18N
        classmate.setText("參考同學：30秒分析現場同學們的意見。");

        teacher.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc/teacher.png"))); // NOI18N
        teacher.setText("詢問老師：由老師提供適度的提示。");

        jLabel24.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        jLabel24.setText("全部作答時間最多只有15分鐘");

        jLabel25.setText("這只是遊戲，分數不幸太低應該是不會被當掉。");

        start.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        start.setText("我準備好面對殘酷的現實");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        quit.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        quit.setText("退出");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20)
                            .addComponent(delete)
                            .addComponent(teacher)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(classmate))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quit, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classmate)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quit, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        this.setVisible(false);
        Game.show(null); 
    }//GEN-LAST:event_startActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        Object[] options = {"我非常肯定", "我打消念頭"};
        int choice = JOptionPane.showOptionDialog(this, "你真的確定要直接當掉嗎？", 
                                                "三思而後行", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                                null, options, options[1]);
        
        if(choice == 0) {
            this.setVisible(false);
            About.show(null);
//            System.exit(0);
        }
    }//GEN-LAST:event_quitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void show(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Info().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classmate;
    private javax.swing.JLabel delete;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton quit;
    private javax.swing.JButton start;
    private javax.swing.JLabel teacher;
    // End of variables declaration//GEN-END:variables
}
