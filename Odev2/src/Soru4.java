package Odev2Main;


public class Soru4 {

	public static void main(String[] args) {
		int[] a = definitionRandomArray(10);
		//int[] b = {2,4,5,11,33,2,5,55,100,1};
		printArray(a);
		System.out.println("\n---------------------");
		printRepetitiveElement(a);
	}
	
	static int[] definitionRandomArray(int size) {
		int[] a = new int[size];
		for (int i=0 ; i<a.length ; i++) {
			a[i] = (int)(Math.random()*10);
		}
		return a;
	}
	
	static void printArray(int[] array) {
		for (int i=0 ; i<array.length ; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static void printRepetitiveElement(int[] array) {
		for (int i=0 ; i<array.length ; i++) {
			for (int j=i+1 ; j<array.length ; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
					break;
				}
			}
		}
	}

}
