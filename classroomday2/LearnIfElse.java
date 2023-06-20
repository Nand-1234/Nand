package classroomday2;

public class LearnIfElse {

	public static void main(String[] args) {
		// check the number is positive or negative
		int mark=450;
				
		if (mark>400)
			System.out.println("The mark obtained is positive: " + mark);
		
		else if (mark>320)
            System.out.println("The mark obtained is neutral: "+ mark);
		
		else
			System.out.println("The mark obtained is negative: " + mark);
	}

}
