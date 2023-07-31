public class Player {
    public String AdSoyad;
    public int puan;

    public Player(String ad, int p){
        AdSoyad = ad;
        puan = p;
    }

    public String ToString(){
        return AdSoyad + " - " + puan;
    }
}
