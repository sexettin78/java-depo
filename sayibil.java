package kahve;
import java.util.*;
public class sayibil {

	public static void main(String[] args) {
		Scanner veri = new Scanner(System.in);
		
		int in = 0;
		Random r =new Random();
		int sayi2=r.nextInt(10);
		System.out.println("Say� bil oyununa ho�geldiniz! 0-10 aras� akl�mdan ge�en say�y� bul. 4 hakk�n var");
		for(in=0; in<4; in++) {
		int sayi = veri.nextInt();
		if(sayi==sayi2) {System.out.println("Do�ru Tahmin!"); break;}
		if(sayi>sayi2) {System.out.println("Daha k���k bir say� yaz!");}
		if(sayi<sayi2) {System.out.println("Daha b�y�k bir say� yaz!");}
		}
		if(in==4) {System.out.println("kaybettin!, tuttu�um say�:"+sayi2);}
	}

}
