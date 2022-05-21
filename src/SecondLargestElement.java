
public class SecondLargestElement {
	
	public static void main(String args[]) {
		
		int arr[] = {10,20,25,45,29,30,50,76};
		int len = arr.length;
		int temp;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Largest Element: " +arr[len-3]);
	}

}
