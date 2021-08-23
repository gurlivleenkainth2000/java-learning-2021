import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
        Map<Character, Integer> strA = new HashMap<Character, Integer>();
        Map<Character, Integer> strB = new HashMap<Character, Integer>();
		
        for(int i = 0; i <a.length(); i++) {
        	char key = a.charAt(i);
        	if(!strA.containsKey(key)) {
        		strA.put(key, 1);
        	} else {
        		Integer value = strA.get(key);
        		strA.put(key, ++value);
        	}
        }
        
        for(int i = 0; i < b.length(); i++) {
        	char key = b.charAt(i);
        	if(!strB.containsKey(key)) {
        		strB.put(key, 1);
        	} else {
        		Integer value = strB.get(key);
        		strB.put(key, ++value);
        	}
        }
        
        ArrayList<Integer> valuesA = new ArrayList<Integer>(strA.values());
        ArrayList<Integer> valuesB = new ArrayList<Integer>(strB.values());
        
        if(valuesA.equals(valuesB)) {
        	if(strA.keySet().equals(strB.keySet())) {
        		return true;
        	} else {
        		return false;
        	}
        } else {
        	return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
//        String b = scan.next();
        scan.close();
       
//        boolean ret = isAnagram(a.toLowerCase(), b.toLowerCase());
        String[] result = a.trim().split("[\\s@&.? ,'$+-]+");
        System.out.println( result.length );
        for(int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
        }
    }

}
