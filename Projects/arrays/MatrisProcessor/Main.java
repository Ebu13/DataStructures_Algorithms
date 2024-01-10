

public class Main {
    public static void main(String[] args) {
        MatrisProcessor matrisProcessor=new MatrisProcessor();
        Integer[][] matris1= {{3,2,5},{9,8,5},{16,14,1}};
        Integer[][] matris2= {{4,8,7},{3,6,4},{1,4,1}};
        System.out.println("Matris Carpim sonuc: ");
        Integer[][] sonuc=matrisProcessor.getCarpim(matris1,matris2);
        for (Integer[] integers : sonuc) {
            System.out.println("");
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
        }
    }
}
