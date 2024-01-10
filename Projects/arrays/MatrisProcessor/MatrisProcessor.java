public class MatrisProcessor {
    public Integer[][] getCarpim(Integer[][] matris1, Integer[][] matris2) {
        // Matrislerin boyutlarını kontrol et
        if (matris1[0].length != matris2.length) {
            // Boyutlar uyumsuz ise null döndür
            return null;
        }
        // Sonuç matrisinin boyutlarını belirle
        int m = matris1.length; // Satır sayısı
        int n = matris2[0].length; // Sütun sayısı
        int p = matris1[0].length; // Ortak boyut
        // Sonuç matrisini oluştur
        Integer[][] sonuc = new Integer[m][n];
        // Matris çarpımı yap
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Sonuç matrisinin i. satır, j. sütun elemanını hesapla
                sonuc[i][j] = 0;
                for (int k = 0; k < p; k++) {
                    // Nokta çarpımı yap
                    sonuc[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }
        // Sonuç matrisini döndür
        return sonuc;
    }

}
