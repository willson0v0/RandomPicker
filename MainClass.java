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

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * @author Willson
 */
public class MainClass {
    static int count=0;
    RandomPicker gui;
    Timer timer = new Timer(50,new ActionListener(){
        int color[][]={
                {118,75,75}
                ,{160,75,75}
                ,{160,118,75}
                ,{160,160,75}
                ,{160,160,118}
                ,{118,160,160}
                ,{75,160,160}
                ,{75,118,160}
                ,{102,204,255}
                ,{75,118,118}
                ,{75,160,75}
                ,{75,160,118}
                ,{75,160,160}
                ,{97,118,118}
        };
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                gui.luckyDog.setForeground(new Color(color[count][0]
                        ,color[count][1]
                        ,color[count][2]));
                
                gui.number.setForeground(new Color(color[count][0]
                        ,color[count][1]
                        ,color[count][2]));
                
                count+=1;
                if(count>=13){
                    count=0;
                }
            }
            catch(java.lang.IllegalArgumentException err){
                System.err.println("red:"+color[count][0]+"\tgreen:"+color[count][1]+"\tblue:"+color[count][2]+"\t");
            }
        }
    });
    
    public MainClass()
    {
        gui = new RandomPicker();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                //System.out.println(info.getName());
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainClass r = new MainClass();
                r.timer.setInitialDelay(0);
                r.timer.start();
                r.gui.setLocationRelativeTo(null);
                r.gui.setIconImage(Toolkit.getDefaultToolkit().createImage("xsf.png"));
                r.gui.setVisible(true);
            }           
        });
    }
    
    
}
