package kahve;
//Arrays.AsLýst metodu ile diziyi liste yapýsýna kopyalama:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylari_listeye_aktarma {

	public static void main(String[] args) {
		String dizi[] = {"Edirne","Ýstanbul","Lüleburgaz","Tekirdað"};
		Integer dizi2[] = {22,34,39,59};
		//dizilerimizi oluþturduk
		List listeyapisi = new ArrayList();
		List listeyapisi2 = new ArrayList();
		//liste yapýmýzý oluþturduk
		listeyapisi = Arrays.asList(dizi);
		listeyapisi2 = Arrays.asList(dizi2);
		//dizilerimizi asList() ile liste yapýsýna dönüþtürdük
		System.out.println(listeyapisi.get(1));
		System.out.println(listeyapisi);
		System.out.println(listeyapisi2.get(0));
		System.out.println(listeyapisi2);
	}

}
