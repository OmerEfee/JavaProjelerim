package örnek8;

import java.util.Scanner;

public class örnek8 {

	public static void main(String[] args) {
		//Kullanıcıdan girilen sayının faktöriyelini yazdıran java kodu:
		Scanner scan=new Scanner(System.in);
	       int s1;
	       System.out.println("Bir sayı giriniz:");
	       s1=scan.nextInt();
	       int temp=s1;
	       int faktor=1;
	       while(s1>0) {
	    	   faktor=faktor*s1;
	    	   s1--;
	       }
	       System.out.println(temp+"!="+faktor);
	}

}
