import java.util.Scanner;
public class ArtikYilHesaplama {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		int year;
		System.out.println("L�tfen Y�l� Giriniz.");
		year=scn.nextInt();
		if (year%100==0 && year%400==0) {
			System.out.println(year+" Art�k y�ld�r.");
		}
		else if (year%4==0) {
			System.out.println(year+" Art�k y�ld�r.");
		}
		else {
			System.out.println(year+" Art�k y�l de�ildir.");
		}

	}

}
