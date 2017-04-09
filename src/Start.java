import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// változók
		int a;
		int b;
		int c;
		String szoveg;
		
		// változók bekérése
		Scanner reader = new Scanner(System.in);
		/* amúgy itt mindig reklamál, hogy "reader is never closed".
		Mi vele a teendõ? */
		
		System.out.println("Írd be az elsõ számot:");
		a = reader.nextInt();
		System.out.println("Írd be a második számot:");
		b = reader.nextInt();
		System.out.println("Írd be a harmadik számot:");
		c = reader.nextInt();
		System.out.println("Írj be egy tetszõleges szót:");
		szoveg = reader.next();
		System.out.print("\n");
		
		// 1.  a + b * c értéke
		Integer osszeg = szamolas(a, b, c);
		System.out.println
			("Az elsõ szám + második szám * harmadik szám értéke: " + osszeg.toString());
		
		// 2. a + b alkalommal kiírni a szöveget
		for (int i = 0; i < a + b; i++){
			kiiratas(szoveg);
			// vesszõ és szóköz kiíratás
			if (i != a + b - 1){
				System.out.print(", ");
			}
		}
		
		// új sor a konzolon
		System.out.print("\n");
		
		// 3. növekvõ sorrendbe rakni a számokat
		sorrend (a, b ,c);
		// 4. kiírni, amik párosak
		paros (a, b, c);
	}
	
	// metódus az elsõ számoláshoz
	public static int szamolas(int a, int b, int c) {
		int d = a + b * c;
		return d;
	}
	
	// metódus kiíráshoz
	public static void kiiratas(String szoveg){
		System.out.print(szoveg);
	}
	
	// metódus a sorrendbe rakáshoz
	public static void sorrend(int a, int b, int c){
		int temp;
		// elsõ kettõ összehasonlítás
		if (a > b){
			temp = a;
			a = b;
			b = temp;
		}
		// elsõ és harmadik összehasonlítás
		if (a > c){
			temp = a;
			a = c;
			c = temp;
		}
		// második és harmadik összehasonlítás
		if (b > c){
			temp = b;
			b = c;
			c = temp;
		}
		
		// sorrend kiírása
		System.out.print("A számok növekvõ sorrendje: ");
		System.out.print(a + ", " + b + ", " + c + "\n");
	}
	
	// metódus a páros számok kiírásához
	public static void paros(Integer a, Integer b, Integer c){
		System.out.print("A következõ számok a párosak: ");
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
		
		// ha egyik sem páros
		if (parosSzamok == ""){
			System.out.println("Egyik szám sem páros.");
		}
		else {
			System.out.println(parosSzamok);
		}
	}
}
