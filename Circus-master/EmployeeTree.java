public class EmployeeTree {
    // private IdComparator IdCP;
    private NameComparator NameCP;
    private EmployeeTreeNode root;

    public EmployeeTree() {
        // this(new NameComparator(), new IdComparator());
        this(new NameComparator());
    }

    // public EmployeeTree(NameComparator cp1, IdComparator cp2) {
    // root = null;
    // NameCP = cp1;
    // IdCP = cp2;
    // }
    public EmployeeTree(NameComparator cp1) {
        root = null;
        NameCP = cp1;
    }

    public void add(Employee empl) {
        EmployeeTreeNode node = new EmployeeTreeNode(empl);
        root = add(root, node);
    }

    // add Employee to its final location based on name
    public EmployeeTreeNode add(EmployeeTreeNode localRoot, EmployeeTreeNode node) {
        if (localRoot == null) {
            return node;
        }
        // Add to the left: root is greater than current node
        if (NameCP.compare(localRoot.getEmployee(), node.getEmployee()) > 0) {
            localRoot.setLeft(add(localRoot.getLeft(), node));
            return localRoot;
        }
        // add to the right: root is less than current node
        if (NameCP.compare(localRoot.getEmployee(), node.getEmployee()) < 0) {
            localRoot.setRight(add(localRoot.getRight(), node));
            return localRoot;
        } else {
            return localRoot;
        }
    }

    public void deleteEmployee(String ss) {
        root = deleteEmployee(root, ss);
    }

    public EmployeeTreeNode deleteEmployee(EmployeeTreeNode localRoot, String ss) {
        if (localRoot == null) {
            return null;
        }
        if (ss.compareTo(localRoot.getEmployee().ss) < 0) {
            localRoot.setLeft(deleteEmployee(localRoot.getLeft(), ss));
        } else if (ss.compareTo(localRoot.getEmployee().ss) > 0) {
            localRoot.setRight(deleteEmployee(localRoot.getRight(), ss));
        }
        // Found the employee
        else {
            System.out.println("Deleting: " + localRoot.getEmployee().firstName);
            // node with only one child or no child

            if (localRoot.getLeft() == null)
                return localRoot.getRight();
            else if (localRoot.getRight() == null)
                return localRoot.getLeft();

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            localRoot.setEmployee(findSmallestSS(localRoot.getRight()));

            // Delete the inorder successor
            localRoot.setRight(deleteEmployee(localRoot.getRight(), localRoot.getEmployee().ss));
        }
        return localRoot;
    }

    public Employee findSmallestSS(EmployeeTreeNode root) {
        Employee e = root.getEmployee();
        while (root.getLeft() != null) {
            e = root.getLeft().getEmployee();
            root = root.getLeft();
        }
        return e;
    }

    public EmployeeTreeNode getRoot() {
        return root;
    }
}