public class DynamicArraysOperation {
    private DynamicArray dizi;

    public DynamicArraysOperation(){
        Integer[] array= new Integer[0];
        this.dizi=new DynamicArray(array);
    }
    public void elemanekle(int sayi){
        Integer[] temp=new Integer[dizi.getDizi().length+1];
        for (int i =0;i<dizi.getDizi().length;i++){
            temp[i]=dizi.getDizi()[i];
        }
        temp[temp.length-1]=sayi;
        dizi.setDizi(temp);
    }
    public void elemansil(){
        if (dizi.getDizi().length!=0){
            Integer[] temp=new Integer[dizi.getDizi().length-1];
            for (int i =0;i<temp.length;i++){
                temp[i]=dizi.getDizi()[i];
            }
            dizi.setDizi(temp);
        }else {
            System.out.println("Dizi boş");
        }
    }
    public Integer[] getDizi(){
        return dizi.getDizi();
    }
    public void yazdir(){
        System.out.println("\n");
        for (int y=0;y<dizi.getDizi().length;y++){
            System.out.print(dizi.getDizi()[y]+" ");
        }
    }
}
