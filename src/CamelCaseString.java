
public class CamelCaseString {
	
	public static void main(String args[]) {
		
		String s = "java is programing language";
		String splited[] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(String word: splited) {
			char firstChar = word.charAt(0);
			if(!Character.isUpperCase(firstChar)) {
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1));
								
			}
			else
				sb.append(word.substring(0));
		}
		String result = sb.toString().trim();
		System.out.println(result);
		
		
	}

}
