package orgsystem;

public class singleInheritDesktop extends singleInheritComputer {
	
	public void desktopSize() {
		System.out.println("Comes from Child Desktop");
	}

	public static void main(String[] args) {
		
		singleInheritDesktop des =new singleInheritDesktop();
		des.computerModel();
		des.desktopSize();
	}

}
