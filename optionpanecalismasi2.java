package kahve;
import javax.swing.JOptionPane;
public class optionpanecalismasi2 {

	public static void main(String[] args) {
		String dizielemansayisi =JOptionPane.showInputDialog("Ka� elemanl� dizi olsun?");
		int dizisayi = Integer.parseInt(dizielemansayisi);
		int dizi[];
		dizi=new int[dizisayi];
		int i=0;
		
		
		for(i=0;i<dizisayi;i++) {			
			String deger = JOptionPane.showInputDialog("Dizinin :"+(i+1)+". eleman�n� girin");
			dizi[i]=Integer.parseInt(deger);
		};
		
		for(int s=0; s<dizisayi;s++) {
			JOptionPane.showMessageDialog(null, "Dizinin "+(s+1)+". eleman�:"+dizi[s]);
		}
		
		

	}

}
