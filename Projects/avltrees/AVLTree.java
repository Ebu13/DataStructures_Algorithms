
public class AVLTree {
    private Node root;

    public AVLTree() {
        this.root = null;
    }

    private int getNodeHeight(Node node) {
        return (node == null) ? -1 : node.level;
    }

    public void insert(int value) {
        root = insertNode(value, root);
    }

    private Node insertNode(int value, Node node) {
        if (node == null) {
            node = new Node(value);
        } else if (value < node.value) {
            node.left = insertNode(value, node.left);
            if (getNodeHeight(node.left) - getNodeHeight(node.right) == 2) {
                if (value < node.left.value) {
                    node = rotateLeftLeft(node);
                } else {
                    node = rotateLeftRight(node);
                }
            }
        } else if (value > node.value) {
            node.right = insertNode(value, node.right);
            if (getNodeHeight(node.right) - getNodeHeight(node.left) == 2) {
                if (value > node.right.value) {
                    node = rotateRightRight(node);
                } else {
                    node = rotateRightLeft(node);
                }
            }
        }

        node.level = getMaxHeight(getNodeHeight(node.left), getNodeHeight(node.right)) + 1;

        return node;
    }

    private Node rotateLeftLeft(Node node) {
        Node left = node.left;
        node.left = left.right;
        left.right = node;
        node.level = getMaxHeight(getNodeHeight(node.left), getNodeHeight(node.right)) + 1;
        left.level = getMaxHeight(getNodeHeight(left.left), node.level) + 1;
        return left;
    }

    private Node rotateRightRight(Node node) {
        Node right = node.right;
        node.right = right.left;
        right.left = node;
        node.level = getMaxHeight(getNodeHeight(node.left), getNodeHeight(node.right)) + 1;
        right.level = getMaxHeight(getNodeHeight(right.right), node.level) + 1;
        return right;
    }

    private int getMaxHeight(int leftHeight, int rightHeight) {
        return Math.max(leftHeight, rightHeight);
    }

    private Node rotateLeftRight(Node node) {
        node.left = rotateRightRight(node.left);
        return rotateLeftLeft(node);
    }

    private Node rotateRightLeft(Node node) {
        node.right = rotateLeftLeft(node.right);
        return rotateRightRight(node);
    }

    public void inorder() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(Node parent) {
        if (parent != null) {
            inorderTraversal(parent.left);
            System.out.print(parent.value + " ");
            inorderTraversal(parent.right);
        }
    }

// Add other traversal methods (preorder, postorder) following a similar pattern.

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if ((root.left == null) || (root.right == null)) {
                Node temp = (root.left == null) ? root.right : root.left;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                Node temp = minValueNode(root.right);
                root.value = temp.value;
                root.right = deleteNode(root.right, temp.value);
            }
        }
        if (root == null) {
            return root;
        }
        root.level = getMaxHeight(getNodeHeight(root.left), getNodeHeight(root.right)) + 1;

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0) {
            return rotateLeftLeft(root);
        }

        if (balance > 1 && getBalance(root.left) < 0) {
            return rotateLeftRight(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0) {
            return rotateRightRight(root);
        }

        if (balance < -1 && getBalance(root.right) > 0) {
            return rotateRightLeft(root);
        }

        return root;
    }

    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getNodeHeight(node.left) - getNodeHeight(node.right);
    }
}
