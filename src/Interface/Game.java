package Interface;

import Config.Helper;
import Config.Load;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Game extends javax.swing.JFrame {
    private int level = 0;
    private Load load;

    private Helper helper;
    
    private javax.swing.Timer timer;
    private final long TOTAL_TIME = 900000;
    
    public Game() {
        initComponents();
        initialize();
        centerScreen();
        refresh();
    }
    
    private void initialize() {
        helper = new Helper();
        load = new Load();
        timer();
        hideLevel();
    }
    
    private void hideLevel() {
        level1.setVisible(false);
        level2.setVisible(false);
        level3.setVisible(false);
        level4.setVisible(false);
        level5.setVisible(false);
        level6.setVisible(false);
        level7.setVisible(false);
        level8.setVisible(false);
        level9.setVisible(false);
        level10.setVisible(false);
        level11.setVisible(false);
        level12.setVisible(false);
        level13.setVisible(false);
        level14.setVisible(false);
        level15.setVisible(false);
        
    }
    
    private void timer() {
        
        final SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");

        Game.setClock(sdf.format(new Date(TOTAL_TIME)));

        int x = 0;
        
        ActionListener al = new ActionListener() {
            long x = TOTAL_TIME - 1000;
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(x == 0) {
                    innerClass();
                    Result.show(null, "timeup", level);
                }
                Game.setClock(sdf.format(new Date(x)));
                x-=1000;
            }
        };
        
        timer = new javax.swing.Timer(1000, al);
        timer.start();  
    }
    
    private void innerClass() {
        this.setVisible(false);     
    }
    
    public static void setClock(String format) {
        clock.setText(format);
    }
    
    private void refresh() {
        if(level == 15) {
            this.setVisible(false);
            timer.stop();
            Result.show(null, "success", level);
        }
        
        setHelper();
        setStatus();
        
        setQuestion();
        setOptions();
    }
    
    private void setQuestion() {
        question.setText(load.getQuestion());
    }
    
    private void setOptions(){
        String[] options = load.getOptions();
        optionA.setText(options[0]);
        optionB.setText(options[1]);
        optionC.setText(options[2]);
        optionD.setText(options[3]);
        
        optionA.setSelected(false);
        optionB.setSelected(false);
        optionC.setSelected(false);
        optionD.setSelected(false);
        
        optionA.setEnabled(true);
        optionB.setEnabled(true);
        optionC.setEnabled(true);
        optionD.setEnabled(true);
    }
    
    private void setStatus() {
        level++;
        
        load.loadFile(level);
        
        if(level == 1) level1.setVisible(true);
        if(level == 2) level2.setVisible(true);
        if(level == 3) level3.setVisible(true);
        if(level == 4) level4.setVisible(true);
        if(level == 5) level5.setVisible(true);
        if(level == 6) level6.setVisible(true);
        if(level == 7) level7.setVisible(true);
        if(level == 8) level8.setVisible(true);
        if(level == 9) level9.setVisible(true);
        if(level == 10) level10.setVisible(true);
        if(level == 11) level11.setVisible(true);
        if(level == 12) level12.setVisible(true);
        if(level == 13) level13.setVisible(true);
        if(level == 14) level14.setVisible(true);
        if(level == 15) level15.setVisible(true); 
        
        if(level>1) level1.setEnabled(true);
        if(level>2) level2.setEnabled(true);
        if(level>3) level3.setEnabled(true);
        if(level>4) level4.setEnabled(true);
        if(level>5) level5.setEnabled(true);
        if(level>6) level6.setEnabled(true);
        if(level>7) level7.setEnabled(true);
        if(level>8) level8.setEnabled(true);
        if(level>9) level9.setEnabled(true);
        if(level>10) level10.setEnabled(true);
        if(level>11) level11.setEnabled(true);
        if(level>12) level12.setEnabled(true);
        if(level>13) level13.setEnabled(true);
        if(level>14) level14.setEnabled(true);
        if(level>15) level15.setEnabled(true);  
    }
    
    private void setHelper() {
        delete.setEnabled(helper.getHelper("delete"));
        teacher.setEnabled(helper.getHelper("teacher"));
        classmate.setEnabled(helper.getHelper("classmate")); 
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

        delete = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        classmate = new javax.swing.JButton();
        level15 = new javax.swing.JLabel();
        level10 = new javax.swing.JLabel();
        level3 = new javax.swing.JLabel();
        level2 = new javax.swing.JLabel();
        level1 = new javax.swing.JLabel();
        level8 = new javax.swing.JLabel();
        level7 = new javax.swing.JLabel();
        level5 = new javax.swing.JLabel();
        level4 = new javax.swing.JLabel();
        level6 = new javax.swing.JLabel();
        level14 = new javax.swing.JLabel();
        level12 = new javax.swing.JLabel();
        level13 = new javax.swing.JLabel();
        level11 = new javax.swing.JLabel();
        level9 = new javax.swing.JLabel();
        questionScrollPanel = new javax.swing.JScrollPane();
        question = new javax.swing.JTextArea();
        labelA = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        labelC = new javax.swing.JLabel();
        labelD = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        optionA = new javax.swing.JRadioButton();
        optionB = new javax.swing.JRadioButton();
        optionC = new javax.swing.JRadioButton();
        optionD = new javax.swing.JRadioButton();
        clock = new javax.swing.JLabel("mm:ss", SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Millionaire");
        setName("Info"); // NOI18N
        setResizable(false);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc/delete.png"))); // NOI18N
        delete.setToolTipText("系統刪除");
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc/teacher.png"))); // NOI18N
        teacher.setToolTipText("詢問老師");
        teacher.setEnabled(false);
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });

        classmate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc/classmate.png"))); // NOI18N
        classmate.setToolTipText("參考同學");
        classmate.setEnabled(false);
        classmate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classmateActionPerformed(evt);
            }
        });

        level15.setFont(new java.awt.Font("Tahoma", 1, 24));
        level15.setText("Level 15 = 100");
        level15.setEnabled(false);

        level10.setFont(new java.awt.Font("Tahoma", 1, 24));
        level10.setText("Level 10 = 67");
        level10.setEnabled(false);

        level3.setFont(new java.awt.Font("Tahoma", 0, 24));
        level3.setText("Level 3 = 20");
        level3.setEnabled(false);

        level2.setFont(new java.awt.Font("Tahoma", 0, 24));
        level2.setText("Level 2 = 13");
        level2.setEnabled(false);

        level1.setFont(new java.awt.Font("Tahoma", 0, 24));
        level1.setText("Level 1 = 7");
        level1.setEnabled(false);

        level8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        level8.setText("Level 8 = 53");
        level8.setEnabled(false);

        level7.setFont(new java.awt.Font("Tahoma", 0, 24));
        level7.setText("Level 7 = 47");
        level7.setEnabled(false);

        level5.setFont(new java.awt.Font("Tahoma", 1, 24));
        level5.setText("Level 5 = 33");
        level5.setEnabled(false);

        level4.setFont(new java.awt.Font("Tahoma", 0, 24));
        level4.setText("Level 4 = 27");
        level4.setEnabled(false);

        level6.setFont(new java.awt.Font("Tahoma", 0, 24));
        level6.setText("Level 6 = 40");
        level6.setEnabled(false);

        level14.setFont(new java.awt.Font("Tahoma", 0, 24));
        level14.setText("Level 14 = 93");
        level14.setEnabled(false);

        level12.setFont(new java.awt.Font("Tahoma", 0, 24));
        level12.setText("Level 12 = 80");
        level12.setEnabled(false);

        level13.setFont(new java.awt.Font("Tahoma", 0, 24));
        level13.setText("Level 13 = 87");
        level13.setEnabled(false);

        level11.setFont(new java.awt.Font("Tahoma", 0, 24));
        level11.setText("Level 11 = 73");
        level11.setEnabled(false);

        level9.setFont(new java.awt.Font("Tahoma", 0, 24));
        level9.setText("Level 9 = 60");
        level9.setEnabled(false);

        questionScrollPanel.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        questionScrollPanel.setHorizontalScrollBar(null);

        question.setColumns(20);
        question.setFont(new java.awt.Font("微軟正黑體", 0, 24));
        question.setLineWrap(true);
        question.setRows(5);
        questionScrollPanel.setViewportView(question);

        labelA.setFont(new java.awt.Font("Tahoma", 1, 36));
        labelA.setText("A");

        labelB.setFont(new java.awt.Font("Tahoma", 1, 36));
        labelB.setText("B");

        labelC.setFont(new java.awt.Font("Tahoma", 1, 36));
        labelC.setText("C");

        labelD.setFont(new java.awt.Font("Tahoma", 1, 36));
        labelD.setText("D");

        start.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        start.setText("我準備好面對殘酷的現實");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        quit.setFont(new java.awt.Font("微軟正黑體", 0, 18));
        quit.setText("我怕了");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        optionA.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        optionA.setText("OPTIONA");
        optionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAActionPerformed(evt);
            }
        });

        optionB.setFont(new java.awt.Font("微軟正黑體", 0, 24));
        optionB.setText("OPTIONB");
        optionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBActionPerformed(evt);
            }
        });

        optionC.setFont(new java.awt.Font("微軟正黑體", 0, 24));
        optionC.setText("OPTIONC");
        optionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCActionPerformed(evt);
            }
        });

        optionD.setFont(new java.awt.Font("微軟正黑體", 0, 24));
        optionD.setText("OPTIOND");
        optionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDActionPerformed(evt);
            }
        });

        clock.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clock.setText("mm:ss");
        clock.setToolTipText("您剩下的作答時間");
        clock.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(teacher)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(classmate)
                                .addGap(32, 32, 32)
                                .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(questionScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelA)
                                    .addComponent(labelB)
                                    .addComponent(labelC))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optionA)
                                    .addComponent(optionB)
                                    .addComponent(optionC)))
                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelD)
                                .addGap(18, 18, 18)
                                .addComponent(optionD)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(level3)
                    .addComponent(level2)
                    .addComponent(level15)
                    .addComponent(level10)
                    .addComponent(level7)
                    .addComponent(level1)
                    .addComponent(level8)
                    .addComponent(level14)
                    .addComponent(level6)
                    .addComponent(level4)
                    .addComponent(level5)
                    .addComponent(level13)
                    .addComponent(level12)
                    .addComponent(level9)
                    .addComponent(level11))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(level15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(level1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classmate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(questionScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(optionA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelA, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionB, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(labelB, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(optionC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelC, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionD, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(labelD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int getSelection() {
        if(optionA.isSelected()) return 0;
        else if(optionB.isSelected()) return 1;
        else if(optionC.isSelected()) return 2;
        else if(optionD.isSelected()) return 3;
        else {
            return 4;
        }
    }
    
    private boolean idioltProof() {
        if(!(optionA.isSelected() | optionB.isSelected() | optionC.isSelected() | optionD.isSelected())) {
            Object[] options = {"勇往直前", "浪子回頭"};
            int choice = JOptionPane.showOptionDialog(this, "你確定連選都不想選？", 
                                                    "別衝動", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                                    null, options, options[1]);
            if(choice == 0) 
                return true;
            else 
                return false;
        }  
        return true;
    }
    
    private boolean checkAnswer() {
        int solution = load.getSolution();
        int selection = getSelection();
        return solution == selection;
    }
    
    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        Object[] options = {"我堅持", "我想改"};
   
        if(idioltProof()) {
            int choice = JOptionPane.showOptionDialog(this, "你確定現在的就是正確答案了？", 
                                                "答案好像不對哦", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                                null, options, options[1]);
            if(choice == 0) {
                if(checkAnswer()) {
                    refresh();
                } else {
                    this.setVisible(false);
                    timer.stop();
                    Result.show(null, "fail", level);
                }
            }
        }
    }//GEN-LAST:event_startActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        boolean quitConfirm = false;
        
        if(!(optionA.isSelected() | optionB.isSelected() | optionC.isSelected() | optionD.isSelected())) {
            Object[] options = {"我非常肯定", "我打消念頭"};
            int choice = JOptionPane.showOptionDialog(this, "你確定只需要這一點點分數？", 
                                                "三思而後行", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                                null, options, options[1]);
            if(choice == 0)
                quitConfirm = true;
        } else {
            Object[] choseoptions = {"我務實", "再考慮"};
            int chosechoice = JOptionPane.showOptionDialog(this, "做了選擇卻不想賭賭看...？", 
                                                "有時，人生需要的就是一場豪賭", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                                null, choseoptions, choseoptions[1]);
            if(chosechoice == 0)
                    quitConfirm = true;
        }
 
        if(quitConfirm) {
            level--;
            this.setVisible(false);
            timer.stop();
            if(checkAnswer())
                Result.show(null, "lucky", level);
            else
                Result.show(null, "quit", level);
        }
    }//GEN-LAST:event_quitActionPerformed

    private void optionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAActionPerformed
        optionB.setSelected(false);
        optionC.setSelected(false);
        optionD.setSelected(false);
    }//GEN-LAST:event_optionAActionPerformed

    private void optionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionBActionPerformed
        optionA.setSelected(false);
        optionC.setSelected(false);
        optionD.setSelected(false);
    }//GEN-LAST:event_optionBActionPerformed

    private void optionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCActionPerformed
        optionA.setSelected(false);
        optionB.setSelected(false);
        optionD.setSelected(false);
    }//GEN-LAST:event_optionCActionPerformed

    private void optionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionDActionPerformed
        optionA.setSelected(false);
        optionB.setSelected(false);
        optionC.setSelected(false);
    }//GEN-LAST:event_optionDActionPerformed

    private int generateRandom(int Min, int Max) {
        return Min + (int)(Math.random() * ((Max-Min)+1));
    }
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int correct = load.getSolution();
        int delete1 = correct;
        int delete2 = correct;
        
        while(delete1 == correct) {
            delete1 = generateRandom(0,3);
        }
        
        while(delete2 == correct | delete2 == delete1) {
            delete2 = generateRandom(0,3);
        }
        
        if(delete1 == 0 || delete2 == 0) {
            optionA.setEnabled(false);
        }
        if(delete1 == 1 || delete2 == 1) {
            optionB.setEnabled(false);
        }
        if(delete1 == 2 || delete2 == 2) {
            optionC.setEnabled(false);
        }
        if(delete1 == 3 || delete2 == 3) {
            optionD.setEnabled(false);
        }
        
        helper.useHelper("delete");
        setHelper();
    }//GEN-LAST:event_deleteActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        helper.useHelper("teacher");
        setHelper();
    }//GEN-LAST:event_teacherActionPerformed
    
    private void classmateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classmateActionPerformed
        helper.useHelper("classmate");
        setHelper();
        Callout.show(null); 
    }//GEN-LAST:event_classmateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void show(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Game().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classmate;
    private static javax.swing.JLabel clock;
    private javax.swing.JButton delete;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel level1;
    private javax.swing.JLabel level10;
    private javax.swing.JLabel level11;
    private javax.swing.JLabel level12;
    private javax.swing.JLabel level13;
    private javax.swing.JLabel level14;
    private javax.swing.JLabel level15;
    private javax.swing.JLabel level2;
    private javax.swing.JLabel level3;
    private javax.swing.JLabel level4;
    private javax.swing.JLabel level5;
    private javax.swing.JLabel level6;
    private javax.swing.JLabel level7;
    private javax.swing.JLabel level8;
    private javax.swing.JLabel level9;
    private javax.swing.JRadioButton optionA;
    private javax.swing.JRadioButton optionB;
    private javax.swing.JRadioButton optionC;
    private javax.swing.JRadioButton optionD;
    private javax.swing.JTextArea question;
    private javax.swing.JScrollPane questionScrollPanel;
    private javax.swing.JButton quit;
    private javax.swing.JButton start;
    private javax.swing.JButton teacher;
    // End of variables declaration//GEN-END:variables
}
