package YMH112_proje;

public class Depo_calisanlari {
  
	 public static String ad;
	 public String soyad;
	 public String tel_no;
	 public int maas;
	 public String yapilan_is;
		
	 public static void calisan_bilgisi_goster(String ad,String soyad,String tel_no,int maas,String yapilan_is) {
		System.out.println("Çalışan adı: "+ad);
		System.out.println("Çalışan soyadı: "+soyad); 
		System.out.println("Çalışanın telefon numarası: "+tel_no);
		System.out.println("Çalışan maaşı: "+maas+" TL");
		System.out.println("Çalışanın yaptığı iş: "+yapilan_is);
	}	
}
