import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class Surface extends JPanel {
    
    public static final double pi = Math.PI;
    randomExpr redExp = new randomExpr();
    randomExpr blueExp = new randomExpr();
    randomExpr greenExp = new randomExpr();
    
    
    randomColor redExp1 = new randomColor();
    randomColor blueExp2 = new randomColor();
    randomColor greenExp3 = new randomColor();
    
    
    public Surface(){
        
    }
 
    
    public void reMakeExpr(){
          redExp = new randomExpr();
          blueExp = new randomExpr();
          greenExp = new randomExpr();
    
    }
   
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

       

     

 
     

        for (int i = 0; i < getWidth(); i++) {
            for(int j =0;j< getHeight();j++){
                
                double x = ((((double) i) / getWidth()) * 2.0) - 1.0;
                double y = ((((double) j) / getHeight()) * 2.0) - 1.0;
                
                //System.out.println(x+"xy"+y);
                
                
                
                //ranExpr
                
                //System.out.println("oat");
                int a = rgb(redExp.ranTree(x,y));
                int b = rgb(blueExp.ranTree(x,y));
                int c = rgb(greenExp.ranTree(x,y));
                //System.out.println(a+" "+b+" "+c);
                
               
                
                //int red = rgb(sin(pi *sin(sin(pi *sin(pi*cos(cos(pi *cos(pi *cos(pi *y * x)))))))));
                //int red2 = rgb(sin(pi*cos(sin(x*y)*pi)));
                //int green = rgb(sin(pi *sin(cos(pi *sin(pi*cos(cos(pi *cos(pi *sin(pi *y * x)))))))));
                //int green2 = rgb(cos(pi*sin(pi*cos(x*y))));
                //int blue = rgb( sin(cos(pi *sin(pi *cos(avg(y * x ,x,y))))));
                //int blue2 = rgb(cos(pi*sin(cos(cos(pi*cos(x*y))))));
                Color color = new Color(a,b,c);
                g2d.setColor(color);
                g2d.fillRect(i, j, 1, 1);
               
               //System.out.println(a+" "+b+" "+c);
                
            }
           
            
        }
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        paint(g);
    }
    public double sin(double value){
    return Math.sin(value);
    }
    
    public double cos(double value){
    return Math.cos(value);
    }
    
    public int rgb(double value){
        
        
        //System.out.println("value = "+value);
        
    return (int)((value+1)*(255/2));
    }
    
    public double avg(double... num) {
    double sum = 0;
    for(int i=0 ; i<num.length ; i++) {
      sum = sum + num[i];
    }
    return sum / num.length;
  }
}