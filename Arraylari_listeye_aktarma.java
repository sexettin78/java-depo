package kahve;
//Arrays.AsL�st metodu ile diziyi liste yap�s�na kopyalama:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylari_listeye_aktarma {

	public static void main(String[] args) {
		String dizi[] = {"Edirne","�stanbul","L�leburgaz","Tekirda�"};
		Integer dizi2[] = {22,34,39,59};
		//dizilerimizi olu�turduk
		List listeyapisi = new ArrayList();
		List listeyapisi2 = new ArrayList();
		//liste yap�m�z� olu�turduk
		listeyapisi = Arrays.asList(dizi);
		listeyapisi2 = Arrays.asList(dizi2);
		//dizilerimizi asList() ile liste yap�s�na d�n��t�rd�k
		System.out.println(listeyapisi.get(1));
		System.out.println(listeyapisi);
		System.out.println(listeyapisi2.get(0));
		System.out.println(listeyapisi2);
	}

}
