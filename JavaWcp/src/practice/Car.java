package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;

	 // コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

    // moveメソッド
    // ・"xx km 走ります"を出力
    // ・残量を計算
	public void move(int km) {
		System.out.println(km + "km走ります");
		this.fuelAmount -= (km / fuelCost);
//		return distance + "km 走ります";
	}
    // fuelAmountを取得するメソッドを作成
	public double getFuelAmount() {
//		return this.fuelCost = this.fuelCost - (distance / this.fuelCost);
		return this.fuelAmount;
	}
}
