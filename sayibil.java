package kahve;
import java.util.*;
public class sayibil {

	public static void main(String[] args) {
		Scanner veri = new Scanner(System.in);
		
		int in = 0;
		Random r =new Random();
		int sayi2=r.nextInt(10);
		System.out.println("Sayý bil oyununa hoþgeldiniz! 0-10 arasý aklýmdan geçen sayýyý bul. 4 hakkýn var");
		for(in=0; in<4; in++) {
		int sayi = veri.nextInt();
		if(sayi==sayi2) {System.out.println("Doðru Tahmin!"); break;}
		if(sayi>sayi2) {System.out.println("Daha küçük bir sayý yaz!");}
		if(sayi<sayi2) {System.out.println("Daha büyük bir sayý yaz!");}
		}
		if(in==4) {System.out.println("kaybettin!, tuttuðum sayý:"+sayi2);}
	}

}
