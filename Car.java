package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("Drive Car");
	}
	
	public void applBrake () {
		System.out.println("Appl Brake");
    }
    public void soundHorn() {
		System.out.println("Sound Horn");
    }
    public void isPuncture() {
    
		System.out.println("Is puncture");
	}

   public static void main(String[] args) {
	
	Car c = new Car();
	c.driveCar();
	c.applBrake();
	c.soundHorn();
	c.isPuncture();

   }
}
