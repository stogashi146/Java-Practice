
public class Chapter05 {
	public static void main(String[] args) {
		long test1 = 9223372036854775807L;
		double test2 =  1234567.89d;
		boolean test3 = true;
//	・ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
		Float float1 = 0.123f;
		Integer integer = 11;
		Character char1 = 'a';

		int[] array1 = new int[4];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;

		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(float1);
		System.out.println(integer);
		System.out.println(char1);
		System.out.println(array1[3]);
	}

}
