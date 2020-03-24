package Odev2Main;

public class Soru1 {

	public static void main(String[] args) {
		
		//int[][] m = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		int[][] m=produceRandomMatrice(4,5);
		printMatrice(m);
		System.out.println("------------");
		printMatrice(turnedMatrice(m));
		
	}
	
	static int[][] produceRandomMatrice(int row,int column) {
		int[][] m = new int[row][column];
		for (int i=0 ; i<row ; i++) {
			for (int j=0 ; j<column ; j++) {
				m[i][j] = (int)(Math.random()+1-Math.random());				
			}
		}
		return m;
	}
	
	static void printMatrice(int[][] matrice) {
		for (int i=0 ; i<matrice.length ; i++) {
			for (int j=0 ; j<matrice[0].length ; j++) {
				System.out.print(matrice[i][j] + " ");				
			}
			System.out.println();
		}
	}
	
	static int[][] turnedMatrice(int[][] m) {
		int[][] a = new int [m.length][m[0].length];
		for (int i=0 ; i<m.length ; i++) {
			for (int j=0 ; j<m[0].length ; j++) {
				a[i][j]=m[i][j];
				if (i==0 && j==0) {
					if (m[i][j+1]+m[i+1][j]+m[i+1][j+1]==3) {
						a[i][j]=1;
					}
					else if (m[i][j+1]+m[i+1][j]+m[i+1][j+1]<2 || m[i][j+1]+m[i+1][j]+m[i+1][j+1]>3) {
						a[i][j]=0;
					}
				}
				else if (i==0 && j!=0 && j!=m[0].length-1) {
					if (m[i][j-1]+m[i][j+1]+m[i+1][j-1]+m[i+1][j]+m[i+1][j+1]==3) {
						a[i][j]=1;
					}
					else if (m[i][j-1]+m[i][j+1]+m[i+1][j-1]+m[i+1][j]+m[i+1][j+1]<2 || m[i][j-1]+m[i][j+1]+m[i+1][j-1]+m[i+1][j]+m[i+1][j+1]>3) {
						a[i][j]=0;
					}	
				}
				else if (i==0 && j==m[0].length-1) {
					if (m[i][j-1]+m[i+1][j]+m[i+1][j-1]==3) {
						a[i][j]=1;
					}
					else if (m[i][j-1]+m[i+1][j]+m[i+1][j-1]<2 || m[i][j-1]+m[i+1][j]+m[i+1][j-1]>3) {
						a[i][j]=0;
					}	
				}
				else if (i!=0 && i!=m.length-1 && j==0) {
					if (m[i-1][j]+m[i-1][j+1]+m[i][j+1]+m[i+1][j+1]+m[i+1][j]==3) {
						a[i][j]=1;
					}
					else if (m[i-1][j]+m[i-1][j+1]+m[i][j+1]+m[i+1][j+1]+m[i+1][j]<2 || m[i-1][j]+m[i-1][j+1]+m[i][j+1]+m[i+1][j+1]+m[i+1][j]>3) {
						a[i][j]=0;
					}
				}
				else if (i!=0 && i!=m.length-1 && j!=0 && j!=m[0].length-1) {
					if (m[i][j-1]+m[i-1][j-1]+m[i-1][j]+m[i-1][j+1]+m[i][j+1]+m[i+1][j+1]+m[i+1][j]+m[i+1][j-1]==3) {
						a[i][j]=1;
					}
					else if (m[i][j-1]+m[i-1][j-1]+m[i-1][j]+m[i-1][j+1]+m[i][j+1]+m[i+1][j+1]+m[i+1][j]+m[i+1][j-1]<2 || m[i][j-1]+m[i-1][j-1]+m[i-1][j]+m[i-1][j+1]+m[i][j+1]+m[i+1][j+1]+m[i+1][j]+m[i+1][j-1]>3) {
						a[i][j]=0;
					}
				}
				else if (i!=0 && i!=m.length-1 && j==m[0].length-1) {
					if (m[i-1][j]+m[i-1][j-1]+m[i][j-1]+m[i+1][j-1]+m[i+1][j]==3) {
						a[i][j]=1;
					}
					else if (m[i-1][j]+m[i-1][j-1]+m[i][j-1]+m[i+1][j-1]+m[i+1][j]<2 || m[i-1][j]+m[i-1][j-1]+m[i][j-1]+m[i+1][j-1]+m[i+1][j]>3) {
						a[i][j]=0;
					}
				}
				else if (i==m.length-1 && j==0) {
					if (m[i-1][j]+m[i-1][j+1]+m[i][j+1]==3) {
						a[i][j]=1;
					}
					else if (m[i-1][j]+m[i-1][j+1]+m[i][j+1]<2 || m[i-1][j]+m[i-1][j+1]+m[i][j+1]>3) {
						a[i][j]=0;
					}
				}
				else if (i==m.length-1 && j!=0 && j!=m[0].length-1) {
					if (m[i][j-1]+m[i-1][j-1]+m[i-1][j]+m[i-1][j+1]+m[i][j+1]==3) {
						a[i][j]=1;
					}
					else if (m[i][j-1]+m[i-1][j-1]+m[i-1][j]+m[i-1][j+1]+m[i][j+1]<2 || m[i][j-1]+m[i-1][j-1]+m[i-1][j]+m[i-1][j+1]+m[i][j+1]>3) {
						a[i][j]=0;
					}
				}
				else {
					if (m[i-1][j]+m[i-1][j-1]+m[i][j-1]==3) {
						a[i][j]=1;
					}
					else if (m[i-1][j]+m[i-1][j-1]+m[i][j-1]<2 || m[i-1][j]+m[i-1][j-1]+m[i][j-1]>3) {
						a[i][j]=0;
					}
				}
			}
		}
		return a;
	}

}