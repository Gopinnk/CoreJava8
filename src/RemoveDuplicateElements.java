import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(2,1,4,3,2,1);
		HashSet<Integer> removedDuplicates = new HashSet<Integer>(list);
		
		//System.out.println(removedDuplicates);
		
		for(int i: removedDuplicates) {
			System.out.println(i);
		}
		
		//Using Java 8
		
		System.out.println("************Java -8 *****************");
		
		List<Integer> removedDuplicates1=list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(removedDuplicates1);
		
	}

}
