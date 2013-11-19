
/**
 * Write a description of class randomExpr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class randomExpr
{
    // instance variables - replace the example below with your own
   // private int count = 0;
    private int max = (int)(Math.random()*3)+3;
    private int[] exprData = new int[max];
    private int[] exprOperand = new int[max];
    
    
    
    public Node root=new Node(new int[]{(int)(Math.random()*5),(int)(Math.random()*2)});
    public String text = new PrintExpr().ExprToString(this.root);
    /**
     * Constructor for objects of class randomExpr
     */
    public randomExpr()
    {
        // initialise instance variables
       makeExpr();
       insert(this.root,0);
       System.out.println(text);
     
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public void makeExpr(){
        for(int i = 0;i<exprData.length;i++){
           exprData[i] = (int)(Math.random()*2);
            //System.out.println("exprData"+exprData[i]);
        }
         for(int i = 0;i<exprOperand.length;i++){
           exprOperand[i] = (int)(Math.random()*3);
           //System.out.println("operand"+exprOperand[i]);
        }
    }

    private void insert(Node nodeIn,int count){
        
        
                nodeIn.setRight(new Node(new int[]{(int)(Math.random()*5),(int)(Math.random()*2)}));
                nodeIn.setLeft(new Node(new int[]{(int)(Math.random()*5),(int)(Math.random()*2)}));
                //nodeIn.setLeftChild(new BinaryTree(new int[]{(int)(Math.random()*2),(int)(Math.random()*2)}));
                //nodeIn.setRightChild(new BinaryTree(new int[]{(int)(Math.random()*2),(int)(Math.random()*2)}));
                if(count < max){
                    
                insert(nodeIn.getLeft(),count+1);
                insert(nodeIn.getRight(),count+1);
                
                }
        
    
       
    }
    public double ranTree(double x,double y){
    return ranTree(x,y,this.root);
    }
    public double ranTree(double x,double y,Node tree){
        
        if(tree!=null){
            int value1 = (int)tree.getValue()[0];
            int value2 = (int)tree.getValue()[1];
            if(value1==0) return sin(randPI(value1*value2)*y*LeftOrRight(value2,x,y,tree));
            else if(value1==1) return cos(randPI(value1*value2)*x*Math.PI* LeftOrRight(value1,x,y,tree));
            //else if(value1==2)return avg(LeftOrRight(value2,x,y,tree),LeftOrRight(value2,x,y,tree),x,y);
            else if(value1==3)return sin(abs(LeftOrRight(value1,x,y,tree)*LeftOrRight(value2,x,y,tree)));
            else return sin(LeftOrRight(value2,x,y,tree))*cos(LeftOrRight(value1*value2,x,y,tree));
        }
        return x*y*Math.PI;
    }
    
    
    public double LeftOrRight(int num,double x,double y,Node tree){
        if(num == 0){
        return ranTree(x,y,tree.getLeft());
        }
    return ranTree(x,y,tree.getRight());
    }
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
    
    public double ranExpr(Node parentNode,int x,int y){
    if(parentNode != null){
        if(((int[])parentNode.getValue())[0] == 0){
        double value =  sin(5);
        }
    }
    return 0.3;
    }
    
    public double randPI(int num){
    if(num == 0){
        return Math.PI;
    }
    return Math.PI;
    }
    


   public Node getValue(){return this.root;}
   // int getCount(){return count;}
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
  
  public double  abs(double value){
    return Math.abs(value);
  }
  
  /*
  public String printExpr(Node tree){
        if(tree!=null){
            if((int)(tree.getValue()[0])==0) return "sin("+printExpr();
            else if((int)(tree.getValue()[0])==1) System.out.println();
            else if((int)(tree.getValue()[0])==2) System.out.println();
            else  System.out.println();//sin(LeftOrRight(tree.getValue()[1],x,y,tree))*cos(LeftOrRight(tree.getValue()[1],x,y,tree));
        }
       
    }
    */
  
}
