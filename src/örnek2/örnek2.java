package örnek2;

import java.util.Scanner;

public class örnek2 {

	public static void main(String[] args) {
		//Kullanıcı tarafından girilen 2 ondalıklı sayıyı çarpan java kodu:
		Scanner scan=new Scanner(System.in);
		float s1,s2;
		System.out.println("Lütfen iki ondalıklı sayı giriniz:");
		s1=scan.nextFloat();
		s2=scan.nextFloat();
		float carpım=s1*s2;
		System.out.println("Girilen ondalıklı sayıların çarpımı:"+carpım);
	}

}
