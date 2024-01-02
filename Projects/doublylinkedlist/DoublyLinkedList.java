public class DoublyLinkedList {
    public Node ilk;


    public void OneEkle(int deger)
    {
        if (ilk!=null){
            Node yeniDugum = new Node(deger);
            yeniDugum.sonraki = ilk;
            ilk.onceki=yeniDugum;
        }else {
            Node yeniDugum= new Node(deger);
            ilk=yeniDugum;
        }
    }

    public void SonaEkle(int deger)
    {
        Node yeniDugum = new Node(deger);

        if(ilk == null)
        {
            ilk = yeniDugum;
            return;
        }else{
            Node temp=ilk;
            while(temp.sonraki!= null)
            {
                temp = temp.sonraki;
            }
            yeniDugum.onceki = temp;
            temp.sonraki = yeniDugum;
        }

    }

    public void Yazdir()
    {
        Node temp = ilk;

        try{
            while(temp.sonraki != null)
            {
                System.out.println(temp.deger);
                temp = temp.sonraki;
            }

            System.out.println(temp.deger);
        }catch (NullPointerException exception){
            System.out.println("\n"+exception.getMessage()+"\nListe boş..");
        }
    }

    public Node Bul(int arananDeger)
    {
        Node temp = ilk;
        try {
            while(temp.sonraki != null)
            {
                if(temp.deger == arananDeger)
                    return temp;

                temp = temp.sonraki;
            }

            if(temp.deger == arananDeger)
                return temp;

            return null;
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage()+"\nListe Boş");
            return null;
        }

    }

    public void OnceEkle(Node sonrakiDugum, int deger)
    {
        if(sonrakiDugum == null)
        {
            System.out.println("Sonraki Düğüm null olamaz");
            return;
        }

        Node yeniDugum = new Node(deger);
        Node oncekiDugum;
        if (sonrakiDugum.onceki!=null){
            oncekiDugum=sonrakiDugum.onceki;
            yeniDugum.onceki=oncekiDugum;
            yeniDugum.sonraki=sonrakiDugum;
            sonrakiDugum.onceki=yeniDugum;
            oncekiDugum.sonraki=yeniDugum;
        }else{
            this.OneEkle(deger);
        }
    }

    public void SonraEkle(Node oncekiDugum, int deger)
    {
        if(oncekiDugum == null)
        {
            System.out.print("Önceki düğüm null olamaz");
            return;
        }
        Node sonrakiDugum=null;
        Node yeniDugum=new Node(deger);
        if (oncekiDugum.sonraki!=null){
            sonrakiDugum=oncekiDugum.sonraki;
        }

        if (sonrakiDugum!=null){
            yeniDugum.onceki=oncekiDugum;
            yeniDugum.sonraki=sonrakiDugum;
            sonrakiDugum.onceki=yeniDugum;
            oncekiDugum.sonraki=sonrakiDugum;
        }else{
            oncekiDugum.sonraki=yeniDugum;
            yeniDugum.onceki=oncekiDugum;
        }
    }
}
