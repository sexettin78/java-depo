package kahve;
import java.util.*;
public class altiyildizdongusu {

	public static void main(String[] args) {
	Scanner veri = new Scanner(System.in);
	System.out.print("Ka� y�ld�z alt alta yaz�ls�n >");
	int kere = veri.nextInt();
	for(int i=0;i<kere;i++){
		for(int j=kere;i<j;j--) {
		System.out.print("*");
	}
		System.out.print("\n");
		}
	}

}
