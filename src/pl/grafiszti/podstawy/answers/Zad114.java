package pl.grafiszti.podstawy.answers;

/*1.14 Przy użyciu pętli i tablic przechowujących liczby całkowite 
 * zaprezentuj poniższą treść:
 tab[0,0] = 0;
 tab[0,1] = 1;
 tab[0,2] = 2;
 tab[1,0] = 3;
 tab[1,1] = 4;
 tab[1,2] = 5;
 Wykorzystuj przy tym własność length.
 */
public class Zad114 {
	int[][] tab;

	public Zad114() {
		tab = new int[3][2];

		int counter = 0;
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = counter++;
			}
		}
	}
	
	public void run(){
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.println(tab[i][j]);
			}
		}
	}
}
