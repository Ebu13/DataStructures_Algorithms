import java.util.Stack;

public class Main {
    static ExpressionTreeNode constructExpressionTree(char[] postfix) {
        Stack<ExpressionTreeNode> stack = new Stack<>();

        for (char c : postfix) {
            if (isOperand(c)) {
                stack.push(new ExpressionTreeNode(c));
            } else if (isOperator(c)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Geçersiz postfix ifade");
                }

                ExpressionTreeNode right = stack.pop();
                ExpressionTreeNode left = stack.pop();
                ExpressionTreeNode operatorNode = new ExpressionTreeNode(c);
                operatorNode.left = left;
                operatorNode.right = right;
                stack.push(operatorNode);
            } else {
                throw new IllegalArgumentException("Geçersiz karakter: " + c);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Geçersiz postfix ifade");
        }

        return stack.pop();
    }

    static boolean isOperand(char c) {
        return (c >= '0' && c <= '9');
    }

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static void inorderTraversal(ExpressionTreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        char[] postfixExpression = "75+42-*".toCharArray();

        try {
            ExpressionTreeNode root = constructExpressionTree(postfixExpression);
            System.out.println("Inorder Traversal of Expression Tree:");
            inorderTraversal(root);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}