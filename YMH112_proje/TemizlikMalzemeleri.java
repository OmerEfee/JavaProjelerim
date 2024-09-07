package YMH112_proje;
 
public class TemizlikMalzemeleri extends Ürünler {
	  public String ürünAdi2;
	    public String ürünBarkodu2;
	    public String sonKullanmaTarihi2;
	    public  int ürünFiyati2;
	    
		public TemizlikMalzemeleri() {
		 ürünAdi1="Deterjan";
		 ürünBarkodu1="274218463";
	     sonKullanmaTarihi1="14.04.2024";
		 ürünFiyati1=50000; //40 tl den 50000 tl 
		 ürün_miktari=1250;
		 ürünAdi2="Sıvı Sabun";
		 ürünBarkodu2="421539713";
	     sonKullanmaTarihi2="14.04.2024";
		 ürünFiyati2=37500; // 30 tl den 37500 tl
		 //ürün_miktari=1250;
		}
	    public void temizlikMalzemesiBilgisiGoster1() {
	    	System.out.println("Ürün 1'in adı: "+ürünAdi1);
	    	System.out.println("Ürün 1'in barkod numarası: "+ürünBarkodu1);
	    	System.out.println("Ürün 1'in son kullanma tarihi: "+sonKullanmaTarihi1);
	    	System.out.println("Ürün 1'in fiyatı: "+ürünFiyati1+" TL"); 
	    	System.out.println("Ürün 1'in miktarı "+ürün_miktari); 
	    	}	
	    public void temizlikMalzemesiBilgisiGoster2() {
	    	System.out.println("Ürün 2'nin adı: "+ürünAdi2);
	    	System.out.println("Ürün 2'nin barkod numarası: "+ürünBarkodu2);
	    	System.out.println("Ürün 2'nin son kullanma tarihi: "+sonKullanmaTarihi2);
	    	System.out.println("Ürün 2'nin fiyatı: "+ürünFiyati2+" TL");
	    	System.out.println("Ürün 2'nin miktarı: "+ürün_miktari); 
	    }    	
}