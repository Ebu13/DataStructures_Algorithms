import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        EditorPage frm = new EditorPage();
        frm.show();
        Stack test = new Stack();

        test.push(" test ");
        test.push(5);
        test.push(8);
        test.push(9);
        test.push(2);
        test.push(3);
        test.push(1);

        System.out.println(test);




        try
        {
            int sayi2 = (char)test.peek();
        }
        catch(Exception ex)
        {

            System.out.println(ex);
        }

    }
}