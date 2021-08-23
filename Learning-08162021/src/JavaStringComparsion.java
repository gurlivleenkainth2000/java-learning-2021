import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaStringComparsion {
	
	public static String getSmallerAndLargestSubstring(String s, int k) {
		String smallest = s.substring(0,k);
		String largest = s.substring(0,k);
		
		for(int i=0; i<= s.length() -k; i++) {
			String str = s.substring(i, i+k);
			if(str.compareTo(smallest) < 0) smallest = str;
			if(str.compareTo(largest) > 0) largest = str;
		}
		
		
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		int size = scanner.nextInt();
		
		System.out.println(getSmallerAndLargestSubstring(str, size));
		scanner.close();

	}

}
