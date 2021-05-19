public class Node {
    private int data;
    private Node next;
    
    public Node() 
    {
        this(0);
    }
    
    public Node(int data) 
    {
        this.data = data;
        next = null;
    }
    
    /*public Node(int data, Node n) {
        this.data = data;
        this.next = n;
    }*/
    
    public int getData() 
    {
        return this.data;
    }
    
    public void setData (int d) {
        this.data = d;
        this.next = null;
    }
    
    public Node getNext() 
    {
        return this.next;
    }
    
    public void setNext (Node n)
    {
        this.next = n;
    }
}















