package YMH112_proje;

public class MeyveSebze extends Ürünler{
	public String ürünAdi2;
    public String ürünBarkodu2;
    public String sonKullanmaTarihi2;
    public  int ürünFiyati2;
    
	public MeyveSebze() {
	 ürünAdi1="Elma";
	 ürünBarkodu1="274218193";
     sonKullanmaTarihi1="14.04.2024";
	 ürünFiyati1=25000; // kg 20tl den 25000 tl 
	 ürün_miktari=1250;
	 ürünAdi2="Patates";
	 ürünBarkodu2="428139713";
     sonKullanmaTarihi2="14.04.2024";
	 ürünFiyati2=12500; // 10 tl den 12500 tl
	 //ürün_miktari=1250;
	}  
    public void meyveBilgisiGoster() {
    	System.out.println("Ürün 1'in adı: "+ürünAdi1);
    	System.out.println("Ürün 1'in barkod numarası: "+ürünBarkodu1);
    	System.out.println("Ürün 1'in son kullanma tarihi: "+sonKullanmaTarihi1);
    	System.out.println("Ürün 1'in fiyatı: "+ürünFiyati1+" TL"); 
    	System.out.println("Ürün 1'in miktarı "+ürün_miktari); 
    	}	
    public void sebzeMalzemesiBilgisiGoster() {
    	System.out.println("Ürün 2'nin adı: "+ürünAdi2);
    	System.out.println("Ürün 2'nin barkod numarası: "+ürünBarkodu2);
    	System.out.println("Ürün 2'nin son kullanma tarihi: "+sonKullanmaTarihi2);
    	System.out.println("Ürün 2'nin fiyatı: "+ürünFiyati2+" TL");
    	System.out.println("Ürün 2'nin miktarı: "+ürün_miktari); 
    }    	
}