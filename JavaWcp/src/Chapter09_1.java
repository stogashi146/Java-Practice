
public class Chapter09_1 {
	public static void main(String[] args) {
		//燃費
		double fuelCost = 12.5;
		//		残量
		double fuelAmount = 55.0;

		Car01 car = new Car01(fuelCost, fuelAmount);

		car.move(20);
		System.out.println("残量は、" + car.getFuelAmount() + "です");
	}

}
