import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {
	
	public static void main(String args[]) {
	
	
	int arr[] = {2,5,3,6};
	List<Integer> list = new ArrayList<Integer>();
	int sum =0;
	list.stream().map(
			element -> { 
			sum += element});
	}	

}
