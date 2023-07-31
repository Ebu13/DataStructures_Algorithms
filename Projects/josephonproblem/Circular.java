public class Circular {
    public Node ilk;
    public Node son;



    public void Insert(int deger)
    {
        Node yeniDugum = new Node(deger);

        if(ilk == null)
        {
            ilk = yeniDugum;
            son = yeniDugum;
            ilk.next = son;
            son.next = ilk;
        }
        else
        {
            son.next = yeniDugum;
            son = yeniDugum;
            son.next = ilk;
        }
    }

    public void Sil(Node dugum)
    {

        if(dugum.next == ilk)
        {
            ilk = dugum.next.next;

        }
        dugum.next =  dugum.next.next;
    }

    public int Adet()
    {
        int sayi = 0;
        Node mevcut = ilk;
        if(ilk == null)
            return 0;

        do {
            sayi++;
            mevcut = mevcut.next;
        } while (mevcut != ilk);
        return sayi;
    }

    public void Yazdir()
    {
        if(ilk == null)
            System.out.println("Listede öğe yok");
        else
        {
            System.out.println("Kalan Sayılar");
            Node mevcut = ilk;

            do {
                System.out.println(mevcut.value);
                mevcut = mevcut.next;

            } while (mevcut != ilk);
        }
    }
}
