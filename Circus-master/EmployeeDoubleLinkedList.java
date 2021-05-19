// Pointers only
public class EmployeeDoubleLinkedList {
    private EmployeeDoubleLinkedListNode head, tail;

    public EmployeeDoubleLinkedList() {
        head = tail = null;
    }

    public void addBy(String cmd, EmployeeTreeNode node) {
        if (node != null) {
            // inOrder traversal: left, self, right
            addBy(cmd, node.getLeft());
            // System.out.println("Adding (" + node.getEmployee().lastName + ") to double
            // linked list");
            if (cmd.equals("name")) {
                addByName(new EmployeeDoubleLinkedListNode(node), new NameComparator()); // TODO: very bad: spawn
                                                                                         // multiple comparator
            } else if (cmd.equals("id")) {
                addById(new EmployeeDoubleLinkedListNode(node), new IdComparator()); // TODO: very bad: spawn
                                                                                     // multiple comparator
            } else if (cmd.equals("category")) {
                // Normal add
                addByCategory(new EmployeeDoubleLinkedListNode(node));
            }
            // System.out.println(toString());
            addBy(cmd, node.getRight());
        }
    }

    // TODO: Optimize this method with addById since its duplicate
    public void addByName(EmployeeDoubleLinkedListNode localNode, NameComparator cp) {
        if (head == null) {
            head = tail = localNode;
            return;
        }

        // System.out.println("head: " +
        // head.getEmployeeTreeNode().getEmployee().lastName + " tail: "
        // + tail.getEmployeeTreeNode().getEmployee().lastName);

        // Check if localNode is greater than tail then add last
        if (cp.compare(localNode.getEmployeeTreeNode().getEmployee(), tail.getEmployeeTreeNode().getEmployee()) > 0) {
            // System.out.println("Current node is greater than tail");
            localNode.setPrevious(tail);
            // if head is same as tail then also connect head to localNode
            if (cp.compare(tail.getEmployeeTreeNode().getEmployee(), head.getEmployeeTreeNode().getEmployee()) == 0) {
                head.setNext(localNode);
            }
            tail.setNext(localNode);
            tail = localNode;
            return;
        }

        // System.out.println("Current node is not greater than tail");
        // if localNode is less than localHead then
        if (cp.compare(localNode.getEmployeeTreeNode().getEmployee(), head.getEmployeeTreeNode().getEmployee()) < 0) {
            // System.out.println("current nod is less than head");
            localNode.setNext(head);
            head.setPrevious(localNode);
            head = localNode;
            return;
        } else {
            // System.out.println("Current node is not less than head");
        }

        // Perform normal Double LinkedList search
        // System.out.println("Perform normal doubly linked list search");
        EmployeeDoubleLinkedListNode current = head;
        // System.out.println(current.getEmployeeTreeNode().getEmployee().lastName);
        while (current != null) {
            // if next node is greater than localNode then add localNode behind that node.
            if (cp.compare(localNode.getEmployeeTreeNode().getEmployee(),
                    current.getNext().getEmployeeTreeNode().getEmployee()) < 0) {
                localNode.setNext(current.getNext());
                localNode.setPrevious(current);
                current.getNext().setPrevious(localNode);
                current.setNext(localNode);
                return;
            }
            current = current.getNext();
        }
    }

    // TODO: Optimize this method with addById since its duplicate
    public void addById(EmployeeDoubleLinkedListNode localNode, IdComparator cp) {
        if (head == null) {
            head = tail = localNode;
            return;
        }

        // System.out.println("head: " +
        // head.getEmployeeTreeNode().getEmployee().lastName + " tail: "
        // + tail.getEmployeeTreeNode().getEmployee().lastName);

        // Check if localNode is greater than tail then add last
        if (cp.compare(localNode.getEmployeeTreeNode().getEmployee(), tail.getEmployeeTreeNode().getEmployee()) > 0) {
            // System.out.println("Current node is greater than tail");
            localNode.setPrevious(tail);
            // if head is same as tail then also connect head to localNode
            if (cp.compare(tail.getEmployeeTreeNode().getEmployee(), head.getEmployeeTreeNode().getEmployee()) == 0) {
                head.setNext(localNode);
            }
            tail.setNext(localNode);
            tail = localNode;
            return;
        }

        // System.out.println("Current node is not greater than tail");
        // if localNode is less than localHead then
        if (cp.compare(localNode.getEmployeeTreeNode().getEmployee(), head.getEmployeeTreeNode().getEmployee()) < 0) {
            // System.out.println("current nod is less than head");
            localNode.setNext(head);
            head.setPrevious(localNode);
            head = localNode;
            return;
        } else {
            // System.out.println("Current node is not less than head");
        }

        // Perform normal Double LinkedList search
        // System.out.println("Perform normal doubly linked list search");
        EmployeeDoubleLinkedListNode current = head;
        // System.out.println(current.getEmployeeTreeNode().getEmployee().lastName);
        while (current != null) {
            // if next node is greater than localNode then add localNode behind that node.
            if (cp.compare(localNode.getEmployeeTreeNode().getEmployee(),
                    current.getNext().getEmployeeTreeNode().getEmployee()) < 0) {
                localNode.setNext(current.getNext());
                localNode.setPrevious(current);
                current.getNext().setPrevious(localNode);
                current.setNext(localNode);
                return;
            }
            current = current.getNext();
        }
    }

    public void addByCategory(EmployeeDoubleLinkedListNode localNode) {
        if (head == null) {
            head = tail = localNode;
            return;
        }
        localNode.setPrevious(tail);
        tail.setNext(localNode);

        if (head.getEmployeeTreeNode().getEmployee().ss.equals(tail.getEmployeeTreeNode().getEmployee().ss)) {
            head.setNext(localNode);
            localNode.setPrevious(head);
        }

        tail = localNode;
    }

    public String toString() {
        EmployeeDoubleLinkedListNode current = head;
        String r = "";
        while (current != null) {
            r += "(" + current.getEmployeeTreeNode().getEmployee().lastName + "), ";
            current = current.getNext();
        }
        return r;
    }
}