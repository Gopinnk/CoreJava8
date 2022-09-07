import java.util.Comparator;
import java.util.TreeMap;

class Testt implements Comparator<String>{
	
	public String CompareTo(String str1, String str2) {
		return str2.compareTo(str1);
	}
	
}

public class SujathammaHashMapSort {
	
	public static void main(String args[]) {
	
	TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(new Testt());
	treeMap.put("c",1);
	treeMap.put("b",2);
	treeMap.put("d",4);
	
}

}
