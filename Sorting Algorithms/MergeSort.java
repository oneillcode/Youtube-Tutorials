import java.util.Arrays;

public class MergeSort {
	private static int[] numbers = {9,1,8,2,7,3,6,4,5,0};
	private static int[] helper = new int[numbers.length];

	public static void main(String[] args) {
		System.out.println(Arrays.toString(numbers));
		mergesort(0,numbers.length - 1);
		System.out.println(Arrays.toString(numbers));
	}

	private static void mergesort(int low, int high){
		
		if(low < high){
			int middle = low + (high - low) / 2;
			mergesort(low, middle);
			mergesort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	private static void merge(int low, int middle, int high){
		
		for(int i = low; i <= high; i++){
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;

		while(i <= middle && j <= high){
			if(helper[i] <= helper[j]){
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		while( i <= middle){
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}
}
