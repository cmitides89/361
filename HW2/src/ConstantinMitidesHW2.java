
public class ConstantinMitidesHW2 {
//------------------- QUESTION 2.E
	public static int fact(int n) {
		if( n < 0 || n > 12) {
			throw new IllegalArgumentException("n has to be >= 0 or > 12");		
		}else {
			if(n == 0) {
				return 1;
			}else {
				return n*fact(n-1);
			}
		}
	}
	public static int baseNum = 2, powResult = 1;
	public static int recPow(int n) {
		//if the int is not bigger than 0 
		//must only accept ints
		if(n < 0 || n >= 31) {
			throw new IllegalArgumentException("n has to be > 0 and  n < 31, you entered "+ n);
		}else {
			//recursion here
			//base number = 2
			if(n==0) {
				return powResult;
			}else {
				powResult = powResult * baseNum;
				return recPow(n - 1);
			}
			
		}
	}
	//------------------- GCD QUESTION 2.F
	public static int myGcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a % b);
		}
	}
	//------------------- QUESTION 2.F COUNT FROM I = 5 TO I + 5 RECURSIVELY
	public static int questionIIpartC(int i) {
		if(i == 10) {
			return i;
		}else {
			return questionIIpartC(i + 1);
		}
	}
	//-------------------DIJKSTRA GCD: question 6.e:
	public static int gcd(int m, int n) {
		if(m == n) {
			return m;
		}else if(m > n) {
			return gcd(m-n, n);
		}else {
			return gcd(m, n-m);
		}
	}
	
	//-------------------MERGE SORT CODE
	
	public static void mergeSort(int[] a) {
		//if the array is empty, exit
		if(a.length <= 1) {
			return;
		}
		//cut the array in half
		int[] left = new int[a.length /2];
		int[] right = new int[a.length - left.length];
		
		//copy each half of a accordingly
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left, right, a);
	}
	
	public static void merge( int[] left, int[] right, int[] toMerged) {
		int leftIndex =0;
		int rightIndex =0;
		int toMergeIndex =0;
		//indexes are less than length, then compare them and enter it to 
		//whole array
		while(leftIndex < left.length && rightIndex < right.length) {
			if(left[leftIndex] < right[rightIndex]) {
				
				toMerged[toMergeIndex] = left[leftIndex];
				leftIndex++;
			}else {
				toMerged[toMergeIndex] = right[rightIndex];
				rightIndex++;
			}
			toMergeIndex++;
		}
		//put remaining elements from both sub arrays into the whole array
		System.arraycopy(left, leftIndex, toMerged, toMergeIndex, left.length - leftIndex);
		System.arraycopy(right, rightIndex, toMerged, toMergeIndex, right.length - rightIndex);
	}
	
	//--------------------------------- END OF MERGE SORT CODE
	//this method just prints an array used for testing merge sort
	public static void arrayPrinter(int[] myLittleArray) {
		for(int i = 0; i < myLittleArray.length; i++) {
			System.out.print(myLittleArray[i]+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Running Factorial method ");
		System.out.println(fact(6));
		
		System.out.println("GCD 54, 24 and dijkstraGCD 54, 24");
		System.out.println(myGcd(54, 24));
		System.out.println(gcd(54, 24));
		System.out.println("counting from i = 5 to i + 5 recursively");
		System.out.println(questionIIpartC(5));
		
		//-------------------------------TESTING RECPOW()---------------------------// 
		System.out.println("--Series of tests for RecPow--");
		
//		System.out.println(recPow(30));
//		This print statements that cause the exceptions to throw: 31, -5
//		System.out.println(recPow(31));
		System.out.println(recPow(5));
//		System.out.println(recPow(0));
//		System.out.println(recPow(-5));

		System.out.println("--END OF Series of tests for RecPow--");
		
		//-------------------------------TESTING MERGESORT()---------------------------//
		System.out.println("an unsorted array");
		int[] myLittleArray = {3,2,4,5,6,78,9};
		arrayPrinter(myLittleArray);
		System.out.println("\n"+"a MergeSorted array");
		mergeSort(myLittleArray);
		arrayPrinter(myLittleArray);
		
//		System.out.println("\n"+"unsorted array"+ "\n");
//		int[] myLittleArray2 = {0,0,0,0,0,0,0};
//		arrayPrinter(myLittleArray2);
//		System.out.println("\n"+"a MergeSorted array"+ "\n");
//		mergeSort(myLittleArray2);
//		arrayPrinter(myLittleArray2);
//		
//		System.out.println("\n"+"unsorted array"+ "\n");
//		int[] myLittleArray3 = {5,34,2,9,0,-1,100};
//		arrayPrinter(myLittleArray3);
//		System.out.println("\n"+"a MergeSorted array"+ "\n");
//		mergeSort(myLittleArray3);
//		arrayPrinter(myLittleArray3);
//		
//		System.out.println("\n"+"unsorted array"+ "\n");
//		int[] myLittleArray4 = new int[10];
//		arrayPrinter(myLittleArray4);
//		System.out.println("\n"+"a MergeSorted array"+ "\n");
//		mergeSort(myLittleArray4);
//		arrayPrinter(myLittleArray4);
	}

}
