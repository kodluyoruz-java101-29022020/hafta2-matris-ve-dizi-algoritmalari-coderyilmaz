package Odev2Main;

public class Soru2 {

	public static void main(String[] args) {
		//int[][] m = {{1,2,3,4,5} , {16,17,18,19,6} , {15,24,25,20,7} , {14,23,22,21,8} , {13,12,11,10,9}};
		int[][] m = produceRandomMatrice(5,5);
		printMatrice(m);
		System.out.println("---------------------");
		printMatriceSpiralOrder(m);
	}
	
	static int[][] produceRandomMatrice (int row,int column) {
		int[][] m = new int[row][column];
		for (int i=0 ; i<row ; i++) {
			for (int j=0 ; j<column ; j++) {
				m[i][j] = (int)(Math.random()*90+10);
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
	
	static void printMatriceSpiralOrder (int[][] matrice) {
		int topRow = 0 , bottomRow = matrice.length-1;
		int leftColumn = 0 , rightColumn = matrice[0].length-1;
		while(true) {
			if(leftColumn<=rightColumn) {
				for(int i=leftColumn ; i<=rightColumn ; i++) {
					System.out.print(matrice[topRow][i]+" ");
				}
				topRow++;
			}
			else {
				break;				
			}
			if(topRow<=bottomRow) {
				for(int i=topRow ; i<=bottomRow ; i++) {
					System.out.print(matrice[i][rightColumn]+" ");
				}
				rightColumn--;
			}
			else {
				break;			
			}
			if(leftColumn<=rightColumn) {
				for(int i=rightColumn ; i>=leftColumn ; i--) {
					System.out.print(matrice[bottomRow][i]+" ");
				}
				bottomRow--;
			}
			else {
				break;				
			}
			if(topRow<=bottomRow) {
				for(int i=bottomRow ; i>=topRow ; i--) {
					System.out.print(matrice[i][leftColumn]+" ");
				}
				leftColumn++;
			}
			else {
				break;
			}
		}
	}
}