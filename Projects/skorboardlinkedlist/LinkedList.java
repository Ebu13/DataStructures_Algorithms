public class LinkedList {
    public Node ilk;
    public Node son;
    public int size;

    public void OneEkle(Node a)
    {
        if(size == 0)
        {
            ilk = a;
            son = a;
        }
        else
        {
            a.sonraki = ilk;
            ilk = a;
        }
        size++;
    }
    public void ArkayaEkle(Node a)
    {
        if(size == 0)
        {
            ilk = a;
            son = a;
        }
        else
        {
            a.sonraki = null;
            son.sonraki = a;
        }
        size++;
    }
}
