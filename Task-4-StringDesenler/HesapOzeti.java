public class HesapOzeti{

    public static void main(String[] args) {

        String[] urunler = { "Elma", "Süt", "Ekmek" };
        int[] miktarlar = { 3, 1, 2 };
        double[] fiyatlar = { 14.99, 21.50, 7.00 };

        double toplamTutar = 0.0;
        double satirToplam1, satirToplam2, satirToplam3;

        System.out.println("--- Alışveriş Hesap Özeti ---");
        System.out.printf("%-15s %8s %10s %12s\n", "Ürün Adı", "Miktar", "Birim Fiyat", "Toplam Fiyat");
        System.out.println("-----------------------------------------------------");

        satirToplam1 = miktarlar[0] * fiyatlar[0];
        toplamTutar += satirToplam1; 
        System.out.printf("%-15s %8d %10.2f TL %11.2f TL\n", 
                          urunler[0], 
                          miktarlar[0], 
                          fiyatlar[0], 
                          satirToplam1);

        satirToplam2 = miktarlar[1] * fiyatlar[1];
        toplamTutar += satirToplam2; 
        System.out.printf("%-15s %8d %10.2f TL %11.2f TL\n", 
                          urunler[1], 
                          miktarlar[1], 
                          fiyatlar[1], 
                          satirToplam2);

        satirToplam3 = miktarlar[2] * fiyatlar[2];
        toplamTutar += satirToplam3; 
        System.out.printf("%-15s %8d %10.2f TL %11.2f TL\n", 
                          urunler[2], 
                          miktarlar[2], 
                          fiyatlar[2], 
                          satirToplam3);

        System.out.println("-----------------------------------------------------");
        System.out.printf("%35s %11.2f TL\n", "TOPLAM TUTAR:", toplamTutar);
    }
}
