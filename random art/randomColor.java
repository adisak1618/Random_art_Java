import java.util.LinkedList;
/**
 * Write a description of class randomColor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class randomColor
{
    // instance variables - replace the example below with your own

     private int max = 20;
    private int[] exprData = new int[max];
    private int[] exprOperand = new int[max];
     LinkedList expr1 = new LinkedList();
     LinkedList expr2 = new LinkedList();

    /**
     * Constructor for objects of class randomColor
     */
    public randomColor()
    {
        // initialise instance variables
        makeExpr();
    }
    
    private void makeExpr(){
        for(int i =0;i<max;i++){
            expr1.add((int)(Math.random()*5));
            expr2.add((int)(Math.random()*6));
        }
    }
    
    
    public void printData(){
        for(int i = 0;i<expr1.size();i++){
            System.out.println(expr1.get(i)+" "+expr2.get(i));
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
    public int ranExpr(double x,double y){
          int data = rgb(sin(ranExpr(x,y,0)));
          if(data >=255){
            return 0;
            }
    return data;
    }
    
    public double ranExpr(double x,double y,int num){
        //System.out.println(num);
        if(num<expr1.size()){
            if((int)(expr1.get(num))==0)return randPI((int)(expr2.get(num)))*sin(ranExpr(x,y,num+1));
            else if((int)(expr1.get(num))==1)return randPI((int)(expr2.get(num)))*cos(ranExpr(x,y,num+1));
            else return randPI((int)(expr2.get(num)))*avg(ranExpr(x,y,num+1));
        }
        return x*y*Math.PI;
    }
    
    
    public double randPI(int num){
        if(num == 0){
            return Math.PI;
        }
        return 1;
    }
    
    
    /*
     public double ranExpr(double x,double y){
    return ranExpr(x,y,0);
    }
  
    
     public double ranExpr(double x,double y,int num){
         double data = 255;
         
       //System.out.println(x+"xy"+y);
       //System.out.println(Math.PI*x*y);
        if(num<max){
            if(exprOperand[num] == 0){
                 data = sin(Math.PI*ranExpr(x,y,num+1));
                 //System.out.print("sin");
            }else if(exprOperand[num] == 1){
                 data = cos(Math.PI*ranExpr(x,y,num+1));
                 //System.out.print("cos");
            }else{
                data = avg(Math.PI*ranExpr(x,y,num+1));
                //System.out.print("avg");
            }
           
        }else{return x*y;}
         return data;
    }
    */
    
     public double sin(double value){
    return Math.sin(value);
    }
    
    
    public double cos(double value){
    return Math.cos(value);
    }
    
    public int rgb(double value){
    return (int)((value+1)*255/2);
    }
    
    public double avg(double... num) {
    double sum = 0;
    for(int i=0 ; i<num.length ; i++) {
      sum = sum + num[i];
    }
    return sum / num.length;
  }
    
}
