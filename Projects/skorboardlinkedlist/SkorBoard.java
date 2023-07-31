public class SkorBoard {
    public Player[] oyuncular;
    public int oyuncusayisi = 0;

    public SkorBoard(int kapasite){
        oyuncular = new Player[kapasite];
    }

    public void ekle(Player o)
    {
        oyuncular[oyuncusayisi] = o;
        oyuncusayisi++;

        for (int i = oyuncusayisi-1; i > 0; i--) {
            if(oyuncular[i].puan < oyuncular[i-1].puan)
            {
                Player temp = oyuncular[i];
                oyuncular[i] = oyuncular[i-1];
                oyuncular[i-1]= temp;
            }

        }
    }

    public void PrintToConsole()
    {
        for (int i = oyuncusayisi-1; i >=0 ; i--) {
            System.out.println(oyuncular[i].AdSoyad + " - " + oyuncular[i].puan);
        }
    }
}
