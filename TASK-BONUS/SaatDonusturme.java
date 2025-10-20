public class SaatDonusturme{

    public static void main(String[] args) {
      int saniye = 1452123 ;
      int saat_kismi = saniye / 60 / 60;
      int dakika_kismi = (saniye - saat_kismi * 60 * 60) / 60;
      int saniye_kismi = (saniye - saat_kismi*60*60 - dakika_kismi * 60);
      
      System.out.println(saniye+ " Saniye = " + saat_kismi + ":"+dakika_kismi+":0"+saniye_kismi);

    }
}
