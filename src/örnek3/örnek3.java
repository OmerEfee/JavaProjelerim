package örnek3;

import java.util.Scanner;

public class örnek3 {

	public static void main(String[] args) {
		//Bölümü ve kalanı bulan java kodu:
		Scanner scan=new Scanner(System.in);
		int bolen, bolunen,kalan,bolum;
		System.out.println("Bölünecek sayı:");
		bolunen=scan.nextInt();
		System.out.println("Bölen sayı:");
		bolen=scan.nextInt();
		bolum=bolunen/bolen;
		kalan=bolunen%bolen;
		System.out.println("Bölüm:"+bolum);
		System.out.println("Kalan:"+kalan);

	}

}
