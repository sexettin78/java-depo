package kahve;
import java.util.*;
public class hesapmakinesiv1 {

	public static void main(String[] args) {
	Scanner veri = new Scanner(System.in);	
	while(true) {
	System.out.println("SEÇENEKLER:");
	System.out.println("[1]-Topla");
	System.out.println("[2]-Çýkar");
	System.out.println("[3]-Çarp");
	System.out.println("[4]-Böl");
	System.out.print("Seçiminizi yapýnýz: ");
	int secim = veri.nextInt();
	System.out.print("Ýlk sayýyý giriniz: ");
	float sayi1 = veri.nextFloat();
	System.out.print("Ýkinci sayýyý giriniz yapýnýz: ");
	float sayi2 = veri.nextFloat();
	float sonuc=0;
	switch(secim) {
	case 1: 
		sonuc=sayi1+sayi2;
		break;
	case 2:
		sonuc=sayi1-sayi2;
		break;
	case 3:
		sonuc=sayi1*sayi2;
		break;
	case 4:
		sonuc=sayi1/sayi2;
		break;
	}
	System.out.println("Sonuç: "+sonuc);
	}
	}

}
