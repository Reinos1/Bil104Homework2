public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci(null, null, 1973, 0.0, "104001");
        Ogrenci ogrenci2 = new Ogrenci("Gökhan", "Bilgisayar Müh", 1985, 0.0, "104001");
        Ogrenci ogrenci3 = new Ogrenci("Ayşe", "Makine Müh", 1985, 0.0, "104001");
        Ogrenci ogrenci4 = new Ogrenci("Elif", "Elektrik-Elektronik Müh", 2020, 1.98, "104001");

        System.out.println("Öğrencilerin Bilgileri");
        System.out.println("OGR-1" + " " + ogrenci1.getAd() + " " + ogrenci1.getBolum() + " " + ogrenci1.getGirisYili() + ogrenci1.getBolumKodu() + " " + ogrenci1.getGano());
        System.out.println("OGR-2" + " " + ogrenci2.getAd() + " " + ogrenci2.getBolum() + " " + ogrenci2.getGirisYili() + ogrenci2.getBolumKodu() + " " + ogrenci2.getGano());
        System.out.println("OGR-3" + " " + ogrenci3.getAd() + " " + ogrenci3.getBolum() + " " + ogrenci3.getGirisYili() + ogrenci3.getBolumKodu() + " " + ogrenci3.getGano());
        System.out.println("OGR-4" + " " + ogrenci4.getAd() + " " + ogrenci4.getBolum() + " " + ogrenci4.getGirisYili() + ogrenci4.getBolumKodu() + " " + ogrenci4.getGano());

        double harc1 = ogrenci3.HarcHesapla(3);
        double harc2 = ogrenci4.HarcHesapla(2, 1);

        System.out.println("3. öğrencinin ödeyeceği harç: " + harc1);
        System.out.println("4. öğrencinin ödeyeceği harç: " + harc2);
    }
}