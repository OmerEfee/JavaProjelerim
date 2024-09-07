package örnek4;

import java.util.Scanner;

public class örnek4 {

	public static void main(String[] args) {
		//İki sayının yerini değiştiren java kodu:
				Scanner scan=new Scanner(System.in);
				int s1,s2;
				System.out.println("İki sayı giriniz:");
				s1=scan.nextInt();
				s2=scan.nextInt();
				System.out.println("Birinci sayı:"+s1);
				System.out.println("İkinci sayı"+s2);
				System.out.println("Sayıların yer değiştirmesinden sonra:");
				int gecici=s1;
				 s1=s2;
				s2=gecici;
				System.out.println("Birinci sayı:"+s1);
				System.out.println("İkinci sayı:"+s2);
	}

}
