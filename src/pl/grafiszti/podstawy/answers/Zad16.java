package pl.grafiszti.podstawy.answers;

/*1.6 Wykorzystaj konwersję i rzutowanie wypróbuj zamiany
 *  różnych typów prostych między sobą. Szczególną uwagę 
 *  zwróć na rzutowanie char na int. Jak myślisz, co w ten 
 *  sposób otrzymujesz?
 */
public class Zad16 {
	int iA, iB, iC;
	char cA, cB, cC;
	
	public Zad16(){
		iA = 56;
		iB = 67;
		iC = 87;
		cA = 'a';
		cB = 'd';
		cC = 'z';
	}
	
	/*po konwersji int do char otrzymujemy znak spod kodu ascii ktory 
	 * byl w zmiennej int, w druga strone jest odwrotnie*/
	public void run(){
		System.out.println("int " + iA + " to char " + (char)iA);
		System.out.println("int " + iB + " to char " + (char)iB);
		System.out.println("int " + iC + " to char " + (char)iC);
		
		System.out.println("char " + cA + " to int " + (int)cA);
		System.out.println("char " + cB + " to int " + (int)cB);
		System.out.println("char " + cC + " to int " + (int)cC);
	}
}
