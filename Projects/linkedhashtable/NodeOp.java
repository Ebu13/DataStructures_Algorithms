public class NodeOp {
    Node[] nodes = new Node[8];

    public void ekle(int sayi) {
        int index = sayi % 8;
        Node newNode = new Node(sayi);

        if (nodes[index] == null) {
            nodes[index] = newNode;
        } else {
            Node temp = nodes[index];
            while (temp.sonraki != null) {
                temp = temp.sonraki;
            }
            temp.sonraki = newNode;
        }
    }

    public void yazdir() {
        for (Node n : nodes) {
            System.out.println("");
            while (n != null) {
                System.out.print(n.sayi + " ");
                n = n.sonraki;
            }
        }
    }
}
