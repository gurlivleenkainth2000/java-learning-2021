
public class Session2_Recursion {
	
	static void printByRecursion(int num) {
		if(num == 0) {
			return;
		}
		
		System.out.print(num + "\t");
		printByRecursion(--num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Session 20210726");
		int num = 5;
		printByRecursion(num);
		
	}

}
