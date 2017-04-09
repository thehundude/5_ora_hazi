import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// v�ltoz�k
		int a;
		int b;
		int c;
		String szoveg;
		
		// v�ltoz�k bek�r�se
		Scanner reader = new Scanner(System.in);
		/* am�gy itt mindig reklam�l, hogy "reader is never closed".
		Mi vele a teend�? */
		
		System.out.println("�rd be az els� sz�mot:");
		a = reader.nextInt();
		System.out.println("�rd be a m�sodik sz�mot:");
		b = reader.nextInt();
		System.out.println("�rd be a harmadik sz�mot:");
		c = reader.nextInt();
		System.out.println("�rj be egy tetsz�leges sz�t:");
		szoveg = reader.next();
		System.out.print("\n");
		
		// 1.  a + b * c �rt�ke
		Integer osszeg = szamolas(a, b, c);
		System.out.println
			("Az els� sz�m + m�sodik sz�m * harmadik sz�m �rt�ke: " + osszeg.toString());
		
		// 2. a + b alkalommal ki�rni a sz�veget
		for (int i = 0; i < a + b; i++){
			kiiratas(szoveg);
			// vessz� �s sz�k�z ki�rat�s
			if (i != a + b - 1){
				System.out.print(", ");
			}
		}
		
		// �j sor a konzolon
		System.out.print("\n");
		
		// 3. n�vekv� sorrendbe rakni a sz�mokat
		sorrend (a, b ,c);
		// 4. ki�rni, amik p�rosak
		paros (a, b, c);
	}
	
	// met�dus az els� sz�mol�shoz
	public static int szamolas(int a, int b, int c) {
		int d = a + b * c;
		return d;
	}
	
	// met�dus ki�r�shoz
	public static void kiiratas(String szoveg){
		System.out.print(szoveg);
	}
	
	// met�dus a sorrendbe rak�shoz
	public static void sorrend(int a, int b, int c){
		int temp;
		// els� kett� �sszehasonl�t�s
		if (a > b){
			temp = a;
			a = b;
			b = temp;
		}
		// els� �s harmadik �sszehasonl�t�s
		if (a > c){
			temp = a;
			a = c;
			c = temp;
		}
		// m�sodik �s harmadik �sszehasonl�t�s
		if (b > c){
			temp = b;
			b = c;
			c = temp;
		}
		
		// sorrend ki�r�sa
		System.out.print("A sz�mok n�vekv� sorrendje: ");
		System.out.print(a + ", " + b + ", " + c + "\n");
	}
	
	// met�dus a p�ros sz�mok ki�r�s�hoz
	public static void paros(Integer a, Integer b, Integer c){
		System.out.print("A k�vetkez� sz�mok a p�rosak: ");
		String parosSzamok = "";
		if (a % 2 == 0){
			parosSzamok = parosSzamok + a.toString() + " ";
		}
		if (b % 2 == 0){
			parosSzamok = parosSzamok + b.toString() + " ";
		}
		if (c % 2 == 0){
			parosSzamok = parosSzamok + c.toString() + " ";
		}
		
		// ha egyik sem p�ros
		if (parosSzamok == ""){
			System.out.println("Egyik sz�m sem p�ros.");
		}
		else {
			System.out.println(parosSzamok);
		}
	}
}
