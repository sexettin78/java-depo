package kahve;
import java.util.*;
public class onsayiuzerindeislem1 {

	public static void main(String[] args) {
		int i=0;
		int negatif = 0;
		int pozitif = 0;
		int pozitifsayi = 0;
		Scanner veri = new Scanner(System.in);
		for(i=0;i<10;i++) {
			int sayi = veri.nextInt();
			if(sayi>=0) {
				pozitif+=sayi;
				pozitifsayi+=1;
			};
			
			
			if(sayi<0) {
				negatif+=sayi;
			};
		}

		System.out.println("pozitif olanlarýn ortalamasý: "+pozitif/pozitifsayi);
		System.out.println("negatif olanlarýn toplamý: "+negatif);
	}

}
