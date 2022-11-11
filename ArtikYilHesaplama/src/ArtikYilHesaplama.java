import java.util.Scanner;
public class ArtikYilHesaplama {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		int year;
		System.out.println("Lütfen Yýlý Giriniz.");
		year=scn.nextInt();
		if (year%100==0 && year%400==0) {
			System.out.println(year+" Artýk yýldýr.");
		}
		else if (year%4==0) {
			System.out.println(year+" Artýk yýldýr.");
		}
		else {
			System.out.println(year+" Artýk yýl deðildir.");
		}

	}

}
