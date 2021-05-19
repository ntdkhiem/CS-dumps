import java.util.HashSet;
import java.util.ArrayList;

public class CategoryTree {
    private HashSet<String> idSet;
    public ArrayList<String> categoryList;
    private CategoryTreeNode root;

    public CategoryTree() {
        idSet = new HashSet<String>();
        categoryList = new ArrayList<String>();
        root = null;
    }

    public void add(Employee person) {
        root = add(root, person);
        idSet.add(person.ss);
        if (!categoryList.contains(person.category)) {
            categoryList.add(person.category);
        }
    }

    public void addCategory(String category) {
        root = addCategory(root, category);
        categoryList.add(category);
    }

    // TODO: Finish this
    public CategoryTreeNode addCategory(CategoryTreeNode localRoot, String category) {
        if (localRoot == null) {
            return new CategoryTreeNode(category);
        }

        if (localRoot.getTitle().compareTo(category) > 0) {
            localRoot.setLeft(addCategory(localRoot.getLeft(), category));
        } else if (localRoot.getTitle().compareTo(category) < 0) {
            localRoot.setRight(addCategory(localRoot.getRight(), category));
        }
        return localRoot;
    }

    // add treenode (by compare it's title) to its final location
    public CategoryTreeNode add(CategoryTreeNode localRoot, Employee person) {
        // create new EmployeeTree if not exist
        if (localRoot == null) {
            CategoryTreeNode node = new CategoryTreeNode(person.category);
            // add current employee as root
            node.getEmployees().add(person);
            return node;
        }

        // add to the left
        if (localRoot.getTitle().compareTo(person.category) > 0) {
            localRoot.setLeft(add(localRoot.getLeft(), person));
            return localRoot;
        }
        // add to the right
        if (localRoot.getTitle().compareTo(person.category) < 0) {
            localRoot.setRight(add(localRoot.getRight(), person));
            return localRoot;
        } else {
            // Add employee to EmployeeTree if node already existed
            localRoot.getEmployees().add(person);
            return localRoot;
        }
    }

    public void deleteCategory(String category) {
        root = deleteCategory(root, category);
        categoryList.remove(category);
    }

    public CategoryTreeNode deleteCategory(CategoryTreeNode localRoot, String category) {
        if (localRoot == null) {
            return null;
        }
        if (category.compareTo(localRoot.getTitle()) < 0) {
            localRoot.setLeft(deleteCategory(localRoot.getLeft(), category));
        } else if (category.compareTo(localRoot.getTitle()) > 0) {
            localRoot.setRight(deleteCategory(localRoot.getRight(), category));
        }
        // Found the employee
        else {
            System.out.println("Deleting: " + localRoot.getTitle());
            // node with only one child or no child

            if (localRoot.getLeft() == null)
                return localRoot.getRight();
            else if (localRoot.getRight() == null)
                return localRoot.getLeft();

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            localRoot.setData(findSmallestCategory(localRoot.getRight()));

            // Delete the inorder successor
            localRoot.setRight(deleteCategory(localRoot.getRight(), localRoot.getTitle()));
        }
        return localRoot;
    }

    public CategoryTreeNode findSmallestCategory(CategoryTreeNode root) {
        while (root.getLeft() != null) {
            root = root.getLeft();
        }
        return root;
    }

    public EmployeeDoubleLinkedList sortByName() {
        return sortBy("name", root, new EmployeeDoubleLinkedList());
    }

    public EmployeeDoubleLinkedList sortById() {
        return sortBy("id", root, new EmployeeDoubleLinkedList());
    }

    public EmployeeDoubleLinkedList sortByCategory() {
        return sortBy("category", root, new EmployeeDoubleLinkedList());
    }

    public EmployeeDoubleLinkedList sortBy(String cmd, CategoryTreeNode localRoot, EmployeeDoubleLinkedList list) {
        // Loop through category
        if (localRoot == null) {
            return list;
        }
        if (!cmd.equals("category")) {

            // other cases: Preorder Traversal
            // Add employees from current category to list
            list.addBy(cmd, localRoot.getEmployees().getRoot());

            return sortBy(cmd, localRoot.getRight(), sortBy(cmd, localRoot.getLeft(), list));
        } else {
            // category case: Inorder Traversal
            list = sortBy(cmd, localRoot.getLeft(), list);
            // System.out.println("current category: " + localRoot.getTitle());
            // add employees from current category to list
            list.addBy("category", localRoot.getEmployees().getRoot());
            // System.out.println(list.toString());
            return sortBy(cmd, localRoot.getRight(), list);
        }
    }

    public EmployeeDoubleLinkedList getEmployeesByCategory(String category) {
        return getEmployeesByCategory(category, root, new EmployeeDoubleLinkedList());
    }

    public EmployeeDoubleLinkedList getEmployeesByCategory(String category, CategoryTreeNode localRoot,
            EmployeeDoubleLinkedList list) {
        if (localRoot != null) {
            if (localRoot.getTitle().equals(category)) {
                list.addBy("name", localRoot.getEmployees().getRoot());
                return list;
            }
            return getEmployeesByCategory(category, localRoot.getRight(),
                    getEmployeesByCategory(category, localRoot.getLeft(), list));
        }
        return list;
    }

    // delete an employee given social security number
    public void deleteEmployee(String ss) {
        deleteEmployee(root, ss);
    }

    // TODO: Optimize this code to stop running after delete the employee
    public void deleteEmployee(CategoryTreeNode localRoot, String ss) {
        if (localRoot != null) {
            localRoot.getEmployees().deleteEmployee(ss);
            deleteEmployee(localRoot.getLeft(), ss);
            deleteEmployee(localRoot.getRight(), ss);
        }
    }

    // Check for existence id
    public boolean idIsExist(String id) {
        return idSet.contains(id);
    }

    public void printSideways() {
        printSideways(root, 0);
    }

    public void printSideways(CategoryTreeNode root, int level) {
        if (root != null) {
            printSideways(root.getRight(), level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("            ");
            }
            System.out.println(root.getTitle());
            printSideways(root.getLeft(), level + 1);
        }
    }
}