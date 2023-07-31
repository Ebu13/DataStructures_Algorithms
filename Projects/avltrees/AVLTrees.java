public class AVLTrees {
    Node root;

    public AVLTrees() {
        root = null;
    }

    private int getHeight(Node node) {
        return node == null ? -1 : node.level;
    }

    public void Insert(int val) {
        root = insert(val, root);
    }

    private Node insert(int val, Node node) {

        if (node == null) {
            node = new Node(val);
        } else if (val < node.value) {
            node.left = insert(val, node.left);
            if (getHeight(node.left) - getHeight(node.right) == 2) {
                if (val < node.left.value) {
                    node = rotateLeftLeft(node);
                } else {
                    node = rotateLeftRight(node);
                }
            }
        } else if (val > node.value) {
            node.right = insert(val, node.right);
            if (getHeight(node.right) - getHeight(node.left) == 2) {
                if (val > node.right.value) {
                    node = rotateRightRight(node);
                } else {
                    node = rotateRightLeft(node);
                }
            }
        }

        node.level = getMaxHeight(getHeight(node.left), getHeight(node.right)) + 1;

        return node;

    }

    private Node rotateLeftLeft(Node node) {
        Node left = node.left;
        node.left = left.left;
        left.right = node;
        node.level = getMaxHeight(getHeight(node.left), getHeight(node.right)) + 1;
        left.level = getMaxHeight(getHeight(left.left), node.level) + 1;
        return left;
    }

    private Node rotateRightRight(Node node) {
        Node right = node.right;
        node.right = right.left;
        right.left = node;
        node.level = getMaxHeight(getHeight(node.left), getHeight(node.right)) + 1;
        right.level = getMaxHeight(getHeight(right.right), node.level) + 1;
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
        System.out.print("\n");
    }

    private void inorderTraversal(Node parent) {
        if (parent != null) {
            inorderTraversal(parent.left);
            System.out.print(parent.value + " ");
            inorderTraversal(parent.right);
        }
    }

    public void preorder() {
        preorderTraversal(root);
    }

    private void preorderTraversal(Node parent) {
        if (parent != null) {
            System.out.print(parent.value + " ");
            preorderTraversal(parent.left);
            preorderTraversal(parent.right);
        }
    }

    public void postorder() {
        postorderTraversal(root);
    }

    private void postorderTraversal(Node parent) {
        if (parent != null) {
            postorderTraversal(parent.left);
            postorderTraversal(parent.right);
            System.out.print(parent.value + " ");
        }
    }

    public void Delete (int val)
    {
        delete(root, val);
    }

    private Node delete(Node root, int val) {
        if (root == null) {
            return root;
        }
        if (val < root.value) {
            root.left = delete(root.left, val);
        } else if (val > root.value) {
            root.right = delete(root.right, val);
        } else {
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }
                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                Node temp = minValueNode(root.right);
                root.value = temp.value;
                root.right = delete(root.right, temp.value);
            }
        }
        if (root == null) {
            return root;
        }
        root.level = biggerValue(getHeight(root.left), getHeight(root.right)) + 1;

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
        Node dugum = node;
        while (dugum.left != null) {
            dugum = dugum.left;
        }
        return dugum;
    }

    private int biggerValue(int a, int b) {
        return Math.max(a, b);
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }
}
