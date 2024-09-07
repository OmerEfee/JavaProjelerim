package YMH112_proje;

public class Yiyecek extends Ürünler{
    public String ürünAdi2;
    public String ürünBarkodu2;
    public String sonKullanmaTarihi2;
    public  int ürünFiyati2;
    
	public Yiyecek() {
	 ürünAdi1="Bisküvi";
	 ürünBarkodu1="002149713";
     sonKullanmaTarihi1="14.04.2024";
	 ürünFiyati1=25000;
	 ürün_miktari=1250;
	 ürünAdi2="Kek";
	 ürünBarkodu2="052149713";
     sonKullanmaTarihi2="14.04.2024";
	 ürünFiyati2=25000;
	 //ürün_miktari=1250;
	}  
    public void yiyecekBilgisiGoster1() {
    	System.out.println("Ürün 1'in adı: "+ürünAdi1);
    	System.out.println("Ürün 1'in barkod numarası: "+ürünBarkodu1);
    	System.out.println("Ürün 1'in son kullanma tarihi: "+sonKullanmaTarihi1);
    	System.out.println("Ürün 1'in fiyatı: "+ürünFiyati1+" TL"); 
    	System.out.println("Ürün 1'in miktarı "+ürün_miktari); 
    	}	
    public void yiyecekBilgisiGoster2() {
    	System.out.println("Ürün 2'nin adı: "+ürünAdi2);
    	System.out.println("Ürün 2'nin barkod numarası: "+ürünBarkodu2);
    	System.out.println("Ürün 2'nin son kullanma tarihi: "+sonKullanmaTarihi2);
    	System.out.println("Ürün 2'nin fiyatı: "+ürünFiyati2+" TL");
    	System.out.println("Ürün 2'nin miktarı: "+ürün_miktari); 
    }    
}