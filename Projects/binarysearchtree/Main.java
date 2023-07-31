// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = null;
        tree.Insert(tree.root, 56);
        tree.Insert(tree.root, 23);
        tree.Insert(tree.root, 28);
        tree.Insert(tree.root, 92);
        tree.Insert(tree.root, 90);
        tree.Insert(tree.root, 100);
        tree.Insert(tree.root, 190);

        System.out.println("\n InOrder:\n" );
        tree.inord(tree.root);

        System.out.println("\n Post order:\n" );
        tree.PostOrder(tree.root);

        System.out.println("\n Pre order:\n" );
        tree.PreOrder(tree.root);

        tree.delete(tree.root, 92 );
        System.out.println("\n InOrder:\n" );
        tree.inord(tree.root);

        System.out.println("\n Post order:\n" );
        tree.PostOrder(tree.root);

        System.out.println("\n Pre order:\n" );
        tree.PreOrder(tree.root);
    }
}