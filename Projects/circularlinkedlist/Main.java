// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        CLinkedList daireselBagli = new CLinkedList();

        daireselBagli.Ekle(10);
        daireselBagli.Ekle(5);
        daireselBagli.Ekle(8);
        daireselBagli.Ekle(7);

        daireselBagli.Sil(7);
        System.out.print(daireselBagli.DugumBul(5));
        System.out.print(daireselBagli.DugumBul(7));
    }
}