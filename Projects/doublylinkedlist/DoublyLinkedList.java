public class DoublyLinkedList {
    public Node ilk;


    public void OneEkle(int deger)
    {
        Node yeniDugum = new Node(deger);
        yeniDugum.onceki = null;
        yeniDugum.sonraki = ilk;

        if(ilk!= null)
        {
            ilk.onceki = yeniDugum;
        }

        ilk = yeniDugum;
    }

    public void SonraEkle(Node oncekiDugum, int deger)
    {
        if(oncekiDugum == null)
        {
            System.out.print("Önceki düğüm null olamaz");
            return;
        }

        Node yeniDugum = new Node(deger);
        yeniDugum.sonraki = oncekiDugum.sonraki;
        oncekiDugum.sonraki = yeniDugum;
        yeniDugum.onceki = oncekiDugum;

        if(yeniDugum.sonraki != null)
            yeniDugum.sonraki.onceki = yeniDugum;
    }

    public void SonaEkle(int deger)
    {
        Node yeniDugum = new Node(deger);

        yeniDugum.sonraki = null;

        Node son = ilk;

        if(ilk == null)
        {
            yeniDugum.onceki = null;
            ilk = yeniDugum;
            return;
        }

        while(son.sonraki!= null)
        {
            son = son.sonraki;
        }

        son.sonraki = yeniDugum;
        yeniDugum.onceki = son;

    }

    public void OnceEkle(Node sonrakiDugum, int deger)
    {
        if(sonrakiDugum == null)
        {
            System.out.println("Sonraki Düğüm null olamaz");
        }

        Node yeniDugum = new Node(deger);

        yeniDugum.onceki = sonrakiDugum.onceki;
        sonrakiDugum.onceki = yeniDugum;
        yeniDugum.sonraki = sonrakiDugum;
        if(yeniDugum.onceki != null)
            yeniDugum.onceki.sonraki = yeniDugum;
        else
            ilk = yeniDugum;

    }

    public void Gezinme()
    {
        Node son = ilk;

        while(son.sonraki != null)
        {
            System.out.println(son.deger);
            son = son.sonraki;
        }

        System.out.println(son.deger);
    }

    public Node Bul(int arananDeger)
    {
        Node son = ilk;

        while(son.sonraki != null)
        {
            if(son.deger == arananDeger)
                return son;

            son = son.sonraki;
        }

        if(son.deger == arananDeger)
            return son;

        return null;
    }
}
