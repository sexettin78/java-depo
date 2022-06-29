package kahve;

import java.util.Arrays;

public class sorucozumu1 {

	public static void main(String[] args) {
		int dizi[] = {4,55,188,3};
		int yenidizi[] = {};
		yenidizi = Arrays.copyOfRange(dizi, 3, 5);
		int i = 0;
		for(i=0;i<yenidizi.length;i++) {
			System.out.print(yenidizi[i]);}

	}

}
