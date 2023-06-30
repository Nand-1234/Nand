package bankday7home;

public class axisBank extends bankInfo{
	
	public void deposit() {
		System.out.println("Comes from child axisBank");
	}

	public static void main(String[] args) {
		axisBank ab=new axisBank();
		ab.deposit();
		
		 

	}

}
