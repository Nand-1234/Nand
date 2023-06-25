package Week1day3;

import java.util.Arrays;

public class Findlargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int seclar=data[data.length-2];
		System.out.println("The second Largest Element is : " +seclar);
		
		

	}

}
