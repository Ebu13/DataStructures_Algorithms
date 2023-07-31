import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.OneEkle(5);
        list.OneEkle(6);
        list.OneEkle(10);
        list.OneEkle(8);
        list.OneEkle(12);


        list.SonaEkle(20);

        list.SonaEkle(44);

        list.SonaEkle(55);

        Node arananDugum = list.Bul(5);

        list.SonraEkle(arananDugum, 100);
        list.OnceEkle(arananDugum, 86);

        list.Gezinme();

        Scanner sc = new Scanner(System.in);

        System.out.println("Adınızı Girin:");

        String ad = sc.nextLine();

        System.out.println("Soyadınızı Girin:");

        String soyad = sc.nextLine();

    }
}