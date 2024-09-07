package YMH112_proje;

public class Ürünler extends Ürün_konumu {
     
	public String ürünAdi1;
	public String ürünBarkodu1;
	public String sonKullanmaTarihi1;
	public int ürünFiyati1;
	
	public int yiyecek_rafi;
	public int içecek_rafi;
	public int meyve_sebze_rafi;
	public int temizlik_malzemeleri_rafi;
	public int ürün_miktari;
	
	//her rafta 25 ürün var 100rafta 2500; 400 rafta 10bin ürün vardır. 
	public Ürünler() {
		this.yiyecek_rafi=100;
		this.içecek_rafi=100;
	    this.meyve_sebze_rafi=100;
	    this.temizlik_malzemeleri_rafi=100;
	    this.ürün_miktari=10000;
	}
	  public void detayli_raf_ürün_bilgisi() {
		  System.out.println("Toplam yiyecek rafı:"+this.yiyecek_rafi);
		  System.out.println("Toplam içecek rafı:"+this.içecek_rafi);
		  System.out.println("Toplam meyve ve sebze rafı:"+this.meyve_sebze_rafi);
		  System.out.println("Toplam temizlik malzemesi rafı:"+this.temizlik_malzemeleri_rafi);
		  System.out.println("Toplam ürün:"+this.ürün_miktari);
	  }
	  public void ürün_konumu_göster() {
		  System.out.println("Yiyecekler A1 rafından itibaren A10'a kadardır.");
		  System.out.println("içecekler  B1 rafından itibaren B10'a kadardır.");
		  System.out.println("Meyveler ve sebzeler C1 rafından itibaren C10'a kadardır.");
		  System.out.println("Temizlik malzemeleri D1 rafından itibaren D10'a kadardır.");
	  }	  
   }