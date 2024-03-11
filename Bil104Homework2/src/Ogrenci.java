class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private double gano;
    private String bolumKodu;
    private String ogrNo;
    public Ogrenci(String ad, String bolum, int girisYili, double gano, String bolumKodu) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        setGano(gano);
        this.bolumKodu = bolumKodu;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getAd() {
        return ad;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }
    public String getOgrNo() {
        return ogrNo;
    }
    public String getBolum() {
        return bolum;
    }
    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }
    public int getGirisYili() {
        return girisYili;
    }
    //GANO'nun 0 ile 4 aralığında olup olmadığını kontrol eder.
    public void setGano(double gano) {
        if (gano >= 0 && gano <= 4) {
            this.gano = gano;
        } else {
            throw new IllegalArgumentException("GANO 0 ile 4 arasında olmalıdır.");
        }
    }
    public double getGano() {
        return gano;
    }
    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }
    public String getBolumKodu() {
        return bolumKodu;
    }
    //Harç Hesaplama.
    public int HarcHesapla(int dersSayisi) {
        return dersSayisi * 160;
    }
    public int HarcHesapla(int dersSayisi, int okuluUzatanYil) {
        return dersSayisi * 160 + okuluUzatanYil * 640;
    }
}
// 2023141043 Bilgisayar Mühendiliği öğrencisi Ahmet TURGUT - Bil104Homework2