// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SplayTrees st = new SplayTrees();
        st.root = new Node(300);
        st.root.left = new Node(55);
        st.root.right = new Node(550);
        st.root.left.left = new Node(48);
        st.root.left.left.left = new Node(22);
        st.root.left.left.left.left = new Node(15);
        st.root.right.left = new Node(500);


        st.root = st.search(550);
        System.out.println("550 için arama:");
        st.preOrder();
        st.root = st.search(15);
        System.out.println("\n15 için arama:");
        st.preOrder();
        st.root = st.search(500);
        System.out.println("\n500 için arama:");
        st.preOrder();

    }
}