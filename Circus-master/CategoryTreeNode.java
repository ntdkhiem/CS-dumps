class CategoryTreeNode {
    private CategoryTreeNode left, right;
    private String title;
    // private Emplo/yee data;
    private EmployeeTree employees;

    public CategoryTreeNode(String t) {
        left = null;
        right = null;
        employees = new EmployeeTree();
        title = t;
    }

    public CategoryTreeNode getLeft() {
        return left;
    }

    public void setLeft(CategoryTreeNode l) {
        left = l;
    }

    public CategoryTreeNode getRight() {
        return right;
    }

    public void setRight(CategoryTreeNode r) {
        right = r;
    }

    public EmployeeTree getEmployees() {
        return employees;
    }

    public void setData(CategoryTreeNode node) {
        this.title = node.getTitle();
        this.employees = node.getEmployees();
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Title: " + title;
    }
}