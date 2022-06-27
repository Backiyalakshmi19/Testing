package week1.day1;

public class Mycar {
	Car myvehicle= new Car();
	public void callCar()
	{
		myvehicle.applyBreak();
		myvehicle.applyGear();
		myvehicle.switchOnAc();
		myvehicle.applyAccleratr(); 

	}
	public static void main(String[] args) {

		Mycar myvehicle1 =new Mycar();
		myvehicle1.callCar();	
	}

}
