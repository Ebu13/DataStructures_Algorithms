class ExpressionTreeNode {
    char value;
    ExpressionTreeNode left, right;

    public ExpressionTreeNode(char item) {
        value = item;
        left = right = null;
    }
}