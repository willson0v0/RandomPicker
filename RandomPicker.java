/*
 * Copyright (C) 2015 Willson.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package RandomPicker;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.Calendar;
import javax.swing.*;
import reader.Data;
/**
 * @author willson
 */
public class RandomPicker extends javax.swing.JFrame {
    
    private long last=0;
    
    public RandomPicker() {
        initComponents();
        absList.setModel(absListmod);
        randomList.setModel(randomListmod);
        jLabel2.setEnabled(false);
        maxPeop.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        listScroll = new javax.swing.JScrollPane();
        randomList = new javax.swing.JList();
        pick = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        maxPeop = new javax.swing.JTextField();
        absPan = new javax.swing.JPanel();
        absinput = new javax.swing.JTextField();
        addabs = new javax.swing.JButton();
        sbabs = new javax.swing.JRadioButton();
        absent = new javax.swing.JButton();
        warn = new javax.swing.JLabel();
        absListSco = new javax.swing.JScrollPane();
        absList = new javax.swing.JList();
        absenter = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        luckyDog = new javax.swing.JLabel();
        clearBut = new javax.swing.JButton();
        number = new javax.swing.JLabel();
        useFile = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jRadioButton1.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButton2.setText("jRadioButton2");

        jLabel1.setText("sb");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("点名器");
        setBackground(new java.awt.Color(255, 255, 255));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        randomList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listScroll.setViewportView(randomList);

        pick.setText("随机");
        pick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickActionPerformed(evt);
            }
        });
        pick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pickKeyPressed(evt);
            }
        });

        jLabel2.setText("学号上限");

        maxPeop.setText("45");
        maxPeop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                maxPeopKeyPressed(evt);
            }
        });

        absPan.setBorder(javax.swing.BorderFactory.createTitledBorder("缺席者"));

        absinput.setEnabled(false);

        addabs.setText("添加到列表");
        addabs.setEnabled(false);
        addabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addabsActionPerformed(evt);
            }
        });

        sbabs.setText("有人缺席");
        sbabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbabsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout absPanLayout = new javax.swing.GroupLayout(absPan);
        absPan.setLayout(absPanLayout);
        absPanLayout.setHorizontalGroup(
            absPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absPanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sbabs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(absinput, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addabs)
                .addContainerGap())
        );
        absPanLayout.setVerticalGroup(
            absPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(absPanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(absPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(absinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addabs)
                    .addComponent(sbabs)))
        );

        absent.setText("这人缺席");
        absent.setEnabled(false);
        absent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentActionPerformed(evt);
            }
        });
        absent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                absentKeyPressed(evt);
            }
        });

        warn.setForeground(new java.awt.Color(255, 0, 0));
        warn.setText(" ");

        absList.setEnabled(false);
        absListSco.setViewportView(absList);

        absenter.setText("缺席者：");
        absenter.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("↓喜大普奔↓");

        luckyDog.setBackground(new java.awt.Color(255, 102, 102));
        luckyDog.setFont(new java.awt.Font("微软雅黑", 0, 60)); // NOI18N
        luckyDog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luckyDog.setText("START!!");
        luckyDog.setFocusCycleRoot(true);

        clearBut.setText("清除所有");
        clearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButActionPerformed(evt);
            }
        });

        number.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        number.setText("№");

        useFile.setSelected(true);
        useFile.setText("使用引入文件");
        useFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(luckyDog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pick)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxPeop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBut))
                    .addComponent(absPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(absent)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(warn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(absenter))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(useFile)))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(absListSco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pick)
                            .addComponent(jLabel2)
                            .addComponent(maxPeop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearBut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(absent)
                                .addComponent(jLabel3)
                                .addComponent(absenter)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(useFile))
                        .addGap(2, 2, 2)
                        .addComponent(luckyDog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(absPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listScroll)
                    .addComponent(absListSco))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void pickActionPerformed(java.awt.event.ActionEvent evt) {                                     
        warn.setText(" ");
        int lastRan;
        if(useFile.isSelected()&&randomListmod.size()>0){
            lastRan = data.getByV_K(randomListmod.lastElement().toString(), "id").getOrder();
        }
        else if(randomListmod.getSize()<=0){
            lastRan = -1;
        }
        else{
            lastRan = Integer.parseInt(randomListmod.lastElement().toString());
        }
        //System.out.print(lastRan+"\t");
        
        if(useFile.isSelected()){

            try{
                data = new Data("Students.txt","\t");
            }
            catch (FileNotFoundException ex) {
                System.err.println("NO Students.txt");

                try{
                    data = new Data("Student.txt","\t");
                }
                catch (FileNotFoundException ex2){
                    System.err.println("NO Student.txt");

                    try{
                        data = new Data("Student.txt","\t");
                    }
                    catch(FileNotFoundException ex3){
                        System.err.println("NO students.txt");

                        try{
                            data = new Data("student.txt","\t");
                        }
                        catch(FileNotFoundException ex4){
                            System.err.println("NO student.txt");
                            System.err.println("NOSUCHFILE");
                            warning(true);
                            return;
                        } catch (Exception ex1) {
                            System.err.println(ex1);
                        }
                    } catch (Exception ex1) {
                        System.err.println(ex1);
                    }
                } catch (Exception ex1) {
                    System.err.println(ex1);
                }
            } catch (Exception ex) {
                System.err.println(ex);
            }
            
            int randNum;
            
            
            /*int[] abs=new int[absListmod.getSize()];
            for(int i =0;i<absListmod.getSize();i++){
                    abs[i]=Integer.parseInt(absListmod.getElementAt(i).toString());
            }*/
            
            whi:
            do{
                randNum = (int)(Math.random()*data.mapSize());
                //System.out.print(randNum+"\t");
                if(lastRan==randNum){
                    //System.out.print("poi\t");
                    continue;
                }
                if(sbabs.isSelected()){
                    Object abs[] = absListmod.toArray();
                    for(Object i:abs){
                        if(Integer.parseInt(data.getRecord(randNum).getValue("id"))==Integer.parseInt(i.toString())){
                            continue whi;
                        }
                    }
                }
                break;
            }
            while(true);
            
            if(data.getRecord(randNum).getOrder()==-1||data.getRecord(randNum).getValue("id").equals("NO DATA")){
                warning(false);
                return;
            }
            
            String name = data.getRecord(randNum).getValue("name");
            if("NO DATA".equals(name)){
                warning(false);
                return;
            }
            
            randomListmod.addElement(data.getRecord(randNum).getValue("id"));
            listScroll.getViewport().doLayout(); 
            JScrollBar ranListVer ;
            ranListVer = listScroll.getVerticalScrollBar();
            ranListVer.setValue(ranListVer.getMaximum());
            luckyDog.setText(name);
            number.setText("№."+ (Integer.parseInt(data.getRecord(randNum).getValue("id"))<10?
                    "0"+data.getRecord(randNum).getValue("id")
                   :data.getRecord(randNum).getValue("id")));   
        }
        else{
            if(!maxPeop.getText().matches("^[0-9]*$")||"".equals(maxPeop.getText())){
                if("lgz".equals(maxPeop.getText().toLowerCase())||"xsf".equals(maxPeop.getText().toLowerCase())){
                    warn.setText("oh!");
                    colorfulEgg ce = new colorfulEgg();
                    ce.setLocationRelativeTo(this);
                    ce.setVisible(true);
                }            
                else{
                    warn.setText("请输入数字");
                }
                maxPeop.setText("");
            }
            else{
                //boolean judge2 = true;
                String str1 = maxPeop.getText();
                int randNum;
                int length =absListmod.getSize();
                int abs[] = new int[length];
                int max;
                try{
                    max = Integer.parseInt(str1);
                }
                catch(NumberFormatException err){
                    warn.setText("超过上限！");
                    return;
                }
                if(length>=max){
                    warn.setText("全员缺席_(:3」ㄥ)_");
                }
                else{
                    for(int i =0;i<absListmod.getSize();i++){
                        abs[i]=Integer.parseInt(absListmod.getElementAt(i).toString());
                    }
                    //absListmod.getClass().getField("delegate");
                    whi:
                    do{
                        randNum = (int)(Math.random()*max+1);
                        //System.out.print(randNum);
                        if(randNum ==lastRan){
                            //System.out.print("poi");
                            continue;
                        }
                        if(sbabs.isSelected()){
                            for(int i:abs){
                                if(randNum==i){
                                    continue whi;
                                }
                            }
                        }
                        break;
                    }
                    while(true);
                    
                    //if(judge2){
                    randomListmod.addElement(randNum);
                    listScroll.getViewport().doLayout();
                    listScroll.getVerticalScrollBar().setValue(listScroll.getVerticalScrollBar().getMaximum());
                    luckyDog.setText("№."+(randNum<10?"0"+randNum:randNum));
                    number.setText("№."+(randNum<10?"0"+randNum:randNum));
                    //}
                }
            }
        }
        //System.out.println();
    }                                    

    private void absentActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int temp;
        warn.setText(" ");

        if(randomListmod.getSize()!=0){
            temp =Integer.parseInt(randomListmod.lastElement().toString());
            int length = absListmod.getSize();
            for(int i =0;i<length;i++){
                if(temp==Integer.parseInt(absListmod.getElementAt(i).toString())){
                    warn.setText("已存在");
                    return;
                }
            }
            
            //System.out.println(Integer.parseInt(maxPeop.getText())+"\t"+randNum);
            absListmod.addElement(temp);
            absListSco.getViewport().doLayout();
            absListSco.getVerticalScrollBar().setValue(absListSco.getVerticalScrollBar().getMaximum());
            //System.out.println(Integer.parseInt(maxPeop.getText())+"\t"+randNum);
        }
        else {
            warn.setText("尚未有人被抽取");
        }
    }                                      

    private void addabsActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int temp;
        warn.setText("");
        String str1=absinput.getText();
        
        if(!str1.matches("^[0-9]*$")||"".equals(str1)){
            absinput.setText("");
            warn.setText("请输入数字");
        }
        else{
            boolean judge = true;
            try{
                temp = Integer.parseInt(absinput.getText());
            }
            catch(NumberFormatException err){
                judge=false;
                temp=-1;
            }
            int length =absListmod.getSize();
            for(int i =0;i<length;i++){
                if(temp==Integer.parseInt(absListmod.getElementAt(i).toString())){
                    warn.setText("已存在");
                    judge=false;
                }
            }
            
            if(!maxPeop.getText().matches("^[0-9]*$")||"".equals(maxPeop.getText())){
                warn.setText("请输入数字");
                maxPeop.setText("");
                judge =false;
            }
            else {
                int temp2;
                try{
                    temp2 =Integer.parseInt(maxPeop.getText());
                }
                catch(NumberFormatException err){
                    warn.setText("大于上限！");
                    temp2=-1;
                    judge=false;
                }
                if(temp2<temp){
                    warn.setText("大于上限！");
                    absinput.setText("");
                    judge=false;
                }
            }
            
            
            if(judge){
                absListmod.addElement(temp);
                
            }
        }
        
    }                                      

    private void sbabsActionPerformed(java.awt.event.ActionEvent evt) {                                      
        boolean state=sbabs.isSelected();
        absPan.setEnabled(state);
        absinput.setEnabled(state);
        addabs.setEnabled(state);
        absList.setEnabled(state);
        absent.setEnabled(state);
        absenter.setEnabled(state);
    }                                     

    private void clearButActionPerformed(java.awt.event.ActionEvent evt) {                                         
        randomListmod.clear();
        absListmod.clear();
    }                                        

    private void pickKeyPressed(java.awt.event.KeyEvent evt) {                                
        long now = new Calendar.Builder().build().getTime().getTime();
        if(evt.getKeyChar()==KeyEvent.VK_ENTER&&now-last>=0.1){
            pickActionPerformed(null);
            last = now;
        }
    }                               

    private void maxPeopKeyPressed(java.awt.event.KeyEvent evt) {                                   
        long now = new Calendar.Builder().build().getTime().getTime();
        if(evt.getKeyChar()==KeyEvent.VK_ENTER&&now-last>=0.1){
            pickActionPerformed(null);
            last = now;
        }
    }                                  

    private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
        long now = new Calendar.Builder().build().getTime().getTime();
        if(evt.getKeyChar()==KeyEvent.VK_ENTER&&now-last>=0.1){
            pickActionPerformed(null);
            last = now;
        }
    }                               

    private void absentKeyPressed(java.awt.event.KeyEvent evt) {                                  
        long now = new Calendar.Builder().build().getTime().getTime();
        if(evt.getKeyChar()==KeyEvent.VK_ENTER&&now-last>=0.1){
            absentActionPerformed(null);
            last = now;
        }
    }                                 

    private void useFileActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jLabel2.setEnabled(!useFile.isSelected());
        maxPeop.setEnabled(!useFile.isSelected());
        randomListmod.clear();
        absListmod.clear();
    }                                       
    
    private void warning(boolean isNofile){
        if(isNofile){
            NoFileWarning warning = new NoFileWarning(this,true);
            warning.setLocationRelativeTo(this);
            warning.setVisible(true);
            useFile.setSelected(false);
            pickActionPerformed(null);
        }
        else{
            NoNameWarning warning = new NoNameWarning(this,true);
            warning.setLocationRelativeTo(this);
            warning.setVisible(true);
            useFile.setSelected(false);
            pickActionPerformed(null);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JList absList;
    private javax.swing.JScrollPane absListSco;
    private javax.swing.JPanel absPan;
    private javax.swing.JButton absent;
    private javax.swing.JLabel absenter;
    private javax.swing.JTextField absinput;
    private javax.swing.JButton addabs;
    private javax.swing.JButton clearBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane listScroll;
    public javax.swing.JLabel luckyDog;
    private javax.swing.JTextField maxPeop;
    public javax.swing.JLabel number;
    private javax.swing.JButton pick;
    private javax.swing.JList randomList;
    private javax.swing.JRadioButton sbabs;
    private javax.swing.JRadioButton useFile;
    private javax.swing.JLabel warn;
    // End of variables declaration                   
    private final DefaultListModel randomListmod = new DefaultListModel();
    private final DefaultListModel absListmod = new DefaultListModel();
    private Data data;
}
