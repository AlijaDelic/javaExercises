package arraysExercise;

public class Array {

	public static int[] getSpecificArray(int[] arr, char option) {
		int positiveNumbers = 0;
		int negativeNumbers=0;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i]>0) {
				positiveNumbers++;
			}
			if(arr[i]<0) {
				negativeNumbers++;
			}
			
		}
		
		int[] negativeArray = new int[negativeNumbers];
		int[] positiveArray = new int[positiveNumbers];
		int count1=0;
		int count2=0;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i]>0) {
				positiveArray[count1]=arr[i];
				count1++;
			}
			
			if(arr[i]<0) {
				negativeArray[count2]=arr[i];
				count2++;
			}
			
		}
		
		if (option == '+') {
			return positiveArray;
		}else {
			return negativeArray;
		}
	}

		
		public static String[] sameNumbersRepeat (int[] arr){
			int number = 0;
			
			for(int i=0; i<arr.length; i++) {
				int element = arr[i];
				
				for(int u=i+1; u<arr.length; u++) {
					if(arr[u]==element) {
						number++;
					}
				}
				
			}
			
			String[] repeatingElements = new String[number];
			int count = 0;
			
			for(int i=0; i<arr.length; i++) {
				int element = arr[i];
				int repeat = 1;
				
				for(int u=i+1; u<arr.length; u++) {
					if(arr[u]==element) {
						repeat++;
						repeatingElements[count]="Element:"+element + " repeats:"+ repeat;
						count++;
					}
				}
				
			}
			
			return repeatingElements;
		}


	public static void main(String[] args) {
		int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
		int[] posArray = Array.getSpecificArray(array, '+'); //positive array
		int[] negArray = Array.getSpecificArray(array, '-'); //negative array
		String[] repeatingElements = Array.sameNumbersRepeat(array);	//repeating elements
		
		}
}
