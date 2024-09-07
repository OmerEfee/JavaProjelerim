package örnek9;

import java.util.Scanner;

public class örnek9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
       int s1;
       System.out.println("Bir sayı giriniz:");
       s1=scan.nextInt();
      for(int i=1;i<=10;i++) {
    	  
    	 System.out.println(s1+"X"+i+"="+i*s1);
      }
	}

}
