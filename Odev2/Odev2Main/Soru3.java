package Odev2Main;


public class Soru3 {

	public static void main(String[] args) {
		int m = (int)(Math.random()*10/2+2);
		int n = (int)(Math.random()*10/2+2);
		int t = (int)(Math.random()*10/2+2);
		int[][] matrice1 = produceRandomMatrice(m,n);
		int[][] matrice2 = produceRandomMatrice(n,t);
		printMatrice(matrice1);
		System.out.println("---------------------");
		printMatrice(matrice2);
		System.out.println("---------------------");
		printMatrice(multiplyMatrices(matrice1,matrice2));		
	}
	
	static int[][] produceRandomMatrice(int row,int column) {
		int[][] m = new int[row][column];
		for (int i=0 ; i<row ; i++) {
			for (int j=0 ; j<column ; j++) {
				m[i][j]=(int)(Math.random()*10);
			}
		}
		return m;
	}
	
	static int[][] multiplyMatrices(int[][] firstMatrice,int[][] secondMatrice) {
		int[][] resultMatrice = new int[firstMatrice.length][secondMatrice[0].length]; 
		for (int i=0 ; i<firstMatrice.length ; i++) {
			for (int j=0 ; j<secondMatrice[0].length ; j++) {
				for (int k=0 ; k<firstMatrice[0].length ; k++) {
					resultMatrice[i][j] = resultMatrice[i][j] + (firstMatrice[i][k]*secondMatrice[k][j]); 
				}
			}
		}
		return resultMatrice;
	}
	
	static void printMatrice(int[][] matrice) {
		for (int i=0 ; i<matrice.length ; i++) {
			for (int j=0 ; j<matrice[0].length ; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

}
