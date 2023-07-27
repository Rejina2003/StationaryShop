package Shop;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MyBtn extends JButton {
    Color first,second;
  
    public MyBtn(){
        setContentAreaFilled(false);
        //this.setBorder(new Border(border.BevelBorder));
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
}
