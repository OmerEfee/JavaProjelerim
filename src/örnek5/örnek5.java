package örnek5;

import java.util.Scanner;

public class örnek5 {

	public static void main(String[] args) {
		//3 Sayıdan büyük olanını yazdıran java kodu:
		Scanner scan=new Scanner(System.in);
		int s1,s2,s3;
		System.out.println("Üç sayı giriniz:");
		s1=scan.nextInt();
		s2=scan.nextInt();
		s3=scan.nextInt();
		if (s1>s2 && s1>s3)
			System.out.println("En büyük sayı:"+s1);
		else if (s2>s1 && s2>s3)
			System.out.println("En büyük sayı:"+s2);
		else 
			System.out.println("En büyük sayı:"+s3);

	}

}
