package Shop;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
  Color first,second;
  
   public MyPanel(){
        setOpaque(false);
        //setBackground(new Color(0,0,0,0));
    }
      private String color1="#000000";
    public String getColor1(){
        return color1;
    }
    public void setColor1(String color1){
        this.color1=color1;
    }
    private String color2="#ffffff";
    public String getColor2(){
        return color2;
    }
    public void setColor2(String color2){
        this.color2=color2;
    }
     private int radius=30;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    @Override
   protected void paintComponent(Graphics g){
      first = Color.decode(color1);
        second = Color.decode(color2);
       Graphics2D g2=(Graphics2D) g;
       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//       g2.setColor(Color.red);
//       g2.drawLine(10, 10, 100, 10);
//       g2.fillRoundRect(0, 0, width, height, width, width); 
         GradientPaint gp=new GradientPaint(0,0,first,getWidth(),getWidth(),second);
         g2.setPaint(gp);
         g2.fillRoundRect(0, 0, getWidth(),getHeight() ,radius, radius);         
        super.paintComponent(g);
   }

//    void setSide(int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
                                                                                                                            