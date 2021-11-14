
public class Car01 {
	private double fuelCost;
	private double fuelAmount;
	public Car01(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

//	コンストラクタ
	public void move(int distance) {
		System.out.println(distance + "kn走ります");
		this.fuelAmount -= ( distance / fuelCost );
	}

	public double getFuelAmount(){
		return this.fuelAmount;

	}

}
