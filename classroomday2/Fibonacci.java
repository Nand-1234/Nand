package classroomday2;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secNum=1;
		System.out.println("The first number is " +  firstNum);
		for (int i = 1; i <= range; i++) {
			int sum=firstNum+secNum; 
			firstNum=secNum;  
			secNum=sum;            
		System.out.println("The fibonacci series for the given number is " + sum);
		}
	}

}
