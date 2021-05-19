public class ListNode {
    public int data;
    public ListNode next;
    
    public ListNode() 
    {
        this(0, null);
    }
    
    public ListNode(int data) 
    {
        this.data = data;
        next = null;
    }
    
    public ListNode(int data, ListNode n) {
        this.data = data;
        this.next = n;
    }
    
    
}















