// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        SkorBoard s = new SkorBoard(10);
        Player o = new Player("Fatih Okumuş", 100);

        s.ekle(o);


        Player o2 = new Player("Fatih Okumuş2", 50);
        s.ekle(o2);

        Player o3 = new Player("Fatih Okumuş3", 80);
        s.ekle(o3);


        //s.PrintToConsole();

        BLPageUI frm = new BLPageUI();
        frm.show();


    }
}