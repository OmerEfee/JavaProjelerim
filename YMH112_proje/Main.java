package YMH112_proje;

public class Main {

	public static void main(String[] args) {
	/* Main sınıfının bulunduğu sınıfa Depomuzla ilgili: deponun bilgileri,çalışan bilgileri,depoda bulunan ürünlerle ilgili
		genel ve özel bilgiler bulunmakta. 
	*/
		/* Bu kısımda Depoya özel bilgileri depo sınıfından nesne oluşturarak yazdırdım.Deponun kârınıysa depo sınıfından 
		 * geriye değer döndüren, parametreli fonksiyon oluşturarak yazdırdım
		 * Ek olarak ürünsayımı fonksiyonun içine bir fonksiyon daha yazarak if else koşullarını kullandım
		 * Birde for döngüsü kullanarak Araçlar marketler için yola çıkarken kaç araç çıktıysa o kadar aracı azaltıp ekrana kalan aracı yazdırdım*/
		 System.out.println("-----Depoyla ilgili-----");
         Depo d1=new Depo();
         System.out.println("Deponun aylık kârı "+d1.kâr_hesapla(300000,250000)+" TL");
         d1.setDepo_adi("Efeler Depo");
         d1.setDepo_sahibinin_adi("Ömer Efe");
         d1.setDepo_konumu("İstanbul");
         d1.goster();
         d1.ürünSayımı(10000);
      for(int i=1;i<=10;i++) {
    	 d1.aktifAracSayısı();
      }
      System.out.println("Depodan 10 araç ayrıldıktan sonra kalan araç sayısı: "+d1.depo_arac_sayisi);
      // Bu kısımda Çalışan sınıfından nesne olşturup çalışan bilgisini yazdırdım çalışan sayısı 1000 ama örnek olarak 1kişi yazdırdım.
	  System.out.println("-----Çalışanlarla ilgili-----");
	  Depo_calisanlari calisan1=new Depo_calisanlari();
	  calisan1.calisan_bilgisi_goster("Eren","Peltek","5554443332",10000,"Depo temizliği");
	 // Bu kısımda ürün sınıfından nesne oluşturup hem genel ürün-raf bilgisini yazdırdım.
	//Ek olarak ürün_konumu adında abstract(soyut) bir sınıf oluşturup ürün sınıfına extends ettim ve ürün konumlarını bu şekilde belirttim
	  System.out.println("-----Ürünlerle ilgili-----");
	  Ürünler ü1=new Ürünler();
	  ü1.detayli_raf_ürün_bilgisi();
	  ü1.ürün_konumu_göster();
	//Bu kısımda Yiyecek sınıfından yiyecek nesnesi oluşturdum.Bu nesneyi kullanarak 2 adet ürünün bilgisini çağırdım.
	  System.out.println("-----Yiyeceklerin Bilgisi-----");
	  Yiyecek y1=new Yiyecek();
	  y1.yiyecekBilgisiGoster1();
	  y1.yiyecekBilgisiGoster2();
	//Bu kısımda ve alt kısımlarda da sınıfa ait nesne oluşturup örnek olarak yazdığım 2ürünü yazdırdım.
	  System.out.println("-----İçeceklerin Bilgisi-----");
	  Icecek ı1=new Icecek();
	  ı1.icecekBilgisiGoster1();
	  ı1.icecekBilgisiGoster2();
	  System.out.println("-----Temizlik Malzemlerinin Bilgisi-----");
	  TemizlikMalzemeleri tm1=new TemizlikMalzemeleri();
	  tm1.temizlikMalzemesiBilgisiGoster1();
	  tm1.temizlikMalzemesiBilgisiGoster2();
	  System.out.println("-----Meyve ve Sebze Bilgisi-----");
	  MeyveSebze ms=new MeyveSebze();
	  ms.meyveBilgisiGoster();
	  ms.sebzeMalzemesiBilgisiGoster();
	}
}
