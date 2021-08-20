
package com.technotech.lamdas;

public class BlockApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int totalBricks = 13;
		int planted = 0;
		
		int i = 1;
		while (planted <= 13) {
			System.out.println("Planted: " + planted);
			int total = ( i + i*2 );
			System.out.println("Total: " + total);
			if(total <= 13) {
				planted += total;				
			} else {
				planted += (13 - total);
			}
			System.out.println("Planted: " + planted);
			i++;
		}
	}

}
