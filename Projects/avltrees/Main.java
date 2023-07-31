// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        AVLTrees tree = new AVLTrees();
        tree.Insert(5);
        tree.Insert(10);
        tree.Insert(15);
        tree.Insert(11);
        tree.Insert(6);
        tree.Insert(4);
        tree.Insert(3);

        tree.inorder();
        tree.Delete(15);
        tree.inorder();

    }
}