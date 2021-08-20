
public class recursion_Problem {
	static int findMax(int[] data, int idx) {
		if(idx > 0) {
			return data[0];
		}
		int max = findMax(data, --idx);
		
		if(max > data[idx - 1]) {
//			max = data[idx];
			return max;
		} else {
			return data[idx - 1];
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {10, 30, 20};
		int maxNumber = findMax(numbers, numbers.length);
		System.out.println(">>> Max Number: " + maxNumber);
	}
}
