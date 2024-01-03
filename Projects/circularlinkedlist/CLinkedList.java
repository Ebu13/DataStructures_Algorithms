public class CLinkedList {
    private Node bas;

    public Node getBas() {
        return bas;
    }
    public void Ekle(int deger) {
        Node yeniDugum = new Node(deger);

        if (bas == null) {
            bas = yeniDugum;
            bas.onceki = bas;
            bas.sonraki = bas;
        } else {
            yeniDugum.sonraki = bas;
            yeniDugum.onceki = bas.onceki;
            bas.onceki.sonraki = yeniDugum;
            bas.onceki = yeniDugum;
            bas = yeniDugum;
        }
    }

    public void yazdir() {
        if (bas == null) {
            System.out.println("Liste boş.");
            return;
        }

        Node current = bas;
        do {
            System.out.println(current.deger);
            current = current.sonraki;
        } while (current != bas);
    }

    public Node ara(int hedef) {
        if (bas == null) {
            System.out.println("Liste boş.");
            return null;
        }

        Node current = bas;
        do {
            if (current.deger == hedef)
                return current;

            current = current.sonraki;
        } while (current != bas);

        System.out.println("Düğüm bulunamadı.");
        return null;
    }

    public void Sil(int silinecekDeger) {

    }
}
