public class SplayTrees {
    Node root;

    private Node rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        return y;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        return y;
    }

    private Node splay(Node root, int val) {
        if (root == null || root.value == val) {
            return root;
        }
        if (root.value > val) {
            if (root.left == null) {
                return root;
            }

            if (root.left.value > val) {
                root.left.left = splay(root.left.left, val);
                root = rightRotate(root);
            } else if (root.left.value < val) {
                root.left.right = splay(root.left.right, val);

                if (root.left.right != null) {
                    root.left = leftRotate(root.left);
                }
            }

            return (root.left == null)
                    ? root : rightRotate(root);
        } else {
            if (root.right == null) {
                return root;
            }

            if (root.right.value > val) {
                root.right.left = splay(root.right.left, val);

                if (root.right.left != null) {
                    root.right = rightRotate(root.right);
                }
            } else if (root.right.value < val) {
                root.right.right = splay(root.right.right, val);
                root = leftRotate(root);
            }

            return (root.right == null)
                    ? root : leftRotate(root);
        }
    }

    public Node search(int val)
    {
        return search(root, val);
    }
    private Node search(Node root, int val) {
        return splay(root, val);
    }

    public void preOrder()
    {
        preOrder(root);
    }
    private void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
