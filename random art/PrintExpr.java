
/**
 * Write a description of class PrintExpr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintExpr
{
    // instance variables - replace the example below with your own
   Node root;

    /**
     * Constructor for objects of class PrintExpr
     */
    public String ExprToString(Node tree)
    {
        
       if(tree!=null){
            int value1 = (int)tree.getValue()[0];
            int value2 = (int)tree.getValue()[1];
            if(value1==0) return "sin("+ExprToString(LeftOrRight(value2,tree))+")";
            else if(value1==1) return "cos("+ExprToString(LeftOrRight(value2,tree))+")";
            //else if(value1==2)return avg(LeftOrRight(value2,x,y,tree),LeftOrRight(value2,x,y,tree),x,y);
            else if(value1==3)return "sin(abs("+ExprToString(LeftOrRight(value2,tree))+"))";
            else return "sin("+ExprToString(LeftOrRight(value2,tree))+")"+"*cos("+ExprToString(LeftOrRight(value1*value2,tree))+")";
        }
        return "x*y*PI";
    }
    
   public Node LeftOrRight(int num,Node tree){
        if(num == 0){
        return tree.getLeft();
        }
    return tree.getRight();
    }
    
    

}
