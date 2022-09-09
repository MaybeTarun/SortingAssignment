package Sorting;

public class InsertionSort {
	
	public static void InsertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
	
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		InsertionSort ob = new InsertionSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		ob.InsertionSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);

	}

}
