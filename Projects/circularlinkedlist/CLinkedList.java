public class CLinkedList {
    public Node ilk = null;
    public Node son = null;

    public void Ekle(int deger)
    {
        Node yeniDugum = new Node(deger);

        if(ilk == null)
        {
            ilk = yeniDugum;
        }
        else
        {
            son.sonraki = yeniDugum;
        }

        yeniDugum.sonraki = ilk;
        son = yeniDugum;

    }

    public boolean DugumBul(int arananDeger)
    {
        Node mevcutDugum = ilk;

        if(ilk == null)
            return false;
        else
        {
            do{

                if(mevcutDugum.deger == arananDeger)
                    return true;

                mevcutDugum = mevcutDugum.sonraki;
            }while(mevcutDugum != ilk);

            return false;
        }
    }

    public void Sil(int silinecekDeger)
    {
        Node mevcutDugum = ilk;

        if(ilk == null)
            return;
        else
        {
            do{
                Node sonrakiDugum = mevcutDugum.sonraki;
                if(sonrakiDugum.deger == silinecekDeger)
                {
                    if(ilk == son)
                    {
                        ilk = null;
                        son = null;
                    }
                    else
                    {
                        mevcutDugum.sonraki = sonrakiDugum.sonraki;

                        if(ilk == sonrakiDugum)
                        {
                            ilk = ilk.sonraki;
                        }
                        if(son == sonrakiDugum)
                        {
                            son = mevcutDugum;
                        }
                    }
                }

                mevcutDugum = sonrakiDugum;
            }
            while(mevcutDugum != ilk);


        }
    }
}
