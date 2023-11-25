// CLinkedList.java
public class CLinkedList {
    public Node ilk = null;
    public Node son = null;

    public void Ekle(int deger) {
        Node yeniDugum = new Node(deger);

        if (ilk == null) {
            ilk = yeniDugum;
            son = yeniDugum;
        } else {
            son.sonraki = yeniDugum;
            son = yeniDugum;
        }

        yeniDugum.sonraki = ilk;
    }

    public boolean DugumBul(int arananDeger) {
        Node mevcutDugum = ilk;

        while (mevcutDugum != null) {
            if (mevcutDugum.deger == arananDeger)
                return true;

            if (mevcutDugum == son)
                break;

            mevcutDugum = mevcutDugum.sonraki;
        }

        return false;
    }

    public void Sil(int silinecekDeger) {
        Node mevcutDugum = ilk;

        if (ilk == null)
            return;
        else {
            do {
                Node sonrakiDugum = mevcutDugum.sonraki;
                if (sonrakiDugum.deger == silinecekDeger) {
                    if (ilk == sonrakiDugum) {
                        ilk = ilk.sonraki;
                    }

                    mevcutDugum.sonraki = sonrakiDugum.sonraki;

                    if (son == sonrakiDugum) {
                        son = mevcutDugum;
                    }
                }

                mevcutDugum = sonrakiDugum;
            } while (mevcutDugum != ilk);
        }
    }
}