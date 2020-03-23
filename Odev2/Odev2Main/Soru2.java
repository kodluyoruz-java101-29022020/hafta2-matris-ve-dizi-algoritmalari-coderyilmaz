package Odev2Main;

public class Soru2 {


	public static void main(String[] args) {
		int[][] m = {{1,2,3,4,5} , {16,17,18,19,6} , {15,24,25,20,7} , {14,23,22,21,8} , {13,12,11,10,9}};
		printMatrice(m);
		//printMatrice(produceRandomMatrice(4,4));
		System.out.println("-----------------------");
		
		printMatriceSpiralForm(m);

	}
	
	static int[][] produceRandomMatrice (int row,int column) {
		int[][] m = new int[row][column];
		for (int i=0 ; i<row ; i++) {
			for (int j=0 ; j<column ; j++) {
				m[i][j] = (int)(Math.random()*10);
			}
		}
		return m;
	}
	
	static void printMatrice (int[][] matrice) {
		for (int i=0 ; i<matrice.length ; i++) {
			for (int j=0 ; j<matrice[0].length ; j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void printMatriceSpiralForm (int[][] matrice) {
		for(int j=0 ; j<matrice[0].length ; j++) {
			System.out.print(matrice[0][j] + " ");
		}
		for(int i=0 ; i<matrice.length ; i++) {
			System.out.print(matrice[i][matrice[0].length-1] + " ");
		}
		for(int j=matrice[0].length-1 ; j>=0 ; j--) {
			System.out.print(matrice[matrice.length-1][j] + " ");
		}
		for(int i=matrice.length-1 ; i>0 ; i--) {
			System.out.print(matrice[i][0] + " ");
		}
	}

}