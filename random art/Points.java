import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Points extends JFrame{
    
    Surface art;
    ActionListener eventClick;
    
    JPanel panelArt;
    
    public Points() {

        initUI();
    }

    public void initUI() {
        setTitle("dadsf");
        
        setSize(500, 400);
        Container content = getContentPane();
        content.setBackground(Color.white);
        content.setLayout(new FlowLayout());
        panelArt = new JPanel();
        content.add(panelArt);
        
        art = new Surface();
        art.setPreferredSize(new Dimension(getWidth(),getHeight()-100));
        panelArt.add(art);
        JButton repaintB = new JButton("Random Picture");
        eventClick = new ActionListener() {
 
            public void actionPerformed(ActionEvent event) {

                art.reMakeExpr();

                repaint();
                
            }
 
            
        };
        
        repaintB.addActionListener(eventClick);
        add(repaintB);
    
        setLocation(0,0);
        setVisible(true);
        
        
        
    }

    public static void main(String[] args) {

     
      

                Points ps = new Points();
                ps.setVisible(true);
                
    
      
    }
    
    
      
        
        
}