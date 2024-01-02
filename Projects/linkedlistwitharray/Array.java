public class Array {
    Integer[] dizi;

    public Array(int size){
        this.dizi = new Integer[size];
    }
    public Integer[] getArray(){
        return dizi;
    }
    public void sonaekle(int ekleneceksayi) {
        boolean bosYerVar = false;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == null) {
                dizi[i] = ekleneceksayi;
                bosYerVar = true;
                break;
            }
        }

        if (!bosYerVar) {
            Integer[] temp=dizi;
            dizi = new Integer[temp.length+1];
            for (int j=0;j<temp.length;j++){
                dizi[j]=temp[j];
            }
            dizi[temp.length]=ekleneceksayi;
        }
    }


    public void sil(int silineceksayi){
        boolean silindimi = false;
        try{
            for (int i=(dizi.length-1);i>=0;i--){
                if (dizi[i] == silineceksayi){
                    dizi[i]=null;
                    silindimi=true;
                    break;
                }
            }
        }catch (NullPointerException exception){
            if (dizi[0]==null){
                System.out.println("Dizi zaten boş");
            }else {
                if (dizi[0]==silineceksayi){
                    dizi[0]=null;
                    silindimi=true;
                }
            }
        }

        if (!silindimi){
            System.out.println("Bulunamadı.");
        }
        for (int j=0;j<dizi.length;j++){
            if (dizi[j]==null && (j!=(dizi.length-1))){
                dizi[j]=dizi[j+1];
                dizi[j+1]=null;
            }
        }
        for (int w=0;w<dizi.length;w++){
            if (dizi[w]==null){
                Integer[] temp= new Integer[w];
                for (int u=0;u<temp.length;u++){
                    temp[u]=dizi[u];
                }
                dizi=temp;
            }
        }
    }

    public boolean dizideara(int aranacaksayi) {
        for (int i=0;i<dizi.length;i++){
            if (dizi[i]==(aranacaksayi)){
                return true;
            }
        }
        return false;
    }

    public void yazdir(){
        if (dizi.length==0 || (dizi.length==1 && dizi[0]==null)){
            System.out.println("Dizi boş");
        }else {
            for (int i=0;i<dizi.length;i++){
                if (dizi[i] == null){
                    System.out.print(" Boş ");
                }else {
                    System.out.print(" "+dizi[i]+" ");
                }
            }
        }
    }
}
