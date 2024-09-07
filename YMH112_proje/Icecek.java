package YMH112_proje;

public class Icecek extends Ürünler{
    public String ürünAdi2;
    public String ürünBarkodu2;
    public String sonKullanmaTarihi2;
    public  int ürünFiyati2;
	
    public Icecek(){
    	 ürünAdi1="Su";
    	 ürünBarkodu1="134275869";
         sonKullanmaTarihi1="14.04.2024";
    	 ürünFiyati1=6250;  // tanesi 5 tl den
    	 ürün_miktari=1250;
    	 ürünAdi2="Süt"; //tanesi 20 tl den 
    	 ürünBarkodu2="198273645";
         sonKullanmaTarihi2="14.04.2024";
    	 ürünFiyati2=25000;
    	// ürün_miktari=1250;    
    }
	public void icecekBilgisiGoster1() {
		System.out.println("Ürün 1'in adı: "+ürünAdi1);
		System.out.println("Ürün 1'in barkod numarası: "+ürünBarkodu1);
		System.out.println("Ürün 1'in son kullanma tarihi: "+sonKullanmaTarihi1);
		System.out.println("Ürün 1'in fiyatı: "+ürünFiyati1+" TL");
		System.out.println("Ürün 1'in miktarı: "+ürün_miktari);
	}
	public void icecekBilgisiGoster2() {
		System.out.println("Ürün 2'nin adı: "+ürünAdi2);
		System.out.println("Ürün 2'nin barkod numarası: "+ürünBarkodu2);
		System.out.println("Ürün 2'nin son kullanma tarihi: "+sonKullanmaTarihi2);
		System.out.println("Ürün 2'nin fiyatı: "+ürünFiyati2+" TL");
		System.out.println("Ürün 2'nin miktarı: "+ürün_miktari);
	}	
}