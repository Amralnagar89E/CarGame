/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author amral
 */
public class Display {
    
    private JFrame frame;
    private Canvas canvas;
    private String title;
    
    public static JTextField  score;
    private int width,height;
    
   public Display(String title,int width,int height)
    {
        this.title=title;
        this.width=width;
        this.height=height;
        creatDisplay();
    }
   
   private void creatDisplay(){
       frame  = new JFrame(title);
       frame.setSize(width, height);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       
       canvas =new Canvas();
       canvas.setPreferredSize(new Dimension(width,height));
       canvas.setMaximumSize(new Dimension(width,height));
       canvas.setMinimumSize(new Dimension(width,height));
       canvas.setFocusable(false);
        
       
       
        score = new JTextField("CarGame");
        score.setBounds(850, 20, 200, 50);
        score.setFont(new Font("Arial", 1, 40));
        getFrame().add(score);
       
        frame.add(getCanvas());
        frame.pack();
      
   }
   public Canvas getCanvas(){
		return canvas;
	}
   

   public JFrame getFrame()
   {
       return frame;
   }
}
