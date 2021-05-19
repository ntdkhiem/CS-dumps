class EmployeeTreeNode {
    private EmployeeTreeNode left, right;
    private Employee data;

    public EmployeeTreeNode(Employee d) {
        left = right = null;
        data = d;
    }

    public EmployeeTreeNode getLeft() {
        return left;
    }

    public void setLeft(EmployeeTreeNode l) {
        left = l;
    }

    public EmployeeTreeNode getRight() {
        return right;
    }

    public void setRight(EmployeeTreeNode r) {
        right = r;
    }

    public Employee getEmployee() {
        return data;
    }

    public void setEmployee(Employee d) {
        data = d;
    }

}