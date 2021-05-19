public class EmployeeDoubleLinkedListNode {
    private EmployeeDoubleLinkedListNode next, previous;
    private EmployeeTreeNode data;

    public EmployeeDoubleLinkedListNode(EmployeeTreeNode d) {
        next = previous = null;
        data = d;
    }

    public EmployeeDoubleLinkedListNode getNext() {
        return next;
    }

    public void setNext(EmployeeDoubleLinkedListNode l) {
        next = l;
    }

    public EmployeeDoubleLinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDoubleLinkedListNode r) {
        previous = r;
    }

    public EmployeeTreeNode getEmployeeTreeNode() {
        return data;
    }
}