package kahve;
import java.util.*;
public class hesapmakinesiv1 {

	public static void main(String[] args) {
	Scanner veri = new Scanner(System.in);	
	while(true) {
	System.out.println("SE�ENEKLER:");
	System.out.println("[1]-Topla");
	System.out.println("[2]-��kar");
	System.out.println("[3]-�arp");
	System.out.println("[4]-B�l");
	System.out.print("Se�iminizi yap�n�z: ");
	int secim = veri.nextInt();
	System.out.print("�lk say�y� giriniz: ");
	float sayi1 = veri.nextFloat();
	System.out.print("�kinci say�y� giriniz yap�n�z: ");
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
	System.out.println("Sonu�: "+sonuc);
	}
	}

}
