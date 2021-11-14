package classMethod01;
import classMethod01.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");

		//	静的メンバーはインスタンスを生成せずに直接使用できる
		Human04.staticMethodPrint();

		//	staticなクラス定数も生成せずに参照できる
		System.out.println(Human04.GREETING);

//		インスタンスメンバーは直接参照できない（staticのついていないもの）
//		Human04.instanceMethodPrint();

//		インスタンスメンバーはインスタンスを生成して使用する
		yamada.instanceMethodPrint();
	}

}
