class Node {

    int[] key;
    

    Node leftChild;
    Node rightChild;

    Node(int[] key) {

        this.key = key;
       

    }
    
    public void setValue(int[] value){
        this.key = value;
    }
    public void setLeft(Node node){
        this.leftChild = node;
    }
    
    public void setRight(Node node){
        this.rightChild = node;
    }
    
    public Node getLeft(){return leftChild;}
    public Node getRight(){return rightChild;}
    public int[] getValue(){return key;}
    
    

    
    

}