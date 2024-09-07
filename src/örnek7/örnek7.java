package örnek7;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class örnek7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
  /*int n;
  System.out.println("Sayı giriniz:");
  n=scan.nextInt();
  int toplam=0;
  for(int i=0;i<=n;i++) {
	  toplam=toplam+i;
	}
 System.out.println("Toplam sonuç:"+toplam); */
  
		/*int x = (int)(Math.random()*10);
		System.out.print(x);
		String yazi="ymh";
		String yazi2="bbg";
		if(yazi.equals(yazi2)) {
			System.out.println("ymh geçildi !!!");
		} else {
			
			System.out.println("bbg geçildi !!!");
			System.out.println(); 
              }*/
	  
		/* İKİNCİ DERECEDEN 1 BİLİNMEYENLİ DENKLEM ÇÖZÜMÜ
		 
		 System.out.println("ax^2+bx+c ikinci dereceden bir denklemdir.Denklemin sabitlerini sırayla giriniz..");
		 System.out.println("a değerini giriniz: ");
		 double a=scan.nextDouble();
		 System.out.println("b değerini giriniz: ");
		 double b=scan.nextDouble();
		 System.out.println("c değerini giriniz: ");
		 double c=scan.nextDouble();
          double delta = (b*b)-(4*a*c);		 
		 if(delta>0) {
			double x1=-b-Math.sqrt((delta))/(2*a);
			double x2=b+Math.sqrt((delta))/(2*a);
			System.out.println("x1= "+x1+" x2= "+x2);
		 }
		 else if(delta<0) {
			 System.out.println("Denklemin gerçek kökü yoktur.!");
		 }
		 else 
		 {
			 double x=-b/(2*a);
			 System.out.println("x= "+x);
			  }*/
		  
		/* TAŞ-KAĞIT-MAKAS OYUNU
		   String[] tkm= {"Tas","Kagıt","Makas"};
		    int rnd=(int)(Math.random()*3);
		    System.out.println("Taş-kağıt-makas oyununda 1-taş,2-kağıt,3-makas olarak belirlenmiştir birini giriniz: ");
		    int sen=scan.nextInt();
		    System.out.println("Bilgisayar= "+tkm[rnd]);
		    System.out.println("Sen= "+tkm[sen]);
		    if((rnd==0 && sen==1) || (rnd==1 && sen==2) || (rnd==2 && sen==0)) {
		    	System.out.println("SEN kazandıN !");
		    }else if((rnd==0 && sen==2)||(rnd==1 && sen==0)||(rnd==2 && sen==1)) {
		    	
		    	System.out.println("Blgisayar KAZANDI ");
		    } 
		    else {System.out.println("Kazanan yok !");}
		*/ 
		
		/*System.out.println("Tablo İndisleri ve İndis Toplamları");
		for(int i=0;i<10;i++) {
			System.out.print(i);
			System.out.print("    ");
		}
		System.out.print("\n- - - - - - - - - - - - - - - - - - - -");
		for(int j=0;j<10;j++) {
			System.out.println(j);
		}*/
		
		int[] dizi= {22,11,33};
		double toplam=0;
		double ortalama=0;
		for(int i=0;i<dizi.length;i++) {
			toplam+=dizi[i];
			
		}
		ortalama=toplam/dizi.length;
		System.out.println("Dizideki elemanların toplamı: "+toplam+" dizideki elemanların ortalaması : "+ortalama);
	}
	} 

