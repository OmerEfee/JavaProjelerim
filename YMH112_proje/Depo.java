package YMH112_proje;

public class Depo implements IAracTakibi {
   private String depo_adi ;
   private String depo_sahibinin_adi;
   private String depo_konumu ;
   public final int depo_büyüklüğü;
   public int depo_calisan_sayisi;
   public int gelir;
   public int gider;
   public int kâr;
   public int depo_kira;
   public int depo_raf_sayisi;
   public int depo_arac_sayisi;

   public Depo() {
	   this.depo_calisan_sayisi=1000;
	   this.depo_raf_sayisi=400;
	   this.depo_büyüklüğü=1000;//m^2
	   this.depo_arac_sayisi=75;
	   this.depo_kira=8000;
   }
   public int kâr_hesapla(int gelir,int gider){
       this.kâr=gelir-gider;
       return  this.kâr;
   }
   public void goster() {
       System.out.println("Deponun adı: "+this.depo_adi);
       System.out.println("Depo sahibinin adı: "+this.depo_sahibinin_adi);
       System.out.println("Deponun konumu: "+this.depo_konumu);
       System.out.println("Deponun büyüklüğü: "+this.depo_büyüklüğü+" metrekare");
       System.out.println("Depodaki çalışan sayısı: "+this.depo_calisan_sayisi);
       System.out.println("Depodaki raf sayısı: "+this.depo_raf_sayisi);
       System.out.println("Depodaki araç sayısı: "+this.depo_arac_sayisi);
       System.out.println("Deponun kirası: "+this.depo_kira+" TL");
   }
        
   public void ürünDagıtımı() {
       System.out.println("Araçlar hedef marketlere doğru yola çıkıyor...");
   }
   public void ürünSayımı(int ürün_miktari) {
          if(ürün_miktari==10000) {
    		 ürünDagıtımı();
    	    }else System.out.println("Eksik ürün sayıldı,ürünleri tekrar kontrol ediniz !");
    	  }
   public int aktifAracSayısı() {
        	 int aktifArac =depo_arac_sayisi--;
        	 return aktifArac;
          }
        
public String getDepo_adi() {
	return depo_adi;
}
public void setDepo_adi(String depo_adi) {
	this.depo_adi = depo_adi;
}
public String getDepo_sahibinin_adi() {
	return depo_sahibinin_adi;
}
public void setDepo_sahibinin_adi(String depo_sahibinin_adi) {
	this.depo_sahibinin_adi = depo_sahibinin_adi;
}
public String getDepo_konumu() {
	return depo_konumu;
}
public void setDepo_konumu(String depo_konumu) {
	this.depo_konumu = depo_konumu;
}
}